package gradle.java.domain;

public class Product {
    public final String image;
    public final String description;
    public final String featuredAttribute;
    public final String price;
    public final String reference;

    public Product(String image, String description, String featuredAttribute, String price, String reference){
        this.image = image;
        this.description = description;
        this.featuredAttribute = featuredAttribute;
        this.price = price;
        this.reference = reference;
    }

    public String showImage(){
        return image;
    }

    public String showDescription(){
        return description;
    }
    public String showFeaturedAttribute(){
        return featuredAttribute;
    }

    public String showPrice(){
        return price;
    }

    public String showReference(){ return reference; }
}
