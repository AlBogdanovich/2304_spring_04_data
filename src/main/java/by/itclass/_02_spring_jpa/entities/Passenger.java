package by.itclass._02_spring_jpa.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "passenger")
@RequiredArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class Passenger {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @NonNull
    private String fio;
}
