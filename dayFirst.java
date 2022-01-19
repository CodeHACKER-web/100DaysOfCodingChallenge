import java.util.Scanner;

public class dayFirst {
        public static void main(String []args){
        double si, p, t, r;

       Scanner scan= new Scanner(System.in);

        System.out.println("Enter Principal Amount");
        p=scan.nextDouble();
        System.out.println("Enter Time Period ");
        t=scan.nextDouble();
        System.out.println("Enter Rate");
        r=scan.nextDouble();

        si=(p*t*r)/100;
        System.out.println("The Simple Interest is: "+si);
    }
}