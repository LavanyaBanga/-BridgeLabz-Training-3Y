public class UnitConverter {

    public static double convertKmToMiles(double km) {
        return km * 0.621371;
    }

    public static double convertMilesToKm(double miles) {
        return miles * 1.60934;
    }

    // Example main method to test
    public static void main(String[] args) {
        double km = 10;
        double miles = convertKmToMiles(km);
        System.out.println(km + " km = " + miles + " miles");

        double m = 5;
        double kmBack = convertMilesToKm(m);
        System.out.println(m + " miles = " + kmBack + " km");
    }
}
