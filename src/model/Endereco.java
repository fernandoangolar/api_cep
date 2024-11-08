package model;

import com.google.gson.annotations.SerializedName;
import record.EnderecoCep;

public class Endereco {

//    @SerializedName("cep")
    private String cep;
//    @SerializedName("logradouro")
    private String logradouro;
//    @SerializedName("localidade")
    private String localidade;
//    @SerializedName("uf")
    private String uf;

    public Endereco() {}

    public Endereco(EnderecoCep enderecoCep) {
        this.cep = enderecoCep.cep();
        this.logradouro = enderecoCep.logradouro();
        this.localidade = enderecoCep.localidade();
        this.uf = enderecoCep.uf();
    }

    public String getCep() {
        return cep;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getLocalidade() {
        return localidade;
    }

    public void setLocalidade(String localidade) {
        this.localidade = localidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public String toString() {
        return "\n Endereco{" +
                "cep='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", uf='" + uf + '\'' +
                '}';
    }
}
