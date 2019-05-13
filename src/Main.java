public class Main {
    public static void main(String[] args) {

        Triangle trian = new Triangle();
        RightTriangle right = new RightTriangle();
        trian.a = 3;
        trian.b = 4;
        trian.c = 5;


        System.out.print("czy trojkat jest prostokatny? \n" + right.isRightTriangle(trian));
    }
}
