import java.util.Scanner;
import java.util.Random;

public class Zahlenraten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int r = rand.nextInt(10);
		
		System.out.println("zahlenraten! gebe ganze zahl <10 ein: ");
		String eingabe = scan.next();
	
		while (Integer.parseInt(eingabe) != r){	
			System.out.println("rate nochmal:");
			eingabe = scan.next();
		}	
		scan.close();
		System.out.println("Herzlichen Glückwunsch!");
	}

}
