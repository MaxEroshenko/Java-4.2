public class BmiService {
    public int calculate(double v, int index) {
        double weigth = 1.76;
        int growth = 95;
        double bmi = growth / (weigth * weigth);
        System.out.println(bmi);

        return index;
    }
}
