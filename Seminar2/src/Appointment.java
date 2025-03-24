import java.util.List;

public class Appointment {
    private String date;
    private Doctor doctor;
    private Patient patient;
    String diagnosis;

    public Appointment(String date, Patient patient, Doctor doctor, String diagnosis) {
        this.date = date;
        this.doctor = doctor;
        this.patient = patient;
        this.diagnosis = diagnosis;
    }

    public String getDate() {
        return date;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public String getDiagnosis() {
        return diagnosis;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    @Override
    public String toString() {
        return "Appointment{" +
                "date='" + date + '\'' +
                ", doctor=" + doctor +
                ", patient=" + patient +
                ", diagnosis='" + diagnosis + '\'' +
                '}';
    }
}
