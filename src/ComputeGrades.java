/*
 * Student Name: Ishtiaque Maitn
 * Lab Professor: Leanne Seaward
 * Due Date: Sep 17th, 2021
 * Modified: Sep 17th, 2021
 * Description: This class will compute a final grade from 4 grades and weights
 *
 */

//	adding the scanner class allowing to get keyboard input
import java.util.Scanner;
public class ComputeGrades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//	start
//		set weight1 to 0.20
//		set weight2 to 0.20
//		set weight3 to 0.30
//	 	set weight4 to 0.30
//		prompt user to enter the first grade
//		set grade1 to user input
//		prompt user to enter the second grade
//		set grade2 to user input
//		prompt user to enter the third grade
//		set grade3 to user input
//	 	prompt user to enter the fourth grade
//		set grade4 to user input
//		set finalgrade to grade1*weight1+grade2*weight2+grade3*weight3+grade4*weight4
//		output final grade
//	stop
		
		//set the weights
		double weight1 = 0.2;
		double weight2 = 0.2;
		double weight3 = 0.3;
		double weight4 = 0.3;
		double finalgrade, grade1, grade2, grade3, grade4;
		
		//adding the scanner input
		Scanner input = new Scanner(System.in);
		
		//get user to input for grades
		System.out.print("Please enter the first grade: ");
		grade1 = input.nextDouble();
		
		System.out.print("Please enter the second grade: ");
		grade2 = input.nextDouble();
		
		System.out.print("Please enter the third grade: ");
		grade3 = input.nextDouble();
		
		System.out.print("Please enter the fourth grade: ");
		grade4 = input.nextDouble();

		//compute final grade
		finalgrade = grade1*weight1+grade2*weight2+grade3*weight3+grade4*weight4;
		
		//output final grade
		System.out.print("The final grade is: " + finalgrade);
		
		input.close();
		
	}

}
