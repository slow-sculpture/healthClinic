package main.java.app.order;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import main.java.app.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Order implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    BigDecimal price;

    //DB relations
    @ManyToOne
    @JoinColumn
    User user;
    @OneToMany (mappedBy = "order", cascade = CascadeType.ALL,
    fetch = FetchType.EAGER)
    Set<OrderDetail> orderDetailSet;
    @OneToMany (mappedBy = "order", cascade = CascadeType.ALL,
            fetch = FetchType.EAGER)
    Set<OrderHistory> orderHistorySet;
}
