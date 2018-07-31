import controllers.SistemaController;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        SistemaController sistemaController = new SistemaController();
        sistemaController.cadastrarPessoa("Julia", 3, 7, 70);
        sistemaController.cadastrarPessoa("Wendson", 5, 5, 60);
        sistemaController.persisteNomePessoas();
        System.out.println(sistemaController.leNomePessoas());
        sistemaController.persistePessoa("Julia");

    }

}
