import javax.print.attribute.standard.NumberOfDocuments;
import javax.swing.JOptionPane;
public class Lista {
    //Atributos
    private Nodo punta;
    //Métodos
    //Constructor

    public Lista() {
        this.punta = null;
    }

    //Insertar al inicio
    public void insertarInicio(int dato) {
        Nodo nuevo = new Nodo();
        nuevo.setDato(dato);
        if (this.punta == null) {
            this.punta = nuevo;
        } else {
            nuevo.setLigaD(this.punta);
            punta.setLigaI(nuevo);
            punta = nuevo;
        }
    }


    //Mostrar lista

    public void mostrarLista() {
        Nodo aux = punta;
        String s = "";
        while (aux != null) {
            System.out.print(aux.getDato() + " ");
            s += aux.getDato() + " ";
            aux = aux.getLigaD();

        }
        JOptionPane.showMessageDialog(null, s);
    }

    // insertar ordenado
    // l3 = l1 + l2
    public void ordenar() {
        int aux;
        Nodo P = this.punta;
        Nodo Q = P;
        for (P = this.punta; P != null; P = P.getLigaD()) {
            for (Q = P.getLigaD(); Q != null; Q = Q.getLigaD()) {
                if (P.getDato() > Q.getDato()) {
                    aux = P.getDato();
                    P.setDato(Q.getDato());
                    Q.setDato(aux);
                }
            }
        }
    }

    public void insertarOrdenado(int dato) {
        if (this.punta == null) return;
        Nodo P = this.punta;
        Nodo Q = P;

        while (dato > P.getDato() && P != null) {
            Q = P;
            P = P.getLigaD();
        }
        Nodo x = new Nodo(dato);
        if (P != Q) Q.setLigaD(x);
        x.setLigaD(P);
        if (P == Q) this.punta = x;
    }

    public void insertarFinal(int dato) {

        if (punta == null) {
            Nodo nuevo = new Nodo(dato);
            punta = nuevo;
        } else {
            Nodo aux = punta;
            while (aux.getLigaD() != null) {
                aux = aux.getLigaD();
            }
            Nodo nuevo = new Nodo(dato);
            aux.setLigaD(nuevo);
        }
    }

    // MARIANA HACE: Insertar ordenado, l1+l2 = l3
    public void sumarListas(Lista A, Lista B) {
        Nodo P = A.punta;
        Nodo Q = B.punta;
        while (P != null || Q != null) {
            int d = 0;
            if (P == null) d = Q.getDato();
            else if (Q == null) d = P.getDato();
            else d = P.getDato() + Q.getDato();
            insertarFinal(d);
            P = P.getLigaD();
            Q = Q.getLigaD();
        }

    }

    public void Reemplazar(int dato, int nuevoDato) {
        Nodo aux = new Nodo();
        aux = punta;
        while (aux != null) {
            if (aux.getDato() == dato) {
                aux.setDato(nuevoDato);
            } else {
                aux = aux.getLigaD();
            }
        }
    }

    public void Busqueda(int Dato) {
        Nodo aux = punta;
        int i = 0;
        while (aux != null) {
            if (aux.getDato() == Dato) {
                JOptionPane.showMessageDialog(null, "El dato " + Dato + " se encuentra en la posicion " + i);
            }
            aux = aux.getLigaD();
            i++;

        }
    }

   
    public void Eliminar(int dato) {
        Nodo aux = punta;
        boolean encontrado=false;
        while(aux!=null && !encontrado){
            encontrado = (aux.getDato()==dato);
            if(!encontrado){
                aux=aux.getLigaD();

            }
        }
        if(encontrado){
            if(aux==punta){
                punta=aux.getLigaD();
            }else{
                aux.getLigaI().setLigaD(aux.getLigaD());
                if(aux.getLigaD()!=null){
                    aux.getLigaD().setLigaI(aux.getLigaI());
                }
            }
            aux=null;
        }

    }

    public void Distribuir(Lista A, Lista B) {
        Nodo P = A.punta;
        Nodo Q = B.punta;
        int acumulador = 0;
        while (Q != null) {

            while (P != null) {
                acumulador = acumulador + P.getDato();
                P = P.getLigaD();
            }

            int d = Q.getDato() * acumulador;
            insertarFinal(d);

            Q = Q.getLigaD();
        }
    }


    public void intercalar (Lista L1, Lista L2)
    {
        Nodo P = L1.punta;
        Nodo Q = L2.punta;
        while (P != null || Q != null)
        {
            if (P != null && Q != null)
            {
                insertarFinal(P.getDato());
                insertarFinal(Q.getDato());
                P = P.getLigaD();
                Q = Q.getLigaD();
            }
            else
            {
                if (P == null)
                {
                    insertarFinal(Q.getDato());
                    Q = Q.getLigaD();
                }
                else
                {
                    insertarFinal(P.getDato());
                    P = P.getLigaD();
                }
            }

        }

    }


}











