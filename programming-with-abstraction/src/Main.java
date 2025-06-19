import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // your code here
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating Area of Rectangle:");
        System.out.print("Enter Width:");
        float w = sc.nextFloat();
        System.out.print("Enter height: ");
        float h = sc.nextFloat();

        Rectangle rct = new Rectangle(w, h);
        System.out.println();
        rct.draw();
        System.out.println("Area: "+rct.calculateArea());


        System.out.println("Calculating Area of Circle: ");
        System.out.print("Enter radius:");
        float r = sc.nextFloat();

        Circle cr = new Circle(r);
        System.out.println();
        cr.draw();
        System.out.println("Area: " + cr.calculateArea());

    }
}

