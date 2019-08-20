class DecimalToBinary{
	public static void main(String[] args) {
		int x = Integer.parseInt(args[0]);
		int rem;
		String binary = "";
		while(x > 0){
			rem = x % 2;
			x = x / 2;
			binary = Integer.toString(rem) + binary;
		}
		System.out.println("The binary equivalent: "+binary);
	}
}