public class Insertsort{
	public static void main(String[]args){
		int[]nums={9,7,8,3,6,2};
		for(int i=1;i<nums.length;i++){
			int key=nums[i];
			int j=i-1;
			while(j>=0&&nums[j]>key){
				nums[j+1]=nums[j];
				j--;
			}
			nums[j+1]=key;
		}
			for(int i:nums){
				System.out.print(" "+i);
			}
		}
	}