package main.java.app.service;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import main.java.app.doctors.Doctor;
import main.java.app.order.OrderDetail;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(exclude = "orderDetailSet")
public class Service implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    private String name;
    private BigDecimal price;
    private String description;

    @OneToMany(mappedBy = "service", fetch = FetchType.EAGER)
    Set<OrderDetail> orderDetailSet;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn
    Doctor doctor;





    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
