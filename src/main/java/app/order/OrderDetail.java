package main.java.app.order;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import main.java.app.service.Service;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OrderDetail implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    BigDecimal price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    Service service;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    Order order;
}
