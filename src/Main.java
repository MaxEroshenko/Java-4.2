public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double index = service.calculate(1.76, 95);
    }
}
