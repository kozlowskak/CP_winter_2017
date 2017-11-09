package pl.waw.sgh;

public class WhileLoop {

    public static void main(String[] args) {

        int v = 3;
        /* pierwsza opcja pętli
        while (v<5){
            System.out.println("v:"+v);

           v++;
       */
        // druga opcja pętli
        do {
            System.out.println("v"+v);
            v++;
                    } while (v<5);
    }
}
