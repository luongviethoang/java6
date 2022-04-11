package ss6adope;

public class FinalDemo {
    final float PI = 3.14F;
    public void display(float pi){
        System.out.println("The value of PI is:"+PI);
    }

    public static void main(String[] args) {
        final FinalDemo objFinalDemo = new FinalDemo();
        objFinalDemo.display(22.7F);
    }
}
