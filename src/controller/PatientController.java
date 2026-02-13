package controller;

import dao.PatientDAO;
import model.Patient;

public class PatientController {

    private PatientDAO patientDAO;

    public PatientController() {
        patientDAO = new PatientDAO();
    }

    public boolean savePatient(Patient patient) {
        return patientDAO.addPatient(patient);
    }
    public java.util.List<Patient> getAllPatients() {
    return patientDAO.getAllPatients();
}
    
    public Patient getPatientById(int patientId) {
    return patientDAO.getPatientById(patientId);
}
    public Patient getPatientByName(String name) {
    return patientDAO.getPatientByName(name);
}
    public Patient getPatientByMobile(String mobile) {
    return patientDAO.getPatientByMobile(mobile);
}
    public boolean updatePatient(Patient patient) {
    return patientDAO.updatePatient(patient);
}
public boolean deletePatient(int patientId) {
    return patientDAO.deletePatient(patientId);
}

}
