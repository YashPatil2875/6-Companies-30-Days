
public class Q2 {
    public static int Dist(int[]x, int[] y){
        int FT = (int)Math.pow(y[1] - x[1], 2);
        int ST = (int)Math.pow(y[0] - x[0], 2);
        int ans = (int)Math.sqrt(FT+ST);
        return ans;
    }
    
    public static void main(String args[]){
        //Case 1

        int[] p1 = {0,0}, p2 = {1,1}, p3 = {1,0}, p4 = {0,1};
        int s1 = Dist(p1, p2);
        int s2 = Dist(p2, p3);
        int s3 = Dist(p3, p4);
        int s4 = Dist(p4, p1);
        int d1 = Dist(p1, p3);
        int d2 = Dist(p2, p4);
        System.out.println(s1);
        if(s1 == s2 && s2 == s3 && s3 == s4 && s4 == s1 || d1 == d2){
        System.out.println("It is valid Square");
       }else{
        System.out.println("It is not valid Square");
       }
        
    }

    // public static void main(String args[]){
    //     //Case 2
    //     int []p1 = {0,0}, p2 = {1,1}, p3 = {1,0}, p4 = {0,12};
    //     int s1 = Dist(p1, p2);
    //     int s2 = Dist(p2, p3);
    //     int s3 = Dist(p3, p4);
    //     int s4 = Dist(p4, p1);
    //     int d1 = Dist(p1, p3);
    //     int d2 = Dist(p2, p4);
    //     System.out.println(s1);
    //     if(s1 == s2 && s2 == s3 && s3 == s4 && s4 == s1 || d1 == d2){
    //     System.out.println("It is valid Square");
    //    }else{
    //     System.out.println("It is not valid Square");
    //    }
        
    // }

    // public static void main(String args[]){
    //     //Case 3 
    //     int[]p1 = {1,0}, p2 = {-1,0}, p3 = {0,1}, p4 = {0,-1};
    //     int s1 = Dist(p1, p2);
    //     int s2 = Dist(p2, p3);
    //     int s3 = Dist(p3, p4);
    //     int s4 = Dist(p4, p1);
    //     int d1 = Dist(p1, p3);
    //     int d2 = Dist(p2, p4);
    //     System.out.println(s1);
    //     if(s1 == s2 && s2 == s3 && s3 == s4 && s4 == s1 || d1 == d2){
    //     System.out.println("It is valid Square");
    //    }else{
    //     System.out.println("It is not valid Square");
    //    }
        
    // }
}
