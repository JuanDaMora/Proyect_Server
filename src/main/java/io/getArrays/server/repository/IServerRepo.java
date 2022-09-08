package io.getArrays.server.repository;

import io.getArrays.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @autor Juan David Morantes Vergara
 */
public interface IServerRepo extends JpaRepository<Server,Long> {
    Server findByIpAddress(String ipAddress);
}
