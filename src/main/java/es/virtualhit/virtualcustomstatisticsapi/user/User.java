package es.virtualhit.virtualcustomstatisticsapi.user;

import es.virtualhit.virtualcustomstatisticsapi.user.statistic.Statistic;

import java.util.HashMap;
import java.util.UUID;

public class User {

    private final UUID uuid;
    private HashMap<String, Statistic> statistics;

    public User(UUID uuid) {
        this.uuid = uuid;
        statistics = new HashMap<>();
    }

    public UUID getUuid() {
        return uuid;
    }

    public HashMap<String, Statistic> getStatistics() {
        return statistics;
    }

    public void setStatistics(HashMap<String, Statistic> statistics) {
        this.statistics = statistics;
    }
}
