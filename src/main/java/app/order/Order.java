package main.java.app.order;

import lombok.*;
import main.java.app.user.User;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = {"orderDetailSet","orderHistorySet"})
@Data
@Builder
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


    public void addOrderDetail(OrderDetail orderDetail){
        orderDetail.setOrder(this);
        orderDetailSet.add(orderDetail);
    }
    public void addOrderHistory(OrderHistory orderHistory){
        orderHistory.setOrder(this);
        orderHistorySet.add(orderHistory);
    }
    public OrderHistory getCurrent(){
        return this.getOrderHistorySet()
                .stream()
                .sorted((a,b)->a.getId().compareTo(b.getId()))
                .findFirst()
                .orElse(new OrderHistory());
    }

}
