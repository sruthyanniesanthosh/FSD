class DecimalToBinary{
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int rem;
		String binary="";
		while(x>0){
			rem=x%2;
			x=x/2;
			//System.out.print(rem);
			binary=binary+Integer.toString(rem);
		}
		int b=Integer.parseInt(binary);
		while(b>0)
		{
			rem=b%10;
			b=b/10;
			System.out.print(rem);
		}
	}
}