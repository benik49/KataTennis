import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class TestUnit {
	

	
	@Test
	void testSimpleGame1() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setSimplePointPlayer1(0) ;
		String players = "A" ; 
		int res = 15 ;
		int res2 = 0 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getSimplePointPlayer1() != res && score1.getSimplePointPlayer2() !=res2) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame2() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setSimplePointPlayer1(15) ;
		String players = "A" ; 
		int res =  30 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getSimplePointPlayer1() != res) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame3() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setSimplePointPlayer1(30) ;
		String players = "A" ; 
		int res = 40 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getSimplePointPlayer1() != res) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame4() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setSimplePointPlayer2(0) ;
		String players = "B" ; 
		int res =  15 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getSimplePointPlayer2() != res) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame5() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setSimplePointPlayer2(15) ;
		String players = "B" ; 
		int res = 30 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getSimplePointPlayer2() != res) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame6() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setSimplePointPlayer2(30) ;
		String players = "B" ; 
		int res = 40 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getSimplePointPlayer2() != res) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame7() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer1(1); 
		score1.setSimplePointPlayer1(40);
		String players = "A" ; 
		int res = 2 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getGamePointPlayer1() != res) {
			System.out.println(" score1.getSimplePointPlayer2()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame8() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer1(2); 
		score1.setSimplePointPlayer1(40);
		String players = "A" ; 
		int res = 3 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getGamePointPlayer1() != res) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame9() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer1(3); 
		score1.setSimplePointPlayer1(40);
		String players = "A" ; 
		int res = 4 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getGamePointPlayer1() != res) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame10(){
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer1(4); 
		score1.setSimplePointPlayer1(40);
		String players = "A" ; 
		int res = 5 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getGamePointPlayer1() != res) {
			System.out.println(" score1.getSimplePointPlayer1()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	
	@Test
	void testSimpleGame11() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer1(5); 
		score1.setSimplePointPlayer1(40); 
		String players = "A" ; 
		int res = 6 ;
		int res2 = 1 ;
		SimpleGame.normalScoreGame(score1, players) ;
		SimpleSet.setFini(score1, "non");
		if (score1.getGamePointPlayer1() != res && 
				score1.getSetPointPlayer1() != res2 )
				 {
			System.out.println(" score1.getSimplePointPlayer1() ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }   // TODO 
	}
	@Test
	void testSimpleGame12() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer2(5); 
		score1.setSimplePointPlayer2(40); 
		String players = "B" ; 
		int res = 6 ;
		int res2 = 1 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getGamePointPlayer2() != res && 
				score1.getSetPointPlayer2() != res2 )
				 {
			System.out.println(" score1.getSimplePointPlayer2() ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }   // TODO 
	}
	@Test
	void testSimpleGame13() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer2(2); 
		score1.setSimplePointPlayer2(40);
		String players = "B" ; 
		int res = 3 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getGamePointPlayer2() != res) {
			System.out.println(" score1.getSimplePointPlayer2()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame14() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer2(3); 
		score1.setSimplePointPlayer2(40);
		String players = "B" ; 
		int res = 4 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getGamePointPlayer2() != res) {
			System.out.println(" score1.getSimplePointPlayer2()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	@Test
	void testSimpleGame15(){
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer2(4); 
		score1.setSimplePointPlayer2(40);
		String players = "B" ; 
		int res = 5 ;
		SimpleGame.normalScoreGame(score1, players) ;
		if (score1.getGamePointPlayer2() != res) {
			System.out.println(" score1.getSimplePointPlayer2()  ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }// TODO
	}
	
	@Test
	void testSimpleGame16() {
		Score score1 = new Score(0,0,0,0,0,0,"","");
		score1.setGamePointPlayer2(5); 
		score1.setSimplePointPlayer2(40); 
		String players = "B" ; 
		int res = 6 ;
		int res2 = 1 ;
		SimpleGame.normalScoreGame(score1, players) ;
		SimpleSet.setFini(score1, "non");
		if (score1.getGamePointPlayer2() != res && 
				score1.getSetPointPlayer2() != res2 )
				 {
			System.out.println(" score1.getSimplePointPlayer2() ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }   // TODO 
	}
	
	void testSimpleGame17() {
		Score score1 = new Score(40,40,0,0,0,0,"","");
		score1.setGamePointPlayer2(5); 
		score1.setSimplePointPlayer2(40); 
		score1.setAdv1("ADV");
		String players = "B" ; 
		int res = 6 ;
		int res2 = 1 ;
		SimpleGame.deuceAdvGame(score1, players) ;
		SimpleSet.setFini(score1, "non");
		if (score1.getGamePointPlayer2() != res && 
				score1.getSetPointPlayer2() != res2 )
				 {
			System.out.println(" score1.getSimplePointPlayer2() ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }   // TODO 
	}
	void testSimpleGame18() {
		Score score1 = new Score(40,40,0,0,0,0,"","ADV");
		score1.setGamePointPlayer2(5); 
		score1.setSimplePointPlayer2(40); 
		String players = "A" ; 
		int res = 5 ;
		int res2 = 0 ;
		SimpleGame.deuceAdvGame(score1, players) ;
		SimpleSet.setFini(score1, "non");
		if (score1.getGamePointPlayer2() != res && 
				score1.getSetPointPlayer2() != res2 )
				 {
			System.out.println(" score1.getSimplePointPlayer2() ");
			fail("Error players A for SimpleGame.normalScoreGame(score1, players)");
	        }   // TODO 
	}
	
}



