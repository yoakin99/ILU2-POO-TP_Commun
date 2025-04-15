package model;

public class ReservationSpectale extends Reservation {
	int jour, mois, numZone, numRes;

	public ReservationSpectale(int jour, int mois, int numZone, int numRes) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.numZone = numZone;
		this.numRes = numRes;
	}

}
