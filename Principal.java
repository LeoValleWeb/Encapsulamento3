public class Principal {

    public static void main(String[] args) {
       Conta conta = new Conta("Leonardo",17,"LeoValle","leovalle2004");

        System.out.println("Nome: "+conta.getNome());
        System.out.println("Idade: "+conta.getIdade());
        System.out.println("Nome de usuario: "+conta.getUsername());
        conta.setUsername("Etec1234");

        if(conta.verificarSenha("Etec2023")){
            System.out.println("senha válida");
        }else{
            System.out.println("senha inválida");
        }

    }
}
