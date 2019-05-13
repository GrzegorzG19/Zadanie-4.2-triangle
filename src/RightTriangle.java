public class RightTriangle {
    double a;
    double b;
    double c;


    boolean isRightTriangle(Triangle first){
        a = first.a;
        b = first.b;
        c = first.c;
        return ((a*a+b*b) == (c*c));

    }

}
