package pizzaria.after.model.builder;

import pizzaria.after.model.Size;

import java.util.List;

public interface PizzasFeaturesBuilder {

    void setSize(Size size);
    void setSauce(List<String> sauces);
    void setToppings(List<String> toppings);
    void setCheese(boolean cheese);
    void setPepper(boolean pepper);

}
