//This demo is for hierarchical inheritance
class Employee
{
   String fname,lname;

   public void disp()
   {
	    System.out.println("First name is "+fname);
    	System.out.println("Last name is "+lname);
        System.out.println();  //for a blank line
	}
} //class End

class FullTimeEmployee extends Employee
{
           int monthlySalary;


}
class PartTimeEmployee extends Employee
{
           int hourlySalary;
}
class Tester
{

	public static void main(String args[])
	{

      FullTimeEmployee fte=new FullTimeEmployee();
			 fte.fname="DD";
			 fte.lname="Singh";
			 fte.monthlySalary=3000;
             fte.disp();

   PartTimeEmployee pte=new PartTimeEmployee();
		 pte.fname="Dev";
		 pte.lname="Singh";
		 pte.hourlySalary=2000;
		 pte.disp();

	}
}


