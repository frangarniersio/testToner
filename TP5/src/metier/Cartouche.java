package metier;

public class Cartouche {
	private String refCartouche;
	private String desCartouche;
	private double prixCartoucheNeuve;
	
	/** Constructeur de Cartouches */
	public Cartouche(String refCartouche, String desCartouche, double prixCartoucheNeuve) {
		this.refCartouche = refCartouche;
		this.desCartouche = desCartouche;
		this.prixCartoucheNeuve = prixCartoucheNeuve;
	}
	public String getDesCartouche() {
		return desCartouche;
	}

	public double getPrixCartoucheNeuve() {
		return prixCartoucheNeuve;
	}
	public void setPrixCartoucheNeuve(double prixCartoucheNeuve) {
		this.prixCartoucheNeuve = prixCartoucheNeuve;
	}
	public String getRefCartouche() {
		return refCartouche;
	}

	public String toString(){
		String msg = this.refCartouche+" -"+this.desCartouche;
		msg = msg+" au prix de "+this.prixCartoucheNeuve;
		return msg;
	}
}
