package br.com.digitalhouse.exerciciosSpring.domain.gateways;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.HouseInfo;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.House;

public interface HouseInfoGateway {
    HouseInfo postHouseInfo (House house);
}
