package io.getArrays.server.services.interfaces;

import io.getArrays.server.model.Server;

import java.util.Collection;

/**
 * @autor Juan David Morantes Vergara
 */
public interface IServerServiceImpl {
    Server create(Server server);
    Server ping(String ipAddress);
    Collection<Server> list(int limit);
    Server get(Long id);
    Server update(Server server);
    Server delete(Long id);
}
