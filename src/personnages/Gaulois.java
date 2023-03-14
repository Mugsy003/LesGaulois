package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int nb_trophees;
	private Equipement[] trophees = new Equipement[100];
	private int effetPotion =1;
	
	public Gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
	}

	public String getNom() {
		return nom;
	}
	
	public void parler(String texte) {
		System.out.println(prendreparole() + "<<" + texte + ">>" );
		
	}
	private String prendreparole() {
		return "le gaulois" + nom + ": ";
	}


	public void setEffetPotion(int effetPotion) {
		this.effetPotion = effetPotion;
	}

	
	public String toString() {
		return "Gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}

	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Asterix",8);
		System.out.println(asterix);
	}

	public void boirePotion(int forcePotion) {
		parler("Merci  Druide,  je  sens  que  ma  force  est"+ forcePotion +  "fois  décuplée. ");
	}
	
	private String prendreParole() {
		return "Le gaulois " + nom + " : ";
		}
	
	public void frapper(Romain romain) {
		System.out.println(nom + "envoie un grand coup dans la mâchoire de " + romain.getNom());
		Equipement[] trophees = romain.recevoirCoup((force / 3) * effetPotion);
		for (int i = 0; trophees != null && !(trophees.length < i); i++,
		nb_trophees++) {
		this.trophees[nb_trophees] = trophees[i];
		}
		return;
		}

	
}
