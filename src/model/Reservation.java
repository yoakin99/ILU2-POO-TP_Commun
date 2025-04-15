package model;

public abstract class Reservation {
	CalendrierAnnuel calendrier = new CalendrierAnnuel();

	protected Reservation(int jour, int mois) {
		calendrier.reserver(jour, mois);
	}

}
