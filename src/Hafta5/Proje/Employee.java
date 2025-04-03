package Hafta5.Proje;

public class Employee {

    private String firstName;
    private String lastName;
    private ContactInfo contactInfo;

    //Constructor
    public Employee(String firstName, String lastName,String email,String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = new ContactInfo(phone,email);
    }

    //Inner Class
    public class ContactInfo{
        private String phoneNumber;
        private String email;

        //Inner Class Constructor
        public ContactInfo(String phoneNumber, String email) {
            this.phoneNumber = phoneNumber;
            this.email = email;
        }

        //Method returning contact information
        public void displayInfo(){
            System.out.println("Phone: " + phoneNumber);
            System.out.println("Email: " + email);
        }
    }

    //Method to show the employee contact details
    public void showContatInfo(){
        System.out.println("Employee: " + firstName + " " + lastName);
        contactInfo.displayInfo();
    }

    public static void main(String[] args) {
        Employee emp = new Employee("Mehmet","Kerem","mehmetkerem@gmail.com","05340711077");
        emp.showContatInfo();
    }

}

