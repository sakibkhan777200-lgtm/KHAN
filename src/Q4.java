import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the array sixe");
        int n =sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elemnt");
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("you enterd");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
