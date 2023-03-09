package personnages;

public class Gaulois {
	private String nom;
	private int force;
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

}
