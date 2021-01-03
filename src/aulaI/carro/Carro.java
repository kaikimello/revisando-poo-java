package aulaI.carro;

/**
 * Created by KAIKI on 02/01/2021, 2021
 */
public class Carro {
    int potencia;
    int velocidade;
    String nome;

    void acelerar(){
        velocidade += potencia;
    }

    void frear(){
        velocidade = velocidade / 2;
    }

    int getVelocidade(){
        return velocidade;
    }

    void imprimir(){
        System.out.println("O carro "+ nome + " está a velocidade de "+ getVelocidade() + " km/h");
    }

}
