public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double weightInKg = 80;
        double heightInM = 1.79;
        double bmi = service.calculate(weightInKg, heightInM);
        System.out.println("Your BMI is");
        System.out.println(bmi);

    }
}
