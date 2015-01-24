import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;


public class SortArrayOfStrings {
	public static void main(String[] args) {	
	Scanner input = new Scanner(System.in);
	int InputInt = input.nextInt();	
	String[] text = new String[InputInt];	
	for (int i = 0; i < text.length; i++) {			
		Scanner inp = new Scanner(System.in);		
		text[i] = inp.nextLine();				
	}
	Arrays.sort(text);
	for (int i = 0; i < text.length; i++) {
		System.out.println(text[i]);
	}
	}	
}
