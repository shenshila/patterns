package org.melekhov.patterns.adapter;

public class MemoryCardAdapter extends Usb{

    private final MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void info() {
        memoryCard.info();
        System.out.println("Adapter memoryCard to USB");
        super.info();
    }
}
