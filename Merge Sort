import java.util.ArrayList;
import java.util.Scanner;
class Solution{
    public static void merge(int arr[], int low, int mid, int high){

        //Creating a temporary arraylist for storing the merged elements
        ArrayList<Integer> temp= new ArrayList<>();

        int left=low;
        int right=mid+1;

        while(left<=mid && right<=high){
            if( arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }
            else{
                temp.add(arr[right]);
                right++;
            }
        }
        //if elements are still left on the left side
        while (left<=mid){
            temp.add(arr[left]);
            left++;
        }
        //if elements are still left on the right
        while (right<=high){
            temp.add(arr[right] );
            right++;
        }
        // Copying the merged elements back to the original array
        for (int i= 0; i< temp.size(); i++){
            arr[low+i]=temp.get(i);
        }
    }
    public static void mergesort(int arr[],int low,int high) {

        if (low>=high) {
            return; //Base case
        }

        int mid=(low + high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low , mid, high);
    }
}
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        //Insertion
        System.out.println("Enter value of n -");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        // printing before sorting
        System.out.println("before sorting :");
        for (int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        Solution.mergesort(arr, 0, n-1);
        System.out.println("After sorting:");
        for (int i=0; i< arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
