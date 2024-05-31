package by.itclass._02_spring_jpa.entities;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Entity
@Table(name = "airplane")
@RequiredArgsConstructor
@Data
@ToString
@NoArgsConstructor
public class Airplane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private  String model;
    @NonNull
    private  int places;

    @OneToMany
    @JoinColumn(name = "airplane_id")
    private List<Passenger> passengers;

    @Autowired
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
}
