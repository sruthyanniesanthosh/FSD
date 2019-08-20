class ThreeNumbers{
	public static void main(String[] args) {
		int x=Integer.parseInt(args[0]);
		int y=Integer.parseInt(args[1]);
		int z=Integer.parseInt(args[2]);
		int sum=x+y+z;
		int flag=0;
		if(x>=40){
			flag++;
		
		}
		if(y>=40)
			{flag++;}
		if(z>=40)
			{flag++;}
		if(sum>=125)
			{flag++;}
		if(flag==4)
			{System.out.println("Passing.");
	}
	else
		System.out.println("Failing.");

	}
}