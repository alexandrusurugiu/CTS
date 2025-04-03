import java.util.ArrayList;
import java.util.List;

public class Main {
    public static List<Appointment> appointments = new ArrayList<>();
    public static void main(String[] args) {
        Doctor cardiolog = new Doctor("1", "John Doe");
        Doctor neurolog = new Doctor("2", "Mark Henry");
        Patient pacient = new Patient("3", "Marry Anne", 30);
        Patient pacient2 = new Patient("4", "Lucas Andrews", 5);

        Appointment appointment = new Appointment("12.12.2020", pacient, cardiolog, "Heart attack");
        Appointment appointment2 = new Appointment("25.09.2023", pacient2, neurolog, "Headache");

        cardiolog.recordDiagnosis("12.12.2020", appointment);
        neurolog.recordDiagnosis("25.09.2023", appointment2);
        appointments.addAll(cardiolog.appointmentsList);
        System.out.println(appointments);
    }
}
