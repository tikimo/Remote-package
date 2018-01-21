package oopDemot4;

class BudjettiYlitetty extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 *Exception class budjetin ylittämiselle 
	 */

	public BudjettiYlitetty(String viesti){
		super(viesti);
	}
	
}