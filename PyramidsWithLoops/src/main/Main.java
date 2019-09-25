/* Mark Meier
 * meiermt@mail.uc.edu
 * Assignment 04
 * Due Date: 09/26/2019
 * Class: Web App W/ Java
 * Description: Making a pyramid
 * nicholdw@ucmail.uc.edu
 * Printing pyramids using loops. It kind-of works. 
 * What I really want is
        1
       222
      33333
     4444444
    555555555 
*/
package main;

public class Main {

	public static void main(String[] args) {
		 {
		 //Setting the integers
		 int i, j, k;
		     {
		     for (i = 1; i <= 5; i++)
		     {
		         for (j = 5; j > i; j--)
		         {
		         //Space to center align the numbers 
		         System.out.printf(" ");
		         }
		         //Setting numbers to up by 2 each line
		         for (k = 1; k <= 2 * i - 1; k++)
		         {
		         System.out.printf("%d", i);
		         }
		         //Print to next line
		         System.out.printf("\n");
		     	}
		     }
		}
	}
}