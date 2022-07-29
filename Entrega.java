package BDOO;

import java.util.Date;

public class Entrega{
    private Date data;
    private Date hora;  
    private Motorista motorista;
    private Veiculo veiculo;
    private Venda venda;
    
    public Entrega(Date data, Date hora, Motorista motorista, Veiculo veiculo, Venda venda) {
        this.data = data;
        this.hora = hora;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.venda = venda;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

}
