package com.company;

public class Laptop {
    private String ram;
    private String hdd;
    private String cpu;

    private boolean isGraphicsEnable;
    private boolean isBluetoothEnable;

    public String getRam() {
        return ram;
    }
    public String getHdd() {
        return hdd;
    }
    public String getCpu() {
        return cpu;
    }
    public boolean isGraphicsEnable() {
        return isGraphicsEnable;
    }
    public boolean isBluetoothEnable() {
        return isBluetoothEnable;
    }

    private Laptop(LaptopBuilder builder) {
        this.ram = builder.ram;
        this.hdd = builder.hdd;
        this.cpu = builder.cpu;

        this.isBluetoothEnable = builder.isBluetoothEnable;
        this.isGraphicsEnable = builder.isGraphicsEnable;

    }

    public static class LaptopBuilder{

        private String ram;
        private String hdd;
        private String cpu;

        private boolean isGraphicsEnable;
        private boolean isBluetoothEnable;

        public LaptopBuilder(String ram, String hdd, String cpu) {
            super();
            this.ram = ram;
            this.hdd = hdd;
            this.cpu = cpu;
        }

        public LaptopBuilder setGraphicsEnable(boolean isGraphicsEnable) {
            this.isGraphicsEnable = isGraphicsEnable;
            return this;
        }

        public LaptopBuilder setBluetoothEnable(boolean isBluetoothEnable) {
            this.isBluetoothEnable = isBluetoothEnable;
            return this;
        }

        public Laptop build() {
            return new Laptop(this);
        }
    }

    @Override
    public String toString() {
        return "Laptop [ram=" + ram + ", hdd=" + hdd + ", cpu=" + cpu + ", isGraphicsEnable=" + isGraphicsEnable
                + ", isBluetoothEnable=" + isBluetoothEnable + "]";
    }

}
