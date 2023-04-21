public class Main
{
	public static void main(String[] args) {
		int[] arr={1,4,6,8,10,14,21};
		int target=15;
		int start=0;
		int end=arr.length-1;
		int flag=0;
		while (end>=start){
		    int mid=(start+end)/2;
		    if(arr[mid]==target){
		        flag=1;
		        break;
		    }
		    else if(arr[mid]>target){
		        end=mid-1;
		    }
		    else{
		        start=mid+1;
		    }
		}
		if (flag==0){
		    System.out.println("Target Element Not Found");
		}
		else{
		    System.out.println("Target Element Found");
		}
	}
}
