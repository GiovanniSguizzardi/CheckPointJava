package br.uam.checkpoint01;
import java.time.LocalDate;

public class Produto {
    int id;
    String nome;
    float preco;
    LocalDate validade;
    float tamanho;
    String descricao;

    public Produto(int id, String nome, float preco, LocalDate validade, float tamanho, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.validade = validade;
        this.tamanho = tamanho;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public LocalDate getValidade() {
        return validade;
    }

    public void setValidade(LocalDate validade) {
        this.validade = validade;
    }

    public float getTamanho() {
        return tamanho;
    }

    public void setTamanho(float tamanho) {
        this.tamanho = tamanho;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", validade=" + validade +
                ", tamanho=" + tamanho +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
