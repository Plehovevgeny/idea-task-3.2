public class Main {
    public static void main(String[] args) {

        BmiService servise = new BmiService();
        double bmi = servise.calculate(1.80, 75); //рост в метрах

        System.out.printf("Ваш индекс массы тела - " + bmi);
    }
}
