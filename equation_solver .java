import java.util.Scanner;
public class Equation_solver{
    public static void main(String[] args) {
        float x ,y,k ;
        try(Scanner put = new Scanner (System.in)){
        System.out.println("put value of x :");
        x  = put.nextFloat();
        System.out.println("put value of y :");
        y = put.nextFloat();
        k = x*25+y*x/26+y-2;
        System.out.println("The value of the given equation is :"+k);
        
        }
    }
    
}
