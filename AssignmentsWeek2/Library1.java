package AssignmentsWeek2;

public class Library1 
	{
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book Added Successfully");
		return bookTitle;
	}
	
	void issueBook()
	{
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Library1 obj1=new Library1();
		System.out.println("Book Title is: " +obj1.addBook("Computer Science"));
		obj1.issueBook();
	}

}
