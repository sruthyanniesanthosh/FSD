class Selection{
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		System.out.println("Enter the size of array:");
		int size = sc.nextInt();
		int []arr = new int[size];

		System.out.println("Enter the elts of array:");

		for (int i=0; i<arr.length ;i++ ) {
			arr[i] = sc.nextInt();

			}
			int temp;

		for(int i=0;i<arr.length;i++){
			for (int j=i+1;j < arr.length ;j++ ) {
				if(arr[i] > arr[j])
				{
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;



				}
			}
		}
		System.out.println("The sorted array:");
		for ( int value:arr) {

			System.out.print(" "+ value);
		 	
		 } 
			
		
	}
}