import java.util.Scanner;

public class Email {

    private String firstName;
    private String lastName;
    private String dept;
    private String password;
    private int defaultPasswordLength = 12;
    private String email;
    private String emailSuffix = "WillyWonka.com";
    private int mailboxCapacity = 500;
    private String alternateEmail;

    // Constructor to receive first and last name
    public Email (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("NEW EMPLOYEE: " + this.firstName + " " + this.lastName);

        // Call a method asking for the dept, then return the dept
//        this.dept = setDepartment();
// Refactored by omitting:       System.out.println("SELECTED DEPARTMENT: " + this.dept);

        // Call a method that returns a random password
        this.password = generateRandomPassword(defaultPasswordLength);
        System.out.println("GENERATED PASSWORD: " + this.password);

        // Combine elements to generate official email
//        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept.toLowerCase() + "." + emailSuffix.toLowerCase();
// Refactored by omitting:       System.out.println("GENERATED EMAIL: " + this.email);
    }

    public void setEmail() {
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + dept.toLowerCase() + "." + emailSuffix.toLowerCase();
    }
    // Ask for dept
//    private String setDepartment() {
//        System.out.println("CURRENT DEPARTMENTS:\n 1) Chocolate\n 2) Fizzy-Lifting-Drink\n 3) Wonkavator\n 4) None ");
//        System.out.println("Please select the corresponding numerical code for your department: ");
//        Scanner in = new Scanner(System.in);
//        int deptSelection = in.nextInt();
//        if (deptSelection == 1) {
//            return "Chocolate";
//        } else if (deptSelection == 2) {
//            return "Fizzy-Lifting-Drink";
//        } else if (deptSelection == 3) {
//            return  "Wonkavator";
//        } else {
//            return  "";
//        }
//    }


    public void setDept(String dept) {
        this.dept = dept;
    }

    // Generate random password
    private String generateRandomPassword(int length) {
        char[] generatedPassword = new char[length];
        String listOfCharacters = "abcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+=";
        for (int i=0; i<length; i++) {
            int randomCharacter = (int) (Math.random() * listOfCharacters.length());
            generatedPassword[i] = listOfCharacters.charAt(randomCharacter);
        }
       return new String(generatedPassword);
    }

    // Set mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    // Set alternate email
    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // Change password
    public void changePassword(String password) {
        this.password = password;
    }

    // Get methods to display password, email, and mailbox capacity
    public String getPassword() {
        return password;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String showInfo() {
        return "NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";

    }













}
