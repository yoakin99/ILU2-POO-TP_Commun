package model;

public class FormulaireRestaurant extends Formulaire {
	int jour;
	int mois;
	int nbPerso;
	int id;
	int numService;

	public FormulaireRestaurant(int jour, int mois, int nbPerso, int id, int numService) {
		this.jour = jour;
		this.mois = mois;
		this.nbPerso = nbPerso;
		this.id = id;
		this.numService = numService;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getId() {
		return id;
	}

	public int getNumService() {
		return numService;
	}
}
