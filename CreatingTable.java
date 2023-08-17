import java.util.Scanner;

public class CreatingTable {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the number");
		int num=scan.nextInt();
		MultiplicationTable mt=new MultiplicationTable();
		mt.multiplicationTable(num);
	}

}
