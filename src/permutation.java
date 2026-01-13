import java.util.ArrayList;

public class permutation {
    static void main() {
//        check("","abc");
//        System.out.println(check1("","abc"));
        System.out.println(check2("","abc"));

    }
//    static void check(String p,String up) {
//        if (up.isEmpty()) {
//            System.out.println(p);
//            return;
//        }
//        char ch = up.charAt(0);
//        for (int i = 0; i <= p.length(); i++) {
//            String f = p.substring(0, i);
//            String s = p.substring(i, p.length());
//            check(f + ch + s, up.substring(1));
//        }
//    }
        static ArrayList<String> check1(String p,String up){
            if(up.isEmpty()){
                ArrayList<String> list = new ArrayList<>();
                list.add(p);
                return list;
            }
            ArrayList<String> ans = new ArrayList<>();
            char ch = up.charAt(0);
            for(int i=0;i<=p.length();i++){
                String  f = p.substring(0,i);
                String s= p.substring(i,p.length());
                ans.addAll(check1(f+ch+s,up.substring(1)));
            }
            return ans;
    }

    static int check2(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        int count = 0;
        char ch = up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String  f = p.substring(0,i);
            String s= p.substring(i,p.length());
            count = count+check2(f+ch+s,up.substring(1));
        }
        return count;

       }

}
