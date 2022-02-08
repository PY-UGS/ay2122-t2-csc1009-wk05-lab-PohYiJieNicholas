
import java.util.Date;

public class GeometricObject {
    private String color;
    private boolean filled;
    private Date dateCreated = new Date();

    public GeometricObject(){
        this.color = "white";
        this.filled = false;
    }

    public GeometricObject(String color, boolean filled){
        this.filled = filled;
        this.color = color;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean isFilled(){
        return this.filled;
    }

    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
        return this.dateCreated;
    }

    public String toString(){
        return "A circle created on " + dateCreated + "\n" + "color: "+this.color+" and filled: "+this.filled;
    }
}
