class MobileDevice implements Device {
    private final String brand;
    private final String model;
    private final double price;
    private final int storageGB;
    private final int batteryMah;
    private final OperatingSystem os;

    public MobileDevice(String brand, String model, double price,
                        int storageGB, int batteryMah, OperatingSystem os) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.storageGB = storageGB;
        this.batteryMah = batteryMah;
        this.os = os;
    }

    @Override
    public void showDetails() {
        System.out.println(" Brand   : " + brand);
        System.out.println(" Model   : " + model);
        System.out.println(" Price   : $" + price);
        System.out.println(" Storage : " + storageGB + " GB");
        System.out.println(" Battery : " + batteryMah + " mAh");
        System.out.println(" OS      : " + os.getName() + " " + os.getVersion());
        System.out.println("\n");
    }
}