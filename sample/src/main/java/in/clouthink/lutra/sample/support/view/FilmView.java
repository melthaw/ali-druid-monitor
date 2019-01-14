package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Film;
import in.clouthink.lutra.sample.model.Language;
import org.springframework.beans.BeanUtils;

import java.math.BigDecimal;
import java.util.Date;


public class FilmView {

    public static FilmView from(Film film) {
        FilmView result = new FilmView();
        BeanUtils.copyProperties(film, result);
        if (film.getLanguage() != null) {
            result.setLanguageId(film.getLanguage().getId());
            result.setLanguageName(film.getLanguage().getName());
        }
        if (film.getOriginalLanguage() != null) {
            result.setOriginalLanguageId(film.getOriginalLanguage().getId());
            result.setOriginalLanguageName(film.getOriginalLanguage().getName());
        }
        return result;
    }

    private Integer id;

    private String title;

    private String description;

    private Integer year;

    private Integer languageId;

    private String languageName;

    private Integer originalLanguageId;

    private String originalLanguageName;

    private Integer rentalDuration;

    private BigDecimal rentalRate;

    private Integer length;

    private BigDecimal replacementCost;

    private String rating;

    private String specialFeatures;

    private Date updatedAt;

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

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getLanguageId() {
        return languageId;
    }

    public void setLanguageId(Integer languageId) {
        this.languageId = languageId;
    }

    public String getLanguageName() {
        return languageName;
    }

    public void setLanguageName(String languageName) {
        this.languageName = languageName;
    }

    public Integer getOriginalLanguageId() {
        return originalLanguageId;
    }

    public void setOriginalLanguageId(Integer originalLanguageId) {
        this.originalLanguageId = originalLanguageId;
    }

    public String getOriginalLanguageName() {
        return originalLanguageName;
    }

    public void setOriginalLanguageName(String originalLanguageName) {
        this.originalLanguageName = originalLanguageName;
    }

    public Integer getRentalDuration() {
        return rentalDuration;
    }

    public void setRentalDuration(Integer rentalDuration) {
        this.rentalDuration = rentalDuration;
    }

    public BigDecimal getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(BigDecimal rentalRate) {
        this.rentalRate = rentalRate;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    public BigDecimal getReplacementCost() {
        return replacementCost;
    }

    public void setReplacementCost(BigDecimal replacementCost) {
        this.replacementCost = replacementCost;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getSpecialFeatures() {
        return specialFeatures;
    }

    public void setSpecialFeatures(String specialFeatures) {
        this.specialFeatures = specialFeatures;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
