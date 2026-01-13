public class recursion
{
    static void main() {

        paths1("",3,3);
    }
//    static  int paths(int r,int c){
//        if(r==1||c==1){
//            return 1;
//        }
//        int down = paths(r-1,c);
//        int right = paths(r,c-1);
//        int ans = down+right;
//        return ans;
//    }
    static  void paths1(String p,int r,int c){
        if(r==1&&c==1){
            System.out.println(p);
            return;
        }

        if(r>1){
            paths1(p+'D',r-1,c);
        }
        if(r>1&&c>1){
            paths1(p+'h',r-1,c-1);
        }
         if(c>1) {
            paths1(p+'R',r, c - 1);
        }
    }
}
