package par;

import emp.Employee;
import bonus.issuebonus;

public class demopackage 
{
	public static void main(String args[])
	{

	System.out.println("this program illustrates use of package....");
	Employee list[]=new Employee[2];
	for(byte i=0;i<list.length;i++)
		list[i]=new Employee();
	System.out.println("\n***************");
	System.out.println("empId\tempName\texpYears salary");
	System.out.println("\n***************");
	for(byte i=0;i<list.length;i++)
	{
		issuebonus.issueEmployeeBonus(list[i]);
		list[i].getEmployee2();
	}
	
	System.out.println("***************");

}
}
