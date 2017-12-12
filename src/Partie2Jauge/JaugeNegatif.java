package Partie2Jauge;

public class JaugeNegatif implements IJauge {
	  private long valeur;
	  private final long min;
	  private final long max;

	  /**
	   * Construit une instance en pr�cisant la valeur de d�part de la Jauge
	   * et l'intervalle de vigie.
	   *
	   * @param vigieMin valeur minimale de l'intervalle de vigie.
	   * @param vigieMax valeur maximale de l'intervalle de vigie.
	   * @param depart   valeur initiale de la jauge.
	 */  
	  public JaugeNegatif(long vigieMin, long vigieMax, long depart) {
	    setVal(new Placeholder(0, 0, depart));
	    min = -vigieMin;
	    max = -vigieMax;
	    /* Le constructeur d'une classe permet d'initialiser l'etat de l'instance creee.
	     * Son nom correspond toujours au nom de la classe. Il n'y a pas de type de retour.
	     */
	  }


	  /**
	   * L'�tat de la jauge est-il rouge ?
	   *
	   * @return vrai si niveau >=  vigieMax.
	   *
	   */
	  public boolean estRouge() {
	    return getVal().getTlong() >= getMax().getTlong();
	  }

	  /**
	   * L'�tat de la jauge est-il vert ?
	   *
	   * @return vrai si niveau appartient � ]vigieMin, vigieMax[.
	   *
	   */
	  public boolean estVert() {
	    //return !(estBleu() && estRouge());
	    return getVal().getTlong() > getMin().getTlong() && getVal().getTlong() < getMax().getTlong();
	  }

	  /**
	   * L'�tat de la jauge est-il bleu ?
	   *
	   * @return vrai si niveau <= vigieMin.
	   */
	  public boolean estBleu() {
	    return getVal().getTlong() <= getMin().getTlong();
	  }

	  /**
	   * Incr�mente le niveau d'une unit�.
	   * L'�tat peut devenir sup�rieur � vigieMax.
	   */
	  public void incrementer() {
	    setVal(new Placeholder(0,0, getVal().getTlong() + 1));
	  }

	  /**
	   * D�cr�mente le niveau d'une unit�.
	   * L'�tat peut devenir inf�rieur � la vigieMin.
	   */
	  public void decrementer() {
		    setVal(new Placeholder(0,0, getVal().getTlong() - 1));
	  }


	  /**
	   * Cette m�thode est h�rit�e de la classe {@link java.lang.Object}.
	   * Tr�s utile pour le d�bogage, elle permet de fournir une
	   * cha�ne de caract�res correspondant a l'�tat d'un objet.
	   * <p> Un code par d�faut est d�finit dans
	   * {@link java.lang.Object#toString() la classe Object}
	   * Il faut adapter (red�finir) le code de cette m�thode � chaque classe.
	   *
	   * Pour les cha�nes de cararct�res, l'op�rateur + correspond a la concat�nation.
	   * Les valeurs num�riques sont alors convertit en ascii.
	   * Si l'�tat d'une instance de cette classe est min=-456, max=23,
	   * valeur=-7, la concat�nation donne la cha�ne "<-7 [-456,23]>".
	   */
	  @Override
    public String toString() {
		return "<" + getVal().getTlong() + " [" + getMin() + "," + getMax() + "]>";
    }
	@Override
	public Placeholder getMax() {
		return new Placeholder(0,0,this.max);
	}

	@Override
	public Placeholder getMin() {
		return new Placeholder(0,0,this.min);
	}


	@Override
	public Placeholder getVal() {
		return new Placeholder(0,0,this.valeur);
	}


	@Override
	public void setVal(Placeholder p) {
		this.valeur = p.getTlong();
		
	}
}
