// Program to find area of circle
// Create area class having a and r data member and getdata and circle are functional

class Area
{
    double r,pi,area;

    void getdata()
    {
      r = 10;
      pi = 3.14;
    }

    void circle()
    {
      area = pi * r * r;
      System.out.println("Area of circle= " + area);
    }
}

class Prog5
{
    public static void main(String argsp[])
    {
        Area a1 = new Area();
        a1.getdata();
        a1.circle();
    }
}
