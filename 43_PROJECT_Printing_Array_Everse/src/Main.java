import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int der = 0;
        System.out.print("Please determine the size of the array: ");
        der = scan.nextInt();


        int[] arr = new int[der];


        for (int i = 0; i < der; i++) {
            System.out.print("Please determine " + (i+1 )+ ". value of array: ");
            arr[i] = scan.nextInt();
        }

        int s = der / 2;
        for (int i = 0; i < s; i++) {
            int t = arr[i];
            arr[i] = arr[der - i - 1];
            arr[der - i - 1] = t;
        }


        for (int i = 0; i < der; i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
}
