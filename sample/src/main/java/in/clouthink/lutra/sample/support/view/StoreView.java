package in.clouthink.lutra.sample.support.view;


import java.util.Date;

public class StoreView {

    private Integer id;

    private StaffView manager;

    private AddressView address;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public StaffView getManager() {
        return manager;
    }

    public void setManager(StaffView manager) {
        this.manager = manager;
    }

    public AddressView getAddress() {
        return address;
    }

    public void setAddress(AddressView address) {
        this.address = address;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
