import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Jameson Thai Goal is to implement reservation system on an airline
 */
public class ReservationSystem {
	
/**
 * 
 * @param args Reading in file at args[]
 * @throws IOException Throws exception if file no input
 */
	public static void main(String[] args) throws IOException {

			}

	/**
	 * Method of adding passenger
	 * 
	 * @param p
	 *            Passenger being added
	 * @param plane
	 *            Airplane
	 * @return String of reserved seat
	 */
	public static String addPassenger(Passenger p, Airplane plane) {
		String seat = "Request Failed";

		return seat;
	}

	/**
	 * Method of adding group
	 * 
	 * @param list
	 *            Arraylist of passengers being added
	 * @param p
	 *            Passenger being added
	 * @param plane
	 *            Airplane
	 * @return String of reserved seats
	 */
	public static String addGroup(ArrayList<Passenger> list, Passenger p, Airplane plane) {
		String seat = "Request Failed";

		return seat;
	}

	/**
	 * Cancels the reservation
	 * 
	 * @param type
	 *            Individual or Group
	 * @param name
	 *            Name being canceled
	 * @param plane
	 *            Airplane
	 */
	public static void cancelReservations(String type, String name, Airplane plane) {
	}

	/**
	 * Prints Available seating
	 * 
	 * @param c
	 *            Type of class
	 * @param plane
	 *            Airplane
	 */
	public static void printAvailability(String c, Airplane plane) {
			}

	/**
	 * Displays Manifest of plane
	 * 
	 * @param c
	 *            Type of class
	 * @param plane
	 *            Airplane
	 */
	public static void displayManifest(String c, Airplane plane) {
		}

	/**
	 * For quitting the airplane
	 * 
	 * @param plane
	 *            plane type being passed in
	 * @throws FileNotFoundException
	 *             If the damn file isn't found
	 */
	public static void Quit(Airplane plane) throws FileNotFoundException {

	}
}