package serenitylabs.tutorials.vetclinic.domain;

import java.util.ArrayList;
import java.util.List;

public class ComplaintRegister {

    private static List<String> complaints = new ArrayList<>();
    public static void recordComplaint(String complaint) {
        complaints.add(complaint);
    }

    public List<String> getComplaints() {
        return complaints;
    }
}
