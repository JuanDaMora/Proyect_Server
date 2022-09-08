package io.getArrays.server.model;

/**
 * @autor Juan David Morantes Vergara
 */
public enum Status {
    SERVER_UP("SERVER_Up"),
    SERVER_DOWN("SERVER_DOWN");
    private final String status;

    Status(String status){
        this.status=status;
    }

    public String getStatus(){
        return this.status;
    }

}
