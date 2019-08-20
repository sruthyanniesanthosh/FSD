class Factorial{
	public static void main(String[] args) {
		int var = Integer.parseInt(args[0]);
		int fact = 1;
		
		for(int i = 1 ; i <= var ; i++){
			fact = fact * i;
		}
		System.out.println("The factorial of the number:"+fact);

	}
}