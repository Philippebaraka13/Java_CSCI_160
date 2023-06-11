public class Population {
    public static void main(String[] args) {
        double mexicoPopulation = 126e6; // 126 million
        double usaPopulation = 332e6; // 332 million
        double mexicoGrowthRate = 1.06 / 100; // 1.06 percent
        double usaDeclineRate = 0.15 / 100; // 0.15 percent
        int years = 0;

        while (mexicoPopulation <= usaPopulation) {
            mexicoPopulation += mexicoPopulation * mexicoGrowthRate;
            usaPopulation -= usaPopulation * usaDeclineRate;
            years++;
        }

        System.out.println("The population of Mexico will exceed that of the USA in " + years + " years.");
    }
}
