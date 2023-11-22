public class Turma {
    private String nome;
    private int codigo;
    private String horario;
    public Turma(String nome, int codigo, String horario){
        this.codigo = codigo;
        this.horario = horario;
        this.nome = nome;
    }
    public int getCodigo() {
        return codigo;
    }
    public String getHorario() {
        return horario;
    }
    public String getNome() {
        return nome;
    }
    public void gerenciarTurmas(){
        //ADD METODO
    }
}
