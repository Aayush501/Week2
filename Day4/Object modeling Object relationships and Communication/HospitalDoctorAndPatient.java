// importing required packages for using ArrayList and List
import java.util.ArrayList;
import java.util.List;

// Hospital class representing the hospital, containing lists of doctors and patients
class Hospital {
    private List<Doctor> doctors;  // stores the list of doctors in the hospital
    private List<Patient> patients;  // stores the list of patients in the hospital

    // constructor to initialize the doctors and patients lists
    public Hospital() {
        doctors = new ArrayList<>();  // initializing the doctors list
        patients = new ArrayList<>();  // initializing the patients list
    }

    // method to add a doctor to the hospital
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);  // adding the doctor to the list if not already present
        }
    }

    // method to add a patient to the hospital
    public void addPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);  // adding the patient to the list if not already present
        }
    }

    // getter method to retrieve the list of doctors
    public List<Doctor> getDoctors() {
        return new ArrayList<>(doctors);  // returning a copy of the list to prevent external modification
    }

    // getter method to retrieve the list of patients
    public List<Patient> getPatients() {
        return new ArrayList<>(patients);  // returning a copy of the list to prevent external modification
    }
}

// Doctor class representing a doctor, who can have multiple patients
class Doctor {
    private String name;  // stores the name of the doctor
    private List<Patient> patients;  // stores the list of patients assigned to the doctor

    // constructor to initialize the name and patients list
    public Doctor(String name) {
        this.name = name;  // assigning the name to the instance variable
        this.patients = new ArrayList<>();  // initializing the patients list
    }

    // getter method to retrieve the doctor's name
    public String getName() {
        return name;  // returning the doctor's name
    }

    // method to assign a patient to the doctor
    public void assignPatient(Patient patient) {
        if (!patients.contains(patient)) {
            patients.add(patient);  // adding the patient to the doctor's patient list
            patient.assignDoctor(this, false);  // preventing recursive calls by passing false
        }
    }

    // method to show consultation between the doctor and patient
    public void consult(Patient patient) {
        if (patients.contains(patient)) {
            System.out.println("Doctor " + name + " is consulting patient " + patient.getName());
        } else {
            System.out.println("Doctor " + name + " has no consultation with patient " + patient.getName());
        }
    }

    // getter method to retrieve the list of patients assigned to the doctor
    public List<Patient> getPatients() {
        return new ArrayList<>(patients);  // returning a copy of the list to prevent external modification
    }
}

// Patient class representing a patient, who can consult multiple doctors
class Patient {
    private String name;  // stores the name of the patient
    private List<Doctor> doctors;  // stores the list of doctors assigned to the patient

    // constructor to initialize the patient's name and doctors list
    public Patient(String name) {
        this.name = name;  // assigning the name to the instance variable
        this.doctors = new ArrayList<>();  // initializing the doctors list
    }

    // getter method to retrieve the patient's name
    public String getName() {
        return name;  // returning the patient's name
    }

    // method to assign a doctor to the patient
    public void assignDoctor(Doctor doctor, boolean addToDoctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);  // adding the doctor to the patient's doctor list
            if (addToDoctor) {
                doctor.assignPatient(this);  // adding the patient to the doctor's patient list
            }
        }
    }

    // getter method to retrieve the list of doctors assigned to the patient
    public List<Doctor> getDoctors() {
        return new ArrayList<>(doctors);  // returning a copy of the list to prevent external modification
    }
}

// main class to demonstrate the interaction between doctors and patients in a hospital
public class HospitalDoctorAndPatient {
    public static void main(String[] args) {
        // Created a hospital
        Hospital hospital = new Hospital();

        // Created doctors
        Doctor doctor1 = new Doctor("Aayush");  // creating a Doctor object
        Doctor doctor2 = new Doctor("Kumar");  // creating another Doctor object

        // Created patients
        Patient patient1 = new Patient("Shrivastav");  // creating a Patient object
        Patient patient2 = new Patient("Anshik");  // creating another Patient object
        Patient patient3 = new Patient("Jaiswal");  // creating another Patient object

        // Adding doctors and patients to the hospital
        hospital.addDoctor(doctor1);  // adding doctor1 to the hospital
        hospital.addDoctor(doctor2);  // adding doctor2 to the hospital
        hospital.addPatient(patient1);  // adding patient1 to the hospital
        hospital.addPatient(patient2);  // adding patient2 to the hospital
        hospital.addPatient(patient3);  // adding patient3 to the hospital

        // Assigning patients to doctors
        doctor1.assignPatient(patient1);  // assigning patient1 to doctor1
        doctor1.assignPatient(patient2);  // assigning patient2 to doctor1
        doctor2.assignPatient(patient2);  // assigning patient2 to doctor2
        doctor2.assignPatient(patient3);  // assigning patient3 to doctor2

        // Displaying relationships between doctors and their patients
        System.out.println("Hospital Status:");
        System.out.println("\nDoctors and their patients:");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println("\n" + doctor.getName() + "'s patients:");
            for (Patient patient : doctor.getPatients()) {
                System.out.println("- " + patient.getName());  // displaying the patient's name
            }
        }

        // Displaying patients and their assigned doctors
        System.out.println("\nPatients and their doctors:");
        for (Patient patient : hospital.getPatients()) {
            System.out.println("\n" + patient.getName() + "'s doctors:");
            for (Doctor doctor : patient.getDoctors()) {
                System.out.println("- " + doctor.getName());  // displaying the doctor's name
            }
        }

        // Demonstrating consultations
        System.out.println("\nConsultations:");
        doctor1.consult(patient1);  // showing consultation between doctor1 and patient1
        doctor1.consult(patient3);  // showing no consultation between doctor1 and patient3
        doctor2.consult(patient2);  // showing consultation between doctor2 and patient2
    }
}
