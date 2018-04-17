package entities;

public class ImpTest {

    public static void main(String[] args){
        setTest();
        System.out.println("movementTest " + (movementTest() ? "Success!" : "Fail!"));
        System.out.println("TypeCheckTest " + (TypeCheckTest() ? "Success!" : "Fail!"));

    }

    private static void setTest() {
        EntitySet Test = new EntitySet();

        Entity e = new BadBeast(2,6);
        Test.insert(new BadBeast(2,6));
        Test.insert(new GoodBeast(2,6));
        Test.insert(new GoodPlant(2,6));
        Test.insert(new MasterSquirrel(2,6));
        Test.insert(e);
        Test.insert(new GoodBeast(2,6));

        System.out.println(Test);

        Test.nextStep();

        System.out.println(Test);
        System.out.println("Lösche: " + e);
        Test.remove(e);
        System.out.println(Test);
        Test.nextStep();
        System.out.println(Test);

    }

    private static boolean movementTest(){
        Entity e = new GoodBeast(3,4);
        XY prev = e.getXY();
        e.nextStep();

            if (e.equals(prev))
                return false;


        return true;

    }

    private static boolean TypeCheckTest(){
        boolean Check = false;
        boolean Check1 = false;
        boolean Check2 = false;

        GoodBeast g0 = new GoodBeast(2,4);
        GoodBeast g1 = new GoodBeast(3,5);
        BadBeast b1 = new BadBeast(2,3);

        if(g0.sameTypeCheck(g1)){
            Check1 = true;
        }
        if(g0.sameTypeCheck(b1) == false){
            Check2 = true;
        }
        if (Check1 == true & Check2 == true)
            Check = true;

        return Check;



    }



}
