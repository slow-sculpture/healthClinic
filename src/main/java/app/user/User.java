package main.java.app.user;

import lombok.*;
import main.java.app.cart.Cart;
import main.java.app.order.Order;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = "orderSet")
@Data
@Builder
public class User implements Serializable{
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    Long id;

    String email;
    String password;
    String firstName;
    String lastName;

    //DB relations
    @OneToOne(mappedBy = "user")
    Cart cart;
    @OneToMany(mappedBy = "user")
    Set<Order> orderSet;
}
