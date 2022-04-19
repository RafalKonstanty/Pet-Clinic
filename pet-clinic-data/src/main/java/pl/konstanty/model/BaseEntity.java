package pl.konstanty.model;

import java.io.Serializable;

//Serializable contains
public class BaseEntity implements Serializable {
    //Hibernate recommendation
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


}
