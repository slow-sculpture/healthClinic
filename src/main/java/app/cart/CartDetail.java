package main.java.app.cart;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.java.app.service.Service;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class CartDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    //DB relations
    @ManyToOne
    @JoinColumn
    Cart cart;
    @ManyToOne
    @JoinColumn
    Service service;


}
