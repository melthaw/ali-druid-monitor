package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Language;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class LanguageView {

    public static LanguageView from(Language language) {
        LanguageView result = new LanguageView();
        BeanUtils.copyProperties(language, result);
        return result;
    }

    private Integer id;

    private String name;

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
