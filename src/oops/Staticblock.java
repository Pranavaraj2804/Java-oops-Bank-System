public static class Staticblock{
    static int a = 4;
    static int b;
    static {
        System.out.println("im in static block");
        b = a*5;
    }

}

static void main() {
     Staticblock obj = new Staticblock();
    System.out.println(Staticblock.a+" "+Staticblock.b);
   Staticblock obj2 = new Staticblock();
   Staticblock.b+=3;
    System.out.println(Staticblock.b);
}
