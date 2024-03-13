public class Main {
    public static void main(String[] args){
        System.out.print("Hello\n");
        System.out.print("Does this work ?");
        System.out.println("\nJava is funky"); //commenty comment
        System.out.println ("Wawa\nWewe");

        //time for variables

        boolean mytest = true;
        var e = "Hi?"; //figure out why var exists later
        String E = e;
        int x = 8;
        double y = 2.25;
        float z = 1.48f; //why do float need a special thing ;( oh well
        if (mytest) {
            System.out.println("Did I do this correctly ?");
            System.out.println("var e = "+e);
            System.out.println("var E = "+E);
            System.out.println(x);//what about numbers
            System.out.println(y);
            System.out.println(y-x);
            double zMinY = (z-y);
            System.out.println("var zMinY = "+zMinY);

            //variable swap
            String cupA = "Water";
            String cupB = "Juice";

            System.out.println(cupA);
            System.out.println(cupB);

            String temp = cupA;
            cupA=cupB;
            cupB=temp;

            System.out.println("A = "+cupA+" & B = "+cupB);
        }
    }
}
