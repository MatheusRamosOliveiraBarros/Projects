package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Produto {

    private int id;
    private String nome;
    private String descricao;
    private int quantidadeEstoque;
    private float preco;
    private Date dataCadastro;

    public Produto(int id, String nome, String descricao, int quantidadeEstoque, float preco, Date dataCadastro){

        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
        try {

            SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yy");
            this.dataCadastro = formataData.parse(String.valueOf(dataCadastro));

        } catch (ParseException e){

            e.printStackTrace();

        }

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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

}