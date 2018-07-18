
public class Score {
	public int simplePointPlayer1 ;
	public int gamePointPlayer1 ;
    public int  setPointPlayer1 ;
    
    public int simplePointPlayer2 ;
    public int gamePointPlayer2 ;
    public int  setPointPlayer2 ;
    public String adv1 ;
    public String adv2 ;
    

	public Score(int simplePointPlayer1, int simplePointPlayer2, int gamePointPlayer1, int setPointPlayer1, int gamePointPlayer2, int setPointPlayer2,
    		String adv1, String adv2) {
		
		this.simplePointPlayer1 = simplePointPlayer1 ;
		this.gamePointPlayer1 = gamePointPlayer1;
		this.setPointPlayer1 = setPointPlayer1;
		
		this.setPointPlayer2 = simplePointPlayer2 ; 
		this.gamePointPlayer2 = gamePointPlayer2;
		this.setPointPlayer2 = setPointPlayer2;
		
		this.adv1 = adv1 ;
		this.adv2 = adv2 ; 
		
	}

	
    public int getSimplePointPlayer1() {
		return simplePointPlayer1;
	}


	public void setSimplePointPlayer1(int simplePointPlayer1) {
		this.simplePointPlayer1 = simplePointPlayer1;
	}


	public int getGamePointPlayer1() {
		return gamePointPlayer1;
	}


	public void setGamePointPlayer1(int gamePointPlayer1) {
		this.gamePointPlayer1 = gamePointPlayer1;
	}


	public int getSetPointPlayer1() {
		return setPointPlayer1;
	}


	public void setSetPointPlayer1(int setPointPlayer1) {
		this.setPointPlayer1 = setPointPlayer1;
	}


	public int getSimplePointPlayer2() {
		return simplePointPlayer2;
	}


	public void setSimplePointPlayer2(int simplePointPlayer2) {
		this.simplePointPlayer2 = simplePointPlayer2;
	}


	public int getGamePointPlayer2() {
		return gamePointPlayer2;
	}


	public void setGamePointPlayer2(int gamePointPlayer2) {
		this.gamePointPlayer2 = gamePointPlayer2;
	}


	public int getSetPointPlayer2() {
		return setPointPlayer2;
	}


	public void setSetPointPlayer2(int setPointPlayer2) {
		this.setPointPlayer2 = setPointPlayer2;
	}


	public String getAdv1() {
		return adv1;
	}


	public void setAdv1(String adv1) {
		this.adv1 = adv1;
	}


	public String getAdv2() {
		return adv2;
	}


	public void setAdv2(String adv2) {
		this.adv2 = adv2;
	}


}
