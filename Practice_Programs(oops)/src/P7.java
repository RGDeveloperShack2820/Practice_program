import java.util.Scanner;

class Area_p7{
	
	int l,b;
	
    Area_p7(int x,int y){
		
		l=x;
		b=y;
	}
	
	double returnArea(){
		
		return (l*b);
	}
}
public class P7 {

	public static void main(String[] args) {
	
		int x,y;
		
		Scanner dim=new Scanner(System.in);
		System.out.println("Enter Length :");
		x=dim.nextInt();
		System.out.println("Enter Breadth :");
		y=dim.nextInt();
		dim.close();
		
		Area_p7 A1= new Area_p7(x, y);
		
		System.out.println("Area of Rectangle :"+A1.returnArea());
		

	}

}
