import java.util.ArrayList;
import java.util.List;

public class subset {
    static void main() {
//        System.out.println(check("","baccad"));
//        System.out.println(check1("","abc"));
        System.out.println(subseq("","abc"));
    }
//    static List<String> check(String p, String up){
//        if(up.isEmpty()){
//            List<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//        List<String> list = new ArrayList<>();
//        char ch = up.charAt(0);
//        if(ch=='a'){
//            list.addAll(check(p,up.substring(1))) ;
//        }
//        else{
//            list.addAll(check(p+ch,up.substring(1)));
//        }
//        return list;
//    }

//    static ArrayList<String> check1(String p,String up){
//        if(up.isEmpty()){
//            ArrayList<String> list = new ArrayList<>();
//            list.add(p);
//            return list;
//        }
//
//        char ch = up.charAt(0);
//        ArrayList<String> left = check1(p+ch,up.substring(1));
//       ArrayList<String> right =  check1(p,up.substring(1));
//
//       left.addAll(right);
//       return  left;
//
//    }
    static  ArrayList<String> subseq(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> first = subseq(p+ch,up.substring(1));
        ArrayList<String> second = subseq(p+(ch+0),up.substring(1));
        ArrayList<String> third = subseq(p,up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
