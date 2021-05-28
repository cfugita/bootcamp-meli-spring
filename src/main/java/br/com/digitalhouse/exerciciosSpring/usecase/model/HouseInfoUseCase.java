package br.com.digitalhouse.exerciciosSpring.usecase.model;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.HouseInfo;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.House;

public interface HouseInfoUseCase {
    HouseInfo postHouseInfo(House house);
}
