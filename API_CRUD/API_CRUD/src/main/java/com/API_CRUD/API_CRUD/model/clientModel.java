package com.API_CRUD.API_CRUD.model;



public class clientModel {


    private String clientID;
    private String clientName;

    private String clientAddress;
    private String clientPhNum;
    public clientModel() {
    }

    public clientModel(String clientID, String clientName, String clientAddress, String clientPhNum) {
        this.clientID = clientID;
        this.clientName = clientName;
        this.clientAddress = clientAddress;
        this.clientPhNum = clientPhNum;
    }
    public String getClientID() {
        return clientID;
    }

    public void setClientID(String clientID) {
        this.clientID = clientID;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }

    public String getClientPhNum() {
        return clientPhNum;
    }

    public void setClientPhNum(String clientPhNum) {
        this.clientPhNum = clientPhNum;
    }

}
