/**
 * Created by Andre on 17/12/2016.
 */

package reservacarros;

public class Carro {

    String nome;
    String marca;
    String tipo;
    int qtdBancos;

    Carro(String nome, String marca, String tipo, int qtdBancos){
        this.nome = nome;
        this.marca = marca;
        this.tipo = tipo;
        this.qtdBancos = qtdBancos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getQtdBancos() {
        return qtdBancos;
    }

    public void setQtdBancos(int qtdBancos) {
        this.qtdBancos = qtdBancos;
    }
    

}
