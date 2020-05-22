class Matrix{
	
	int row,column;
	int[][] matrix;
	
	Matrix (int r,int c){
		
		row=r;
		column=c;
		
		matrix =new int [row][column];
}
	int getRows() {
		
		return row;
	}
	
	int getcolumn() {
		
		return column;
	}
	
	int getElement(int r,int c) {
		
		return matrix[r][c];
	}
	
	void setElement(int r,int c ,int e) {
		
		matrix[r][c]=e;
	}
	
	Matrix add(Matrix A, Matrix B){
	   
		
		if(A.row==B.row&&A.column==B.column) {
			Matrix Ans= new Matrix(A.row,B.column);
			
			for(int i=0;i<A.row;i++) {
				
				for(int j=0;j<A.column;j++) {
					
					Ans.setElement(i, j, (A.getElement(i, j)+B.getElement(i, j)));
				}
			}
			return Ans;
		}
		else {
			System.out.println("Matrices Can't Be Added");
			return new Matrix(0,0);
		}
	  
	}
	
	Matrix product(Matrix A, Matrix B){
	   
		
		if(A.column==B.row) {
			Matrix Ans= new Matrix(A.row,B.column);
			
			for(int i=0;i<A.row;i++) {
				
				for(int j=0;j<B.column;j++) {
					
					int sum=0;
					
					for(int k=0; k<A.row;k++) {
					
						sum+=(A.getElement(i, k)*B.getElement(k, j));
					}
					
					Ans.setElement(i,j ,sum );
				} 
			}
			return Ans;
		}
		else {
			System.out.println("Matrices Can't Be Multiplied");
			return new Matrix(0,0);
		}
	  
	}
	
	void display() {
		
		for(int i=0;i<row;i++) {
			
			for(int j=0;j<column;j++) {
				
				System.out.print(matrix[i][j]+"\t");
			}
			
			System.out.println("\n");
		}
		
	}
}
public class P14 {

	public static void main(String[] args) {
	
       Matrix M1= new Matrix(2, 2);
       M1.setElement(0, 0, 1);
       M1.setElement(0, 1, 1);
       M1.setElement(1, 0, 1);
       M1.setElement(1, 1, 1);
       
       Matrix M2= new Matrix(2, 2);
       M2.setElement(0, 0, 1);
       M2.setElement(0, 1, 1);
       M2.setElement(1, 0, 1);
       M2.setElement(1, 1, 1);
    
       
       Matrix M3=new Matrix(0,0);
       
      
       
       System.out.println("Added matrix : \n");
       M3=M3.add(M1, M2);
       M3.display();
       

       System.out.println("\nMultiplied matrix : \n");
       M3=M3.product(M1, M2);
       M3.display();
       
       
       
	}

}
