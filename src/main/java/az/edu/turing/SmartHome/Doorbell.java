package az.edu.turing.SmartHome;

public class Doorbell extends Device{

    public Doorbell(int id, String name, boolean status, DeviceType deviceType){
        super(id, name, status, deviceType);
    }
    @Override
    public void turnOn(){
        setStatus(true);
        System.out.println(getName() + " light is turned on.");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getName() + " light is turned off.");
    }

    public void ring() {
        System.out.println(getName() + " is ringing.");
    }
}
