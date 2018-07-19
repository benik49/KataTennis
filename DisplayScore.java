
public class DisplayScore {
	
	Score score1 ;
	
	//fct for display the score
	
	public static void displayScore (Score score1) 
	{
		System.out.println
		("Table Score *****************************************************************"
	 +"\n***********| Point  |Game | Set |"
	 +"\n Player A  |    "+score1.getSimplePointPlayer1()  +"   |  "+score1.getGamePointPlayer1()+"  |  "+score1.getSetPointPlayer1()+"  | "+score1.getAdv1() 
	 +"\n Player B  |    "+score1.getSimplePointPlayer2() +"   |  "+score1.getGamePointPlayer2()+"  |  "+score1.getSetPointPlayer2()+"  | "  +score1.getAdv2() 
	 +"\n ******************************************************************************"
	   + "\n");
	}
	

}
