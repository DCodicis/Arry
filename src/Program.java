import java.util.Scanner;
public class Program {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] arr = new int[7];

        int num = s.nextInt();
        System.out.println(Calculator.maxDigit(num));

        System.out.println("Enter Numbers: ");
        for(int i=0 ; i<arr.length ;i++){
            arr[i] = s.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
        }
        System.out.println("The sum of all numbers: "+sum);

        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("The max number: "+max);

        int min = max;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("The minimum is: "+min);

        //uncorrect arry printing
        //System.out.println(arr);


    }
}
