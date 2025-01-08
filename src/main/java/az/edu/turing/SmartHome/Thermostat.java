package az.edu.turing.SmartHome;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(int id, String name, boolean status, DeviceType deviceType) {
        super(id, name, status, deviceType);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println(getName() + " thermostat is turned on.");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getName() + " thermostat is turned off.");
    }

}
