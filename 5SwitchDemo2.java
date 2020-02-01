//this demo is for string comparison(from jdk 7)
class SwitchDemo2


{
	public static void main(String[] args)
		
	{
		String Day = "Tuesday";
		switch(Day)
		{
			case "Monday":
			    System.out.println("Today is monday");
			    break;
			case "Tuesday":
			    System.out.println("Today is Tuesday");
			    break;
			default:
                System.out.println("Yous choice is not decent");
		}
	
		System.out.println("Out of the switch block");
	}
}
