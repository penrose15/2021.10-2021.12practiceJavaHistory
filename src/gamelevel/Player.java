package gamelevel;

public class Player {
	private PlayerLevel level;
	
	public Player() {
		level = new BeginnerLevel();  //비기너로 시작 고정
		level.showLevelMessage();  //Player 클래스 디폴트
	}
		
		public PlayerLevel getLevel() {
			return level;
		}
		public void upgradeLevel(PlayerLevel level) {
			this.level = level;
			level.showLevelMessage();
		}
		public void play(int count) {
			level.go(count);
		}
	}


