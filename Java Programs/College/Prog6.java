// Write a program to find the area of circle (pi = 3.14)

class area
{
    double a,r;

    void getdata(double r)
    {
        this.r = r;
    }

    void circle()
    {
        a = 3.14 * r * r;
    }

    void show()
    {
        System.out.println("Area of circle = " + a);
    }
}

class Prog6
{
    public static void main(String args[])
    {
        area x = new area();
        x.getdata(5);
        x.circle();
        x.show();
    }
}
