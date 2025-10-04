public class main {
    public static void main(String[] args) {
        Device samsung = new MobileDevice(
                "Samsung", "Galaxy S24", 999.99,
                1024, 5000, new AndroidOS("14")
        );

        Device iphone = new MobileDevice(
                "Apple", "iPhone 7 Pro", 1599.00,
                512, 4350, new IOS("17")
        );

        samsung.showDetails();
        iphone.showDetails();
    }
}