package statisticker;

public class StatsChecker {
    public float maxThreshold;
    public IAlerter[] alerter ;

    public StatsChecker(float maxThreshold, IAlerter[] alerters) {
        this.maxThreshold = maxThreshold;
        this.alerter = alerters;
    }

    public void checkAndAlert(Float[] numbers) {


    }
}
