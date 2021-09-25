package top100;

public class integerToRoman_12 {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int thos = Math.abs(num/1000);
        for(int i=0; i < thos; i++){
            result.append("M");
        }
        int huns = Math.abs((num-thos*1000)/100);
        result = constructResult("C", "D", "M", result, huns);
        int tens = Math.abs((num-thos*1000- huns*100)/10);
        result = constructResult("X", "L", "C", result, tens);
        int ones = num%10;
        result = constructResult("I", "V", "X", result, ones);
        return result.toString();

    }
    
    private StringBuilder constructResult(String base, String five, String ten, StringBuilder result, int value) {
        if (value < 4){
            for(int i=0; i < value; i++){
                result.append(base);
            }
        }
        else if (value==4){
            result.append(base);
            result.append(five);
        }
        else if (value==5)
            result.append(five);
        else if (value != 9) {
            result.append(five);
            for(int i=0; i < (value-5); i++){
                result.append(base);
            }
        } else {
            result.append(base);
            result.append(ten);
        }
        return result;
    }
}
