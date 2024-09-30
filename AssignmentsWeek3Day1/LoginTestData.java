package AssignmentsWeek3Day1;

public class LoginTestData extends TestData
{
	
	public void enterUsername()
	{
		System.out.println("User Name Entered");
	}
	
	public void enterPassword()
	{
		System.out.println("Password Entered");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		LoginTestData Login=new LoginTestData();
		Login.enterCredentials();
		Login.enterUsername();
		Login.enterPassword();
		Login.navigateToHomePage();
	}
}
