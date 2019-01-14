package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Customer;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class CustomerView {

    public static CustomerView from(Customer customer) {
        CustomerView result = new CustomerView();
        BeanUtils.copyProperties(customer, result);
        if (customer.getStore() != null) {
            result.setStoreId(customer.getStore().getId());
        }
        if (customer.getAddress() != null) {
            result.setAddressId(customer.getAddress().getId());
            result.setAddressName(customer.getAddress().getAddress());
        }
        return result;
    }

    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private Integer storeId;

    private Integer addressId;

    private String addressName;

    private Boolean active;

    private Date createdAt;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getAddressName() {
        return addressName;
    }

    public void setAddressName(String addressName) {
        this.addressName = addressName;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
