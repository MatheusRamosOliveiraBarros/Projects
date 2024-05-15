package Model;

import java.util.Date;

public class Comida extends Produto {
    private int tipoDeProduto = 1; 

    public Comida(int id, String nome, String descricao, int quantidadeEstoque, float preco, Date dataCadastro) {
        super(id, nome, descricao, quantidadeEstoque, preco, dataCadastro);
        setTipoDeProduto(tipoDeProduto);
    }
    
        public Comida(String nome, int quantidadeEstoque, float preco) {
        super(nome, quantidadeEstoque, preco);
        setTipoDeProduto(tipoDeProduto);
        }

    public Comida() {
     super(0, "", "", 0, 0.0f, new Date());
    }


    public int getTipoDeProduto() {
        return tipoDeProduto;
    }
    public void setTipoDeProduto(int tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }


}