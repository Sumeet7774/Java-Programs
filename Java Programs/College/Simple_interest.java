// Create a bank class having p,r,n and i are data numbers and getdata at interest are functions to calculate simple interest

class Bank
{
    float p,r,n,i;

    void getdata(float a, float b, float c)
    {
        p = a;
        r = b;
        n = c;
    }

    void interest()
    {
        i = (p*r*n) / 100;
        System.out.println("Interst= " + i);
    }
}

class Simple_interest
{
    public static void main(String args[])
    {
        Bank b = new Bank();
        b.getdata(10000,10,5);
        b.interest();
    }
}
