package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Rental;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class RentalView {

    public static RentalView from(Rental rental) {
        RentalView result = new RentalView();
        BeanUtils.copyProperties(rental, result);
        if (rental.getInventory() != null) {
            result.setInventoryId(rental.getInventory().getId());
        }
        if (rental.getCustomer() != null) {
            result.setCustomerId(rental.getCustomer().getId());
            result.setCustomerFirstName(rental.getCustomer().getFirstName());
            result.setCustomerLastName(rental.getCustomer().getLastName());
        }
        if (rental.getStaff() != null) {
            result.setStaffId(rental.getStaff().getId());
            result.setStaffFirstName(rental.getStaff().getFirstName());
            result.setStaffLastName(rental.getStaff().getLastName());
        }
        return result;
    }

    private Integer id;

    private Integer inventoryId;

    private Integer customerId;

    private String customerFirstName;

    private String customerLastName;

    private Integer staffId;

    private String staffFirstName;

    private String staffLastName;

    private Date returnAt;

    private Date rentalAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInventoryId() {
        return inventoryId;
    }

    public void setInventoryId(Integer inventoryId) {
        this.inventoryId = inventoryId;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerFirstName() {
        return customerFirstName;
    }

    public void setCustomerFirstName(String customerFirstName) {
        this.customerFirstName = customerFirstName;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public void setCustomerLastName(String customerLastName) {
        this.customerLastName = customerLastName;
    }

    public Integer getStaffId() {
        return staffId;
    }

    public void setStaffId(Integer staffId) {
        this.staffId = staffId;
    }

    public String getStaffFirstName() {
        return staffFirstName;
    }

    public void setStaffFirstName(String staffFirstName) {
        this.staffFirstName = staffFirstName;
    }

    public String getStaffLastName() {
        return staffLastName;
    }

    public void setStaffLastName(String staffLastName) {
        this.staffLastName = staffLastName;
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
