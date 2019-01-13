package in.clouthink.lutra.sample.model;

import javax.persistence.*;
import java.util.Date;

//CREATE TABLE rental (
//        rental_id INT NOT NULL AUTO_INCREMENT,
//        rental_date DATETIME NOT NULL,
//        inventory_id MEDIUMINT UNSIGNED NOT NULL,
//        customer_id SMALLINT UNSIGNED NOT NULL,
//        return_date DATETIME DEFAULT NULL,
//        staff_id TINYINT UNSIGNED NOT NULL,
//        last_update TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//        PRIMARY KEY (rental_id),
//        UNIQUE KEY  (rental_date,inventory_id,customer_id),
//        KEY idx_fk_inventory_id (inventory_id),
//        KEY idx_fk_customer_id (customer_id),
//        KEY idx_fk_staff_id (staff_id),
//        CONSTRAINT fk_rental_staff FOREIGN KEY (staff_id) REFERENCES staff (staff_id) ON DELETE RESTRICT ON UPDATE CASCADE,
//        CONSTRAINT fk_rental_inventory FOREIGN KEY (inventory_id) REFERENCES inventory (inventory_id) ON DELETE RESTRICT ON UPDATE CASCADE,
//        CONSTRAINT fk_rental_customer FOREIGN KEY (customer_id) REFERENCES customer (customer_id) ON DELETE RESTRICT ON UPDATE CASCADE
//        )ENGINE=InnoDB DEFAULT CHARSET=utf8;

@Entity
@Table(name = "rental")
public class Rental {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rental_id")
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "inventory_id")
    private Inventory inventory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "staff_id")
    private Staff staff;

    @Basic
    @Column(name = "return_date")
    private Date returnAt;

    @Basic
    @Column(name = "rental_date")
    private Date rentalAt;

    @Basic
    @Column(name = "last_update")
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Date getReturnAt() {
        return returnAt;
    }

    public void setReturnAt(Date returnAt) {
        this.returnAt = returnAt;
    }

    public Date getRentalAt() {
        return rentalAt;
    }

    public void setRentalAt(Date rentalAt) {
        this.rentalAt = rentalAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
