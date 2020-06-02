import javax.swing.*;
import java.util.*;
import javax.swing.table.*;
public class TelaTabela{
   
   public static void main(String []args){
      String[] colunas={"nome","idade","sexo","endereco","vegetariano(a)","esporte"};
      ArrayList<Pessoa> pessoas;
      
      PessoaFactory y= new PessoaFactory();
      
      pessoas=y.completaTabela();
      
      TableModel modelo = new ModeloTabela(pessoas,colunas);
      
      JTable tabela= new JTable(modelo);
      JScrollPane rolagem= new JScrollPane(tabela);
      JFrame quadro= new JFrame(); 
      quadro.getContentPane().add(rolagem);
      quadro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      quadro.setLocationRelativeTo(null);
      quadro.pack();
      quadro.setVisible(true);
   }
}