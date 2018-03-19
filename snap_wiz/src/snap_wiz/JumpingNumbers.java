package snap_wiz;

public class JumpingNumbers
{
public static void main(String[] args) 
{
	
	int arr[]=findN(45);
	for(int i=0;i<=arr.length;i++)
	{
		System.out.println(arr[i]+",");
	if(arr[i]-arr[i+1]==1||arr[i+1]-arr[i]==1)
	{
		System.out.println("jumping no");
		
	}
	else
	{
		System.out.println("No jumping no");
	}
	}
}


static int[] findN(int n)
{
	int a[]=new int[2];
	int k=1;
	while(n>0) {
	int t=n%10;
	for(int i=0;i<k ;i++)
	{
		a[i]=t;
	}
	n=n/10;
	}
return a;	
}
}
