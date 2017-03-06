/**
 *   File Name: BasicApp.java<br>
 *
 *   Chan, William<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Mar 6, 2017
 *
 */

package com.sqa.wc;

import java.util.*;

import com.sqa.wc.helpers.*;

/**
 * BasicApp //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author Chan, William
 * @version 1.0.0
 * @since 1.0
 *
 */
public class BasicApp {

	static String appName = "Basic Fundamentals";
	static String user;
	static int cupsOfCoffee;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		user = AppBasics.welcomeUserAndName(appName);
		requestNumOfCoffee();
		AppBasics.farewellUser(appName, user);
	}

	/**
	 *
	 */

	private static void requestNumOfCoffee() {
		String input;
		Scanner scanner = new Scanner(System.in);
		System.out.print("How many cups of coffee would you like " + user + "?");
		input = scanner.nextLine();
		cupsOfCoffee = Integer.parseInt(input.trim());
		System.out.println("Sounds like you would like " + (cupsOfCoffee * 2) + " cups of coffee!");
	}

}
