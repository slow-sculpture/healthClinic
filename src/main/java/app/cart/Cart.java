package main.java.app.cart;

import lombok.*;
import main.java.app.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"cartDetailSet", "user"})
@Data
@Builder
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

    public void addCartDetail(CartDetail cartDetail){
        cartDetail.setCart(this);
        cartDetailSet.add(cartDetail);
    }
    public BigDecimal getTotalPrice(){
        BigDecimal total = cartDetailSet
                .stream()
                .map(cartDetail -> cartDetail.getService().getPrice())
                .reduce(BigDecimal.ZERO,BigDecimal::add);
        return total;
    }
}
