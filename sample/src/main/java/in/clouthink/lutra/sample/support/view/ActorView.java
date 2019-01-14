package in.clouthink.lutra.sample.support.view;

import in.clouthink.lutra.sample.model.Actor;
import org.springframework.beans.BeanUtils;

import javax.persistence.*;
import java.util.Date;


public class ActorView {

    public static ActorView from(Actor actor) {
        ActorView result = new ActorView();
        BeanUtils.copyProperties(actor,result);
        return result;
    }

    private Integer id;

    private String firstName;

    private String lastName;

    private Date updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

}
