import java.util.Scanner;
import java.util.Arrays;

public class Main
{
public static void main(String []args)
{
Scanner input = new Scanner(System.in);
BubbleSort bs = new BubbleSort();
BinarySearch bs1 = new BinarySearch();

System.out.print("Enter the length of array: ");
int length =  input.nextInt();


int []A = new int[length];

System.out.print("Enter the element of array: ");
for(int i=0;i<length;i++)
A[i] = input.nextInt();

int i,j;

bs.bubbleSort(A);
System.out.println(Arrays.toString(A));

int start = 0;
int end = length -1;
bs1.binarySearch(A,start,end);

}
}
