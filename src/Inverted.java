public class Inverted {


    public static void main(String[] args) {


        String invert =null;

        if(invert.length()==1){
            System.out.println(invert);
        }else if(invert.length()>1){
           StringBuilder str = new StringBuilder();
           str.append(invert);
           str.reverse();
            System.out.println(str);
        }else{
            System.out.println("");
        }


    }
}
