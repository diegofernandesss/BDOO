package BDOO;

public class Vendedor {
    private  int codVdd;
    private double cpf;
    private double vComissao;
    private String nome;
    private String endereco;
    
    public Vendedor(int codVdd, double cpf, double vComissao, String nome, String endereco) {
        this.codVdd = codVdd;
        this.cpf = cpf;
        this.vComissao = vComissao;
        this.nome = nome;
        this.endereco = endereco;
    }

    public int getCodVdd() {
        return codVdd;
    }

    public void setCodVdd(int codVdd) {
        this.codVdd = codVdd;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public double getvComissao() {
        return vComissao;
    }

    public void setvComissao(double vComissao) {
        this.vComissao = vComissao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}
