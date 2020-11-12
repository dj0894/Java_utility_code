import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String studentID;
    private String gradYear;
    private int gradeLevel;
    private String courses;
    private  int tuitionBalance=0;
    private static int courseCost=600;
    private static int id=1000;

    public Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter student first name");
        this.firstName=sc.nextLine();
        System.out.println("Enter student last name");
        this.lastName=sc.nextLine();
        System.out.println("Enter student gradLevel");
        System.out.println("1.Freshman\n2.Sophomore\n3.Junior\n4.Senior");
        this.gradYear=sc.nextLine();
        setStudentID();
        enroll();
        payTuition();
    }

    private void setStudentID() {
        id++;
        this.studentID=gradYear+""+id;
    }


    public void enroll(){
       do {
           System.out.print("Enter course to enroll (Q tp quit): ");

           Scanner sc = new Scanner(System.in);
           String course = sc.nextLine();
           if (!course.equals("Q")) {
               course = courses + "\n" + course;
               tuitionBalance = tuitionBalance + courseCost;
           } else {
               break;
           }
       }while(1!=0);

    }

    public void viewBalance(){
        System.out.println(" Your Balance $"+tuitionBalance);
    }

    public void  payTuition(){
        viewBalance();
        Scanner sc=new Scanner(System.in);
        System.out.print("How much you want to pay ");
        int payment=sc.nextInt();

            tuitionBalance = tuitionBalance - payment;
            System.out.print("Thanks for your payment of $ " + payment+" ,");
            viewBalance();
        }


    @Override
    public String toString() {

        return
                "Student name= " + firstName + lastName+
                "\nstudentID= " + studentID +
                "\ngradLevel= " + gradYear +
                "\ntuitionBalance= " + tuitionBalance ;

    }
}











