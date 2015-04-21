public class TestBox {
	public static void main(String args[]) { 
	
	Box <String>  b1 = new Box <String> ("Ala ma kota");
	Box <Integer> b2 = new Box <Integer> (12);     
	Box <Double>  b3 = new Box <Double> (24.76);   
	
	System.out.println (b1.getElement());
	  
	int wartosc = b2.getElement() + 3;
	System.out.println (wartosc);
	  
	System.out.println (b3.getElement());    
	}
}