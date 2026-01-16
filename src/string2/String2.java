package string2;

public class String2 {
    public static void main(String[] args) {
        String2 obj = new String2();
        System.out.println(obj.doubleChar("The"));
        System.out.println(obj.countHi("abc hi ho"));
        System.out.println(obj.catDog("catdog"));
        System.out.println(obj.countCode("aaacodebbb"));
        System.out.println(obj.endOther("Hiabc", "abc"));
        System.out.println(obj.xyzThere("abcxyz"));
        System.out.println(obj.bobThere("abcbob"));
        System.out.println(obj.xyBalance("aaxbby"));
        System.out.println(obj.mixString("abc", "xyz"));
        System.out.println(obj.repeatEnd("Hello", 3));
        System.out.println(obj.repeatFront("Chocolate", 4));
        System.out.println(obj.repeatSeparator("Word", "X", 3));
        System.out.println(obj.prefixAgain("abXYabc", 1));
        System.out.println(obj.xyzMiddle("AAxyzBB"));
        System.out.println(obj.getSandwich("breadjambread"));
        System.out.println(obj.sameStarChar("xy*yzz"));
        System.out.println(obj.oneTwo("abc"));
        System.out.println(obj.zipZap("zipXzap"));
        System.out.println(obj.starOut("ab*cd"));
        System.out.println(obj.plusOut("12xy34", "xy"));

    }
    public String doubleChar(String str) {
        String q = "";
        for(int i =0; i < str.length(); i++){
            for(int j = 0; j < 2; j++){
                q += str.charAt(i);
            }
        }
        return q;
    }
    public int countHi(String str) {
        int count = 0;
        for (int i = 0; i < str.length()-1; i++){
            if (str.substring(i, i+2).equals("hi")){
                count++;
            }
        }
        return count;

    }
    public boolean catDog(String str) {
        int cat = 0;
        int dog = 0;
        for(int i = 0; i < str.length()-2; i++){
            if(str.substring(i, i+3).equals("cat")){
                cat++;
            }
            if(str.substring(i, i+3).equals("dog")){
                dog++;
            }
        }
        if(cat == dog){
            return true;
        }
        return false;
    }
    public int countCode(String str) {
        int code = 0;
        for(int i = 0; i < str.length()-3; i++){
            if(str.charAt(i) == 'c' && str.charAt(i+1) == 'o' && str.charAt(i+3) == 'e'){
                code++;
            }
        }
        return code;
    }
    public boolean endOther(String a, String b) {
        int alen = a.length();
        int blen = b.length();

        if(alen == blen){
            if(a.equalsIgnoreCase(b)){
                return true;
            }
        }

        if(alen < blen){
            if(b.substring(b.length()-alen).equalsIgnoreCase(a)){
                return true;
            }
        }
        if(blen < alen){
            if(a.substring(a.length()-blen).equalsIgnoreCase(b)){
                return true;
            }
        }
        return false;
    }
    public boolean xyzThere(String str) {
        for (int i = 0; i <= str.length() - 3; i++) {
            if (str.substring(i, i + 3).equalsIgnoreCase("xyz")) {
                if (i == 0) {
                    return true;
                }
                if (str.charAt(i-1) != '.')  {

                    return true;
                }

            }
        }
        return false;
    }
    public boolean bobThere(String str) {
        for(int i =0; i < str.length() - 2; i++){
            if(str.charAt(i) == 'b' && str.charAt(i+2) == 'b'){
                return true;
            }
        }
        return false;
    }
    public boolean xyBalance(String str) {
        boolean balanced = true;
        for(int i = 0 ; i < str.length(); i++){
            if(str.charAt(i) == 'x'){
                balanced = false;
            } else if (str.charAt(i) == 'y') {
                balanced = true;
            }
        }
        return balanced;
    }
    public String mixString(String a, String b) {
        String str = "";

        if (a.length() == b.length()){
            for (int i = 0; i < b.length(); i++) {
                str += a.charAt(i);
                str += b.charAt(i);
            }

        }

        if (a.length() > b.length()){
            for (int i = 0; i < b.length(); i++) {
                str += a.charAt(i);
                str += b.charAt(i);
            }
            int len = (a.length()+b.length()) - str.length();
            str += a.substring(a.length()-len);

        }

        if (a.length() < b.length()){
            for (int i = 0; i < a.length(); i++) {
                str += a.charAt(i);
                str += b.charAt(i);
            }
            int len = (b.length()+a.length()) - str.length();
            str += b.substring(b.length()-len);

        }
        return str;
    }
    public String repeatEnd(String str, int n) {
        String repeated = "";
        str = str.substring(str.length()-n);
        for (int i = 0; i < n; i++) {
            repeated += str;
        }
        return repeated;
    }
    public String repeatFront(String str, int n) {
        String repeat = "";
        for(int i = 0; i < n; i++){
            str = str.substring(0,n-i);
            repeat += str;
        }
        return repeat;
    }
    public String repeatSeparator(String word, String sep, int count) {
        String big = "";
        for (int i = 0; i < count; i++) {
            big += word;
            if (i < count -1){
                big += sep;
            }
        }
        return big;
    }
    public boolean prefixAgain(String str, int n) {
        String prefix = str.substring(0,n); // a


        for (int i = n; i <= str.length()-n; i++) {
            String check = str.substring(i, i+n);
            if(check.equals(prefix)){
                return true;
            }
        }
        return false;
    }
    public boolean xyzMiddle(String str) {
        if(str.equals("xyz")){
            return true;
        }

        for(int i = 0; i < str.length()-3; i++){
            if(str.substring(i, i+3).equals("xyz")){
                String left = str.substring(0, i);
                String right = str.substring(i+3);
                if(Math.abs(left.length() - right.length()) <= 1){
                    return true;
                }
            }
        }
        return false;
    }
    public String getSandwich(String str) {
        int left = str.indexOf("bread"); // 2
        int right = str.lastIndexOf("bread"); // 10

        if( left == right){
            return "";
        }
        return str.substring(left+5, right);
    }
    public boolean sameStarChar(String str) {
        if(str.length() == 0){
            return true;
        }

        char right = '.';
        char left = '.';

        for(int i = 0; i < str.length()-1; i++){
            if(str.charAt(i) == '*' && i == 0) continue;

            if(str.charAt(i) == '*'){
                left = str.charAt(i-1);
                right = str.charAt(i+1);
            }
        }
        return left == right;
    }
    public String oneTwo(String str) {
        String s = "";

        for(int i = 0; i <= str.length()-3;){ // i+=3
            s += str.charAt(i+1);
            s += str.charAt(i+2);
            s += str.charAt(i);
            i++;
            i++;
            i++;
        }
        return s;
    }
    public String zipZap(String str) {

        String s = "";

        if(str.length()<=2){
            return str;
        }

        for(int i = 0; i < str.length();){
            if(str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
                s += str.charAt(i);
                s += str.charAt(i+2);
                i+=3;
            } else{
                s += str.charAt(i);
                i++;
            }
        }
        return s;
    }
    public String starOut(String str) {
        String s = "";

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '*') continue;
            if(i > 0 && str.charAt(i - 1) == '*') continue;
            if(i < str.length()-1 && str.charAt(i +1) == '*') continue;

            s += str.charAt(i);
        }

        return s;
    }
    public String plusOut(String str, String word) {

        String s = "";

        int i = 0;

        while(i < str.length()){
            if(i <= str.length() - word.length() && str.substring(i, i+word.length()).equals(word)){
                s += word;
                i += word.length();
            } else {
                s += "+";
                i++;
            }
        }

        return s;

    }


}
