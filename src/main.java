public class main {
    public static void main(String[] args) throws Exception {
        Rakieta rakieta1 = new Rakieta("Apollo", 100);
        rakieta1.zatankuj();

        try {

            rakieta1.start();
//
//            int tab [] = {1};
//            System.out.println(tab[10]);
        }
//        catch (ArithmeticException e){
//            System.out.println(e);
//        }
        catch(Exception a){
//            System.out.println(a);
//            System.out.println(a.getCause());
            System.out.println(a.getMessage());
        }
    }
}
