import java.util.ArrayList;
import java.util.Iterator;

public class AL {

	public static void main(String[] args) {

		ArrayList <String> tydzien = new ArrayList<String>();
        
        tydzien.add("poniedziałek");
        tydzien.add("wtorek");
        tydzien.add("środa");
        tydzien.add("czwartek");
        tydzien.add("exterminate");
        tydzien.add("piątek");
        tydzien.add("sobota");
        tydzien.add("niedziela");
         
        Iterator it = tydzien.iterator();
         
        while (it.hasNext()){
            System.out.println(it.next());
        }
         
        //Usunięcie pozycji z listy
        tydzien.remove("exterminate");
         
        //Wyświetlenie całej listy
        System.out.println("Cała lista = " + tydzien);
         
        //Przejdź do pozycji o numerze indeksu 1
        System.out.println("Drugi dzień tygodnia " + tydzien.get(1));

	}
}
