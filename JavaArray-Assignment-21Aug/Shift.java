class Shift{
	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);

		 System.out.println("Enter the size of array:");
		 int size = sc.nextInt();
		int []arr = new int[size];

		System.out.println("Enter the elts of array:");

		for (int i=0; i<arr.length ;i++ ) {
			arr[i] = sc.nextInt();

			}
			//int size=arr.length;
			int temp = arr[size-1];
			int temp1= arr[0];
			int temp2;
		for (int i=0;i<arr.length-1 ;i++ ) {
			temp2=arr[i+1];
			arr[i+1]=temp1;
			temp1=temp2;
		}
		arr[0]=temp;
		System.out.println("The array after shifting- ");
		for (int value : arr) {
			System.out.print(" "+value);
			
		}
	}
}