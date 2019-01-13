package in.clouthink.lutra.sample.model;

import javax.persistence.*;


//CREATE TABLE address (
//        address_id SMALLINT UNSIGNED NOT NULL AUTO_INCREMENT,
//        address VARCHAR(50) NOT NULL,
//        address2 VARCHAR(50) DEFAULT NULL,
//        district VARCHAR(20) NOT NULL,
//        city_id SMALLINT UNSIGNED NOT NULL,
//        postal_code VARCHAR(10) DEFAULT NULL,
//        phone VARCHAR(20) NOT NULL,
//        /*!50705 location GEOMETRY NOT NULL,*/
//        last_update TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//        PRIMARY KEY  (address_id),
//        KEY idx_fk_city_id (city_id),
//        /*!50705 SPATIAL KEY `idx_location` (location),*/
//        CONSTRAINT `fk_address_city` FOREIGN KEY (city_id) REFERENCES city (city_id) ON DELETE RESTRICT ON UPDATE CASCADE
//        )ENGINE=InnoDB DEFAULT CHARSET=utf8;

@Entity
@Table(name = "address")
public class Address {

    @Id
    @Column(name = "address_id")
    private Integer id;

    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Column(name = "address2")
    private String address2;

    @Basic
    @Column(name = "district" )
    private String district;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "city_id")
    private City city;

    @Basic
    @Column(name = "postal_code")
    private String postalCode;

    @Basic
    @Column(name = "phone")
    private String phone;

    @Basic
    @Column(name = "last_update")
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

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
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
