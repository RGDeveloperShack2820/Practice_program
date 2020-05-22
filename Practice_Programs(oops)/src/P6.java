import java.util.Scanner;

class Area{
	
	public int l,b;
	
	void getDim()   {
		
		Scanner dim=new Scanner(System.in);
		System.out.println("Enter Length : ");
		l=dim.nextInt();
		System.out.println("Enter Breadth : ");
		b=dim.nextInt();
	    dim.close();
		
		
		
	}
	
	double getArea() {
		
		return (l*b);
	}
}

public class P6 {

	public static void main(String[] args) {
		
			Area A1=new Area();
			
			A1.getDim();
			
			System.out.println("Area Of Rectangle : "+	A1.getArea());
			
			
	}

}
