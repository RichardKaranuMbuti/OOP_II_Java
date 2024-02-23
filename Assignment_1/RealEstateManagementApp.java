import java.util.*;

// Complaint class representing a complaint with encapsulated fields
class Complaint {
    private int id;
    private String description;
    private String status; // e.g., "Open", "In Progress", "Closed"
    private String submittedBy;
    private Date submissionDate;

    // Constructor to initialize a complaint
    public Complaint(int id, String description, String submittedBy, Date submissionDate) {
        this.id = id;
        this.description = description;
        this.submittedBy = submittedBy;
        this.submissionDate = submissionDate;
        this.status = "Open"; // Default status
    }

    // Getters and setters for encapsulated fields
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    
}

// Interface defining operations for complaint management
interface ComplaintManagement {
    void addComplaint(Complaint complaint);
    Complaint getComplaintById(int id);
    List<Complaint> getAllComplaints();
    void updateComplaintStatus(int id, String status);
    List<Complaint> getComplaintsByStatus(String status);
}

// Implementation of the ComplaintManagement interface using a HashMap and LinkedList
class ComplaintRepository implements ComplaintManagement {
    private Map<Integer, Complaint> complaints = new HashMap<>();
    private List<Complaint> complaintList = new LinkedList<>(); // For maintaining insertion order

    @Override
    public void addComplaint(Complaint complaint) {
        complaints.put(complaint.getId(), complaint);
        complaintList.add(complaint);
    }

    @Override
    public Complaint getComplaintById(int id) {
        return complaints.get(id);
    }

    @Override
    public List<Complaint> getAllComplaints() {
        return new ArrayList<>(complaintList);
    }

    @Override
    public void updateComplaintStatus(int id, String status) {
        Complaint complaint = complaints.get(id);
        if (complaint != null) {
            complaint.setStatus(status);
        }
    }

    @Override
    public List<Complaint> getComplaintsByStatus(String status) {
        List<Complaint> filteredComplaints = new ArrayList<>();
        for (Complaint complaint : complaintList) {
            if (complaint.getStatus().equalsIgnoreCase(status)) {
                filteredComplaints.add(complaint);
            }
        }
        return filteredComplaints;
    }
}

// Main class to demonstrate functionality
public class RealEstateManagementApp {
    public static void main(String[] args) {
        ComplaintManagement complaintRepo = new ComplaintRepository();
        
        // Adding complaints
        complaintRepo.addComplaint(new Complaint(1, "Leaky faucet in apartment 3B", "Alice", new Date()));
        complaintRepo.addComplaint(new Complaint(2, "Broken window in the lobby", "Bob", new Date()));
        
        // Retrieve and print all complaints
        List<Complaint> complaints = complaintRepo.getAllComplaints();
        for (Complaint complaint : complaints) {
            System.out.println("Complaint ID: " + complaint.getId() + ", Description: " + complaint.getDescription());
        }
        
        // Update a complaint's status
        complaintRepo.updateComplaintStatus(1, "In Progress");
        
        // Get and print complaints by status
        List<Complaint> inProgressComplaints = complaintRepo.getComplaintsByStatus("In Progress");
        for (Complaint complaint : inProgressComplaints) {
            System.out.println("In Progress - Complaint ID: " + complaint.getId() + ", Description: " + complaint.getDescription());
        }
    }
}