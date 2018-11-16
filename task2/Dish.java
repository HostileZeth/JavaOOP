class Dish {
private String name;
private String description;
private double price;

public Dish (String _name, String _description) {
name = _name;
description = _description;
price = 0;
}

public double getPrice () {
return price;
}

public void setPrice (double _price) {
price = _price;
}

public String getName () {
return name;
}

public void setName (String _name) {
name = _name;
}

public String getDescription () {
return description;
}

public void setDescription (String _description) {
description = _description;
}

}