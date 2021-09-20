class Demo {
	public static void main(String args[]) {
	int num[]=new int[10];
	System.out.println(num[0]);
	System.out.println(num[9]);
	int flag=100;
	for(int i=0;i<num.length;i++) {
		num[i]=flag;
		flag++;
	}
	System.out.println("Number are ");
	for(int i=0;i<num.length;i++) {
		System.out.println(num[i]);
	}
	}
}