package gradle.java.domain;

public class Product {
    public final String image;
    public final String shortDescription;
    public final String highlightedAttribute;
    public final String longDescription;
    public final Double price;
    public final String reference;

    public Product(String image, String shortDescription, String highlightedAttribute, String longDescription, Double price, String reference){
        this.image = image;
        this.shortDescription = shortDescription;
        this.highlightedAttribute = highlightedAttribute;
        this.longDescription = longDescription;
        this.price = price;
        this.reference = reference;
    }

    public String showImage(){
        return image;
    }

    public String showShortDescription(){
        return shortDescription;
    }
    public String showHighLightedAttribute(){
        return highlightedAttribute;
    }
    public String showLongDescription() { return longDescription; }

    public Double showPrice(){
        return price;
    }

    public String showReference(){ return reference; }
}
