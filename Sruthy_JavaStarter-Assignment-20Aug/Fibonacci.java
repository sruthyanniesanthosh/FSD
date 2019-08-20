class Fibonacci{
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int c=1;
		System.out.println("The fibonacci series from 1 to 89:");
		while(c<=89){
			
			System.out.print(" "+c);
			a=b;
			b=c;
			c=a+b;


		}
	}
}