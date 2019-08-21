class Series{
	public static void main(String[] args) {
		int min = 35;
		int max = 46;
		for (int i = min; i <= max; i++) {
			if (i==38) {
				System.out.println("Thirty Eight");	
			}
			else
				{if (i==45) {
					System.out.println("Fourty Five");
				}
				else
					{if (i==40 || i==43) {
						continue;
					}
					else
						System.out.println(i);

		}

	}
}
}
}