public class BmiService {

    public int calculate(int bodyWeightKg, double humanGrowthMetre) {
        double formula = bodyWeightKg / (humanGrowthMetre * humanGrowthMetre);
        return (int) formula;

    }
}
