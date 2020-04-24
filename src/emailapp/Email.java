package emailapp;
import java.util.Scanner;

public class Email {
    private String name;
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int capacity;
    private String emailAddress = "";
    private String alternateEmail;
    private int defaultPasswordLength = 8;


    // GETTERS:
    public String getEmail() {
        return emailAddress;
    }

    public String getName() {
        return firstName + " " + lastName;
    }

    public int getCapacity() {
        return capacity;
    }

    // CONSTRUCTORS:
    public Email( String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = firstName + " " + lastName;
        System.out.println(name);
        // Set department method.
        this.department = setDepartment();

        // Set Password.
        this.password = randomPassword(defaultPasswordLength);
        System.out.println(this.password);
    }


    // METHODS:
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES:\n1 Sales\n2 Development\n3 Accounting\n0 none\n ENTER DEPARTMENT CODE:");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales";}
        else if (depChoice == 2) { return "development";}
        else if (depChoice == 3) { return "accounting";}
        else { return "";}
    }

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMOPQRSTUCWXYZ0123456789!@#$%";
        char[] password = new char[length];

        for (int i=0; i<length; i++){
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

//    public void handlePassword() {
//        // Generate random String.
//            // randomize string method here.
//        // Assign password to email address.
//        this.password = password;
//    }
//
//    public void changePassword() {
//        this.handlePassword();
//    }
//
//    public void setCapacity(Integer num) {
//        this.capacity = num;
//    }

//    public void changeEmailAddress(String firstname, String lastname, String department, String company ) {
//        String newAddress = firstname + '.' + lastname + '@' + department + '.' + company + ".com";
//        this.emailAddress = newAddress;
//    }
}

