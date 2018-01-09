import java.util.ArrayList;

public class BusStop {

    private String stopName;
    private ArrayList<Person> queue;

    public BusStop(String stopName){
        this.stopName = stopName;
        this.queue = new ArrayList<>();
    }

}
