class Patient {
    private int patientId;
    protected String disease;

    Patient(int patientId, String disease) {
        this.patientId = patientId;
        this.disease = disease;
    }

    void getDetails() {
        System.out.println("Patient id: " + patientId);
        System.out.println("Patient disease: " + disease);
    }

    public int getId() {
        return patientId;
    }

    public String getDisease() {
        return disease;
    }

}

class DoctorAccess extends Patient{
    int pId = getId();
    String pDisease = getDisease();
    
    DoctorAccess(int p, String d){
        super(p, d);
        System.out.println("Doctor...");
    }
    
}

public class S4P5 {
    public static void main(String[] args) {
        Patient pa1 = new Patient(1,"ABC");
        Patient pa2 = new Patient(2,"DEF");
        pa1.getDetails();
        pa2.getDetails();
    }
}
