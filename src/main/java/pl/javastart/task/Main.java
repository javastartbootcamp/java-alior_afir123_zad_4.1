package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Room salon = new Room(4, 5, 23.5, true, 21);
        Room sypialnia = new Room(3, 3, 22.3, true, 20);
        Room kuchnia = new Room(2, 3, 22.0, false, 24);


        System.out.println("Obecna temperatura: " + salon.getTemperature());
        String result1 = salon.makeLowerTemperature(salon.getTemperature(), salon.getMinTemperature(), salon.getIsAirConditioner());
        System.out.println(result1);

        System.out.println("Obecna temperatura: " + salon.getTemperature());
        String result2 = salon.makeLowerTemperature(salon.getTemperature(), salon.getMinTemperature(), salon.getIsAirConditioner());
        System.out.println(result2);

        System.out.println("Obecna temperatura: " + salon.getTemperature());
        String result3 = salon.makeLowerTemperature(salon.getTemperature(), salon.getMinTemperature(), salon.getIsAirConditioner());
        System.out.println(result3);

        System.out.println("Obecna temperatura: " + salon.getTemperature());
        String result4 = salon.makeLowerTemperature(salon.getTemperature(), salon.getMinTemperature(), salon.getIsAirConditioner());
        System.out.println(result4);
    }
}
