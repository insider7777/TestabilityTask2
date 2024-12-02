public class BmiService {
    public int calculate(double waight, double height) {

        double bmi = waight / (height * height);


        return (int) bmi; // Округляем до целого числа
    }
}
