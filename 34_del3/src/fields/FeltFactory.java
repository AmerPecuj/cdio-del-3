package fields;

import desktop_fields.Field;
import desktop_fields.Street;

public class FeltFactory {
	public FeltFactory() {
	}
	public static Field[] getFelter() {
		/**
		 * Declare the fields variable as an array of Street.Builder() objects
		 */

		Field[] felter = new Field[11];

		felter[0] = new Street.Builder()
				.setTitle("Tower")
				.setSubText("+250")
				.build();

		felter[1] = new Street.Builder()
				.setTitle("Crater")
				.setSubText("-100")
				.build();

		felter[2] = new Street.Builder()
				.setTitle("Palace Gates")
				.setSubText("+100")
				.build();

		felter[3] = new Street.Builder()
				.setTitle("Cold Desert")
				.setSubText("-20")
				.build();

		felter[4] = new Street.Builder()
				.setTitle("Walled City")
				.setSubText("+180")
				.build();

		felter[5] = new Street.Builder()
				.setTitle("Monastery")
				.setSubText("0")
				.build();

		felter[6] = new Street.Builder()
				.setTitle("Black Cave")
				.setSubText("-70")
				.build();

		felter[7] = new Street.Builder()
				.setTitle("Huts in the Mountain")
				.setSubText("+60")
				.build();

		felter[8] = new Street.Builder()
				.setTitle("The Werewall")
				.setSubText("-80")
				.build();

		felter[9] = new Street.Builder()
				.setTitle("The Pit")
				.setSubText("-50")
				.build();

		felter[10] = new Street.Builder()
				.setTitle("Goldmine")
				.setSubText("+650")
				.build();

		// return array of fields
		return felter;
	}
}