package histoire;


import personnages.Druide;
import personnages.Gaulois;
import personnages.Romain;

public class Scenario {

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Ast�rix",8);
		Romain minus = new Romain("Minus",20);
		Druide panoramix = new Druide("Panoramix",5,10);
		Gaulois obelix = new Gaulois("Ob�lix",4);
		panoramix.parler("je vais aller pr�parer une petite potion...");
		panoramix.preparerPotion(panoramix.getEffetPotionMin());
		panoramix.booster(obelix);
		obelix.parler("par B�l�nos, ce n'est pas juste! ");
		panoramix.booster(asterix);
		asterix.parler("Bonjour");
		minus.parler("UN GAU... UN GAUGAU...");
		while (minus.getForce() > 0) {
			asterix.frapper(minus);
		}
		
		}

		
		

	}
