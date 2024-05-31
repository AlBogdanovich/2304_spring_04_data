package by.itclass._02_spring_jpa.repositories;

import by.itclass._02_spring_jpa.entities.Airplane;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirplaneRepository extends CrudRepository<Airplane, Integer> {
    //find,  get одинаковы , query, delete, update     - begin
    //By            - where
    //Model, Places - condition
    Airplane findByModel(String model);
    Airplane findByModelAndPlaces(String model, int places);
    Airplane findByModelLike(String model);
    List<Airplane> findByIdBetween(int from, int to);

    @Query(value = "SELECT * FROM airplane", nativeQuery = true)
    List<Airplane> selAllSamoliot();

    @Query(value = "SELECT * FROM airplane WHERE model LIKE ?1 AND places = ?2", nativeQuery = true)
    Airplane concreteSamoliot(String model, int places);

    @Query(value = "SELECT * FROM airplane WHERE places > 100", nativeQuery = true)
    List<Airplane> bigSamoliot();
}
