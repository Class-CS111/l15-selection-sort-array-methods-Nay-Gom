/********************************************
*	AUTHOR:	<name>
* COLLABORATORS: <names>
*	COURSE:	CS 111 Intro to CS I - Java
*	LAST MODIFIED:	<date>
********************************************/

public class Main 
{
  public static void main(String[] args)
  {
    int[] values = {12, 16, 26, 42, 53, 77, 84};


    System.out.println("TEST: array contents = " + ArrayMethods.arrayString(values));

    ArrayMethods.swap(values, 0, 6);

    System.out.println("TEST: array after swap of 12 and 84 = " + ArrayMethods.arrayString(values));

    int[] numbers = {42, 16, 84, 12, 77, 26, 53 };
    int minIndex1 = ArrayMethods.indexOfMin(numbers, 0); 
    //should be 12 (numbers[minIndex1]), index is 3
    int minIndex2 = ArrayMethods.indexOfMin(numbers, 4);
    //should be 26, index is 5


    System.out.println("TEST: min indices should be 3 and 5, we got: " + minIndex1 + " and " + minIndex2 );

    System.out.println("TEST: array before reversal = " + ArrayMethods.arrayString(numbers));
  
    ArrayMethods.reverse(numbers);

    System.out.println("TEST: array after reversal = " + ArrayMethods.arrayString(numbers));

    System.out.println("TEST: array before sorting = " + ArrayMethods.arrayString(numbers));

    ArrayMethods.selectionSort(numbers);

    System.out.println("TEST: array after sorting = " + ArrayMethods.arrayString(numbers));
  }
}