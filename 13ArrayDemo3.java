//this demo is for multi dimensional array
class ArrayDemo3

  
{
	public static void main(String[] args) 
	{
		//declare and create tho dimensional int array whose size is 3 by 5
		int [][]arr=new int[3][5];
		//display the number of rows and columns

		System.out.println("Number of rows"+arr.length);//3
		System.out.println("Number of colunms in first row= "+arr[0].length);//5
		System.out.println("Number of colimns in second row= "+arr[1].length);//5
		//display the value of each entry in the array
		for(int i=0;i<3;i++)

	    {
			System.out.println("\n Starting row"+i);

		      for(int j=0;j<5;j++)

		    {
			   arr[i][j]=i*j;
			   System.out.println("\t"+arr[i][j]+"\t");

	     	}

		
	  }
	}
}
