import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Please enter anything :");




       Scanner sca = new Scanner(System.in);
//
       String name =sca.next();
//
//        System.out.println(name);

        String names []={"Kelly", "Eric", "Elane", "Pimol", "Marat"};



        for (int i =0; i< names.length; i++){

            if(names[i].equals("Kelly")){
                System.out.println(names[i]+": She is the Boss");
            }else {

                 System.out.println(names[i]+ " : Not the Boss ");
            }

        }





    }
}
