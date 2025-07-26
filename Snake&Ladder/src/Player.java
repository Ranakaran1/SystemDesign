public class Player {

    int id;
    String name;
    int currentPosition;

    public Player(){};

    public Player(int id, String name, int currentPosition) {
        this.id = id;
        this.name = name;
        this.currentPosition = currentPosition;
    }
    public Player(int id, int currentPosition){
        this.id = id;
        this.currentPosition = currentPosition;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    
    
}
