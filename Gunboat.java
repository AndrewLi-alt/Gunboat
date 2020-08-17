import java.util.*;
public class Gunboat {
    public static void main(String []args){
        boolean loop = false;
        while (!loop) {
            System.out.println("Ahoy! Crew. Let's bomb some Buccaneers!");
            Scanner input = new Scanner(System.in);
            System.out.println("Yarr matey, what be our height 'bove these waves?");
            double h = input.nextDouble();
            System.out.println("How 'bout the 'nitial velocity mate?");
            double v = input.nextDouble();
            System.out.println("Jus' need the distance to their ship now, then we got'em!");
            double d = input.nextDouble();
            double a = (-4.9)*(d/v)*(d/v);
            double b = d;
            double c = a + h;
            double tantheta = (-b + (Math.sqrt(b*b - 4*a*c)))/(2*a);
            double tantheta2 = (-b - (Math.sqrt(b*b - 4*a*c)))/(2*a);
            double angle = Math.atan(tantheta)*(180/3.1415926536);
            double angle2 = Math.atan(tantheta2)*(180/3.1415926536);
            System.out.println("Alright, I'll line up the cannon to "+angle+" degrees. You aim the other one to "+angle2+" degrees. Eat Lead, Adboats!");
        }
    }
}
