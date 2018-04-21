package main.java.app.order;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import main.java.app.service.Service;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @ManyToOne (cascade = CascadeType.ALL)
    @JoinColumn
    Service service;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    Order order;
}
