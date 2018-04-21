package main.java.app.cart;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import main.java.app.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cart implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    //DB relations
    @OneToOne
    User user;
    @OneToMany(mappedBy = "cart")
    Set<CartDetail> cartDetailSet;
    //
}
