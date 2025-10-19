public class master {
    //  Node class
    static class Patient {
        String patient_name;
        int patient_id;
        String patient_admission_date;
        String patient_type_of_illness;
        int severity;
        Patient next;

        // Constructor
        public Patient(String patient_name, int patient_id, String patient_admission_date,
                       String patient_type_of_illness, int severity) {
            this.patient_name = patient_name;
            this.patient_id = patient_id;
            this.patient_admission_date = patient_admission_date;
            this.patient_type_of_illness = patient_type_of_illness;
            this.severity = severity;
            this.next = null;
        }
    }

    //  Linked list class
    static class PatientList {
        Patient head;

        //  Insert patient in descending order by severity
        public void insertBySeverity(Patient newPatient) {
            if (head == null || newPatient.severity > head.severity) {
                newPatient.next = head;
                head = newPatient;
            } else {
                Patient current = head;
                while (current.next != null && current.next.severity >= newPatient.severity) {
                    current = current.next;
                }
                newPatient.next = current.next;
                current.next = newPatient;
            }
        }

        //  Display list
        public void display() {
            Patient current = head;
            while (current != null) {
                System.out.println("Name: " + current.patient_name +
                        ", ID: " + current.patient_id +
                        ", Admission Date: " + current.patient_admission_date +
                        ", Illness: " + current.patient_type_of_illness +
                        ", Severity: " + current.severity);
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        PatientList list = new PatientList();

        list.insertBySeverity(new Patient("Ali", 1, "2025-10-10", "Flu", 4));
        list.insertBySeverity(new Patient("Sara", 2, "2025-10-11", "Heart", 9));
        list.insertBySeverity(new Patient("Ahmed", 3, "2025-10-12", "Fever", 6));

        System.out.println("Patients sorted by severity:");
        list.display();
    }
}
