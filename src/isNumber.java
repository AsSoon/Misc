import java.util.Scanner;

public class isNumber {

	public static void isStringNumber(String s){
		Double number = null;
		String result;
		String yes = ("Podane wyrażenie jest liczbą");
		String no = ("Podane wyrażenie nie jest liczbą");
		boolean is_number = true;
		try{
			number = Double.parseDouble(s);
		}
		catch(NumberFormatException e){
			is_number = false;
		}
		result = (is_number==true)? yes : no ;
		System.out.println(result);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s;
		System.out.print("Podaj wyrażenie do sprawdzenia:  ");
		s =  in.nextLine();
		isStringNumber(s);

	}
}
