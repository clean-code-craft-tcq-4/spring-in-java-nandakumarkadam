
package statisticker;

import java.util.Arrays;
import java.util.List;

public class StatsChecker {

  /**
   * @param maxThreshold
   * @param alerters
   */
  public float maxThreshold;
  public IAlerter alerters;

  public StatsChecker(float maxThreshold, IAlerter alerters) {
    this.maxThreshold = maxThreshold;
    this.alerters = alerters;
  }

  /**
   * @param numbers
   */
  public void checkAndAlert(Float[] numbers) {
    List<Float> numberList = Arrays.asList(numbers);
    Statistics.Stats s = Statistics.getStatistics(numberList);

    if (maxThreshold > s.max) {
      alerters.emailAlert.setEmailSent(true);
      alerters.ledAlert.setLedGlows(true);

    }

  }

}
