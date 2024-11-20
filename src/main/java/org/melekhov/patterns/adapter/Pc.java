package org.melekhov.patterns.adapter;

public class Pc {
    public void readUsb(Usb usb) {
        usb.info();
        System.out.println("Reading information");
    }
}
