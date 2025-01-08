package az.edu.turing.SmartHome;

import java.util.ArrayList;
import java.util.List;

public class SmartHome implements Manageable {
    private List<User> users;
    private List<Device> devices;

    public SmartHome() {
        this.users = new ArrayList<>();
        this.devices = new ArrayList<>();
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("User added: " + user.getFirstName());
    }

    public void removeUser(User user) {
        users.remove(user);
        System.out.println("User removed: " + user.getFirstName());
    }

    @Override
    public void addDevice(Device device){
        devices.add(device);
        System.out.println("Device added: " + device.getName());
    }
    @Override
    public void removeDevice(Device device) {
        users.remove(device);
        System.out.println("User removed: " + device.getName());
    }
    public void getDeviceStatus(int id) {
        boolean status = devices.get(id).getStatus();
        String statusStr = "";
        if (status) {
            statusStr = "Active";
        } else {
            statusStr = "Not active";
        }
        System.out.println("Device status is :" + statusStr);
    }



}
