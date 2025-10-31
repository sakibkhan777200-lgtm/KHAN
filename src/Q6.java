public class Q6 {
    public static void main(String[] args) {
        int arr[]={23,78,45,23,24};
        int sum =0;
        for(int i=0;i<arr.length;i++){
            sum =sum+arr[i];
        }
        double average =(double)sum/arr.length;
        System.out.println("Average of elemnt are"+average);
    }
}
