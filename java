class Patient {
    int age;
    double weight;
    double height;
    int oxygenLevel;
    int wbcCount;
    int rbcCount;

    // Constructor to initialize patient details
    public Patient(int age, double weight, double height, int oxygenLevel, int wbcCount, int rbcCount) {
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.oxygenLevel = oxygenLevel;
        this.wbcCount = wbcCount;
        this.rbcCount = rbcCount;
    }

    // Method to check health
    public void checkHealth() throws Exception {
        if (age >= 18 && age <= 60 && weight >= 50 && weight <= 100 && height >= 150 && height <= 200 &&
            oxygenLevel >= 95 && wbcCount >= 4000 && wbcCount <= 10000 && rbcCount >= 4 && rbcCount <= 6) {
            System.out.println("Patient's health is very well.");
        } else {
            throw new Exception("Patient needs to be hospitalized.");
        }
    }
}

public class MedicalSystem {
    public static void main(String[] args) {
        // Create a sample patient with information
        Patient patient = new Patient(25, 70.5, 175.0, 98, 8000, 5);

        try {
            // Check health of the patient
            patient.checkHealth();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
