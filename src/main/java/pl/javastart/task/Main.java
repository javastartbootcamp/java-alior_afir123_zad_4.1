package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room salon = new Room(4, 5, 23.5, true, 21);
        Room sypialnia = new Room(3, 3, 22.3, true, 20);
        Room kuchnia = new Room(2, 3, 22.0, false, 24);


        System.out.println("Obecna temperatura: " + salon.getTemperature());
        System.out.println("Czy udało się zmniejszyć temperaturę: " + salon.makeLowerTemperature(salon.getTemperature(), salon.getMinTemperature(), salon.getIsAirConditioner()));

        System.out.println("Obecna temperatura: " + salon.getTemperature());
        System.out.println("Czy udało się zmniejszyć temperaturę: " + salon.makeLowerTemperature(salon.getTemperature(), salon.getMinTemperature(), salon.getIsAirConditioner()));

        System.out.println("Obecna temperatura: " + salon.getTemperature());
        System.out.println("Czy udało się zmniejszyć temperaturę: " + salon.makeLowerTemperature(salon.getTemperature(), salon.getMinTemperature(), salon.getIsAirConditioner()));

        System.out.println("Obecna temperatura: " + salon.getTemperature());
        System.out.println("Czy udało się zmniejszyć temperaturę: " + salon.makeLowerTemperature(salon.getTemperature(), salon.getMinTemperature(), salon.getIsAirConditioner()));
    }
}
