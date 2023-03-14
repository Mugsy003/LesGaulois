package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois=0;

	public Village(String nom,int nbVillageoisMax) {
		this.nom = nom;
		villageois = new Gaulois[nbVillageoisMax];
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois,int i) {
		villageois[i]=gaulois;
		nbVillageois++;
	}
	public Gaulois trouverHabitant(int i) {
		Gaulois[] ref= villageois;
		return ref[i];
		
	}
	public void afficherVillageois() {
		System.out.println("Dans le village du chef " + chef.getNom() + " vivent les legendaires gaulois :\n");
		for (int i = 0; i < nbVillageois; i++) {
			System.out.println("-" + villageois[i].getNom()+"\n");
		}
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles",30);
		Chef chef = new Chef("Abraracourcix",6,1,village);
		Gaulois gaulois1= new Gaulois("Asterix",6);
		village.ajouterHabitant(gaulois1,0);
		Gaulois gaulois2 = new Gaulois("Obelix",25);
		village.ajouterHabitant(gaulois2,1);
		village.afficherVillageois();
	}
	
}
