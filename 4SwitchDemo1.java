//this demo is for switch case statement

class SwitchDemo1
{


	public static void main(String[] args) 
	{
		int var = 20;
		switch(var)
		{
			case 10:
			    System.out.println("Hello");
			    break;
			case 20:
				System.out.println("Hi");
                break;
		    default:
		        System.out.println("Your choice is not decent");
		}
		System.out.println("Out of the switch block");
	}
}
