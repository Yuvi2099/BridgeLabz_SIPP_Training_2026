package CoreJavaPractice.gcr_codebase.Programming_Elements.Level_1;
public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double volumeKm3 = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);
        double kmPerMile = 1.60934;
        double volumeMiles3 = volumeKm3 / Math.pow(kmPerMile, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}