// definition of Patient class
class Patient {
    // declaring the attributes of this class
    static String hospitalName = "City Hospital"; // shared hospital name for all patients
    static int totalPatients = 0; // counter to keep track of total patients
    private final int patientID;  // final variable to ensure patient ID immutability
    private String name;
    private int age;
    private String ailment;
    // kept attributes private to ensure data security

    // created a parameterized constructor to provide the attributes with user-defined values
    Patient(int patientID, String name, int age, String ailment) {
        this.patientID = patientID;
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        totalPatients++; // incrementing the total patient count
    }

    // created a static method to get the total number of patients
    static int getTotalPatients() {
        return totalPatients;
    }

    // created a method to display the patient details
    void displayPatientDetails() {
        System.out.println("Patient ID: " + patientID + ", Name: " + name + ", Age: " + age + ", Ailment: " + ailment + ", Hospital: " + hospitalName);
    }
}

// definition of HospitalManagementProgram class
public class HospitalManagementProgram {
    public static void main(String[] args) {
        // created array of objects of Patient class
        Patient[] patients = new Patient[3];

        // initializing the objects with user-defined values
        patients[0] = new Patient(1, "Person-1", 25, "Ailment-A");
        patients[1] = new Patient(2, "Person-2", 30, "Ailment-B");
        patients[2] = new Patient(3, "Person-3", 35, "Ailment-C");

        // displaying the total number of patients
        System.out.println("Total Patients in " + Patient.hospitalName + ": " + Patient.getTotalPatients());

        // displaying the details of patients if they are objects of Patient class
        for (Patient patient : patients) {
            if (patient instanceof Patient) { // using instanceof operator to check if object is an instance of Patient class
                patient.displayPatientDetails();
            }
        }
    }
}
