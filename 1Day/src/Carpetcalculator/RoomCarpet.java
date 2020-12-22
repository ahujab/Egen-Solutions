package Carpetcalculator;

public class RoomCarpet 
 
{
RoomDimension size;
double carpetCost;
public RoomCarpet(RoomDimension dim, double cost)
{
size = new RoomDimension(dim.getLength(), dim.getWidth());
carpetCost = cost;
}
public double getTotalCost()
{
return carpetCost;
}
public String toString()
{
String output = size + "\nCarpet cost: $" + carpetCost * size.getArea();
return output;
}
}
