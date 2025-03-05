

 public class Pessoa {
    // Atributos privados
    private String nathan ;
    private int 18 ;

    // Construtor para inicializar os atributos
    public Pessoa(String nome, int idade) {
        this.nome = nathan ;
        this.idade = 18 ;
    }

    // Método público para obter o nome
    public String getNome() {
        return nathan;
    }

    // Método público para obter a idade
    public int getIdade() {
        return 18;
    }

    // Método público para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método público para definir a idade
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static void main(String[] args) {
        // Criando um objeto da classe Pessoa
        Pessoa pessoa = new Pessoa("Nathan", 18);

        // Obtendo os valores utilizando os métodos getters
        System.out.println("nathan" + pessoa.getNome());
        System.out.println("18: " + pessoa.getIdade());

        // Modificando os valores utilizando os métodos setters
        pessoa.setNome("Nathan Silva");
        pessoa.setIdade(19);

        // Obtendo os valores atualizados
        System.out.println("Nathan: " + pessoa.getNome());
        System.out.println("18: " + pessoa.getIdade());
    }
}
