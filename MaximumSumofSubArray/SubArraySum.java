import java.util.*;
class SubArraySum
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,4,2,3,5,9};
		int n = arr.length;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i=0;i<n;i++)
		{
			for (int j=i;j<n;j++)
			{
				int sum=0;
				for (int k=i;k<=j;k++)
				{
					sum+=arr[k];
									
				}
				list.add(sum);

			}
		}
		Collections.sort(list);
		int m=list.size();
		System.out.println(list.get(m-1));

	}
}