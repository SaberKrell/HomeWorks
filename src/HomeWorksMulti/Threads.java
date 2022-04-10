package HomeWorksMulti;

import java.util.Arrays;

public class Threads{
    static final int size = 10000000;
    static final int h = size / 2;

    public float[] calculate (float[] arr){
        for (int i = 0; i < arr.length; i++)
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        return arr;
    }
    public void CrateArr(){
        float[] arr = new float[size];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        calculate(arr);
        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

    public void CrateArrMulti(){
        float[] arr = new float[size];
        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Arrays.fill(arr, 1);
        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread thread = new Thread(() -> calculate(a1));
        Thread thread2 = new Thread(() -> calculate(a2));
        thread.start();
        thread2.start();

        try {
            thread.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.arraycopy(a1, 0, arr, 0, a1.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);


        System.currentTimeMillis();
        System.out.println(System.currentTimeMillis() - a);
    }

}
class Main {
    public static void main(String[] args) {
        Threads threads = new Threads();
        threads.CrateArr();
        threads.CrateArrMulti();
    }
}
