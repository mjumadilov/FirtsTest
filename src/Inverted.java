public class Inverted {


    public static void main(String[] args) {


        String invert ="";

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
/*(OBLIGATORY) The test should pass on the correct inverter
OK

The test shouldn't pass on the incorrect inverter
WRONG ANSWER

The test shouldn't pass on null inverter
OK

The test shouldn't pass on inverter that handles only null
WRONG ANSWER

The test shouldn't pass on inverter that handles only null and empty strings
WRONG ANSWER

The test shouldn't pass on inverter that handles only null, empty and one character long strings
WRONG ANSWER

Detected some errors.*/