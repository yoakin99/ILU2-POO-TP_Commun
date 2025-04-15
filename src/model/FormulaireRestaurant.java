package model;

public class FormulaireRestaurant extends Formulaire {
	int jour;
	int mois;
	int numRes;
	int nbPerso;
	int numService;

	public FormulaireRestaurant(int jour, int mois, int nbPerso, int numService) {
		this.jour = jour;
		this.mois = mois;
		this.nbPerso = nbPerso;
		this.numService = numService;
	}

	public void setIdentificationEntite(int numRes) {
		this.numRes = numRes;
	}

	public int getJour() {
		return jour;
	}

	public int getMois() {
		return mois;
	}

	public int getNombrePersonnes() {
		return nbPerso;
	}

	public int getIdentificationEntite() {
		return numRes;
	}

	public int getNumService() {
		return numService;
	}
}
