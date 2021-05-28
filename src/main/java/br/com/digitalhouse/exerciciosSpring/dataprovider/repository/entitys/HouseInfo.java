package br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys;

import java.util.List;

public class HouseInfo {
    private double totalArea;
    private double totalValue;
    private String biggestRoom;
    List<RoomInfo> roomInfo;

    public HouseInfo(double totalArea, double totalValue, String biggestRoom, List<RoomInfo> roomInfo) {
        this.totalArea = totalArea;
        this.totalValue = totalValue;
        this.biggestRoom = biggestRoom;
        this.roomInfo = roomInfo;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public String getBiggestRoom() {
        return biggestRoom;
    }

    public void setBiggestRoom(String biggestRoom) {
        this.biggestRoom = biggestRoom;
    }

    public List<RoomInfo> getRoomInfo() {
        return roomInfo;
    }

    public void setRoomInfo(List<RoomInfo> roomInfo) {
        this.roomInfo = roomInfo;
    }
}
