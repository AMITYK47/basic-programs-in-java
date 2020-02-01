//this demo is for single dimensional array
class ArrayDemo2

  
{
	public static void main(String[] args) 
	{
		//detclare and create int array whose size is 10
		int[] arr=new int[10];
		arr[0]=10;//this is initilazation
		arr[1]=20;
		arr[9]=30;
		//display the value of each entry in the array
		for(int i=0;i<arr.length;i++)

		{
		
		System.out.println(arr[i]+"\t");
	    }
	}
}
