package Array;

public class array_1 {

	public static void main(String[] args) {
		
		int n=8;
		int [] arr=new int[n];

		for(int i=0;i<arr.length;i++) {
			arr[i]=i;
			
		}
		
		int index = -1;
		for(int i=0;i<arr.length;i++) {
			
			
			if (arr[i]==4) {
				index=i;
				break;
			}
		}
		
		System.out.println(index);
	}

}
