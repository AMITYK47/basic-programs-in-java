//this demo is for basic for loop and enhanced forloop
class ArrayDemo1

  
{
	static public  void main(String[] args) 
	{
		int[]arr={10,20,30};

		System.out.println("Using basic for loop");
		for(int i=0;i<arr.length;i++)

		{
			System.out.println(arr[i]+"\t");

		}
		System.out.println();//for new line
		System.out.println("using Enhanced for loop");
		for(int var:arr)
			{
			System.out.println(var);
		    }
	}
}
