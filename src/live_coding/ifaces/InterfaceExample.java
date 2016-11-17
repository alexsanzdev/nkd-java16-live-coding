package live_coding.ifaces;

public class InterfaceExample {

    public static void main(String[] args) {

        USB[] usbDevices = { new UsbDrive(), new Camera() };

        String myPassword = "asdjfkuio3ui9";

        for (USB usbDevice: usbDevices) {
            usbDevice.sendData(myPassword);
        }

    }
}
