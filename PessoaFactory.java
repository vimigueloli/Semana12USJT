import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;

public class PessoaFactory{
   ConexaoBDE ct =null;
   Connection conn=null;
   ResultSet resp = null;
   PreparedStatement ps=null;
   ArrayList<Pessoa> pessoas= new ArrayList<Pessoa>();
   
   String stmt= "SELECT * FROM pessoas";
   
   public ArrayList completaTabela(){

      try{

         ct =new ConexaoBDE();
         int idade;
         String nome,sexo,endereco,esporte;
         boolean vegetarian;
         conn=ct.conectar();
         ps=conn.prepareStatement(stmt);
         resp= ps.executeQuery();
         int i=0;
         while(resp.next()){
            Pessoa objeto=new Pessoa();
            nome= resp.getString("nome_p");
            idade= resp.getInt("idade");
            sexo= resp.getString("sexo");   
            endereco= resp.getString("endereco");
            vegetarian= resp.getBoolean("vegetarian");
            esporte= resp.getString("fk_nome_e");  
            
            objeto.setNome(nome);
            objeto.setIdade(idade);
            objeto.setSexo(sexo);
            objeto.setEndereco(endereco);
            objeto.setVegetarian(vegetarian);
            objeto.setEsporte(esporte);
            
            pessoas.add(objeto);             
         }
         ps.close();
         resp.close();
         return pessoas;

      }catch(SQLException e){
         e.printStackTrace();
         return pessoas;
      }finally{
         try{
            
            if (conn != null){
               conn.close(); 
            }
            
         }catch(SQLException t){
            t.printStackTrace();
         }
      }
      
      
      
      
   }
   
   

}