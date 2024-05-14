package Model;

import java.util.Date;

public class Bebida extends Produto {
//Número 2 para bebidas
    private int tipoDeProduto = 2; 

    public Bebida(int id, String nome, String descricao, int quantidadeEstoque, float preco, Date dataCadastro) {
        super(id, nome, descricao, quantidadeEstoque, preco, dataCadastro); //todos
        setTipoDeProduto(tipoDeProduto);
    }
    
        public Bebida(String nome, int quantidadeEstoque, float preco) {
        super(nome, quantidadeEstoque, preco); //essenciais
        setTipoDeProduto(tipoDeProduto);
        }

    public Bebida() {
     super(0, "", "", 0, 0.0f, new Date());
    }


    //getter e setter
    public int getTipoDeProduto() {
        return tipoDeProduto;
    }
    public void setTipoDeProduto(int tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }


}
