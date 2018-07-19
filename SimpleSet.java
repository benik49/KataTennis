
public class SimpleSet {

	public static void setFini(Score score1, String tieBreack)
	{
		// fct for the account of Set

		if(score1.getGamePointPlayer1()==6 && score1.getGamePointPlayer2()<5 )
		{
			int set = 1+score1.getSetPointPlayer1()  ;
			score1.setSetPointPlayer1(set);
			score1.setGamePointPlayer1(0) ;
			score1.setGamePointPlayer2(0) ;
			System.out.println("Set remporté par le joueur A !!  ");

		}

		else if(score1.getGamePointPlayer2()==6 && score1.getGamePointPlayer1()<5 )
		{
			int set = 1+score1.getSetPointPlayer2()  ;
			score1.setSetPointPlayer2(set);
			score1.setGamePointPlayer1(0) ;
			score1.setGamePointPlayer2(0) ;
			System.out.println("Set remporté par le joueur B !!  ");
		}


		if(!tieBreack.equals("Yes") || !tieBreack.equals("yes") 
				|| !tieBreack.equals("Y") 
				|| !tieBreack.equals("y"))
		{
			// rules with 7points for win 

			if(score1.getGamePointPlayer1()==7  )
			{
				int set = 1+score1.getSetPointPlayer1()  ;
				score1.setSetPointPlayer1(set);
				score1.setGamePointPlayer1(0) ;
				score1.setGamePointPlayer2(0) ;
				System.out.println("Set remporté par le joueur A !!  ");
			}

			else if(score1.getGamePointPlayer2()==7)
			{
				int set = 1+score1.getSetPointPlayer2()  ;
				score1.setSetPointPlayer2(set);
				score1.setGamePointPlayer1(0) ;
				score1.setGamePointPlayer2(0) ;
				System.out.println("Set remporté par le joueur B !!  ");
			}
		}

		// tie breack rules !!


		else if(tieBreack.equals("Yes") || tieBreack.equals("yes") 
				|| tieBreack.equals("Y") 
				|| tieBreack.equals("y") )
		{
			if(score1.getGamePointPlayer2()-score1.getGamePointPlayer1()>1)
			{
				int set = 1+score1.getSetPointPlayer2()  ;
				score1.setSetPointPlayer2(set);
				score1.setGamePointPlayer1(0) ;
				score1.setGamePointPlayer2(0) ;
				System.out.println("Set remporté par le joueur B !!  ");
			}
			else if(score1.getGamePointPlayer2()-score1.getGamePointPlayer1()<-1 )
			{
				int set = 1+score1.getSetPointPlayer1()  ;
				score1.setSetPointPlayer1(set);
				score1.setGamePointPlayer1(0) ;
				score1.setGamePointPlayer2(0) ;
				System.out.println("Set remporté par le joueur A !!  ");

			}

		}
		if(score1.getSetPointPlayer1()>2 )
		{
			System.out.println("Player A win match");
		}
		else if(score1.getSetPointPlayer2()>2 )
		{
			System.out.println("Player B win match");
		}





	}
 
}
