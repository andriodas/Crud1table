import java.util.ArrayList;

public class CarPart {
    private static int counter = 0;
    private int id;
    private String partName;
    private int partCode;
    public static ArrayList<CarPart> parts = new ArrayList<>();
    public CarPart(int carId) {
        this.id = ++counter;
//        CarPart.find(carId).CarPart.add(this);
    }

    public CarPart(String partName, int partCode) {
        this.id = ++counter;
        this.partName = partName;
        this.partCode = partCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public int getPartCode() {
        return partCode;
    }

    public void setPartCode(int partCode) {
        this.partCode = partCode;
    }
}
