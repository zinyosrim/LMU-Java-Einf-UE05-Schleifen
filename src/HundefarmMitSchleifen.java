
public class HundefarmMitSchleifen {
	// Main
			public static void main(String[] args) {

				// Objekte der Klasse Hund erzeugen:
				Hund bello = new Hund("Bello","Haski",110);
				Hund leo = new Hund("Leo","Schaefer",170);
				Hund justin = new Hund("Justin","Labrador",150);
				
				// Objekte vom Typ Hund sind nun angelegt.
				// Die Instanzvariablen wurden mittels Konstruktor entsprechend belegt.
				
				// Jeder einzelne angelegte Hund bellt und laeuft nun durch Aufrufen der entsprechenden Methoden auf dem jeweiligen Objekt:
				bello.bellen(3);
				bello.laufen(6);
				//rasse_von_bello = bello.getRasse();
				System.out.println("Der Rassenname von "+bello.getName()+" ist "+bello.getRasse());
				
				leo.bellen(4);
				leo.laufen(4);
				
				justin.bellen(2);
				justin.laufen(7);
				
				
				Hund lassie = new Hund("Lassie", "Collie", 100);
				lassie.bellen(10);
				lassie.laufen(12);
				
				//Hund lassie = new Hund("Lassie", "Collie", 115);
				//name_von_lassie = getName(lassie);
				
					//System.out.println("Willkommen bei Hund");
					//System.out.println("der Hund heisst "+name_von_lassie);
					//lassie.laufen();
					//lassie.bellt();
					//System.out.println(lassie.name+" ist "+lassie.groesse+"cm gross");
					//System.out.println("Der Rassenname ist "+lassie.rasse);


			   }
}
