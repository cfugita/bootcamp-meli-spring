package br.com.digitalhouse.exerciciosSpring.dataprovider;

import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.AgeRepositoryFake;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.AgeGateway;
import org.springframework.stereotype.Component;

@Component
public class AgeDataProvider implements AgeGateway {
    @Override
    public int calculateAge(int day, int month, int year) {
        return AgeRepositoryFake.calculateAgeFrom(day, month, year);
    }
}