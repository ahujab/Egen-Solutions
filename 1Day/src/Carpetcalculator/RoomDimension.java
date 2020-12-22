package Carpetcalculator;

public class RoomDimension
{
double length;
double width;
public RoomDimension(double len, double w)
{
length = len;
width = w;
}
public double getLength()
{
return length;
}
public double getWidth()
{
return width;
}
public double getArea()
{
return length * width;
}
public String toString()
{
String output;
output = "Room dimensions:\nLength: " + length + "\nWidth: " + width + "\nArea: " + getArea();
return output;
}
}