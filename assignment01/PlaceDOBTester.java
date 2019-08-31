package assignment01;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
public class PlaceDOBTester{
	public static void main(String[] args){
		DateAndPlaceOfBirth pAndDob1 = new DateAndPlaceOfBirth (1990, 6, 19, "New York", "USA");
		DateAndPlaceOfBirth pAndDob2 = new DateAndPlaceOfBirth (2000, 6, 19, "Nashville", "Tennessee", "USA");
		DateAndPlaceOfBirth pAndDob3 = new DateAndPlaceOfBirth (1995, 8, 20, "Boulder", "Colorado", "USA");
		DateAndPlaceOfBirth pAndDob4 = new DateAndPlaceOfBirth (1993, 11, 11, "Berlin", "Germany");
		DateAndPlaceOfBirth pAndDob5 = new DateAndPlaceOfBirth (1993, 11, 11, "Verona", "Italy");
											
	
		System.out.println(pAndDob1.olderThan(pAndDob2));
		System.out.println(pAndDob1.olderThan(pAndDob3));
		System.out.println(pAndDob1.olderThan(pAndDob4));
		System.out.println(pAndDob1.olderThan(pAndDob5));
		System.out.println(pAndDob2.olderThan(pAndDob1));
		System.out.println(pAndDob2.olderThan(pAndDob3));
		System.out.println(pAndDob2.olderThan(pAndDob4));
		System.out.println(pAndDob2.olderThan(pAndDob5));
		System.out.println(pAndDob3.olderThan(pAndDob1));
		System.out.println(pAndDob3.olderThan(pAndDob2));
		System.out.println(pAndDob3.olderThan(pAndDob4));
		System.out.println(pAndDob3.olderThan(pAndDob5));
		System.out.println(pAndDob4.olderThan(pAndDob1));
		System.out.println(pAndDob4.olderThan(pAndDob2));
		System.out.println(pAndDob4.olderThan(pAndDob3));
		System.out.println(pAndDob4.olderThan(pAndDob5));
		System.out.println(pAndDob5.olderThan(pAndDob1));
		System.out.println(pAndDob5.olderThan(pAndDob2));
		System.out.println(pAndDob5.olderThan(pAndDob3));
		System.out.println(pAndDob5.olderThan(pAndDob4));

		System.out.println(pAndDob1.youngerThan(pAndDob2));
		System.out.println(pAndDob1.youngerThan(pAndDob3));
		System.out.println(pAndDob1.youngerThan(pAndDob4));
		System.out.println(pAndDob1.youngerThan(pAndDob5));
		System.out.println(pAndDob2.youngerThan(pAndDob1));
		System.out.println(pAndDob2.youngerThan(pAndDob3));
		System.out.println(pAndDob2.youngerThan(pAndDob4));
		System.out.println(pAndDob2.youngerThan(pAndDob5));
		System.out.println(pAndDob3.youngerThan(pAndDob1));
		System.out.println(pAndDob3.youngerThan(pAndDob2));
		System.out.println(pAndDob3.youngerThan(pAndDob4));
		System.out.println(pAndDob3.youngerThan(pAndDob5));
		System.out.println(pAndDob4.youngerThan(pAndDob1));
		System.out.println(pAndDob4.youngerThan(pAndDob2));
		System.out.println(pAndDob4.youngerThan(pAndDob3));
		System.out.println(pAndDob4.youngerThan(pAndDob5));
		System.out.println(pAndDob5.youngerThan(pAndDob1));
		System.out.println(pAndDob5.youngerThan(pAndDob2));
		System.out.println(pAndDob5.youngerThan(pAndDob3));
		System.out.println(pAndDob5.youngerThan(pAndDob4));

		System.out.println(pAndDob1.hasSameBirthDateAs(pAndDob2));
		System.out.println(pAndDob1.hasSameBirthDateAs(pAndDob3));
		System.out.println(pAndDob1.hasSameBirthDateAs(pAndDob4));
		System.out.println(pAndDob1.hasSameBirthDateAs(pAndDob5));
		System.out.println(pAndDob2.hasSameBirthDateAs(pAndDob1));
		System.out.println(pAndDob2.hasSameBirthDateAs(pAndDob3));
		System.out.println(pAndDob2.hasSameBirthDateAs(pAndDob4));
		System.out.println(pAndDob2.hasSameBirthDateAs(pAndDob5));
		System.out.println(pAndDob3.hasSameBirthDateAs(pAndDob1));
		System.out.println(pAndDob3.hasSameBirthDateAs(pAndDob2));
		System.out.println(pAndDob3.hasSameBirthDateAs(pAndDob4));
		System.out.println(pAndDob3.hasSameBirthDateAs(pAndDob5));
		System.out.println(pAndDob4.hasSameBirthDateAs(pAndDob1));
		System.out.println(pAndDob4.hasSameBirthDateAs(pAndDob2));
		System.out.println(pAndDob4.hasSameBirthDateAs(pAndDob3));
		System.out.println(pAndDob4.hasSameBirthDateAs(pAndDob5));
		System.out.println(pAndDob5.hasSameBirthDateAs(pAndDob1));
		System.out.println(pAndDob5.hasSameBirthDateAs(pAndDob2));
		System.out.println(pAndDob5.hasSameBirthDateAs(pAndDob3));
		System.out.println(pAndDob5.hasSameBirthDateAs(pAndDob4));

		System.out.println(pAndDob1.hasSameBirthDayAs(pAndDob2));
		System.out.println(pAndDob1.hasSameBirthDayAs(pAndDob3));
		System.out.println(pAndDob1.hasSameBirthDayAs(pAndDob4));
		System.out.println(pAndDob1.hasSameBirthDayAs(pAndDob5));
		System.out.println(pAndDob2.hasSameBirthDayAs(pAndDob1));
		System.out.println(pAndDob2.hasSameBirthDayAs(pAndDob3));
		System.out.println(pAndDob2.hasSameBirthDayAs(pAndDob4));
		System.out.println(pAndDob2.hasSameBirthDayAs(pAndDob5));
		System.out.println(pAndDob3.hasSameBirthDayAs(pAndDob1));
		System.out.println(pAndDob3.hasSameBirthDayAs(pAndDob2));
		System.out.println(pAndDob3.hasSameBirthDayAs(pAndDob4));
		System.out.println(pAndDob3.hasSameBirthDayAs(pAndDob5));
		System.out.println(pAndDob4.hasSameBirthDayAs(pAndDob1));
		System.out.println(pAndDob4.hasSameBirthDayAs(pAndDob2));
		System.out.println(pAndDob4.hasSameBirthDayAs(pAndDob3));
		System.out.println(pAndDob4.hasSameBirthDayAs(pAndDob5));
		System.out.println(pAndDob5.hasSameBirthDayAs(pAndDob1));
		System.out.println(pAndDob5.hasSameBirthDayAs(pAndDob2));
		System.out.println(pAndDob5.hasSameBirthDayAs(pAndDob3));
		System.out.println(pAndDob5.hasSameBirthDayAs(pAndDob4));
	
		try(var output =new PrintWriter(new FileOutputStream(
						new File("output.txt"), true /* true means append to file */))) {
					output.println("\nTESTS FOR DateAndPlaceOfBirth.java:");

				//Copy all your lines above, add an extra "2" to every variable name
				// and replace every System.out.print or System.out.println
				// by output.print or output.println

		DateAndPlaceOfBirth pAndDob12 = new DateAndPlaceOfBirth (1990, 6, 19, "New York", "USA");
		DateAndPlaceOfBirth pAndDob22 = new DateAndPlaceOfBirth (2000, 6, 19, "Nashville", "Tennessee", "USA");
		DateAndPlaceOfBirth pAndDob32 = new DateAndPlaceOfBirth (1995, 8, 20, "Boulder", "Colorado", "USA");
		DateAndPlaceOfBirth pAndDob42 = new DateAndPlaceOfBirth (1993, 11, 11, "Berlin", "Germany");
		DateAndPlaceOfBirth pAndDob52 = new DateAndPlaceOfBirth (1993, 11, 11, "Verona", "Italy");

		output.println(pAndDob12.olderThan(pAndDob22));
		output.println(pAndDob12.olderThan(pAndDob32));
		output.println(pAndDob12.olderThan(pAndDob42));
		output.println(pAndDob12.olderThan(pAndDob52));
		output.println(pAndDob22.olderThan(pAndDob12));
		output.println(pAndDob22.olderThan(pAndDob32));
		output.println(pAndDob22.olderThan(pAndDob42));
		output.println(pAndDob22.olderThan(pAndDob52));
		output.println(pAndDob32.olderThan(pAndDob12));
		output.println(pAndDob32.olderThan(pAndDob22));
		output.println(pAndDob32.olderThan(pAndDob42));
		output.println(pAndDob32.olderThan(pAndDob52));
		output.println(pAndDob42.olderThan(pAndDob12));
		output.println(pAndDob42.olderThan(pAndDob22));
		output.println(pAndDob42.olderThan(pAndDob32));
		output.println(pAndDob42.olderThan(pAndDob52));
		output.println(pAndDob52.olderThan(pAndDob12));
		output.println(pAndDob52.olderThan(pAndDob22));
		output.println(pAndDob52.olderThan(pAndDob32));
		output.println(pAndDob52.olderThan(pAndDob42));

		output.println(pAndDob12.youngerThan(pAndDob22));
		output.println(pAndDob12.youngerThan(pAndDob32));
		output.println(pAndDob12.youngerThan(pAndDob42));
		output.println(pAndDob12.youngerThan(pAndDob52));
		output.println(pAndDob22.youngerThan(pAndDob12));
		output.println(pAndDob22.youngerThan(pAndDob32));
		output.println(pAndDob22.youngerThan(pAndDob42));
		output.println(pAndDob22.youngerThan(pAndDob52));
		output.println(pAndDob32.youngerThan(pAndDob12));
		output.println(pAndDob32.youngerThan(pAndDob22));
		output.println(pAndDob32.youngerThan(pAndDob42));
		output.println(pAndDob32.youngerThan(pAndDob52));
		output.println(pAndDob42.youngerThan(pAndDob12));
		output.println(pAndDob42.youngerThan(pAndDob22));
		output.println(pAndDob42.youngerThan(pAndDob32));
		output.println(pAndDob42.youngerThan(pAndDob52));
		output.println(pAndDob52.youngerThan(pAndDob12));
		output.println(pAndDob52.youngerThan(pAndDob22));
		output.println(pAndDob52.youngerThan(pAndDob32));
		output.println(pAndDob52.youngerThan(pAndDob42));

		output.println(pAndDob12.hasSameBirthDateAs(pAndDob22));
		output.println(pAndDob12.hasSameBirthDateAs(pAndDob32));
		output.println(pAndDob12.hasSameBirthDateAs(pAndDob42));
		output.println(pAndDob12.hasSameBirthDateAs(pAndDob52));
		output.println(pAndDob22.hasSameBirthDateAs(pAndDob12));
		output.println(pAndDob22.hasSameBirthDateAs(pAndDob32));
		output.println(pAndDob22.hasSameBirthDateAs(pAndDob42));
		output.println(pAndDob22.hasSameBirthDateAs(pAndDob52));
		output.println(pAndDob32.hasSameBirthDateAs(pAndDob12));
		output.println(pAndDob32.hasSameBirthDateAs(pAndDob22));
		output.println(pAndDob32.hasSameBirthDateAs(pAndDob42));
		output.println(pAndDob32.hasSameBirthDateAs(pAndDob52));
		output.println(pAndDob42.hasSameBirthDateAs(pAndDob12));
		output.println(pAndDob42.hasSameBirthDateAs(pAndDob22));
		output.println(pAndDob42.hasSameBirthDateAs(pAndDob32));
		output.println(pAndDob42.hasSameBirthDateAs(pAndDob52));
		output.println(pAndDob52.hasSameBirthDateAs(pAndDob12));
		output.println(pAndDob52.hasSameBirthDateAs(pAndDob22));
		output.println(pAndDob52.hasSameBirthDateAs(pAndDob32));
		output.println(pAndDob52.hasSameBirthDateAs(pAndDob42));

		output.println(pAndDob12.hasSameBirthDayAs(pAndDob22));
		output.println(pAndDob12.hasSameBirthDayAs(pAndDob32));
		output.println(pAndDob12.hasSameBirthDayAs(pAndDob42));
		output.println(pAndDob12.hasSameBirthDayAs(pAndDob52));
		output.println(pAndDob22.hasSameBirthDayAs(pAndDob12));
		output.println(pAndDob22.hasSameBirthDayAs(pAndDob32));
		output.println(pAndDob22.hasSameBirthDayAs(pAndDob42));
		output.println(pAndDob22.hasSameBirthDayAs(pAndDob52));
		output.println(pAndDob32.hasSameBirthDayAs(pAndDob12));
		output.println(pAndDob32.hasSameBirthDayAs(pAndDob22));
		output.println(pAndDob32.hasSameBirthDayAs(pAndDob42));
		output.println(pAndDob32.hasSameBirthDayAs(pAndDob52));
		output.println(pAndDob42.hasSameBirthDayAs(pAndDob12));
		output.println(pAndDob42.hasSameBirthDayAs(pAndDob22));
		output.println(pAndDob42.hasSameBirthDayAs(pAndDob32));
		output.println(pAndDob42.hasSameBirthDayAs(pAndDob52));
		output.println(pAndDob52.hasSameBirthDayAs(pAndDob12));
		output.println(pAndDob52.hasSameBirthDayAs(pAndDob22));
		output.println(pAndDob52.hasSameBirthDayAs(pAndDob32));
		output.println(pAndDob52.hasSameBirthDayAs(pAndDob42));
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
	