public class BmiService {
    public double calculate(double height, double weight) {
        double degreeHeight = height * height;
        double bmi = weight / degreeHeight;
        return bmi;
    }
}
