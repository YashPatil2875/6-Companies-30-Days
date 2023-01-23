public class rough {
        public static int magicalString(int n) {
            String s = "1221121221221121122";
            int count = 0;
            for(int i=0; i < n; i++){
                if(s.charAt(i) == '1'){
                    count++;
                }
            }
            return count;

        }

    
    public static void main(String args[]){
        System.out.println(magicalString(6));
        System.out.println(magicalString(1));
    }
}
