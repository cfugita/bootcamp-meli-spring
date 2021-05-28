package br.com.digitalhouse.exerciciosSpring.domain.entitys;

import java.util.List;

public class House {
    private String name;
    private String address;
    private List<Room> rooms;

    public House(String name, String address, List<Room> rooms) {
        this.name = name;
        this.address = address;
        this.rooms = rooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Room> getRooms() { return rooms; }

    public Room getRoom(int i) { return this.rooms.get(i); }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }
}
