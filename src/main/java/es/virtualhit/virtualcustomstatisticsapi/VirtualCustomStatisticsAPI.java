package es.virtualhit.virtualcustomstatisticsapi;

import es.virtualhit.virtualcustomstatisticsapi.user.User;

import java.util.UUID;

public interface VirtualCustomStatisticsAPI {

    User getUser(UUID uuid);
}
