package AssignmentsWeek2;

public class FibonacciSeries 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int range=8;
		int firstNumber=0;
		int secondNumber=1;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for (int i=2;i<=range;i=i+1)
		{
			int nextNumber=firstNumber+secondNumber;
			System.out.println(nextNumber);
			firstNumber=secondNumber;
			secondNumber=nextNumber;
			
		}

	}

}
