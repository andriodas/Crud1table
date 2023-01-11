import java.util.ArrayList;
import java.util.Scanner;

public class Car {
    private static int counter = 0;
    public static ArrayList<Car> cars = new ArrayList<>();
    private int carid;
    private String marke;
    private String modelis;
    private ArrayList<CarPart> carParts = new ArrayList<>();

    public Car() {
        this.carid = ++counter;
        this.carParts = new ArrayList<CarPart>();
        cars.add(this);
    }

    public Car(String marke, String modelis) {
        this.carid = ++counter;
        this.marke = marke;
        this.modelis = modelis;
        this.carParts = new ArrayList<CarPart>();
        cars.add(this);
    }

    public int getCaridId() {
        return carid;
    }

    public void setcarId(int id) {
        this.carid = carid;

    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModelis() {
        return modelis;
    }

    public void setModelis(String modelis) {
        this.modelis = modelis;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + carid +
                ", marke='" + marke + '\'' +
                ", modelis='" + modelis + '\'' +
                '}';
    }

    public static void showCars() {//1
        for (int i = 0; i < Car.cars.size(); i++) {
            Car car = Car.cars.get(i);
            System.out.println(car);
        }
    }

    public static void deleteCar(int id) {
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).carid == id) {
                cars.remove(i);
                System.out.println("Automobilis sėkmingai pašalintas");
                return;
            }
        }
        System.out.println("Dar tokios masinos neradome");
    }

    public static void editCar(Scanner sc) {
        int id = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).carid == id) {
                System.out.println("Įveskite automobilio marke");
                cars.get(i).setMarke(sc.nextLine());
                System.out.println("Įveskite automobilio modeli");
                cars.get(i).setModelis(sc.nextLine());
                System.out.println("Automobilio duomenys sėkmingai atnaujinti");
            }
        }
    }
    public static void  insertCar(Scanner sc){
        Car au = new Car();
        au.setMarke(sc.nextLine());
        System.out.println("Įveskite automobilio modeli");
        au.setModelis(sc.nextLine());
        System.out.println("Automobilis buvo sėkmingai įtrauktas į biblioteką");

    }

}