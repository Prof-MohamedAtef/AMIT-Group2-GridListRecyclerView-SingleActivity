package mo.ed.course.two.amit.androidlists.views.models;

import android.graphics.drawable.Drawable;

public class ExclusiveOffer {

    Drawable image;
    String title;
    int weight;
    int price;


    public ExclusiveOffer(Drawable image, String title, int weight, int price) {
        this.image = image;
        this.title = title;
        this.weight = weight;
        this.price = price;
    }


    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
