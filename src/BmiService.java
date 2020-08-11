public class BmiService {
    public double calculate(double weight, int growth) {
        double bmi = growth / (weight * weight);

        return bmi;
    }
}
