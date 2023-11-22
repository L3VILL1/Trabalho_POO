public class Pessoa {
    private String nome;
    private String dataNascimento;
    private String endereco;
    private String telefone;
    private int cpf;
    private int matricula;
    public Pessoa(){
        this.nome = "default";
        this.dataNascimento = "00/00/00";
        this.endereco = "rua x";
        this.telefone = "851111111";
        this.cpf = 1234;
        this.matricula = 1234;
    }
    public Pessoa(String nome, String dataNascimento, String endereco, String telefone, int cpf, int matricula){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.telefone = telefone;
        this.cpf = cpf;
        this.matricula = matricula;
    }
    public int getCpf() {
        return cpf;
    }
    public String getDataNascimento() {
        return dataNascimento;
    }
    public String getEndereco() {
        return endereco;
    }
    public int getMatricula() {
        return matricula;
    }
    public String getNome() {
        return nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
