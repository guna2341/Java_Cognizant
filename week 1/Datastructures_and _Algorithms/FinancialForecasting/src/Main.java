


    public class Main {

        public static double recursion(double currentValue, double growthRate, int time) {
            if (time == 0) return currentValue;
            double curr = recursion(currentValue, growthRate, time - 1);
            return ((growthRate/100) * curr) + curr;
        }

        public static void main(String[] args) {
            System.out.println(recursion(1000.0, 10.0, 2));
        }
    }