package miko.findbrew.entities;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import javax.persistence.*;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="BEER")
public class Beer {

    @GeneratedValue
    @Id
    @Column(name="ID")
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="FIRST_BREWED")
    private String first_brewed;

    @Column(name="ABV")
    private int abv;
    //private MultipartFile icon;

    @Column(name="VOLUME")
    private String volume;

    @Column(name="TAGLINE")
    private String tagLine;

    @Column(name="INGREDIENTS")
    private String ingredients;

    public Beer(){};

    public Beer(int id, String name, String description, String first_brewed, int abv, String volume, String tagLine, String ingredients) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.first_brewed = first_brewed;
        this.abv = abv;
      //  this.icon = icon;
        this.volume = volume;
        this.tagLine = tagLine;
        this.ingredients = ingredients;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getFirst_brewed() {
        return first_brewed;
    }

    public int getAbv() {
        return abv;
    }

//    public MultipartFile getIcon() {
//        return icon;
//    }

    public String getVolume() {
        return volume;
    }

    public String getTagLine() {
        return tagLine;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFirst_brewed(String first_brewed) {
        this.first_brewed = first_brewed;
    }

    public void setAbv(int abv) {
        this.abv = abv;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public void setTagLine(String tagLine) {
        this.tagLine = tagLine;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }
}
