// Class to compute volume of Earth
class EarthVolume {
    public static void main(String[] args) {
        
        // Create variables for radius and pi
        double radiusKm = 6378;
        double pi = 3.14159;

        // Calculate volume in cubic kilometers
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert to cubic miles (1 mile = 1.6 km, so radius in miles)
        double radiusMiles = radiusKm / 1.6;
        double volumeMiles3 = (4.0 / 3.0) * pi * Math.pow(radiusMiles, 3);

        // Display result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + 
                           " and cubic miles is " + volumeMiles3);
    }
}
