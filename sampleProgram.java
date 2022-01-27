import java.util.Scanner;

public class sampleProgram{
    public static void main(String[] args){
        double area, r;
        System.out.println("Enter the Radius");
        
        Scanner scan=new Scanner(System.in);
        r=scan.nextDouble();

        area=3.14159*r*r;
        System.out.println("Area: "+ area);
    }
}