public class Calculator {
    
    public static int maxDigit(int num){
        int[] arr = new int[10];
        int max = arr[0], maxDig = 0;

        do{
            arr[num%10]++;
            num = num / 10;
        }while(num!=0);

        for(int i = 0; i<arr.length; i++){
            if(arr[i]>max){
                max = arr[i];
                maxDig = i;
            }
        }
        return maxDig;
    }
}
