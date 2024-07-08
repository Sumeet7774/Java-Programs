// Program to find the area of rectangle
// a = l * b

class Rectangle
{
  double a,l,b;

  void getdata(double l,double b)
  {
    this.l = l;
    this.b = b;
  }

  void process()
  {
    a = l * b;
  }

  void show()
  {
    System.out.println("Area of rectangle is= " + a);
  }
}

class Area_of_rectangle
{
  public static void main(String args[])
  {
    Rectangle r = new Rectangle();
    r.getdata(10,20);
    r.process();
    r.show();
  }
}
