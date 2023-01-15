package test;

public class EntierNaturel {

    private int val=0;

    public EntierNaturel(int val) throws NombreNegatifException  {

       if (val<0) throw new NombreNegatifException("attention entier négative a été entrée",val);
        this.val = val;

    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) throws NombreNegatifException {
        if (val<0) throw new NombreNegatifException("attention entier négative a été entrée",val);
        this.val = val;


    }
    public void decrementer() throws NombreNegatifException{
        if (val<0) throw new NombreNegatifException("attention entier négative a été entrée",val);
        val--;

    }

}

