package br.com.digitalhouse.exerciciosSpring;

import br.com.digitalhouse.exerciciosSpring.dataprovider.StudentDataProvider;
import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.StudentRepositoryFake;
import br.com.digitalhouse.exerciciosSpring.dataprovider.repository.entitys.StudentFinals;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Student;
import br.com.digitalhouse.exerciciosSpring.domain.entitys.Subject;
import br.com.digitalhouse.exerciciosSpring.domain.gateways.StudentGateway;
import br.com.digitalhouse.exerciciosSpring.entrypoint.exceptions.ValidationErrorException;
import br.com.digitalhouse.exerciciosSpring.usecase.impl.StudentUseCaseImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class ExerciciosSpringApplicationTests {

	@Test
	void shouldCalculateGrade() {
		double averageGrade = 8.0;
		Subject subject1 = new Subject("Matemática", 9.0);
		Subject subject2 = new Subject("Geografia", 7.0);
		Subject subject3 = new Subject("Física", 8.0);
		List<Subject> subjects = new ArrayList<>();
		subjects.add(subject1);
		subjects.add(subject2);
		subjects.add(subject3);
		Student student = new Student("Carolina", subjects);
		StudentRepositoryFake studentRepositoryFake = new StudentRepositoryFake();

		StudentFinals studentFinals = studentRepositoryFake.calculateGrade(student);

		assertEquals(studentFinals.getAverageGrade(),averageGrade);
	}

	@Test
	void shouldThrowValidationException () {
		Subject subject1 = new Subject("Matemática", 9.0);
		List<Subject> subjects = new ArrayList<>();
		subjects.add(subject1);
		Student student = new Student("Carolina123", subjects);

		StudentUseCaseImpl studentUseCase = new StudentUseCaseImpl(new StudentDataProvider());

		Assertions.assertThrows(ValidationErrorException.class, () -> studentUseCase.calculateGrades(student));
	}

}
