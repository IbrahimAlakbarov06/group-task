package az.edu.turing.SmartHome;

public class Camera extends Device{

    private boolean recording;

    public Camera(int id, String name, boolean status, DeviceType deviceType){
        super(id, name, status, deviceType);
    }
    @Override
    public void turnOn(){
        setStatus(true);
        System.out.println(getName() + " camera is turned on.");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println(getName() + " camera is turned off.");
    }

    public void startRecording() {
        if (getStatus()) {
            recording = true;
            System.out.println(getName() + " started recording.");
        } else {
            System.out.println("Cannot start recording. " + getName() + " is off.");
        }
    }

    public void stopRecording() {
        recording = false;
        System.out.println(getName() + " stopped recording.");
    }



}
