package model;

public abstract class EntiteReservable<T extends Formulaire> {
	CalendrierAnnuel calendrier;
	int id;

	protected EntiteReservable(CalendrierAnnuel calendrier, int id) {
		this.calendrier = calendrier;
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean estLibre(T formulaire) {
		return calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
	}

	public abstract boolean compatible(T formulaire);

	public abstract Reservation reserver(T formulaire);

}
