import java.util.Scanner;

public class QuestionOne 
{
	public Scanner input;
	
	public String[] name;
	public int[]    nodeOne;
	public int[]    nodeTwo;
	
	public QuestionOne(String filename)
	{
		input = new Scanner(filename);
	}
	
	public void readData()
	{
		int resistors = input.nextInt();
		
		name = new String[resistors];
		nodeOne = new int[resistors];
		nodeTwo = new int[resistors];
		
		for(int i = 0; i < resistors; i++)
		{
			name[i] = input.next();
			nodeOne[i] = input.nextInt();
			nodeTwo[i] = input.nextInt();
		}
	}
}
