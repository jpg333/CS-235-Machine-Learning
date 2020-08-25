import java.util.*;

public class main 
{

	public static void main(String[] args) 
	{
		/*	
		 * This program will populate a 2D array with data pairings representative of the coordinates of a 
		 * straight line, whose function will be based on user input
		*/
		
										
		Scanner scn = new Scanner(System.in);			// scanner to read input
		
		
		//default variable declarations 
		
		int min = -2;									// min x value
		int max = 2;									// max x value
		int m = 1;										// m = slope 
		int a = 0;										// a = horizontal translation 
		int b = 0;										// b = vertical translation
		
		
		// user input scans
		System.out.println("Use this program to generate points of a straight line."
				+ "\nYou will be asked for the x-axis bounds of the line,\nfollowed by the slope and horizontal/vertical translations."
				+ "\nLeave blank for default values."
				+ "\n------------------------------------------------------------");
		
		String temp;				// temporary string to store scanner input
		
		// input for 'min'
		System.out.println("Enter lower x bound of line (default -2): ");
		temp = scn.nextLine();				// read next line		
		if (temp.isBlank())					// if blank input, leave as default				
			;
		else
			min = Integer.valueOf(temp);	// else update min with input
		
		
		// input for 'max'
		System.out.println("Enter upper x bound of line (default 2): ");
		temp = scn.nextLine();				// read next line
		if (temp.isBlank())					// if blank input, leave as default	
		{	
			;
		}
		else while (Integer.valueOf(temp) < min )				// while loop to ensure that max is larger than min
		{
			System.out.println("ERROR: Please enter an upper bound that is larger or equal to the lower bound.");
			System.out.println("Enter upper x bound of line (default -2): ");
			temp = scn.nextLine();								// prompt and scan repeat until exit
			max = Integer.valueOf(temp);
		}
							// update max with input
		
			
		// input for 'm' (same as min)
		System.out.println("Enter slope value 'm' (default 1): ");
		temp = scn.nextLine();
		if (temp.isBlank())
			;
		else
			m = Integer.valueOf(temp);
		
		
		// input for 'a' (same as min)
		System.out.println("Enter horizontal translation 'a' (default 0): ");
		temp = scn.nextLine();
		if (temp.isBlank())
			;
		else
			a = Integer.valueOf(temp);
		
		
		// input for 'b' (same as min)
		System.out.println("Enter horizontal translation 'b' (default 0): ");
		temp = scn.nextLine();
		if (temp.isBlank())
			;
		else
			b = Integer.valueOf(temp);
		
		
		// calculations and array generation
		int n = max - min + 1;						// calculate number of points to be shown after input
		
		int[][] coords = new int[n][2];				// array for graph coord points
		
		int x = min;								// preserve min value while being able to increment over x
		
			for (int i = 0; i < n; i++)
			{		
				// i = coordinate number	
				
				// x value
				coords[i][0] = x;
					
				// y value		
				coords[i][1] = (m * (x - a) + b );
				
				x++; // increment x 
				
			}
		
		System.out.println("\n------------------------------------------------------------"
				+ "\nThe points along the line: "
				+ "y = " + m +"(x - " + a + ") + " +b + " \nBetween the bounds: "
						+ "x = " + min + " and x = " + max + " are:");
		System.out.println(Arrays.deepToString(coords));
		
	}

}
