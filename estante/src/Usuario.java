public class Usuario {
  private String nome;
  private String username;
  private String comentario;
  private double nota;

  // construtor --> inicializa o atributo com o valor do parâmetro
  public Usuario(String nome, String username, String comentario, double nota) {
    this.nome = nome;
    this.username = username;
    this.comentario = comentario;
    this.nota = nota;
  }

  // metodos

  // método que poupa o código de imprimir o perfil do usuário, na classe Estante
  public String imprimirUsuario() {
    return "\n" + "USUARIO" + "\n" + "--------------------" + "\n" + "Nome: " + getNome() + "\n" + "Username: "
        + getUsername() + "\n"
        + "Nota do livro: "
        + getNota() + "\n" + "Comentário: " + getComentario();
  }

  // método que trata a nota (entre 1 e 10)

  // getters e setters --> retorna e define o valor do atributo
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public double getNota() {
    return nota;
  }

  public void setNota(double nota) {
    this.nota = nota;
  }
}
