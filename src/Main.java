import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new Car("Audi", "A4");
        new Car("Volkswagen", "Golf");
        new Car("Volkswagen", "Golf2");
        new Car("Volkswagen", "Golf3");
        new Car("Volkswagen", "Golf4");
        new Car("Volkswagen", "Golf5");
        new Car("Audi", "A6");
        new Car("Audi", "A8");
        new Car("Hyundai", "I10");
        new Car("Tesla", "S");
        new Car("Toyota", "Yaris");
        new CarPart("Zabaris",255);
        new CarPart("Jolki",2555);
        Scanner sc = new Scanner(System.in);

        System.out.println("sveiki atvykę į online automobilyna!");
        while (true) {
            intro();
            int option = sc.nextInt();
            sc.nextLine();
            switch (option) {
                case 1:
                    Car.showCars();
                    break;
                case 2:
                    System.out.println("Įveskite automobilio marke");
                    Car.insertCar(sc);
                    break;
                case 3:
                    System.out.println("Įveskite automobilio kurį norite trinti id");
                    Car.deleteCar(sc.nextInt());
                    sc.nextLine();
                    break;
                case 4:
                    System.out.println("Įveskite automobilio kurį norite redaguoti id");
                    Car.editCar(sc);
                    break;
                case 5:
                    System.out.println("Viso gero this is the end");
                    System.exit(1);
                    break;
                    //surasti viena konkretu irasa
            }
        }
    }

    public static void intro() {
        System.out.println("Pasirinkite ka norite daryti");
        System.out.println("1.Pamatyti automobiliu sarasa.");
        System.out.println("2.Prideti auomobili.");
        System.out.println("3.Istrinti automobili.");
        System.out.println("4.Redaguoti automobilio marke ir modeli.");
        System.out.println("5.Iseiti is programos");
    }
}
