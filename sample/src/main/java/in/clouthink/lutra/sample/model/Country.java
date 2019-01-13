package in.clouthink.lutra.sample.model;

//CREATE TABLE country (
//        country_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
//        country VARCHAR(50) NOT NULL,
//        last_update TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//        PRIMARY KEY  (country_id)
//        )ENGINE=InnoDB DEFAULT CHARSET=utf8;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "country_id")
    private Integer id;

    @Basic
    @Column(name = "country")
    private String country ;

    @Basic
    @Column(name = "last_update")
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
