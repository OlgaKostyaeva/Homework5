public class BmiService {
    public double calculate(double sm, double kg) {
        double bmiA;
        double smA = sm * sm;
        bmiA = kg / smA;
        int bmi = (int) bmiA;
        return bmi;
    }
}
