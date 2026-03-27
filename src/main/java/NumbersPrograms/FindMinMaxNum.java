package NumbersPrograms;

public class FindMinMaxNum {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 8, 15};
        int min = arr[0];
        int max = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
