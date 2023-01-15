import test.EntierNaturel;
import test.NombreNegatifException;

public class Application {

    public static void main(String[] args) throws NombreNegatifException {

        try {
            EntierNaturel e1= new EntierNaturel(1);
            System.out.println(e1.getVal());
            e1.decrementer();
            System.out.println(e1.getVal());
            e1.setVal(-6);
        }catch (NombreNegatifException e){
            System.out.println(e.getMessage());
            System.out.println("la valeur erronée est:"+e.getErrorval());

        }
        System.out.println("Fin du programme");
        }
    }
