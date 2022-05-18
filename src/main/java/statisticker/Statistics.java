package statisticker;

import java.util.List;

public class Statistics 
{
    public static Stats getStatistics(List<Float> numbers) {

        //implement the computation of statistics here


    return null;
    }

    public class Stats {
        public float average;
        public float min;
        public float max;

        public float getAverage() {
            return average;
        }

        public void setAverage(float average) {
            this.average = average;
        }

        public float getMin() {
            return min;
        }

        public void setMin(float min) {
            this.min = min;
        }

        public float getMax() {
            return max;
        }

        public void setMax(float max) {
            this.max = max;
        }
    }
}
