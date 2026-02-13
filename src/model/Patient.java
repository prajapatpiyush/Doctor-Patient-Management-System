package model;

import java.util.Date;

public class Patient {

    private int patientId;
    private String name;
    private String mobile;
    private Date visitDate;
    private String treatment;
    private String notes;

    // Empty constructor
    public Patient() {}

    // Constructor without ID (for insert)
    public Patient(String name, String mobile, Date visitDate, String treatment, String notes) {
        this.name = name;
        this.mobile = mobile;
        this.visitDate = visitDate;
        this.treatment = treatment;
        this.notes = notes;
    }

    // Constructor with ID (for update / fetch)
    public Patient(int patientId, String name, String mobile, Date visitDate, String treatment, String notes) {
        this.patientId = patientId;
        this.name = name;
        this.mobile = mobile;
        this.visitDate = visitDate;
        this.treatment = treatment;
        this.notes = notes;
    }

    // Getters & Setters
    public int getPatientId() { return patientId; }
    public void setPatientId(int patientId) { this.patientId = patientId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getMobile() { return mobile; }
    public void setMobile(String mobile) { this.mobile = mobile; }

    public Date getVisitDate() { return visitDate; }
    public void setVisitDate(Date visitDate) { this.visitDate = visitDate; }

    public String getTreatment() { return treatment; }
    public void setTreatment(String treatment) { this.treatment = treatment; }

    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }
}
