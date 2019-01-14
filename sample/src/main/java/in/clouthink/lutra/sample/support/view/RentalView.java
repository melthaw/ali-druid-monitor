package in.clouthink.lutra.sample.support.view;

import java.util.Date;

public class RentalView {

    private Integer id;

    private InventoryView inventory;

    private CustomerView customer;

    private StaffView staff;

    private Date returnAt;

    private Date rentalAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public InventoryView getInventory() {
        return inventory;
    }

    public void setInventory(InventoryView inventory) {
        this.inventory = inventory;
    }

    public CustomerView getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerView customer) {
        this.customer = customer;
    }

    public StaffView getStaff() {
        return staff;
    }

    public void setStaff(StaffView staff) {
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
