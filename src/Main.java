public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();

        double height  = 1.72;
        double waight = 65.5;
        int bmi = service.calculate(waight, height );
        System.out.println("Ваш индекс массы тела: " + bmi);
    }
}