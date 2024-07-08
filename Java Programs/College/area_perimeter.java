// Program to find area of circle and perimeter of rectangle using return value
// using return value

class rectangle
{
  double l, b;

  void getdata(double l, double b)
  {
    this.l = l;
    this.b = b;
  }

  double area()
  {
    return(l * b);
  }

  double perimeter()
  {
    return (2*(l + b));
  }
}

class area_perimeter
{
  public static void main(String args[])
  {
    rectangle r = new rectangle();
    r.getdata(10,20);

    double a = r.area();
    double p = r.perimeter();

    System.out.println("Area of rectangle is= " + a);
    System.out.println("Perimeter of rectangle is= "+p);
  }
}
