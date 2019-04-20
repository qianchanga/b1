public class MyArrayList<T, T1> {
    int size;
    public Sort[] arr;

    public MyArrayList(){
        size=0;
        arr=new Sort[50];

    }
    public void play() {
        for(int i=0;i<size;i++){
            System.out.println(arr[i].object);
        }
    }
public <T extends Integer>void add(T x){
        arr[size]=new Sort();
        arr[size].object=x;
        arr[size].kind="int";
        size++;
   }
   public <T1 extends Float>void add(T1 x){
       arr[size]=new Sort();
        arr[size].object=x;
        arr[size].kind="float";
        size++;
    }
    public <T extends Integer>void remove(T x){
        for(int i=0;i<size;i++){
            if(arr[i].object==x) {
                for(int b=i;b<size;b++)
                {
                    arr[b]=arr[b+1];
                }
                size--;
                break;
            }
        }
    }
    public <T1 extends Float>void remove(T1 y) {
        for (int i = 0; i < size; i++) {
            if (arr[i].object.equals(y)) {
                for (int b = i; b < size ; b++) {
                    arr[b] = arr[b+1];
                }
                size--;
                break;
            }
        }
    }
    }
