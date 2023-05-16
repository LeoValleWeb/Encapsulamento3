public class Principal {

    public static void main(String[] args) {
       Conta conta = new Conta();
        conta.setNome("Leonardo Valle");
        conta.setIdade(17);
        conta.setUsername("Lelas");
        conta.setSenha("lelelele");

        System.out.println("Nome: "+conta.getNome());
        System.out.println("Idade: "+conta.getIdade());
        System.out.println("Nome de usuario: "+conta.getUsername());
        System.out.println("Senha: "+conta.getSenha());
    }
}
