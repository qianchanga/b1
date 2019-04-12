import java.text.DecimalFormat;

public class Text {
    public static void main(String[] args) {
        Redmoney r = new Redmoney(200, 16);
        r.randoms();
        for(int i=0;i<20;i++) {
            ThreadA a = new ThreadA(r);
            a.setName("a"+i);
            a.start() ;
        }

    }
}
