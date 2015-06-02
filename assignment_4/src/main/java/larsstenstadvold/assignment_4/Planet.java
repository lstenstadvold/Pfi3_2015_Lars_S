package larsstenstadvold.assignment_4;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

/**
 * Created by larsy09 on 4/29/15.
 */
public class Planet implements Serializable {
    String name;
    Drawable image;
    String description;
    String fact;

    public Planet(String name, Drawable image, String description, String fact) {
        this.name = name;
        this.image = image;
        this.description = description;
        this.fact = fact;
    }

    public Drawable getImage() {
        return image;
    }
    public void setImage(Drawable image) {
        this.image = image;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getSummary() {
        return description;
    }
    public String getFact() {
        return fact;
    }

}
