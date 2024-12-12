import org.lopeshenriquee.models.ConsultaCEP;
import org.lopeshenriquee.models.Endereco;

public class Principal {
    public static void main(String[] args) {
        ConsultaCEP consultaCEP = new ConsultaCEP();
        Endereco novoEndereco = new ConsultaCEP().buscaEndereco("01001000");
        System.out.println(novoEndereco);
    }
}
