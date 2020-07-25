import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ContadorDeEstudantes {
    private static Scanner scanner = new Scanner(System.in);

    private static Set<Integer> conjuntoDeEstudantes = new HashSet<>();

    public static void main(String[] args) {
        adicionarEstudantes(Integer.parseInt(obterDados("Quantos estudantes serão adicionados ao curso A?")));
        adicionarEstudantes(Integer.parseInt(obterDados("Quantos estudantes serão adicionados ao curso B?")));
        adicionarEstudantes(Integer.parseInt(obterDados("Quantos estudantes serão adicionados ao curso C?")));
        System.out.println("Total de estudantes: "+conjuntoDeEstudantes.size());
    }

    private static String obterDados(String mensagemAoUsuario) {
        System.out.println(mensagemAoUsuario);
        return scanner.nextLine();
    }

    private static void adicionarEstudantes(int numeroDeEstudantesAAdicionar) {
        for (int i = 1; i <= numeroDeEstudantesAAdicionar; i++) {
            int IDDoEstudante = Integer.parseInt(obterDados("Digite o ID do estudante de número " + i + ":"));
            conjuntoDeEstudantes.add(IDDoEstudante);
        }
        System.out.println("Estudantes adicionados com sucesso!");
    }
}
