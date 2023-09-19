public class Nodo {
    //Atributos
    private int Dato;
    private Nodo LigaD, LigaI;

    //Metodos
    public Nodo(int Dato) {
        this.Dato = Dato;
        this.LigaD = null;
        this.LigaI = null;
    }

    public Nodo() {
        this.Dato = 0;                  //POR DEFECTO
        this.LigaD = null;
        this.LigaI = null;

    }

    public int getDato() {
        return Dato;
    }

    public void setDato(int Dato) {
        this.Dato = Dato;
    }

    public Nodo getLigaD() {
        return LigaD;
    }

    public void setLigaD(Nodo LigaD) {
        this.LigaD = LigaD;
    }

    public Nodo getLigaI() {
        return LigaI;
    }

    public void setLigaI(Nodo LigaI) {
        this.LigaI = LigaI;
    }
}