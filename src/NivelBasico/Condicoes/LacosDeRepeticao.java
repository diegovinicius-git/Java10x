package NivelBasico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {

        //While
        // while (condicao) {Tudo aqui vai acontecer}

        int numeroClones = 0;
        int numeroMaxClones = 40;

        while (numeroClones <= numeroMaxClones) {
            numeroClones++;
            System.out.println("Naruto fez um clone das sombras " + numeroClones);
        }

        //Estrutura For
        for (int i = 0; i < numeroMaxClones; i++) {
            System.out.println("O Naruto está se clonando e já se clonou " + i);
        }



    }
}
