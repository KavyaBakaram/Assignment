
public class MethodOverloading 
{
	
	private static final String Car = null;
	public void personIdentity(String name, int id)
    {
 
        System.out.println("PersonName :" + name + " "
                           + "\tId :" + id);
    }
 
    public void personIdentity(int id)
    {      
		
		String name = null;
		System.out.println("\tId :" + id + " "
                + "PersonName :" + name);
    }
	public void personIdentity(int id, String name)
	{

		System.out.println("Id :" + id + " "
                       + "PersonName :" + name);
	}
	public void personIdentity(String CompanyName)
	{

		System.out.println("CompanyName :" + CompanyName);
	}
	public void personIdentity(float Salary)
	{

		System.out.println("");
	}
	public void personIdentity(boolean True)
	{
		System.out.println("Car :" + Car);
	}
	public void personIdentity(boolean True,String name )
	{
		System.out.println("Car :" + Car + " "
                + "PersonName :" + name);
	}

	public void personIdentity(String name, String string) {
		// TODO Auto-generated method stub
		
	}

}
class GFG 
{
    public static void main(String[] args)
    {
 
    	MethodOverloading mo = new MethodOverloading ();
 
        mo.personIdentity("Mohit", 1);
        mo.personIdentity("juli", 2);
        mo.personIdentity("Jhon",3);
        mo.personIdentity("Intellect");
        mo.personIdentity("25000");
        mo.personIdentity("Yes");
        mo.personIdentity("No");
    }
}

