class Multiplication{
	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);
		int limit = Integer.parseInt(args[1]);
		int mul = 1;
		System.out.println("Multiplication table of "+num);
		for(int i=1 ; i<=limit ; i++){
			mul = num * i;
			System.out.println(num + " * " + i + " = " + mul);
		}
	}
}