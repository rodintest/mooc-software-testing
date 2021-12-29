package tudelft.mySolutions;

public class RomanNumbers {

    private int convertedNumber=0;

    public void convertRomanNumber(String number){

        int size=number.length();
        int currentValue,nextValue;

        number=number.toUpperCase();

        for (int i=0;i<size;i++){

            currentValue=RomanChars.valueOf(Character.toString(number.charAt(i))).getCharValue();
            if (!(i==size-1)){
                nextValue=RomanChars.valueOf(Character.toString(number.charAt(i+1))).getCharValue();
                if (nextValue>currentValue)
                    {convertedNumber=convertedNumber-currentValue;}
                else
                    {convertedNumber=convertedNumber+currentValue;}
            }else {
                convertedNumber=convertedNumber+currentValue;
            }
        }

        System.out.println(number +"-->"+convertedNumber);
    }

    public enum RomanChars{
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        private int charValue;
        RomanChars(int charValue) {
            this.charValue = charValue;
        }

        public  int getCharValue() {
            return charValue;
        }
    }


}
