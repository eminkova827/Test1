package InterPolyMorthy.Part1;

public class DaliOK implements Part1 {
    @Override
    public int f5() {
        int c=7;
        System.out.println("f5=" + c);
        return c;
    }

    @Override
    public int f6() {

        int c=7;
        System.out.println("f6=" + c);
        return c;
    }

    @Override
    public int f7() {
        int c=7;
        System.out.println("f7=" + c);
        return c;
    }

    public void f9()//final not allowed
    {
        System.out.println("f8=" +7);


    }

    public static void main(String[] args) {

        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        System.out.println("x3 = "+x3);
        System.out.println("x4 = "+x4);
      //f5();
       //f6();
       //f7();
        //f8();
      // f9();

        System.out.println("x10=" + x10);
    }


}
