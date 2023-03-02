import java.util.ArrayList;

public class Team {

    private String teamName;
    private int rank;
    private ArrayList<String> meberNames;

    public Team(String teamName){
        this.teamName = teamName;
        rank = 0;
        meberNames = new ArrayList<>();
    }
    public void setRank(int newRank){
        rank = newRank; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hold: ");
        sb.append(teamName);
        sb.append(" Rang: ");
        sb.append(rank);
        return sb.toString();
    }
}
