package statisticker;

import java.util.Collections;
import java.util.List;

public class Statistics {

  public static Stats getStatistics(List<Float> numbers) {

    // implement the computation of statistics here
    Stats s = new Stats();
    if (!numbers.isEmpty()) {
      float avg = 0;
      for (float fl : numbers) {
        avg = avg + fl;
      }
      s.average = avg / numbers.size();
      s.max = Collections.max(numbers);
      s.min = Collections.min(numbers);
    }
    return s;
  }

  public static class Stats {
    public static float average;
    public static float min;
    public static float max;
    }
  }

