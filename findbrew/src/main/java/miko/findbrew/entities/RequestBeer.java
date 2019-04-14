package miko.findbrew.entities;


public class RequestBeer {
    private int id;
    private String name;
    private String description;
    private String first_brewed;
    private int abv;
    //private MultipartFile icon;
    private String volume;
    private String tagLine;
    private String ingredients;

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

    public String getVolume() {
        return volume;
    }

    public String getTagLine() {
        return tagLine;
    }

    public String getIngredients() {
        return ingredients;
    }
}
