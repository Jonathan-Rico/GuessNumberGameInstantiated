import java.util.Scanner;
public class Main {
	public static void main(String [] args){
		System.out.printf("Welcome to the guess a number game, please type in a number between 1 and 10\n");		
		RandomNumber randomNumber = new RandomNumber();
		int game = randomNumber.GetANumber_Between_1_and_10 ();
		Scanner input = new Scanner(System.in);
		int user = input.nextInt();		
		if (user == game){
			System.out.printf("Congratulations, the number %d is the correct choice. You have won the game.\n", user);		
			}		
		else if (user < game){			
			System.out.printf("Sorry but the number %d is too low, the correct number is %d, please try again by restarting program", user , game);		
			}		
		else if (user > game){			
			System.out.printf("Sorry but the number %d is too high, the correct number is %d, please try again by restarting program", user , game);			
			}	
		}
	} 
