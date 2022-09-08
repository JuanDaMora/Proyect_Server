package io.getArrays.server.dto;

import io.getArrays.server.model.Status;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

/**
 * @autor Juan David Morantes Vergara
 */
@Getter
@Setter
@NoArgsConstructor
public class ServerDTO implements Serializable {
    @Serial
    private static final long serialVersionUID = 6894378232909677398L;
    private String ipAddress;
    private String name;
    private String memory;
    private String type;
    private String imgUrl;
    private Status status;
}
