package Model;

import java.util.Date;
import DAO.ProdutoDAO;
import java.util.ArrayList;

public class Comida extends Produto {
    // Número 1 para bebidas
    private int tipoDeProduto = 1;
    private ProdutoDAO dao; 

    public Comida() {
        super(0, "", "", 0, 0.0f, new Date());
        this.dao = new ProdutoDAO();
    }

    public Comida(int id, String nome, String descricao, int quantidadeEstoque, float valor, Date dataCadastro) {
        super(id, nome, descricao, quantidadeEstoque, valor, dataCadastro);
        this.dao = new ProdutoDAO();
    }

    public int getTipoDeProduto() {
        return tipoDeProduto;
    }

    public ArrayList getLista() {
        return dao.getLista(this.tipoDeProduto);
    }
}