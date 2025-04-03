import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Doctor implements MedicalRecord {
    private final String doctorId;
    private String name;
     public List<Appointment> appointmentsList = new ArrayList<>();

    public Doctor(String doctorId, String name) {
        this.doctorId = doctorId;
        this.name = name;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String recordDiagnosis(String date, Appointment appointment) {
        appointmentsList.add(appointment);
        return appointmentsList.toString();
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId='" + doctorId + '\'' +
                ", name='" + name + '\'' +
                ", appointments=" + appointmentsList +
                '}';
    }
}
