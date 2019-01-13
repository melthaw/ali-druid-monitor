package in.clouthink.lutra.sample.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

//CREATE TABLE film_text (
//        film_id SMALLINT NOT NULL,
//        title VARCHAR(255) NOT NULL,
//        description TEXT,
//        PRIMARY KEY  (film_id),
//        FULLTEXT KEY idx_title_description (title,description)
//        )ENGINE=MyISAM DEFAULT CHARSET=utf8;

@Entity
@Table(name = "film_text")
public class FilmText {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "film_id")
    private Integer id;

    @Basic
    @Column(name = "title")
    private String title;

    @Basic
    @Column(name = "description")
    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
