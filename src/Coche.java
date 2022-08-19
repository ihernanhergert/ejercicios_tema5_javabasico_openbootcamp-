public class Coche {
    String id;

    public Coche(){

    };

    public Coche(String id){
    this.id = id;
    };

    @Override
    public String toString() {
        return id;
    }
}
