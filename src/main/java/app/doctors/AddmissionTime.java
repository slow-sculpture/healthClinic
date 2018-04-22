package main.java.app.doctors;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalTime;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AddmissionTime implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Enumerated
    WorkingDay workingDay;
    LocalTime fromTime;
    LocalTime toTime;

    //private Map<WorkingDay, List<LocalTime>> admission;
    //Map<PON, List<from, to>>
    //LocalTime fromTime; //=LocalTime.of()


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    Doctor doctor;
}
