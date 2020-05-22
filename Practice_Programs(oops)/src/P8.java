import java.util.Scanner;

class Average{
	
	int a,b,c;
	
	void getAverage() {
		
		double avg= (a+b+c)/3;
		System.out.println("Average ="+avg);
		
	}
}
public class P8 {

	public static void main(String[] args) {
		
		Average A1= new Average();
		Scanner no=new Scanner(System.in);
		
		System.out.println("Enter Three Numbers :");
		A1.a=no.nextInt();
		A1.b=no.nextInt();
		A1.c=no.nextInt();
		
		no.close();
		
		A1.getAverage();
		

	}

}
