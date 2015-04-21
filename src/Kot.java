public class Kot <String, T> {

	public String imie;
	public String kolor;
	public T drapieznosc; // Bo kotek może wyrazić swoją drapieżnoć na wiele sposobów
	
	public Kot(String imie, String kolor, T drapieznosc){
		this.imie = imie;
		this.kolor = kolor;
		this.drapieznosc = drapieznosc;
	}
	
	 public String getImie() {
	        return imie;
	    }

	    public void setImie(String imie) {
	        this.imie = imie;
	    }

	    public String getKolor() {
	        return kolor;
	    }

	    public void setKolor(String kolor) {
	        this.kolor = kolor;
	    }

	    public T getDrapieznosc() {
	        return drapieznosc;
	    }

	    public void setDrapieznosc(T drapieznosc) {
	        this.drapieznosc = drapieznosc;
	    }
	    
	    public void main(String[] args){
	    	//nie działam
	    }

}
