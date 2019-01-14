package in.clouthink.lutra.sample.support.view;


import java.util.Date;

public class CityView {

    private Integer id;

    private String city ;

    private CountryView country;

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

    public CountryView getCountry() {
        return country;
    }

    public void setCountry(CountryView country) {
        this.country = country;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
