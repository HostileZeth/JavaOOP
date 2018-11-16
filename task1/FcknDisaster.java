import myfirstpakage.*;

public class FcknDisaster {

public static void main(String[] args) {

ShytCollector o = new ShytCollector(228, 322);


for (int i=1; i<=8; i++)
{
for (int j=1; j<=8; j++)
{
o.setvalue1(i);
o.setvalue2(j);
System.out.print(o.calculate()+ " ");
}
System.out.println();
}
System.out.print("Dats all, folks!");
}

}