public class DragonCurve { 
    public static void main(String[] args) { 
        String dragon0 = "F";
        String reverse0 = "F";
        String dragon1 = dragon0 + "L" + reverse0;
        String reverse1 = dragon0 + "R" + reverse0;
        String dragon2 = dragon1 + "L" + reverse1;
        String reverse2 = dragon1 + "R" + reverse1;
        String dragon3 = dragon2 + "L" + reverse2;
        String reverse3 = dragon2 + "R" + reverse2;
        String dragon4 = dragon3 + "L" + reverse3;
        String reverse4 = dragon3 + "R" + reverse3;
        String dragon5 = dragon4 + "L" + reverse4;

        System.out.println(dragon0);
        System.out.println(dragon1);
        System.out.println(dragon2);
        System.out.println(dragon3);
        System.out.println(dragon4);
        System.out.println(dragon5);
    }
}
