// Write a program to find the sum of two numbers by passing parameters

class Number
{
      int a,b,c;

      void getdata(int p, int q)
      {
          a = p;
          b = q;
      }

      void sum()
      {
          c = a + b;
          System.out.println("Sum is = " + c);
      }
}

class Passing_parameters
{
    public static void main(String args[])
    {
        Number n1 = new Number();
        Number n2 = new Number();

        n1.getdata(100,200);
        n2.getdata(10,50);

        n1.sum();
        n2.sum();
    }
}
