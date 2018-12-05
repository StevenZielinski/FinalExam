
public class Exam 
{
	public static void main(String[] args) 
	{
		int questionNumber;
		
		try
		{
			questionNumber = Integer.parseInt(args[0]);
		}
		catch(Exception e)
		{
			System.out.println("Please make sure to enter an integer of either 1 or 2");
			questionNumber = 3;
		}
		
		String filename = args[1];
		
		if (questionNumber == 1)
		{
			QuestionOne qone = new QuestionOne(filename);
			qone.readData();
		}
		else if (questionNumber == 2)
		{
			QuestionTwo qtwo = new QuestionTwo(filename);
			qtwo.readData();
		}
		else
		{
			System.out.println("Again remember to enter a number of either 1 or 2");
		}
	}
}
