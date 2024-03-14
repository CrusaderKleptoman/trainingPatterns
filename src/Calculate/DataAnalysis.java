package Calculate;

public class DataAnalysis {
    private AverageValues averageValues = new AverageValues();
    private DispersionRates dispersionRates = new DispersionRates();
    private DistributionPercentiles distributionPercentiles = new DistributionPercentiles();

    public DataAnalysis() {
    }

    public void calculateAverageValuesAll()
    {
        averageValues.calculateAverage();
        averageValues.calculateMedian();
        averageValues.calculateMod();
    }

    public void calculateDispersionRatesAll()
    {
        dispersionRates.calculateDispersion();
        dispersionRates.calculateAverageDeviation();
    }

    public void calculateDistriburionPercentilesAll()
    {
        distributionPercentiles.calculateQuartiles();
    }

    public void calculateAll()
    {
        calculateDistriburionPercentilesAll();
        calculateAverageValuesAll();
        calculateDispersionRatesAll();
    }
}
