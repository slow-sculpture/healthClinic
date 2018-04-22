package main.java.app.doctors;

import lombok.*;
import main.java.app.service.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(exclude = {"serviceSet", "addmissionTimeSet"})
@Data
@Builder
public class Doctor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    private String academicTitle;
    private String firstName;
    private String lastName;
    private String specialization;

    //DB relations
    @OneToMany(mappedBy = "doctor", fetch = FetchType.EAGER)
    Set<Service> serviceSet;
    @OneToMany (mappedBy = "doctor")
    Set<AddmissionTime> addmissionTimeSet;
    //

}
