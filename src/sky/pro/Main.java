package sky.pro;

public class Main {

    public static void main(String[] args) {
        // task 1
        byte y = 125;
        short x = 150;
        int z = 40000;
        long w = 5000L;
        float f = 6.56f;
        double j = 34.345;
        char k = 345;
        boolean l = true;

        //task 2
        double firstWeightFighter = 78.2;
        double secondWeightFighter = 82.7;
        double totalWeight = firstWeightFighter + secondWeightFighter;
        System.out.println("Общий вес " + totalWeight + " кг.");
        double differenceWeight = secondWeightFighter - firstWeightFighter;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг.");

        //task 3
        int numberBananas = 5;
        int weightBananas = 80;
        int volumeMilk = 200 / 100;
        int weightMilk = 105;
        int numberIceСream = 2;
        int weightIceCream = 105;
        int numberEggs = 5;
        int weightEggs = 70;
        int weightBreakfastGrams = numberBananas * weightBananas + volumeMilk * weightMilk + numberIceСream * weightIceCream + numberEggs * weightEggs;
        System.out.println("Вес завтрака " + weightBreakfastGrams + " грамм");
        float weightBreakfastKg = weightBreakfastGrams / 1_000f;
        System.out.println("Вес завтрака " + weightBreakfastKg + " кг.");

        //task 4
        int loseWeight = 7;
        float minLoseWeight = 250 / 1000f;
        float maxLoseWeight = 500 / 1000f;
        float minLoseWeightDay = loseWeight / minLoseWeight;
        System.out.println("Количество дней, если спортсмен будет терять каждый день по 250 грамм " + minLoseWeightDay);
        float maxLoseWeightDay = loseWeight / maxLoseWeight;
        System.out.println("Количество дней, если спортсмен будет терять каждый день по 500 грамм " + maxLoseWeightDay);
        float averageLoseWeight = (minLoseWeight + maxLoseWeight) / 2;
        float averageLoseWeightDay = loseWeight / averageLoseWeight;
        System.out.println("Количество дней в среднем " + averageLoseWeightDay);

        //task 5
        int salaryMashaMonth = 67_760;
        int salaryDenisMonth = 83_690;
        int salaryKristinaMonth = 76_230;
        float salaryMashaMonthIncrease = salaryMashaMonth * (110f / 100);
        float salaryDenisMonthIncrease = salaryDenisMonth * (110f / 100);
        float salaryKristinaMonthIncrease = salaryKristinaMonth * (110f / 100);
        float addSalaryMashaYear = (salaryMashaMonthIncrease - salaryMashaMonth) * 12;
        float addSalaryDenisYear = (salaryDenisMonthIncrease - salaryDenisMonth) * 12;
        float addSalaryKristinaYear = (salaryKristinaMonthIncrease - salaryKristinaMonth) * 12;
        System.out.println("Маша теперь получает " + salaryMashaMonthIncrease + " рублей");
        System.out.println("Годовой доход вырос на " + addSalaryMashaYear + " рублей");
        System.out.println("Денис теперь получает " + salaryDenisMonthIncrease + " рублей");
        System.out.println("Годовой доход вырос на " + addSalaryDenisYear + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristinaMonthIncrease + " рублей");
        System.out.println("Годовой доход вырос на " + addSalaryKristinaYear + " рублей");

        //task 6
        int a = 12;
        int b = 27;
        int c = 44;
        int d = 15;
        int e = 9;
        int result=a * (b + (c - d * e));
        System.out.println("Результат " + result);
        int invertResult=result*-1;
        System.out.println("Инвентированный результат " + invertResult);
    }
}