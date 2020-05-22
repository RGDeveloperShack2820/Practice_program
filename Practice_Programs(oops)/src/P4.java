class Triangle_p4
{   
	int x,y,z;
	public Triangle_p4(int a,int b,int c) {
		
		x=a;
		y=b;
		z=c;
	}
	
	public double Area() {
		
		double s=(x+y+z)/2;
		return Math.pow((s*(s-x)*(s-y)*(s-z)), 0.5);
	}
	
	public double Perimeter() {
		
		return (x+y+z);
	}
	
}

public class P4 {

	public static void main(String[] args) {
		
			Triangle_p4 t1=new Triangle_p4(3, 4, 5);
			
			System.out.println("Area = "+t1.Area()+"\nPerimeter= "+t1.Perimeter());
	}

}
