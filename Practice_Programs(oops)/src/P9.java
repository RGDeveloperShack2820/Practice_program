import java.util.Scanner;

class Complex{
	
   float r1,i1,r2,i2;
   
   void add() {
	   
	   double r3=r1+r2;
	   double i3=i1+i2;
	   
	   System.out.println("\nAddition = "+r3+" + (i)"+i3);
   }
   
 void sub() {
	   
	   double r3=r1-r2;
	   double i3=i1-i2;
	   
	   System.out.println("Subtraction = "+r3+" + (i)"+i3);
   }
}

public class P9 {

	public static void main(String[] args) {
	
		Scanner no= new Scanner(System.in);
		Complex c1= new Complex();
		System.out.print("Enter First no :\nReal Part = ");
		c1.r1=no.nextFloat();
		System.out.print("Imaginary Part = ");
		c1.i1=no.nextFloat();
		
		System.out.print("\nEnter Second no :\nReal Part = ");
		c1.r2=no.nextFloat();
		System.out.print("Imaginary Part = ");
		c1.i2=no.nextFloat();
		no.close();
		
	    c1.add();
	    c1.sub();
	}

}
