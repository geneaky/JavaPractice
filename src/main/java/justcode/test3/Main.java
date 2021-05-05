package justcode.test3;

public class Main {
    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        int xor = 0;
        for(int num: nums){
            xor^=num;
            System.out.println(xor);
        }
        System.out.println("xor = " + xor);
    }
}
