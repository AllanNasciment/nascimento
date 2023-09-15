package prodotto;

public class Prodotto {
    
    private double prezzo;
    private double iva;
    private double peso;
    private double tara;
    private String descrizione;
    private int[] barCode;

    public Prodotto(double prezzo, double iva, double peso, double tara, String descrizione, int[] barCode) {
        this.prezzo = prezzo;
        this.iva = iva;
        this.peso = peso;
        this.tara = tara;
        this.descrizione = descrizione;
        this.barCode = clone(barCode);
    }
    
    public int[] clone(int[] vett){
        int[] copia = new int[vett.length];
        for(int i=0 ; i<vett.length ; i++){
            copia[i] = vett[i];
        }
        return copia;
    }
    
    public double prezzoIvato(){
        return prezzo+(prezzo*iva);
    }
    
    public double pesoLordo(){
        return peso+tara;//??
    }
    
    public boolean controlloCodice(){
        boolean risult=false;
        double somma = 0;
        for(int i=0 ; i<barCode.length ; i++){
            somma = barCode[i]*((3*(i%2))+((i+1)%2));
            System.out.print(somma);
        }
        return false;
    }
  
}
