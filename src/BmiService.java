public class BmiService {
    public int calculate(double weigth, int growth) {
        double bmi = growth / (weigth * weigth);
        System.out.println(bmi);

        return 0;
    }
}
