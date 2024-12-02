public class BmiService {
    public int calculate(double mass, double body) {

        double bmi = mass / (body * body);


        return (int) bmi; // Округляем до целого числа
    }
}
