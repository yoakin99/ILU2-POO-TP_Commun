package model;

public class CentraleReservation<T extends EntiteReservable<U>, U extends Formulaire> {
	T[] entites;
	int tailleTab = 0;

	public CentraleReservation(T[] entites) {
		this.entites = entites;
	}

	public int ajouterEntite(T entite) {
		entites[tailleTab] = entite;
		entite.setId(tailleTab + 1);
		return ++tailleTab;
	}

	public int[] donnerPossibilites(U formulaire) {
		int[] possibilites = new int[tailleTab];

		for (int i = 0; i < tailleTab; i++) {
			if (entites[i].estLibre(formulaire) && entites[i].compatible(formulaire)) {
				possibilites[i] = entites[i].getId();
			} else {
				possibilites[i] = 0;
			}
		}
		return possibilites;
	}

	public Reservation reserver(int num, U formulaire) {
		for (int i = 0; i < tailleTab; i++) {
			if (num == entites[i].getId()) {
				formulaire.setId(entites[i].getId());
				return entites[i].reserver(formulaire);
			}
		}
		return null;
	}

}
