package model;

public class FormulaireHotel extends Formulaire {
	int jour;
	int mois;
	int numRes;
	int nbLitSimple;
	int nbLitDouble;
	int id;

	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int id) {
		this.jour = jour;
		this.mois = mois;
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.id = id;
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

	public int getNbLitSimple() {
		return nbLitSimple;
	}

	public int getNbLitDouble() {
		return nbLitDouble;
	}

	public int getIdentificationEntite() {
		return numRes;
	}

	public int getId() {
		return id;
	}

}
