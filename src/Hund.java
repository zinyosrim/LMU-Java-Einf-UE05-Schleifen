
public class Hund {
		// instanzvariablen
		private String rasse;
		private String name;
		private int groesse;
		
		// Konstruktor
		public Hund(String n, String r, int g) {
			this.name = n;
			this.rasse = r;
			this.groesse = g;
		}	
		// methoden
		public void laufen(int i){
			System.out.print(this.name+ " läuft ");
			for (int j=0;j<i;j++){
				System.out.print(j+1+"km... ");
			}
			System.out.println();
		}
		
		public void bellen(int i){
			System.out.print(this.name+ " bellt "+i+"mal: ");
			while (i>0){
				System.out.print("wuff ");
			i--;
			}
			System.out.println();
		}
		 
		//Getter
		public String getName (){
			return name;
		}
		public String getRasse (){
			return rasse;
		}
		public int getGroesse (){
			return groesse;
		}
		//Setter
		public void setName(String n){
			this.name = n;
		}
		public void setRasse(String r){
			this.rasse = r;
		}
		public void setGroesse(int g){
			this.groesse = g;
		}

}
