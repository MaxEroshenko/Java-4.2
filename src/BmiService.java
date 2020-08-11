public class BmiService {
    public int calculate(double weigth, int growth) {
        weigth = 1.76;
        growth = 95;
        double bmi = growth / (weigth * weigth);
        System.out.println(bmi);

        return 0;
    }
}
