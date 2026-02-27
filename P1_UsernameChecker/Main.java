public class Main {

    public static void main(String[] args) {

        UsernameService service = new UsernameService();

        service.registerUser("john_doe", 101);
        service.registerUser("admin", 102);

        System.out.println("Check john_doe: " + service.checkAvailability("john_doe"));
        System.out.println("Check jane_smith: " + service.checkAvailability("jane_smith"));

        System.out.println("Suggestions for john_doe: " + service.suggestAlternatives("john_doe"));

        service.checkAvailability("admin");
        service.checkAvailability("admin");
        service.checkAvailability("admin");

        System.out.println("Most Attempted: " + service.getMostAttempted());
    }
}