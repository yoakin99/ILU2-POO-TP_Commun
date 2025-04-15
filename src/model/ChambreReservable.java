package model;

public class ChambreReservable extends EntiteReservable<FormulaireHotel> {
	public ChambreReservable(CalendrierAnnuel calendrier, int id) {
		super(calendrier, id);
	}

	@Override
	public boolean compatible(FormulaireHotel formulaire) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reservation reserver(FormulaireHotel formulaire) {
		// TODO Auto-generated method stub
		return null;
	}

}
