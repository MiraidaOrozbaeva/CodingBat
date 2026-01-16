package string1.feature_string1;

public class String1 {
    public static void main(String[] args) {
        String1 obj = new String1();
        System.out.println(obj.helloName("Bob"));
        System.out.println(obj.makeAbba("Hi", "Bye"));
        System.out.println(obj.makeTags("i", "Yay"));
        System.out.println(obj.makeOutWord("<<>>", "Yay"));
        System.out.println(obj.extraEnd("Hello"));
        System.out.println(obj.firstTwo("abcdefg"));
        System.out.println(obj.firstHalf("WooHoo"));
        System.out.println(obj.withoutEnd("coding"));
        System.out.println(obj.comboString("aaa", "b"));
        System.out.println(obj.nonStart("shotl", "java"));
        System.out.println(obj.left2("Hello"));
        System.out.println(obj.right2("Hello"));
        System.out.println(obj.theEnd("Hello", true));
        System.out.println(obj.withouEnd2("abc"));
        System.out.println(obj.middleTwo("Practice"));
        System.out.println(obj.endsLy("oddly"));
        System.out.println(obj.nTwice("Chocolate", 3));
        System.out.println(obj.twoChar("java", 2));
        System.out.println(obj.middleThree("Candy"));
        System.out.println(obj.hasBad("badxx"));

    }
    public String helloName(String name) {
        return "Hello " + name + "!";
    }
    public String makeAbba(String a, String b) {
        return (a + b) + (b + a);
    }
    public String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }
    public String makeOutWord(String out, String word) {
        return out.substring(0,2) + word + out.substring(2,4);
    }
    public String extraEnd(String str) {
        int l = str.length()-2;
        if (str.length() <= 2){
            return str + str + str;
        }else {
            return str.substring(l)+str.substring(l)+str.substring(l);
        }
    }
    public String firstTwo(String str) {
        if (str.length() >= 2){
            return str.substring(0,2);
        }
        return str;
    }
    public String firstHalf(String str) {
        return str.substring(0,str.length()/2);
    }
    public String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }
    public String comboString(String a, String b) {
        if (a.length() > b.length()){
            return b+a+b;
        } else {
            return a+b+a;
        }
    }
    public String nonStart(String a, String b) {
        return a.substring(1).concat(b.substring(1));
    }
    public String left2(String str) {
        String j = str.substring(0,2);
        if (str.length() < 2){
            return str;
        }else {
            return str.substring(2)+j;
        }
    }
    public String right2(String str) {
        return str.substring(str.length()-2) + str.substring(0,str.length()-2);
    }
    public String theEnd(String str, boolean front) {
        if (front){
            return str.substring(0,1);
        } else {
            return str.substring(str.length()-1);
        }
    }
    public String withouEnd2(String str) {
        if(str.length() <= 1){
            return "";
        }
        return str.substring(1,str.length()-1);
    }
    public String middleTwo(String str) {
        int l = ((str.length()) - 2) / 2;
        return str.substring(l,str.length()-l);
    }
    public boolean endsLy(String str) {
        if (str.endsWith("ly")){
            return true;
        } else{
            return false;
        }
    }
    public String nTwice(String str, int n) {
        String m = str.substring(str.length()-n);
        return str.substring(0,n)+m;
    }
    public String twoChar(String str, int index) {
        int len = index +2;
        if (str.length() < len){
            return str.substring(0,2);
        } else if (index <=0 ){
            return str.substring(0,2);
        } else {
            return str.substring(index,len);
        }
    }
    public String middleThree(String str) {
        int len = ((str.length())-3) / 2;
        return str.substring(len,str.length()-len);
    }
    public boolean hasBad(String str) {
        if(str.startsWith("bad",0)){
            return true;
        } else if (str.startsWith("bad", 1)){
            return true;
        } else {
            return false;
        }
    }
}
