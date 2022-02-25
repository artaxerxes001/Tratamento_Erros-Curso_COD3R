package basico;

public class Basico {
    public static void main(String[] args) {
        Aluno a1 = null;
        try {

            imprimirNomeDoAluno(a1);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome do usuario");
        }
        try {

            System.out.println(7 / 0);

        } catch (ArithmeticException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        System.out.println("Fim \uD83D\uDE03");
    }

    public static void imprimirNomeDoAluno(Aluno aluno) {
        System.out.println(aluno.nome);
    }
}
