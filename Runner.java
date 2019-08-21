public class Runner {
    double speedInKm;
    double distaneInKm;
    double timeTakenInSec;

    public void setDistance(double distance) {
        distaneInKm = distance;
    }

    public void setTime(double inSec) {
        timeTakenInSec = inSec;
    }

    public getAverageSpeed() {
        double averageSpeed = distaneInKm / timeTakenInSec;
        return averageSpeed;
    }

    public double getInMiles(double lengthInKm) {
        double inMiles = lengthInKm / 1.6;
        return inMiles;
    }

}