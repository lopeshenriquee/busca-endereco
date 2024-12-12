import org.lopeshenriquee.models.ConsultaCEP;
import org.lopeshenriquee.models.Endereco;
import org.lopeshenriquee.models.GeradorJson;

import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ConsultaCEP consultaCEP = new ConsultaCEP();

        System.out.println("Digite um CEP: ");
        var cep = scan.nextLine();

        try {
            Endereco novoEndereco = new ConsultaCEP().buscaEndereco(cep);
            System.out.println(novoEndereco);
            GeradorJson geradorTxt = new GeradorJson();
            geradorTxt.salvaJson(novoEndereco);
        } catch (RuntimeException | IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando Aplicação");
        }
        scan.close();
    }
}
