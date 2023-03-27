package es.virtualhit.virtualcustomstatisticsapi.user.statistic;

public class IntegerStatistic extends Statistic {

    private int value;

    public IntegerStatistic(String name, int value) {
        super(name, StatisticType.INTEGER);
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

