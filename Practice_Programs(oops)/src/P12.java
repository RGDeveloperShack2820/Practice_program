class  Employee_p12 {
  
	int salary,wh;
	
	void getinfo(int salary,int wh) {
		
		this.salary=salary;
		this.wh=wh;
	}
	
	void addSal() {
		
		if(salary<500)
		{
			salary+=10;
		}
	}
	
	void addwork() {
		
		if(wh>6)
		{
			salary+=5;
		}
	}
	
}

public class P12 {

	public static void main(String[] args) {
		
		Employee_p12 E1= new Employee_p12();
		
		E1.getinfo(400, 7);
		E1.addSal();
		E1.addwork();
		
		System.out.println("Final Salary : "+E1.salary);

	}

}
