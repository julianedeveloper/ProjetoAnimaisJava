public class Reptil extends Animal{

    @Override
    public void locomover() {
        System.out.println("Rastejando.");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais.");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    @Override
    public float getPeso() {
        return peso;
    }

    @Override
    public void setPeso(float peso) {
        this.peso = peso;
        System.out.println(this.peso);
    }

    @Override
    public int getIdade() {
        return idade;
    }

    @Override
    public void setIdade(int idade) {
        this.idade = idade;
        System.out.println(this.idade);
    }

    @Override
    public int getMembros() {
        return membros;
    }

    @Override
    public void setMembros(int membros) {
        this.membros = membros;
        System.out.println(this.membros);
    }
    
    
}
