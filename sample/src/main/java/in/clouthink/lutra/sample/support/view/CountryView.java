package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Country;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class CountryView {

    public static CountryView from(Country country) {
        CountryView result = new CountryView();
        BeanUtils.copyProperties(country, result);
        return result;
    }

    private Integer id;

    private String country;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
