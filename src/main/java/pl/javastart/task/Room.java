package pl.javastart.task;

public class Room {

    private int length;
    private int width;
    private double temperature;
    private boolean isAirConditioner;
    private double minTemperature;

    public Room(int length, int width, double temperature, boolean isAirConditioner, double minTemperature) {
        this.length = length;
        this.width = width;
        this.temperature = temperature;
        this.isAirConditioner = isAirConditioner;
        this.minTemperature = minTemperature;
    }

    int getLength() {
        return length;
    }

    void setLength(int length) {
        this.length = length;
    }

    int getWidth() {
        return width;
    }

    void setWidth(int width) {
        this.width = width;
    }

    double getTemperature() {
        return temperature;
    }

    void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    boolean getIsAirConditioner() {
        return isAirConditioner;
    }

    void setAirConditioner(boolean airConditioner) {
        isAirConditioner = airConditioner;
    }

    double getMinTemperature() {
        return minTemperature;
    }

    void setMinTemperature(double minTemperature) {
        this.minTemperature = minTemperature;
    }

    String makeLowerTemperature(double temperature, double minTemperature, boolean isAirConditioner) {
        String result;
        if (isAirConditioner) {
            result = isTemperatureCouldBeChange(temperature, minTemperature);
        } else {
            result = "Brak klimatyzatora";
        }
        return result;
    }

    private String isTemperatureCouldBeChange(double temperature, double minTemperature) {
        String result;
        if (temperature > minTemperature) {
            result = isTemperatureMoreThanOne(temperature, minTemperature);
        } else {
            result = "Osiągnięto minimalną temperaturę";
        }
        return result;
    }

    private String isTemperatureMoreThanOne(double temperature, double minTemperature) {
        String result;
        if (temperature - minTemperature > 1) {
            setTemperature(temperature - 1);
            result = "Zmniejszono temperaturę o 1 stopień";
        } else {
            setTemperature(temperature - (temperature - minTemperature));
            result = "Zmniejszono temperaturę do poziomu temperatury minimalnej";
        }
        return result;
    }
}