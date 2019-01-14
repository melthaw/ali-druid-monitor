package in.clouthink.lutra.sample.support.view;

import java.util.Date;

public class InventoryView {

    private Integer id;

    private FilmView film;

    private StoreView store;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FilmView getFilm() {
        return film;
    }

    public void setFilm(FilmView film) {
        this.film = film;
    }

    public StoreView getStore() {
        return store;
    }

    public void setStore(StoreView store) {
        this.store = store;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
