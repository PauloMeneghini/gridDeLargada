public class Main {
    public static void main(String[] args) {

        Automovel automovel1 = new Automovel("Piloto1", "Equipe1", 100.5);
        Automovel automovel2 = new Automovel("Piloto2", "Equipe2", 101.2);
        Automovel automovel3 = new Automovel("Piloto3", "Equipe3", 99.8);
        Automovel automovel4 = new Automovel("Piloto4", "Equipe4", 102.0);
        Automovel automovel5 = new Automovel("Piloto5", "Equipe5", 98.0);

        Automovel[] automoveis = { automovel1, automovel2, automovel3, automovel4,  automovel5};

        GridDeLargada grid = new GridDeLargada(4, 4);
        grid.formacaoDoGrid(automoveis);

        System.out.println("Grid de Largada:");
        System.out.println(grid);

    }
}