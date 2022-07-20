// Referências: https://www.bezkoder.com/spring-boot-jpa-h2-example/

package tinnova.ex05.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Table(name = "Carros")
public class Carro {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name="veiculo")
    private String veiculo;
    @Column(name="marca")
    private String marca;
    @Column(name="ano")
    private int ano;
    @Column(name="descricao")
    private String descricao;
    @Column(name="vendido")
    private boolean vendido;
    @Column(name="created")
    private String created;
    @Column(name="updated")
    private String updated;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }
}
