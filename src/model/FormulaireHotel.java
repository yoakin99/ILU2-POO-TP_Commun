package model;

public class FormulaireHotel extends Formulaire {
	int jour;
	int mois;
	int numRes;
	int nbLitSimple;
	int nbLitDouble;
	int numEnt;

	public FormulaireHotel(int jour, int mois, int nbLitSimple, int nbLitDouble, int numEnt) {
		this.jour = jour;
		this.mois = mois;
		this.nbLitSimple = nbLitSimple;
		this.nbLitDouble = nbLitDouble;
		this.numEnt = numEnt;
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

	public int getNumEnt() {
		return numEnt;
	}

}
