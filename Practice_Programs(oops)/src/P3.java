class Triangle
{
  public int a,b,c;
  		 
  		 
  public double Area()
  		{   
	        double s=(a+b+c)/2;
	  		return Math.pow((s*(s-a)*(s-b)*(s-c)),0.5);
  		}
  
  public double Perimeter() 
  		{
	  		return (a+b+c);
  		}	
	  		
  		
}

public class P3 {

	public static void main(String[] args) {
		
		Triangle t1= new Triangle() ;
		
		t1.a=3;
		t1.b=4;
		t1.c=5;
		
		System.out.println("Area = "+t1.Area()+"\nPerimeter= "+t1.Perimeter());

	}

}
