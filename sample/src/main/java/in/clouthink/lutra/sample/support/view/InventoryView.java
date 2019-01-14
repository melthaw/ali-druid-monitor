package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Inventory;
import org.springframework.beans.BeanUtils;

import java.util.Date;

public class InventoryView {

    public static InventoryView from(Inventory inventory) {
        InventoryView result = new InventoryView();
        BeanUtils.copyProperties(inventory, result);
        if (inventory.getStore() != null) {
            result.setStoreId(inventory.getStore().getId());
        }
        if (inventory.getFilm() != null) {
            result.setFilmId(inventory.getFilm().getId());
            result.setFilmTitle(inventory.getFilm().getTitle());
        }
        return result;
    }

    private Integer id;

    private Integer filmId;

    private String filmTitle;

    private Integer storeId;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFilmId() {
        return filmId;
    }

    public void setFilmId(Integer filmId) {
        this.filmId = filmId;
    }

    public String getFilmTitle() {
        return filmTitle;
    }

    public void setFilmTitle(String filmTitle) {
        this.filmTitle = filmTitle;
    }

    public Integer getStoreId() {
        return storeId;
    }

    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
