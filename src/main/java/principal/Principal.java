package principal;

import com.mycompany.exercicio35.Ave;
import com.mycompany.exercicio35.Cachorro;
import com.mycompany.exercicio35.SerVivoeCia;

public class Principal {

    public static void main(String[] args) {
        SerVivoeCia cachorro1 = new Cachorro("xébiu");
        cachorro1.produzirSom();
        cachorro1.mover();

        SerVivoeCia ave1 = new Ave("quinto das 3 besta");
        ave1.produzirSom();
        ave1.mover();

    }

}
