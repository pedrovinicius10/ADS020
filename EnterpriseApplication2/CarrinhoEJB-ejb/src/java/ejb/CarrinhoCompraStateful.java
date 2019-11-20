package ejb;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Local;
import javax.ejb.Stateful;
import javax.ejb.LocalBean;

/**
 *
 * @author 18114290034
 */
@Stateful
@Local(CarrinhoCompraLocal.class)
public class CarrinhoCompraStateful implements CarrinhoCompraLocal {

    private List<String> lista = new ArrayList<>();
    
    
    @Override
    public void adicionarItem(String s) throws EJBException {
     
        System.out.println("Item " + s +  " adicionado ao carrinho");
        lista.add(s);
    }

    @Override
    public List<String> listarItens() throws EJBException {
       
        return lista;
    }
 

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}