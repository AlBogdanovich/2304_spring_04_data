package by.itclass._02_spring_jpa.entities;

import jakarta.persistence.*;
import lombok.*;

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
}
