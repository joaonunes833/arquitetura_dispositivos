public class Team {
    private String name;
    private int number;
    private int rank;
    private Stadium stadium;

    public Team(String name, int number, int rank, Stadium stadium){
        this.name = name;
        this.number = number;
        this.rank = rank;
        this.stadium = stadium;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int getRank() {
        return rank;
    }

    public Stadium getStadium() {
        return stadium;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public void setStadium(Stadium stadium) {
        this.stadium = stadium;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", rank=" + rank +
                ", " + stadium.toString() +
                '}';
    }
}
