import java.util.Scanner;

public class HelloWorld
{

	public static void main(String[] args)
	{
	    int N = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value for N:");
        N = scanner.nextInt();
        int arr[] = new int[N];
        for (int k = 0; k < N; k++) {
            System.out.println("The array elements are:");
            arr[k] = scanner.nextInt();
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.println("-------");
        System.out.println(arr[N-1]);
        System.out.println(arr[N-2]);
	}

}
