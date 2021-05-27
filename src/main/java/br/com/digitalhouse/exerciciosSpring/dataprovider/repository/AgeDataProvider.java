package br.com.digitalhouse.exerciciosSpring.dataprovider.repository;

import br.com.digitalhouse.exerciciosSpring.domain.gateways.AgeGetaway;
import org.springframework.stereotype.Component;

@Component
public class AgeDataProvider implements AgeGetaway {
    @Override
    public int calculateAge(int day, int month, int year) {
        return AgeRepositoryFake.calculateAgeFrom(day, month, year);
    }
}
