import java.util.*;
class addbinary {
    public String addBinary(String a, String b) {
        a="1010";
        b="0101";
        StringBuilder s=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int carry=0;
        while(i>=0||j>=0||carry==1){
            if(i>=0){
                carry +=a.charAt(i--)-'0';

            }
            if(j>=0){
                carry +=b.charAt(j--)-'0';
            }
            s.append(carry%2);
            carry/=2;
        }
        return s.reverse().toString();

    }
}