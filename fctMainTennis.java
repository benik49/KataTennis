import java.util.Scanner;

public class fctMainTennis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// main fct of Tennis Kata
		// 1st --> a Game
		Score score1 = new Score(0,0,0,0,0,0,"","");
		String tieBreack = "" ;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Welcome at the Kata Tennis Game, 2 players are playing, "
				+ "each turn choose who win the point, \n "
				+ "the choice is between A or B ( who correspond to Player A and Player B ) \n "
				+ "So lets begin ! ");
		System.out.println("Do you want with Tie breack ? yes or no?" );
		tieBreack = sc.nextLine();
		sc.nextLine() ;		
	
		
		SimpleGame.game(score1, tieBreack); 
		
		/*If the user exit the game, we show the final score
		 
		  System.out.println("End of game"
				+ "final score is "+
				afficheScore(score1));
				
		*/
	
		

	}

}
