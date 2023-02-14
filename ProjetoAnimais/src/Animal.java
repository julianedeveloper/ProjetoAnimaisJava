public abstract class Animal {
        protected float peso;
        protected int idade;
        protected int membros;
        
        public abstract void locomover();
        public abstract void alimentar(); 
        public abstract void emitirSom();

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        System.out.println(this.peso);
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
        System.out.println(this.idade);
    }

    public int getMembros() {
        return membros;
    }

    public void setMembros(int membros) {
        this.membros = membros;
        System.out.println(this.membros);
    }
        
        
}
