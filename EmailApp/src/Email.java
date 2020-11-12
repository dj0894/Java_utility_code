import java.util.Scanner;
import java.util.UUID;

public class Email<passwordLength> {

    private String lastName;
    private String firstName;
    private String department;
    private String email;
    private String password;
    private String alternateEmail;
    int mailboxCapacity = 500;
    int passwordLength = 10;
    private String companyName = "google.com";

    //task to be done
    //ask for department
    //constructor for setting firstname and lastname
    //generate random password
    //set mailboxCapacity
    //change the password

    Email(String firstName, String lastName) {
        this.lastName = lastName;
        this.firstName = firstName;

        setDepartment();
        setPassword(passwordLength);
        if(this.department==""){
            email=firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"  + companyName;
        }else {
            email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + (this.department).toLowerCase() + "." + companyName;
        }
    }

    private String setDepartment() {
        System.out.println("Select the deapartment code\n1.Sales\n2.Accounting\n3.Dev\n4.None");
        System.out.println("Enter the department code");
        Scanner sc = new Scanner(System.in);
        int departmentId = sc.nextInt();

        if (departmentId == 1) {
            this.department = "Sales";
        } else if (departmentId == 2) {
            this.department = "Accounting";
        } else if (departmentId == 3) {
            this.department = "Dev";
        } else {
            this.department = "";
        }
        return this.department;
    }

    private String setPassword(int passwordLength) {
        String passwordSet = "ABCDEFGMHIJKLMNOPQRSTUVWXYZ$@#!01234556789";
        char[] password = new char[passwordLength];
        for (int i = 0; i < passwordLength; i++) {
            int random = (int) Math.random() * passwordSet.length();
            password[i] = passwordSet.charAt(random);
        }

        // System.out.println("Password generated"+ password.toString());
        return password.toString();
    }


    public int getMailboxCapacity() {
        return mailboxCapacity;
    }


    public String getAlternateEmail() {
        return this.alternateEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setmailboxCapacity(int mailboxCapacity) {
        this.mailboxCapacity = mailboxCapacity;

    }


    public void setAlternateEmail(String email) {
        this.alternateEmail = email;
    }

    public void changePassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Name:" + this.firstName +" "+this.lastName + "\nEmail: " + this.email + "\nMailCapacity:" + this.mailboxCapacity;
    }
}
