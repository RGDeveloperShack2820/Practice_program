import java.util.Scanner;

class AddDistance{
	
    int f1,i1,f2,i2;
	
	
	void add() {
		
		int f3,i3;
		
		f3=f1+f2;
		
		if((i1+i2)<=12) {
		
			i3=i1+i2;
		}	
		else {
			i3=(i1+i2)%12;	
			f3=f3+(i1+i2)/12;
		}
		
		System.out.println("\nAddition = "+f3+" Feet "+i3+" Inches");
		
	}
	
}
public class P11 {

	public static void main(String[] args) {
		
		Scanner get=new Scanner(System.in);
		AddDistance A1=new AddDistance();
		System.out.print("First Value:\nFeet Part = ");
		A1.f1=get.nextInt();
		System.out.print("Inches Part = ");
		A1.i1=get.nextInt();
		
		System.out.print("\nFirst Value:\nFeet Part = ");
		A1.f2=get.nextInt();
		System.out.print("Inches Part = ");
		A1.i2=get.nextInt();
		
		get.close();
		
		A1.add();
		
	}

}
