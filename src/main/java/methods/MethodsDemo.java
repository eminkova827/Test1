package methods;

public class MethodsDemo {
    public static void main(String[] args) {

        System.out.println(sum(4,5));
        System.out.println(sum(3,5,9));

        System.out.println(sum(sum(4,5,6), sum(3, 56)));// da wry]a `islo ot o4akwaniq tip pri wytre[nite sum
    }

    public static int sum(int a, int b){
        return a+b;
    }
    // method overload, came from polymorphism
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    //wsi4ki metodi w DOG sa instance methods

}
