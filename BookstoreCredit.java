import java.util.Scanner;

public class BookstoreCredit
{
	public static void main(String[] args)
	{

		// Variables and constants
		String name;
		double gpa;
		double result;


        // objects
        Scanner scan = new Scanner(System.in);

        // input phase
        System.out.print("To qualify for bookstore credits enter your name: >> ");
        name = scan.nextLine();

 		System.out.print("Now enter your GPA for your submission: >> "); 
        gpa = scan.nextDouble();


		// calculation phase

		result =  calcCred(gpa);
		

		// output phase
			System.out.println("Hi " + name + ", your GPA is " + gpa + ". You get $" + result + " bookstore credits!");

			}

			public static double calcCred(double g)
			{
				double result;
			 	result = g * 10;
				return result;


		}
	}

