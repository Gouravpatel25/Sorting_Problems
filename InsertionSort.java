import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Insertion
        System.out.println("Enter value of n -");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        //InsertionSort Logic
        for (int i = 0; i < args.length; i++) {
            int temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > temp) {

                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        //printing
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

