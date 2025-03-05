// Classe Veiculo
public class Veiculo {
    // Atributo protegido
    protected int velocidadeMaxima;

    // Construtor para inicializar a velocidade máxima
    public Veiculo(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}

// Classe Carro que herda de Veiculo
public class Carro extends Veiculo {

    // Construtor para inicializar a velocidade máxima do carro
    public Carro(int velocidadeMaxima) {
        super(velocidadeMaxima); // Chama o construtor da classe Veiculo
    }

    // Método para exibir a velocidade máxima do carro
    public void exibirVelocidadeMaxima() {
        System.out.println("Velocidade máxima do carro: " + velocidadeMaxima + " km/h");
    }

    public static void main(String[] args) {
        // Criando um objeto Carro com velocidade máxima de 220 km/h
        Carro carro = new Carro(220);
        
        // Exibindo a velocidade máxima do carro
        carro.exibirVelocidadeMaxima();
    }
}
