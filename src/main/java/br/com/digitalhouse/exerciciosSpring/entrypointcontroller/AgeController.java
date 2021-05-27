package br.com.digitalhouse.exerciciosSpring.entrypointcontroller;

import br.com.digitalhouse.exerciciosSpring.usecase.model.AgeUseCase;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/age")
@RestController
public class AgeController {

    private final AgeUseCase ageUseCase;

    public AgeController (AgeUseCase ageUseCase) { this.ageUseCase = ageUseCase; }

    @GetMapping("/{day}/{month}/{year}")
    public int getAge (@PathVariable("day") int day, @PathVariable("month") int month, @PathVariable("year") int year) {
        return ageUseCase.calculateAge(day,month,year);
    }

}
