public class Minarray {
    public static void main(String[] args) {
        int[] nums={13,24,45,34,10};
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            int value=nums[i];
            if(value<min){
                min=value;
            }
        }
        System.out.println("min:"+min);
    }
}