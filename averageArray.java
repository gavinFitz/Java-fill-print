import java.util.*;
public class averageArray
{
	public static void main(String args[])
	{
		int ar[] = new int [5];
		fillArray(ar);
		Arrays.sort(ar);
		int average =0, total =0, ans = 0;

		for(int a =0; a<ar.length; a++)
		{
			total = total + ar[a];
		}
		average = total/(ar.length);
		int min = Integer.MAX_VALUE;
		for (int b = 0; b <ar.length; b++)
		{
			int temp = ar[b];
			int tempDis = Math.abs(temp - average);
			if ((tempDis < min) || (tempDis == min))
			{
				min = tempDis;
				ans = temp;

			}
		}
		System.out.println(ans);

	}

	public static void fillArray(int ar[])
	{
		Scanner sc1 = new Scanner(System.in);

		for(int x =0; x < ar.length; x++)
		{
			System.out.print("Enter an integer:");
			ar[x] = sc1.nextInt();
		}
	}
	public static void printArray(int ar[])
	{
		for(int z =0; z < ar.length; z++)
		{
			System.out.println(ar[z]);
		}
	}
}
