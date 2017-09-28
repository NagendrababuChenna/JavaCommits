package core.condition.hw;

public class pyramidprinting {

	public static void main(String[] args) {
	int i = 1;
	int j = 1;
	int r = 10;//input number
	int c = 1;
	
	for (;i <= r;i++){
		for (j = i;j<r;j++)
			System.out.print(" ");
			for (c=1;c<i;c++)
				System.out.print("* ");
			System.out.println();
		}
	
	for (i=r;i>0;i--){
		for (j=i;j<r;j++)
			System.out.print(" ");
		for (c=1;c<i;c++)
			System.out.print("* ");
		System.out.println();
	}
	}
}
	


