package br.com.digitalhouse.exerciciosSpring.usecase.impl;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.HouseInfo;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.House;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.HouseInfoGateway;
import br.com.digitalhouse.exerciciosSpring.usecase.model.HouseInfoUseCase;
import org.springframework.stereotype.Service;

@Service
public class HouseInfoUseCaseImpl implements HouseInfoUseCase {

    private HouseInfoGateway houseInfoGateway;

    public HouseInfoUseCaseImpl(HouseInfoGateway houseInfoGateway) {
        this.houseInfoGateway = houseInfoGateway;
    }
    @Override
    public HouseInfo postHouseInfo(House house) {
        return this.houseInfoGateway.postHouseInfo(house);
    }
}
