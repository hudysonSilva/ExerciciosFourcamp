
public class Cliente {
    String cpf;
    String nome;
    Endereco endereco;
    int idade;


    public static Cliente cadastraCLiente(Cliente cliente) {
        //                                            ↑
        //Cadastro                                 cliente
        Utils ajuda = new Utils();
        do {
            cliente.cpf = ajuda.lerSring("CPF");
            if(cliente.cpf.length() != 11){
                System.out.println("CPF invalido o CPF possui 11 digitos");
            }
        }while(cliente.cpf.length() != 11 );
        cliente.nome = ajuda.lerSring("Nome");
        cliente.idade = ajuda.lerInteiro("Idade");
        return cliente;
    }
}
