//This demo is for labeled countinue stasement 
class ContinueDemo2

{

   static public  void main(String... args)
    {
	     int i,j;

	  outer:
	  for(i=0;i<5;i++)
	{ 
	  for(j=0;j<5;j++)
		{
		   System.out.println("Hello");
		   continue outer;//This is labeled continue.
		}
	}
	     System.out.println("GoodBye");
	}

}
