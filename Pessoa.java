public class Pessoa{

   private String nome,endereco,sexo,esporte;
   private boolean vegetarian;
   public int idade;
   
   public Pessoa(){
      this.nome="nome";
      this.idade=0;
      this.sexo="M";
      this.endereco="endereco";
      this.vegetarian= false;
      this.esporte="esporte";
   }
   
   public String getNome(){
      return nome;
   }
   public String getSexo(){
      return sexo;
   }
   public String getEndereco(){
      return endereco;
   }
   public String getEsporte(){
      return esporte;
   }
   public boolean getVegetarian(){
      return vegetarian;
   }
   public int getIdade(){
      return idade;
   }
   
   public void setNome( String nome){
      this.nome=nome;
   }
   public void setIdade(int idade){
      this.idade=idade;
   }
   public void setSexo(String sexo){
      this.sexo=sexo;
   }
   public void setEndereco(String endereco){
      this.endereco=endereco;
   }
   public void setVegetarian(boolean vegetarian){
      this.vegetarian=vegetarian;
   }
   public void setEsporte(String esporte){
      this.esporte=esporte;
   }
   
   
 }