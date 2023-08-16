import java.util.Scanner;

public class EmailApp {


    public static void main(String[] args) {

        Email employee1Email = new Email("Charlie", "Bucket");


        String dept = "";

            System.out.println("CURRENT DEPARTMENTS:\n 1) Chocolate\n 2) Fizzy-Lifting-Drink\n 3) Wonkavator\n 4) None ");
            System.out.println("Please select the corresponding numerical code for your department: ");
            Scanner in = new Scanner(System.in);
            int deptSelection = in.nextInt();
            if (deptSelection == 1) {
                dept = "Chocolate";
            } else if (deptSelection == 2) {
                dept = "Fizzy-Lifting-Drink";
            } else if (deptSelection == 3) {
                dept =  "Wonkavator";
            } else {
                dept = "";
            }
        employee1Email.setDept(dept);
        employee1Email.setEmail();
        System.out.println(employee1Email.showInfo());


    }
}
