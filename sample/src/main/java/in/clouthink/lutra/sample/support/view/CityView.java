package in.clouthink.lutra.sample.support.view;


import in.clouthink.lutra.sample.model.City;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class CityView {

    public static CityView from(City city) {
        CityView result = new CityView();
        BeanUtils.copyProperties(city, result);
        if (city.getCountry() != null) {
            result.setCountryId(city.getCountry().getId());
            result.setCountryName(city.getCountry().getCountry());
        }
        return result;
    }

    private Integer id;

    private String city;

    private Integer countryId;

    private String countryName;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
