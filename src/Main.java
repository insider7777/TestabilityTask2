public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double body = 1.72;
        double mass = 65.5;
        int bmi = service.calculate(mass, body);
        System.out.println(bmi);
    }
}