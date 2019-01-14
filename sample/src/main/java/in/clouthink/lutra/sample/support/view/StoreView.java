package in.clouthink.lutra.sample.support.view;


import in.clouthink.lutra.sample.model.Store;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class StoreView {

    public static StoreView from(Store store) {
        StoreView result = new StoreView();
        BeanUtils.copyProperties(store, result);
        if (store.getManager() != null) {
            result.setManagerId(store.getManager().getId());
            result.setManagerFirstName(store.getManager().getFirstName());
            result.setManagerLastName(store.getManager().getLastName());
        }
        if (store.getAddress() != null) {
            result.setAddressId(store.getAddress().getId());
            result.setAddressName(store.getAddress().getAddress());
        }
        return result;
    }

    private Integer id;

    private Integer managerId;

    private String managerFirstName;

    private String managerLastName;

    private Integer addressId;

    private String addressName;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getManagerId() {
        return managerId;
    }

    public void setManagerId(Integer managerId) {
        this.managerId = managerId;
    }

    public String getManagerFirstName() {
        return managerFirstName;
    }

    public void setManagerFirstName(String managerFirstName) {
        this.managerFirstName = managerFirstName;
    }

    public String getManagerLastName() {
        return managerLastName;
    }

    public void setManagerLastName(String managerLastName) {
        this.managerLastName = managerLastName;
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

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
