package br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys;

public class RoomInfo {
    private String name;
    private double totalArea;

    public RoomInfo(String name, double totalArea) {
        this.name = name;
        this.totalArea = totalArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(double totalArea) {
        this.totalArea = totalArea;
    }
}
