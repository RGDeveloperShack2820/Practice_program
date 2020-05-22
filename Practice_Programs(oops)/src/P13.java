class Matrix_p13 {

	int rows,columns;
    int[][] matrix;
  
    
	
	public Matrix_p13(int rows,int columns) {
	
		this.rows=rows;
		this.columns=columns;
		
	   matrix= new int [this.rows][this.columns];
	   
	}
}
public class P13 {

	public static void main(String[] args) {
		
         Matrix_p13 M1=new  Matrix_p13(2, 2);
        M1.matrix[0][0]=1;
        M1.matrix[0][1]=2;
        M1.matrix[1][0]=3;
        M1.matrix[1][1]=4;
        
        System.out.println("Matrix :\n");
        for(int i=0; i<=1;i++)
        {
        	for(int j=0; j<=1; j++)
        	{
        		System.out.print(M1.matrix[i][j]+"\t");
        	}
        		
        	System.out.println("\n");
        }
         
	}

}
