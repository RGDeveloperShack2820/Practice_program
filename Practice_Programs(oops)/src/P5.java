class Rectangle{
	
	public int x,y;
	
	Rectangle(int l,int b) {
		
		x=l;
		y=b;
	}
	
    double Area() {
    	
    	return (x*y);
    }
}

public class P5 {

	public static void main(String[] args) {
	
		Rectangle R1=new Rectangle(4, 5);
		Rectangle R2=new Rectangle(5, 8);
		
		System.out.println("Area of R1 = "+R1.Area()+"\nArea of R2 = "+R2.Area());
	}

}
