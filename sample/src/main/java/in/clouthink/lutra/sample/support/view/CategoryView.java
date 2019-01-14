package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Category;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class CategoryView {

    public static CategoryView from(Category category) {
        CategoryView result = new CategoryView();
        BeanUtils.copyProperties(category, result);
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
