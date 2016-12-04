public class BubbleSort
{
public int i,j;
public  void bubbleSort(int []A)
{
   for(i=1;i<A.length;i++)
   {
	for(j=0;j<A.length-1;j++)
	{
		if(A[j]>A[j+1])
 		{
		int temp = A[j];
		A[j] = A[j+1];
		A[j+1] = temp;
 		}
	}
    }
}

}
