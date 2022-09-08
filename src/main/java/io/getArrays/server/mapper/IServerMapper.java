package io.getArrays.server.mapper;

import io.getArrays.server.dto.ServerDTO;
import io.getArrays.server.model.Server;
import org.mapstruct.factory.Mappers;

/**
 * @autor Juan David Morantes Vergara
 */
public interface IServerMapper {
    IServerMapper INSTANCE= Mappers.getMapper(IServerMapper.class);

    //Mapping DTO to model
    Server toServer(ServerDTO serverDTO);

    //Mapping model to DTO
    ServerDTO toServerDTO(Server server);
}
