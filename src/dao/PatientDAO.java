package dao;

import model.Patient;
import util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ArrayList;
import model.Patient;


public class PatientDAO {

    // Insert patient record
    public boolean addPatient(Patient patient) {
        String sql = "INSERT INTO patients (name, mobile, visit_date, treatment, notes)\n" +
"VALUES (?, ?, ?, ?, ?)";

        try (Connection con = DBConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, patient.getName());
ps.setString(2, patient.getMobile());
ps.setDate(3, new java.sql.Date(patient.getVisitDate().getTime()));
ps.setString(4, patient.getTreatment());
ps.setString(5, patient.getNotes());


            return ps.executeUpdate() > 0;

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public java.util.List<Patient> getAllPatients() {

    java.util.List<Patient> list = new java.util.ArrayList<>();
String sql = "SELECT patient_id, name, mobile, visit_date, treatment, notes FROM patients";

    try (java.sql.Connection con = util.DBConnection.getConnection();
         java.sql.PreparedStatement ps = con.prepareStatement(sql);
         java.sql.ResultSet rs = ps.executeQuery()) {

        while (rs.next()) {
            Patient p = new Patient(
    rs.getInt("patient_id"),
    rs.getString("name"),
    rs.getString("mobile"),
    rs.getDate("visit_date"),
    rs.getString("treatment"),
    rs.getString("notes")   // ✅ READ NOTES FROM DB
);
            list.add(p);
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return list;
}
    
    public Patient getPatientById(int patientId) {

    String sql = "SELECT * FROM patients WHERE patient_id = ?";

    try (java.sql.Connection con = util.DBConnection.getConnection();
         java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, patientId);

        java.sql.ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return new Patient(
                rs.getInt("patient_id"),
                rs.getString("name"),
                rs.getString("mobile"),
                rs.getDate("visit_date"),
                rs.getString("treatment"),
                rs.getString("notes")
            );
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return null; // not found
}
public Patient getPatientByName(String name) {

    String sql = "SELECT * FROM patients WHERE name = ?";

    try (java.sql.Connection con = util.DBConnection.getConnection();
         java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, name);

        java.sql.ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return new Patient(
                rs.getInt("patient_id"),
                rs.getString("name"),
                rs.getString("mobile"),
                rs.getDate("visit_date"),
                rs.getString("treatment"),
                rs.getString("notes")
            );
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;
}
public Patient getPatientByMobile(String mobile) {

    String sql = "SELECT * FROM patients WHERE mobile = ?";

    try (java.sql.Connection con = util.DBConnection.getConnection();
         java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, mobile);

        java.sql.ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            return new Patient(
                rs.getInt("patient_id"),
                rs.getString("name"),
                rs.getString("mobile"),
                rs.getDate("visit_date"),
                rs.getString("treatment"),
                rs.getString("notes")
            );
        }

    } catch (Exception e) {
        e.printStackTrace();
    }

    return null;
}
public boolean updatePatient(Patient patient) {

    String sql = "UPDATE patients SET name = ?, mobile = ?, visit_date = ?, treatment = ?, notes = ? WHERE patient_id = ?";

    try (java.sql.Connection con = util.DBConnection.getConnection();
         java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setString(1, patient.getName());
        ps.setString(2, patient.getMobile());
        ps.setDate(3, new java.sql.Date(patient.getVisitDate().getTime()));
        ps.setString(4, patient.getTreatment());
        ps.setString(5, patient.getNotes());
        ps.setInt(6, patient.getPatientId());

        return ps.executeUpdate() > 0;

    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}
public boolean deletePatient(int patientId) {

    String sql = "DELETE FROM patients WHERE patient_id = ?";

    try (java.sql.Connection con = util.DBConnection.getConnection();
         java.sql.PreparedStatement ps = con.prepareStatement(sql)) {

        ps.setInt(1, patientId);
        return ps.executeUpdate() > 0;

    } catch (Exception e) {
        e.printStackTrace();
        return false;
    }
}

}

