package test;


public class Player{
	private PlayerLevel level;
	
	public Player() {
		level = new Beginner();
		level.showPlayerInfo();
	}

	
	public PlayerLevel getL 
	evel() {
		return level;
	}
	public void upgradeLevel(PlayerLevel level) {
		this.level = level;
		level.showPlayerInfo();
	}
	public void play(int count) {
		level.go(count);
	}
	
	
	
		}
	


