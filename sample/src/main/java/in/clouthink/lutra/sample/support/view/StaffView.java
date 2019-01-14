package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Staff;
import org.springframework.beans.BeanUtils;

import java.util.Date;


public class StaffView {

    public static StaffView from(Staff staff) {
        StaffView result = new StaffView();
        BeanUtils.copyProperties(staff, result);
        if (staff.getStore() != null) {
            result.setStoreId(staff.getStore().getId());
        }
        if (staff.getAddress() != null) {
            result.setAddressId(staff.getAddress().getId());
            result.setAddressName(staff.getAddress().getAddress());
        }
        return result;
    }

    private Integer id;

    private String firstName;

    private String lastName;

    private Integer addressId;

    private String addressName;

    private String email;

    private Integer storeId;

    private Boolean active;

    private String username;

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

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
