//programa recebe um fname String chamado como parametro
public class Parametros {
  static void myParametros(String fname, int age) {
    System.out.println(fname + " is " + age);
  }

  public static void main(String[] args) {
    myParametros("Cleber ", 36);
    myParametros("Rafaela ", 34);
    myParametros("Luisa ", 10);
  }
}
