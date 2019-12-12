package br.com.johnsquispe.totalVoiceApi.models;

import javax.persistence.*;

@Entity
public class Escola {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long escolaId;

    private String razaoSocial;

    private String cnpj;

    public Long getEscolaId() {
        return escolaId;
    }

    public void setEscolaId(Long escolaId) {
        this.escolaId = escolaId;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
