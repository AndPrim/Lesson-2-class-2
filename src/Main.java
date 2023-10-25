
public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bodyWeightKg = 98; // Вводим вес тела в килограммах.
        double humanGrowthMetre = 1.87; // Вводим рост в метрах.
        int bmi = service.calculate(bodyWeightKg, humanGrowthMetre);
        System.out.println(bmi);
    }
}