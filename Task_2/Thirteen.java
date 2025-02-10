public class Thirteen {
    public static void main(String[] args) {
        
        // int target = 10;
        int[] arr = { 1, 10 ,4 , 7, 89,0};
        int min = arr[0];
        for ( int i = 1; i < arr.length; i++) {
            if ( arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println(min);
    }
    
}
