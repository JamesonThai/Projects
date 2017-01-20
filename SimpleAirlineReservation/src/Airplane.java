import java.util.ArrayList;

/**
 * Airplane base class
 * 
 * @author Jameson Thai
 *
 */
public class Airplane {

	Passenger[][] eco, fir;
	ArrayList<Integer> avalEco, avalFir;
	int rowE, colE, rowF, colF;

	/**
	 * Constructor of Airplane creating Economy and First class
	 */
	public Airplane() {
		eco = new Passenger[20][6];
		fir = new Passenger[2][4];
		avalEco = new ArrayList<Integer>();
		avalFir = new ArrayList<Integer>();

		rowE = 20;
		colE = 6;
		rowF = 2;
		colF = 4;
		for (int i = 0; i < 2; i++) {
			avalFir.add(4);
		}
		for (int i = 0; i < rowE; i++) {
			avalEco.add(6);
		}
	}

	/**
	 * Adding in passenger if possible in First class
	 * 
	 * @param seatpref
	 *            Seat preference of passenger
	 * @param plane
	 *            Airplane
	 * @param p
	 *            Passenger being added
	 * @return returns reserved seat if possible
	 */
	public String firstPas(String seatpref, Airplane plane, Passenger p) {
		String seat, one;
		seat = "Request denied";
		return seat;
	}

	/**
	 * Converts column to letter equivalent
	 * 
	 * @param x
	 *            Number being converted
	 * @param cl
	 *            Check for class type
	 * @return returns converted value
	 */
	public String Converter(int x, String cl) {
		return "N";
	}

	/**
	 * Books passenger in economy if possible
	 * 
	 * @param seatPref
	 *            Seat preference of passenger
	 * @param plane
	 *            Airplane
	 * @param p
	 *            Passenger containing information
	 * @return returns String of reserved seat
	 */
	public String ecoPas(String seatPref, Airplane plane, Passenger p) {
		String seat, one;
		seat = "Request Denied";
		return seat;
	}

	/**
	 * books passengers in first if possible
	 * 
	 * @param list
	 *            List containing adjacent rows
	 * @param plane
	 *            Airplane
	 * @return returns string with reserved seats
	 */
	public String fiGroPas(ArrayList<Passenger> list, Airplane plane) {
		String seat, one, fin;
		seat = "";
		return seat;
	}

	/**
	 * Books passengers in economy if possible
	 * 
	 * @param list
	 *            List containing adjacent rows
	 * @param plane
	 *            Airplane
	 * @return String of reserved seats
	 */
	public String ecoGroPas(ArrayList<Passenger> list, Airplane plane) {

		String seat, one, fin;
		
		seat = "Request Denied";
		return seat;
	}

	/**
	 * Checks for largest seat left in the arraylist
	 * 
	 * @param list
	 *            The arraylist containing rows with adjacent seating
	 * @return returns the largest row with adjacent seating
	 */
	public int checkLargestSeatLeft(ArrayList<Integer> list) {
		int num = 0;
		return num;
	}

	/**
	 * updates the list of availability
	 * 
	 * @param p
	 *            Airplane
	 * @param name
	 *            Type of class
	 */
	private void updateListIndex(Airplane p, String name) {
		
	}

	/**
	 * Checks what is available
	 * 
	 * @param name
	 *            Type of class
	 * @param p
	 *            Airplane
	 * @return returns the total availability
	 */
	public int checkAvalabilty(String name, Airplane p) {
		int num = 0;
		int total = 0;
		int start = 0;

				return total;
	}

	/**
	 * Returns the largest index of row size
	 * 
	 * @param list
	 *            List being put in to be checked
	 * @return Returns the largest index of row size
	 */
	public int getLargestIndex(ArrayList<Integer> list) {
		int num = 0;
		
		return num;
	}

	/**
	 * Checks for duplicate passengers
	 * 
	 * @param p
	 *            Passenger type
	 * @param plane
	 *            Airplane
	 * @return returns true if there is a duplicate otherwise false
	 */
	public boolean checkDuplicate(Passenger p, Airplane plane) {

				return false;
	}
}
