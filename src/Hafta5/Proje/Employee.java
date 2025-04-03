package Hafta5.Proje;

public class Employee {

    private String firstName;
    private String lastName;
    private ContactInfo contactInfo;

    //Constructor to initialize employee's name and contact info
    public Employee(String firstName, String lastName,String email,String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phone,email);
    }

    // Inner Class to store contact information
    public class ContactInfo{
        private String phoneNumber;
        private String email;

        //Constructor to initialize contact details
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        // Method to display contact information
        public void displayInfo(){
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + email);
        }
    }

    // Method to display employee's name and contact info
    public void showContatInfo(){
        System.out.println("Employee: " + firstName + " " + lastName);
        contactInfo.displayInfo();
    }

    // Main method to test the structure
    public static void main(String[] args) {
        Employee emp = new Employee("Mehmet","Kerem","mehmetkerem@gmail.com","05340711077");
        emp.showContatInfo();
    }

}

