package fatec.poo.model;

public class Questao {
    private int numero;
    private String enunciado;
    private String alternativa_A;
    private String alternativa_B;
    private String alternativa_C;
    private String alternativa_D;
    private char resposta;
    private char alternativaGabrito;

    public Questao(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public String getAlternativa_A() {
        return alternativa_A;
    }

    public void setAlternativa_A(String alternativa_A) {
        this.alternativa_A = alternativa_A;
    }

    public String getAlternativa_B() {
        return alternativa_B;
    }

    public void setAlternativa_B(String alternativa_B) {
        this.alternativa_B = alternativa_B;
    }

    public String getAlternativa_C() {
        return alternativa_C;
    }

    public void setAlternativa_C(String alternativa_C) {
        this.alternativa_C = alternativa_C;
    }

    public String getAlternativa_D() {
        return alternativa_D;
    }

    public void setAlternativa_D(String alternativa_D) {
        this.alternativa_D = alternativa_D;
    }

    public char getResposta() {
        return resposta;
    }

    public void setResposta(char resposta) {
        this.resposta = resposta;
    }

    public char getAlternativaGabrito() {
        return alternativaGabrito;
    }

    public void setAlternativaGabrito(char alternativaGabrito) {
        this.alternativaGabrito = alternativaGabrito;
    }
     
}
