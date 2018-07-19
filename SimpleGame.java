import java.util.Scanner;

public class SimpleGame {

	Score score1 ;

	public static void game(Score score1, String tieBreack)
	{
		boolean continueGame = true ;
		String playersWinGame = "" ;
		String str = "" ;
		Scanner sc = new Scanner(System.in);

		while(continueGame == true )
		{
			playersWinGame="";
			// for add point to A or B 
			while(!playersWinGame.equals("A") && !playersWinGame.equals("B") )
			{
				System.out.println("who win the point? A or B ?") ;
				playersWinGame = sc.nextLine();
				System.out.println(""+playersWinGame);
			}

			System.out.println(playersWinGame + " won the point ! ") ;

			// if 40-40 spécial rules ADV/DEUCE
			
			if(score1.getSimplePointPlayer1()==40 && score1.getSimplePointPlayer2()==40)
			{
				deuceAdvGame(score1, playersWinGame) ;
			}
			else
			{
				//if not fct to resolve simple score game (0-15-30-40 without Deuce & adv)
				normalScoreGame(score1, playersWinGame) ;
			}
			
			SimpleSet.setFini(score1, tieBreack); //after the 6th or 7th game or Tie Breack 
			DisplayScore.displayScore(score1);
			System.out.println("Do you want to continue the game? true (write true or yes) or false (write other things)") ;
			str = sc.nextLine() ;
			
			if(str.equals("true")|| str.equals("yes"))
			{
				continueGame = true ;
			}
			else 
			{
				continueGame = false ;
			}


			

		}

	}

	public static void normalScoreGame(Score score1,String playersWinGame ) {
		// TODO Auto-generated method stub
		// fct to resolve simple score game (0-15-30 without Deuce & adv)
		if(playersWinGame.equals("A") )
		{
			// first if case for 0 or 15 points for player A
			if(score1.getSimplePointPlayer1()== 0 || score1.getSimplePointPlayer1()== 15  )
			{
				int simplePointPlayer = score1.getSimplePointPlayer1() + 15 ;
				score1.setSimplePointPlayer1(simplePointPlayer);
			}
			// second if case for 30 points for player A
			else if(score1.getSimplePointPlayer1()== 30 )
			{
				int simplePointPlayer = score1.getSimplePointPlayer1() + 10 ;
				score1.setSimplePointPlayer1(simplePointPlayer);
			}
			else if(score1.getSimplePointPlayer1()==40) {
				
				System.out.println("Player A won a game !!!") ;
				int game = score1.getGamePointPlayer1()+1 ;
				
				score1.setGamePointPlayer1(game) ;
				score1.setSimplePointPlayer1(0) ;
				score1.setSimplePointPlayer2(0) ;
			}

		}

			// TODO Auto-generated method stub
			// fct to resolve simple score game (0-15-30 without Deuce & adv)
		else if(playersWinGame.equals("B") )
		{
			// first if case for 0 or 15 points for player A
			if(score1.getSimplePointPlayer2()== 0 || score1.getSimplePointPlayer2()== 15  )
			{
				int simplePointPlayer = score1.getSimplePointPlayer2() + 15 ;
				score1.setSimplePointPlayer2(simplePointPlayer);
			}
			// second if case for 30 points for player A
			else if(score1.getSimplePointPlayer2()== 30 )
			{
				int simplePointPlayer = score1.getSimplePointPlayer2() + 10 ;
				score1.setSimplePointPlayer2(simplePointPlayer);
			}
			else if(score1.getSimplePointPlayer2()==40) {

				System.out.println("Player B won a game !!!") ;
				int game = score1.getGamePointPlayer2()+1 ;

				score1.setGamePointPlayer2(game) ;
				score1.setSimplePointPlayer1(0) ;
				score1.setSimplePointPlayer2(0) ;
			}

		}
	}

	public static void deuceAdvGame(Score score1, String playersWinGame) {
		// TODO Auto-generated method stub
		// fct to resolve the Adv probleme when 40-40, Deuce & Adv  

		if(playersWinGame.equals("A"))
		{

			if(score1.getAdv1().equals("") && score1.getAdv2().equals("")  )
			{
				score1.setAdv1("ADV");
			}
			else if(score1.getAdv1().equals("ADV") && score1.getAdv2().equals("")  )
			{
				System.out.println("Player A win a game !!!");
				int game = score1.getGamePointPlayer1()+1 ;
				score1.setAdv1("");
				score1.setGamePointPlayer1(game) ;
				score1.setSimplePointPlayer1(0) ;
				score1.setSimplePointPlayer2(0) ;
			}
			else if(score1.getAdv1().equals("") && score1.getAdv2().equals("ADV")  )
			{
				score1.setAdv1("");
				score1.setAdv2("");
			}


		}

		else if(playersWinGame.equals("B")) 
		{

			if(score1.getAdv1().equals("") && score1.getAdv2().equals("")  )
			{
				score1.setAdv2("ADV");
			}
			else if(score1.getAdv1().equals("ADV") && score1.getAdv2().equals("")  )
			{
				score1.setAdv1("");
				score1.setAdv2("");

			}
			else if(score1.getAdv1().equals("") && score1.getAdv2().equals("ADV")  )
			{
				score1.setAdv2("ADV");
				System.out.println("Player B win a game !!!");
				int game = score1.getGamePointPlayer2()+1 ;
				score1.setAdv2("");
				score1.setGamePointPlayer2(game) ;
				score1.setSimplePointPlayer1(0) ;
				score1.setSimplePointPlayer2(0) ;

			}

		}
	}

}
