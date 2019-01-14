package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.FilmText;
import org.springframework.beans.BeanUtils;

public class FilmTextView {

    public static FilmTextView from(FilmText filmText) {
        FilmTextView result = new FilmTextView();
        BeanUtils.copyProperties(filmText, result);
        return result;
    }

    private Integer id;

    private String title;

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
