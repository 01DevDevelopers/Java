import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
		int TC = sc.nextInt();

		while(TC>0)
		{
			int n = sc.nextInt();
			int a[][] = new int[n][n];

			for(int i = 0;i<n;i++)
			{
				for(int j = 0;j<n;j++)
				{
					a[i][j] = sc.nextInt();
				}
			}
