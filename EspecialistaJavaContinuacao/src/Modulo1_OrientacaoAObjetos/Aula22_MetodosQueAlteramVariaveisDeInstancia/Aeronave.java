package Modulo1_OrientacaoAObjetos.Aula22_MetodosQueAlteramVariaveisDeInstancia;

public class Aeronave {

    boolean ativo;
    int totalAssentos;
    int assentosReservados;

    int calcularAssentosDisponiveis() {
        return totalAssentos - assentosReservados;
    }

    boolean alteraStatusAeronave() {
        return !ativo;
    }

    void reservarAssentos(int numeroDeAssentos){
        if (ativo != true) {
            System.out.println("Aeronave desativada");
        } else {
            assentosReservados += numeroDeAssentos;
        }
    }

}

