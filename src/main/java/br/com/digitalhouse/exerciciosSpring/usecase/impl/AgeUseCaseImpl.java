package br.com.digitalhouse.exerciciosSpring.usecase.impl;

import br.com.digitalhouse.exerciciosSpring.usecase.model.AgeUseCase;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.AgeGateway;
import org.springframework.stereotype.Service;

@Service
public class AgeUseCaseImpl implements AgeUseCase {

    private final AgeGateway ageGateway;

    public AgeUseCaseImpl(AgeGateway ageGateway) { this.ageGateway = ageGateway; }

    @Override
    public int calculateAge(int day, int month, int year) {
        return this.ageGateway.calculateAge(day,month,year);
    }
}
