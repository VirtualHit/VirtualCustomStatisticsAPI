package es.virtualhit.virtualcustomstatisticsapi.user.statistic;

public class Statistic {

    private final String name;
    private final StatisticType type;


    public Statistic(String name, StatisticType type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public StatisticType getType() {
        return type;
    }
}
