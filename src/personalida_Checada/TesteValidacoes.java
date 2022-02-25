package personalida_Checada;

import basico.Aluno;
import personalizada_nao_Checada.NumeroForaIntervaloException;

public class TesteValidacoes {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno("Ana", -1);
            Validar.aluno(aluno);

        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException e) {
            System.out.println(e.getMessage());
        }
        try {
            Validar.aluno(null);
        } catch (StringVaziaException e) {
            e.printStackTrace();
        }

        System.out.println("Fim :)");
    }

}
