package model;

public class CalendrierAnnuel {
	Mois[] calendrier;

	public CalendrierAnnuel() {
		calendrier = new Mois[] { new Mois("Janvier", 31), new Mois("Février", 28), new Mois("Mars", 31),
				new Mois("Avril", 30), new Mois("Mai", 31), new Mois("Juin", 30), new Mois("Juillet", 31),
				new Mois("Aout", 31), new Mois("Septembre", 30), new Mois("Octobre", 31), new Mois("Novembre", 30),
				new Mois("Decembre", 31) };
	}

	public boolean estLibre(int jour, int mois) {
		return (calendrier[mois - 1]).estLibre(jour);
	}

	public boolean reserver(int jour, int mois) {
		try {
			(calendrier[mois - 1]).reserver(jour);
			return true;
		} catch (IllegalStateException e) {
			return false;
		}
	}

	public class Mois {
		String nom;
		boolean[] jours;
		int nbJours;

		public Mois(String nom, int nbJours) {
			this.nom = nom;
			jours = new boolean[nbJours];
			this.nbJours = nbJours;

			for (int i = 0; i < nbJours; i++) {
				jours[i] = true;
			}
		}

		public boolean estLibre(int jour) {
			return jours[jour - 1];
		}

		public void reserver(int jour) {
			if (!(jours[jour - 1])) {
				throw new IllegalStateException();
			}
			jours[jour - 1] = false;
		}
	}
}
