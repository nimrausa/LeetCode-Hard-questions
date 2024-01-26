package practice_hard_ques;

public class Trapping_Rain_Water {

	public int trap(int[] height) {
        return rain(height);
    }
    public static int rain(int [] arr) {
    int n=arr.length;
		int [] left=new int [arr.length];
		left[0]=arr[0];
		int [] right=new int [arr.length];
		right[n-1]=arr[n-1];
		for (int i = 1; i < right.length; i++) {
			left[i]=Math.max(left[i-1],arr[i] );	
		}
		for (int i = n-2; i >=0; i--) {
			right[i]=Math.max(right[i+1],arr[i]);	
		}
		int sum=0;
		for (int i = 0; i < right.length; i++) {
			sum=sum+(Math.min(left[i],right[i])-arr[i]);
		}
		return sum;
	}

}
