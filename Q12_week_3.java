public class Q12_week_3{
    public static int length(int arr[]){
        int lp = 0; 
        int rp = arr.length-1; 
        while(lp != rp){
            if(arr[lp] < arr[lp+1]){
                lp++;
            }
            else if(arr[rp] > arr[rp-1]){
                rp--;
            }
            else{
                return (rp-lp+1);
            }
        }
        return 0;
    }
    public static void main(String args[]){
        //case 1
        int arr[] = {2,6,4,8,0,9,15};

        // case 2 
        // int arr[] = {1,2,3,4};

        // case 3
        // int arr[] = {1};

        System.out.println(length(arr));
    }
}