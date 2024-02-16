import java.util.Scanner;

public class HelloWorld
{

	public static void main(String[] args)
	{
		   Scanner scanner = new Scanner(System.in);
	        int t = scanner.nextInt();
	        while (t-- > 0) {
	            int n = scanner.nextInt();
	            int a[] = new int[n];
	            int b[] = new int[n];
	           int count =0;
	            for (int j = 0; j < n; j++) {
	                a[j] = scanner.nextInt();
	            }
	            for (int k = 0; k < n; k++) {
	                b[k] = scanner.nextInt();
	            }
	            for (int i = 0; i < n; i++) {
	                if (a[i] <=2*b[i] && b[i]<=2*a[i]) {
	                    count=count+1;
	                }
	            }
	            System.out.println("the day both were happy are"+count);

	        }
	}

}
