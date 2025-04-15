package model;

public class ReservationRestaurant extends Reservation {
	int jour, mois, numService, numTable;
	String[] service = new String[] { "premier", "deuxième" };

	public ReservationRestaurant(int jour, int mois, int numService, int numTable) {
		super(jour, mois);
		this.jour = jour;
		this.mois = mois;
		this.numService = numService - 1;
		this.numTable = numTable;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Le ");
		sb.append(jour);
		sb.append("/");
		sb.append(mois);
		sb.append("\nTable ");
		sb.append(numTable);
		sb.append(" pour le ");
		sb.append(service[numService]);
		sb.append(" service.");
		return sb.toString();
	}

}
