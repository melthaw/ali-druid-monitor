package in.clouthink.lutra.sample.model;

import javax.persistence.*;
import java.util.Date;


//CREATE TABLE language (
//        language_id TINYINT UNSIGNED NOT NULL AUTO_INCREMENT,
//        name CHAR(20) NOT NULL,
//        last_update TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
//        PRIMARY KEY (language_id)
//        )ENGINE=InnoDB DEFAULT CHARSET=utf8;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "language_id")
    private Integer id;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "last_update")
    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
