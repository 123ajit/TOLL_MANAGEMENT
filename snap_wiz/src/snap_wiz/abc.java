package snap_wiz;

import java.util.Scanner;

public class abc
{
	static int maxLen(int arr[], int n)
	{
		int max_len = 0;
		for (int i = 0; i < n; i++)
		{
			int curr_sum = 0;
			for (int j = i; j < n; j++)
			{
				curr_sum += arr[j];
				if (curr_sum == 0)
					max_len = Math.max(max_len, j - i + 1);
			}
		}
		return max_len;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for (int i = 0; i < a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		int l = a.length;
		System.out.println(maxLen(a,l));
	}
}
