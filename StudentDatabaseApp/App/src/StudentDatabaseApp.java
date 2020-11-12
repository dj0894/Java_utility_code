import java.lang.reflect.Array;
import java.util.*;

public class StudentDatabaseApp {

    public static void main(String args[]) {


            Scanner sc=new Scanner(System.in);
            System.out.println("How many new students will be added to database");
            int numberOfStudent = sc.nextInt();
            List<Student> studentList = new ArrayList<>();
            for (int i = 0; i < numberOfStudent; i++) {
                studentList.add(i,new Student());
            }

            System.out.println("\n----Student status----");
            for(int i=0;i<numberOfStudent;i++){
                System.out.println(studentList.get(i).toString());
            }

    }

}