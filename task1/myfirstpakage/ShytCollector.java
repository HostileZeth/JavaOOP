package myfirstpakage;

public class ShytCollector{
private int value1;
private int value2;

public ShytCollector(int x1, int x2)
{
value1 = x1;
value2 = x2;
}

public int getvalue1()
{ return value1; }

public int getvalue2()
{ return value2; }

public void setvalue1(int x)
{ value1 = x; }

public void setvalue2(int x)
{ value2 = x; }

public int calculate()
{
return value1 * value2;
}

}