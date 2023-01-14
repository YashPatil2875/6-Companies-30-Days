public class Q3 {
    public static int fact(int n) {
        if(n == 0){
            return 0;
        }

        if (n == 1) {
            return 1;
        }

        int ans = n * fact(n - 1);

        return ans;
    }

    public static int trailZeros(int factorial) {
        int count = 0;
        if (factorial == 0) {
            return 0;
        }
        while (factorial > 1) {
            if (factorial % 10 == 0) {
                count++;
                factorial = factorial / 10;
                
            }
            if (factorial % 10 != 0) {
                return count;
            }
            
        }
        return count;

    }

    public static void main(String args[]) {
        //case 1
        int factorial = fact(3);

        //case 2
        // int factorial = fact(5);

        // case 3
        // int factorial = fact(0);

        System.out.println(trailZeros(factorial));

        

    }
}