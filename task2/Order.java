package bin;

class Order {

private Dish[] dishList;
private int dishCount;
private int actualDishCount;

static private int initialDishCount = 16;


public Order()
{
dishList = new Dish[initialDishCount];
dishCount = initialDishCount;
actualDishCount = 0;
}

public Order(int orderCount)
{
dishList = new Dish[orderCount];
actualDishCount = 0;
}

public Order(Dish[] _dishList)
{
dishList = _dishList;
}

private void doubleDishArray()
{
dishCount = dishCount * 2;
Dish[] newDishList = new Dish[dishCount];

for (int i=0; i<actualDishCount; i++)
newDishList[i] = dishList[i];

}

public boolean addDish(Dish inpDish)
{

if (actualDishCount+1 == dishCount) doubleDishArray();
dishList[++actualDishCount] = inpDish;

return true;
}

}