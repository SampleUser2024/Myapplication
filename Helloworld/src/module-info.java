import java.util.Scanner;

public class HelloWorld
{

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
	        int T = scanner.nextInt();

	        for (int i = 0; i < T; i++) {

	            int N = scanner.nextInt();
	            int arr[] = new int[N];
	            for (int k = 0; k < arr.length; k++) {
	                arr[k] = scanner.nextInt();
	            }
	            boolean isincreasing = true;
	            for (int j = 1; j < arr.length; j++) {
	                if (arr[j - 1] > arr[j]) {
	                    isincreasing = false;
	                    break;
	                }
	            }
	            if (isincreasing) {
	                System.err.println("Yes");
	            } else {
	                System.out.println("No");
	            }

	        }
	}

}
