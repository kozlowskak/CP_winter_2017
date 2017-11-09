package pl.waw.sgh;

public class SwitchOperator {
    public static void main(String[] args) {
final String PL =  "Poland"; // final = wont change
        final String US = "USA";
        final String GB = "Great Britain";

String country = "Poland";

        switch (country){
            case PL:
                System.out.println("Witaj!");
                break;
            case    GB:
            case US:
                System.out.println("Hello!");
break;
            default:
                System.out.println("Don't know how to greet you!");



//loops= pętle


        }




    }

}
