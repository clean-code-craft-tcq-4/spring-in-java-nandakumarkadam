package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics {

  public static Stats getStatistics(List<Float> numbers) {

    // implement the computation of statistics here
    if (!numbers.isEmpty()) {
      float avg = 0;
      for (float fl : numbers) {
        avg = avg + fl;
      }
      Stats.average = avg / numbers.size();
      Stats.max = Collections.max(numbers);
      Stats.min = Collections.min(numbers);
    }
    return null;
  }


  public static class Stats {

    public static float average;
    public static float min;
    public static float max;

  }
}
