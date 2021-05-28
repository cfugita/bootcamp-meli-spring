package br.com.digitalhouse.exerciciosSpring.dataprovider;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.HouseInfoRepositoryFake;
import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.HouseInfo;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.House;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.HouseInfoGateway;
import org.springframework.stereotype.Service;

@Service
public class HouseInfoDataProvider implements HouseInfoGateway {
    @Override
    public HouseInfo postHouseInfo(House house) {
        return HouseInfoRepositoryFake.postHouseInfofrom(house);
    }
}
