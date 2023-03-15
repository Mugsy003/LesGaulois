package personnages;

public enum Equipement {
    CASQUE("Casque"),
    BOUCLIER("Bouclier");
    
    private String nom;
    
    private Equipement(String nom) {
        this.nom = nom;
    }
    
  String getNom() {
        return nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    public static Equipement fromNom(String nom) {
        for (Equipement equipement : Equipement.values()) {
            if (equipement.getNom().equalsIgnoreCase(nom)) {
                return equipement;
            }
        }
        return null;
    }

    
}

