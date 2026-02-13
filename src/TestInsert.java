import dao.PatientDAO;
import model.Patient;
import java.util.Date;

public class TestInsert {
    public static void main(String[] args) {
        Patient p = new Patient(
            "Rahul Sharma",
            "9876543210",
            new Date(),
            "Fever and cold",
            "Prescribed medicines"
        );

        boolean result = new PatientDAO().addPatient(p);

        System.out.println(result ? "Inserted Successfully" : "Insert Failed");
    }
}
