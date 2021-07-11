public class Replace {
    public static void main(String[] args) {



        String riddle = "ab?ac?";

        String nn=null;

        if(riddle.contains("?")){
         nn=riddle.replace('?', 'f');

        }

        System.out.println(nn);
    }
}
