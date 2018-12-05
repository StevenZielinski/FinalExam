import java.util.Scanner;

public class QuestionTwo 
{
	public Scanner input;
	
	int[][] truthTable;
	
	public QuestionTwo(String filename)
	{
		input = new Scanner(filename);
	}
	
	public void readData()
	{
		String line = input.nextLine();
		
		String[] variables = line.split(" ");
		
		int rows = (int)Math.pow(2, variables.length);
		int cols = variables.length + 1;
		
		truthTable = new int[rows][cols];
		
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
			{
				truthTable[i][j] = input.nextInt();
			}
		}
	}
}
