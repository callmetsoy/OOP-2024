package Problem2;

enum LevelOfLeague{
	AMATEUR,
	SEMI_PRO,
	PROFESSIONAL
}

public class Football {
	private final static int MAX_PLAYERS = 11;
	private final String teamName;
	private static int teams = 0;
	private LevelOfLeague level;
	private int currentPlayers;
	
	{
		teams++;
	}
	
	public Football(String teamName, LevelOfLeague level, int currentPlayers) {
		this.teamName = teamName;
		this.level = level;
		this.currentPlayers = currentPlayers;
	}

    public void addPlayer() {
        if (this.currentPlayers < MAX_PLAYERS) {
            this.currentPlayers++;  
            System.out.println("Player added! Total players: " + this.currentPlayers);
        } else {
            System.out.println("Cannot add more players, team is full.");
        }
    }

    public void addPlayer(int count) {
        if (this.currentPlayers + count <= MAX_PLAYERS) {
            this.currentPlayers += count;
            System.out.println(count + " players added! Total players: " + this.currentPlayers);
        } else {
            System.out.println("Cannot add " + count + " players. It exceeds the team limit.");
        }
    }


    public static int getTotalTeams() {
        return teams;
    }


    public String getTeamName() {
        return teamName;
    }

    public LevelOfLeague getTeamLevel() {
        return level;
    }
	
	
}