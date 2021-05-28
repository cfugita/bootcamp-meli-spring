package br.com.digitalhouse.exerciciosSpring.dataprovider.repository;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.HouseInfo;
import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.RoomInfo;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.House;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Room;

import java.util.ArrayList;
import java.util.List;

public class HouseInfoRepositoryFake {

    public static HouseInfo postHouseInfofrom(House house){

        List<RoomInfo> roomInfos = new ArrayList<RoomInfo>();
        double totalArea = 0, maxArea = 0;
        String biggestRoom = "";

        for(Room room : house.getRooms()){
            double area = calculateArea(room);
            if(area > maxArea){
                maxArea = area;
                biggestRoom = room.getName();
            }
            totalArea += area;
            roomInfos.add(new RoomInfo(room.getName(),area));
        }

        return new HouseInfo(totalArea,(totalArea*800),biggestRoom, roomInfos);
    }

    private static double calculateArea(Room room) { return room.getWidth()* room.getLength(); }
}
