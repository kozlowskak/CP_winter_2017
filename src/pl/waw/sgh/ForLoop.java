package pl.waw.sgh;

public class ForLoop {
    //loop = pętle
    public static void main(String[] args) {

        int c =0;
       // c++

        //c++ to samo co c+1 zmienia wartość c o jednostkę
        int  d;
        d= ++c;
                // d=c++
        // różnica między ++c vs c++ what is done first
        System.out.println("d="+d);

        System.out.println("c="+c);


        String sl = "abc";

        Integer i1 = 35444;
        sl= sl+ i1;
        String  s2 = i1.toString();
  sl = sl.concat(s2);






        for (int i = 0; i < 5; i++) {
            System.out.println("i=" +i);
        }
        System.out.println();

        for (int j=5;j>0; j--) {
            if (j==4) continue; // w pętli omija tylko tę wartość


            if(j==2) break;; // zatrzymuje pętle
        }
    }
}
