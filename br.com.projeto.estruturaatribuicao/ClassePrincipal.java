

public class ClassePrincipal{
    public static void main(String[] args){
        //System.out.println("Hello World!");

        int a = 1;
        int b = a;

        System.out.println("A = " + a + "\nB = " + b);
        a = 2;
        System.out.println("A = " + a + "\nB = " + b);

        MeuObjeto obj1 = new MeuObjeto();
        MeuObjeto obj2 = obj1;

        System.out.println("Objeto1 = " + obj1 + "\nObjeto2 = " + obj2);

        obj1.setNum(2);

        System.out.println("Objeto1 = " + obj1 + "\nObjeto2 = " + obj2);
    }
}