public class Main {
    public static void main(String[] args) {
        HomeInterface home = new HomeInterface();

        System.out.println("--- Turn on all services ---");
        home.turnOnAll();

        System.out.println("\n--- Turn off the TV only ---");
        home.turnOffTV();

        System.out.println("\n--- Turn off all services ---");
        home.turnOffAll();
    }
}
