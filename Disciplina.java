public class Disciplina {
    private String nome;
    private int codigo;
    private int carga;
    public Disciplina(String nome, int codigo, int carga){
        this.carga = carga;
        this.codigo = codigo;
        this.nome = nome;
    }
    public int getCarga() {
        return carga;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getNome() {
        return nome;
    }  
    public void gerenciarDisciplina(){
        //ADD METODO
    }
}
