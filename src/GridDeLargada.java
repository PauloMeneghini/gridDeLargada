import java.util.Arrays;
public class GridDeLargada {
    private Automovel[][] grid;
    private int quantidade;

    public GridDeLargada(int qtdLin, int qtdCol) {
        grid = new Automovel[qtdLin][qtdCol];
        quantidade = 0;
    }

    public void formacaoDoGrid(Automovel[] automoveis) {
        Arrays.sort(automoveis); // Ordenar em ordem crescente de tempo

        int linhas = grid.length;
        int colunas = grid[0].length;

        for (Automovel automovel : automoveis) {
            int linha = quantidade / colunas;
            int coluna = colunas - 1 - (quantidade % colunas); // Inverter a ordem das colunas

            grid[linha][coluna] = automovel;
            quantidade++;
        }
    }

    public int posicao(String nomePiloto) {
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                Automovel automovel = grid[i][j];
                if (automovel != null && automovel.getNome().equals(nomePiloto)) {
                    return i * grid[0].length + grid[0].length - j;
                }
            }
        }
        return -1; // Piloto não encontrado
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] != null) {
                    sb.append(grid[i][j].getNome()).append(" ");
                } else {
                    sb.append("Vazio ");
                }
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GridDeLargada other = (GridDeLargada) obj;
        return Arrays.deepEquals(grid, other.grid);
    }

    @Override
    public int hashCode() {
        return Arrays.deepHashCode(grid);
    }

    public GridDeLargada(GridDeLargada outro) {
        this.grid = new Automovel[outro.grid.length][outro.grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (outro.grid[i][j] != null) {
                    this.grid[i][j] = outro.grid[i][j].clone();
                }
            }
        }
        this.quantidade = outro.quantidade;
    }
}