import java.lang.Math;
import java.util.Arrays;



public class main 
{

public static void main(String[] args) 
{
	
	//main method calls other methods for array generation and sorting
	//Arrays class toString used to print generated array before and after sorting
	int[] array = generateArray();
	
	System.out.println("Unsorted Array: " + Arrays.toString(array));
	
	bubbleSort(array);
	
	System.out.println("Sorted Array: " + Arrays.toString(array));
}



//Array of size 10 is randomly generated with values between 0 and 100
public static int[] generateArray() 
{
	
	int[] array = new int[10];
	
	for (int i = 0; i < array.length; i++)
	{
		array[i] = (int)(Math.random()*100); 
	}
	
	return array;
}

//Bubble sort implementation. Array sorted from low to high
public static void bubbleSort(int[] array) {
	
	int temp;
	
	for (int i = 0; i < array.length; i++)
	{
		for (int j = 0; j < array.length-1; j++)
		{
			if (array[j] > array[j+1])
			{
				temp = array[j];
				array[j]= array[j+1];
				array[j+1] = temp;
			}
			
		}
		
	}
	
}

}
