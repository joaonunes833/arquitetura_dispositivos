public class Stadium {
    private String name;
    private String country;
    private int capacity;

    public Stadium(String name, String country, int capacity){
        this.name = name;
        this.country = country;
        this.capacity = capacity;
    }
    public Stadium(){
        this.name = "";
        this.country = "";
        this.capacity = 0;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }
    public int getCapacity() {
        return capacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ":" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
