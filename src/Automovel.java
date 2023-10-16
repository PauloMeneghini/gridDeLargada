import java.util.Objects;

class Automovel implements Comparable<Automovel> {
    private String nome;
    private String equipe;
    private double tempo;

    // Construtor
    public Automovel(String nome, String equipe, double tempo) {
        this.nome = nome;
        this.equipe = equipe;
        this.tempo = tempo;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }

    public double getTempo() {
        return tempo;
    }

    public void setTempo(double tempo) {
        this.tempo = tempo;
    }

    @Override
    public String toString() {
        return "Automovel [nome=" + nome + ", equipe=" + equipe + ", tempo=" + tempo + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Automovel other = (Automovel) obj;
        return nome.equals(other.nome) && equipe.equals(other.equipe) && tempo == other.tempo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, equipe, tempo);
    }

    @Override
    public Automovel clone() {
        return new Automovel(this.nome, this.equipe, this.tempo);
    }

    @Override
    public int compareTo(Automovel outro) {
        return Double.compare(this.tempo, outro.tempo);
    }
}
