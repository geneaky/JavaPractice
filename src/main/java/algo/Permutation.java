package algo;
/*
1 3(a) 5 4 4(b)
->
1 4 3 4 5
*/
public class Permutation {

    public void nextPermutation(int[] nums){
        //뒤에서부터 탐색하면서 오름차순이 깨지는 인덱스를 확인(a)
        int a = nums.length-2;
        while(a>=0 && nums[a] >= nums[a+1]) a--;
        if (a != -1) {
            //다시 뒤에서부터 탐색하면서 a 보다 큰 첫번째 인덱스를 확인(b)
            int b = nums.length-1;
            while(nums[a]>=nums[b]) b--;
            //a랑 b를 스왑
            swap(nums,a,b);
        }
        //a+1에서부터 끝까지를 오름차순 정렬렬
        int start = a+1;
        int end = nums.length-1;
        while(start<end){
            swap(nums,start++,end--);
        }
   }

   public void swap(int[] nums,int a,int b){
        int tmp = nums[a];
        nums[a] = nums[b];
        nums[b] = tmp;
   }
}
