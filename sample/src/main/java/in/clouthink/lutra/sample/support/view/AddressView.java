package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Address;
import org.springframework.beans.BeanUtils;

public class AddressView {

    public static AddressView from(Address address) {
        AddressView result = new AddressView();
        BeanUtils.copyProperties(address, result);
        if (address.getCity() != null) {
            result.setCityId(address.getCity().getId());
            result.setCityName(address.getCity().getCity());
        }
        return result;
    }

    private Integer id;

    private String address;

    private String address2;

    private String district;

    private Integer cityId;

    private String cityName;

    private String postalCode;

    private String phone;

    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }
}
