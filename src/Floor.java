import java.util.List;
import java.util.ArrayList;
public class Floor {

    private int floorNumber;
    private List<Request> upwardRequests;
    private List<Request> downwardRequests;


    public Floor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.upwardRequests = new ArrayList<>();
        this.downwardRequests = new ArrayList<>();
    }

    public int getFloorNumber() {
        return floorNumber;
    }

    public List<Request> getUpwardRequests() {
        return upwardRequests;
    }

    public List<Request> getDownwardRequests() {
        return downwardRequests;
    }

    public void addRequest(Request request) {
        //request adding to 1st list if request's direction is upwards

    }
}