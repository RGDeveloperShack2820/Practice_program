
class Employees{
	
	String name;
	int year;
	String address;
	
	public Employees(String name,int year,String address) {
		
		this.name=name;
		this.year=year;
		this.address=address;
	}
	
	void disp() {
		
		System.out.println(name+"\t\t"+year+"\t\t"+address);
	}
}

public class P10 {

	public static void main(String[] args) {
		
       Employees E1= new Employees("Robert", 1994, "64C-WallsStreat");
       Employees E2= new Employees("Sam",2000,"68D- WallsStreat");
       Employees E3= new Employees("John",1999,"26B- WallsStreat");
       
       System.out.println("NAME\t    YEAR OF JOINING \t ADDRESS\n");
       
       E1.disp();
       E2.disp();
       E3.disp();
       
	}

}
