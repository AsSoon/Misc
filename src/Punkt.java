import static java.lang.Math.*;
import java.util.Scanner;

public class Punkt {
	private Integer x;
	private Integer y;
	private String name;
	
	public Integer getX(){
		return x;
	}
	
	public Integer getY(){
		return y;
	}
	
	public String getName(){
		return name;
	}
	
	void setX(Integer x){
		this.x=x;
	}
	
	void setY(Integer y){
		this.y=y;
	}
	
	void setName(String name){
		this.name=name;
	}
	
	public Double distance(){
		return sqrt(x*x+y*y);
	}
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		Integer tmpI = null;
		String tmpS = null;
		Punkt p = new Punkt();
		System.out.print("Nazwij punkt: ");
		tmpS = in.nextLine();
		p.setName(tmpS);
		System.out.print("Podaj współrzędną x: ");
		tmpI = in.nextInt();
		p.setX(tmpI);
		System.out.print("Podaj współrzędną y: ");
		tmpI = in.nextInt();
		p.setY(tmpI);
	
		System.out.println("Utworzyłeś punkt "+ p.getName() +" o współrzędnych ("+ p.getX() +","+ p.getY() +")");
		System.out.println("Jego odległość od początku układu współrzędnych wynosi "+ p.distance());
	}
}
