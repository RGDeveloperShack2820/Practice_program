
class Student_p2
{
	public String name;
			int roll_no;
			long phno;
			String adds;
}

public class P2 {

	public static void main(String[] args) {
		
		Student_p2 S1= new Student_p2();
		Student_p2 S2= new Student_p2();
		
		S1.name="Sam";
		S1.phno= 9953663110L;
		S1.roll_no=5;
		S1.adds="243,street 4";
		
		S2.name="Jhon";
		S2.phno=9811699980L;
		S2.roll_no=6;
		S2.adds="234,street 10";
		
		
		System.out.println("Name: "+S1.name+"\nRoll no= "+S1.roll_no+"\nPh no="+S1.phno+"\nAddress="+S1.adds);
		System.out.println("Name: "+S2.name+"\nRoll no= "+S2.roll_no+"\nPh no="+S2.phno+"\nAddress="+S2.adds);
	}

}
