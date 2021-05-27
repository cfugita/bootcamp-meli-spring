package br.com.digitalhouse.exerciciosSpring.usecase.impl;

import br.com.digitalhouse.exerciciosSpring.usecase.model.AgeUseCase;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.AgeGetaway;
import org.springframework.stereotype.Service;

@Service
public class AgeUseCaseImpl implements AgeUseCase {

    private final AgeGetaway ageGateway;

    public AgeUseCaseImpl(AgeGetaway ageGateway) { this.ageGateway = ageGateway; }

    @Override
    public int calculateAge(int day, int month, int year) {
        return this.ageGateway.calculateAge(day,month,year);
    }
}
