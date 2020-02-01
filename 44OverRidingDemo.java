//This demo is for method overriding
class Employee
{
   String fname,lname;   //instance variable

   public void disp()
   {
      System.out.println("First name is "+fname);
      System.out.println("Last name is "+lname);
   }
} //class End
class FullTimeEmployee extends Employee
{
    int monthlySalary;
    public void disp()   //overriding
    {
/*
   System.out.println("First name is "+fname);
   System.out.println("Last name is "+lname);
   or
   */
	super.disp();   //it call parent class disp()
   System.out.println("Monthly Salary is "+monthlySalary);
	}
public static void main(String args[])
{
     FullTimeEmployee fte=new FullTimeEmployee();
	 fte.fname="DD";
	 fte.lname="Singh";
     fte.monthlySalary=3000;
     fte.disp();
}
}


