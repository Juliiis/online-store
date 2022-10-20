package gradle.java.domain;

public class Product {
    public final String image;
    public final String description;
    public final String featuredAttribute;
    public final String longDescription;
    public final Double price;
    public final String reference;
    public final int stock;

    public Product(String image, String description, String featuredAttribute, String longDescription, Double price, String reference, int stock){
        this.image = image;
        this.description = description;
        this.featuredAttribute = featuredAttribute;
        this.longDescription = longDescription;
        this.price = price;
        this.reference = reference;
        this.stock = stock;
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
    public String showLongDescription() { return longDescription; }

    public Double showPrice(){
        return price;
    }

    public String showReference(){ return reference; }

    public int showStock() { return stock; }
}
