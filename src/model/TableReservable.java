package model;

public class TableReservable extends EntiteReservable<FormulaireRestaurant> {
	public TableReservable(CalendrierAnnuel calendrier, int id) {
		super(calendrier, id);

	}

	@Override
	public boolean compatible(FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reservation reserver(FormulaireRestaurant formulaire) {
		// TODO Auto-generated method stub
		return null;
	}

}
