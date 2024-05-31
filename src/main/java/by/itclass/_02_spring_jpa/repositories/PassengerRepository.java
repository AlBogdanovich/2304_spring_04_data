package by.itclass._02_spring_jpa.repositories;

import by.itclass._02_spring_jpa.entities.Passenger;
import org.springframework.data.repository.CrudRepository;

public interface PassengerRepository extends CrudRepository<Passenger, Integer> {
}
