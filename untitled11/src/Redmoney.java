import java.text.DecimalFormat;
import java.util.Random;

public class Redmoney {
    private int  size;
    private int number;
    public int sizes=0;
    public DecimalFormat formats;
    private Redmoney redmoney;
    private double differen;
    private float [] monry;
    public Redmoney(int size,int number){
        this.number=number;
        this.size=100*size;
        monry=new float[number];
        formats=new DecimalFormat("0.00");
    }
    public void randoms() {
        for (int i = 0; i < monry.length; i++) {
            Random random = new Random();
            if (i == monry.length - 1) {
                monry[i] = Float.valueOf(formats.format((float)size/100));
                break;
            }
            int p = (size - 100 * (number - 1) + 100 * i) - 100;
            int j = random.nextInt(p) + 100;
            size = size - j;
            monry[i] = Float.valueOf(formats.format((float)j/100));
        }
    }

    public Redmoney getRedmoney() {
        return redmoney;

    }
    public float[] getMonry(){
        return monry;
    }

}
