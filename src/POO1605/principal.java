package POO1605;

public class principal {
  public static void main(String[] args) {
    animal x = new leao();
    x.setNome("simba");
    x.setIdade(10);
    //x.rugir(); não vai funcionar tipo animal
    x.correr();
    leao k = new leao();
    k.rugir();
    animal u = k;
    //u.rugir(); não vai funcionar, tipo animal

    //object y = new leao();
    //y.setNome() nao funciona, extende object apenas e não os metodos de animal ou leao

    // se for criado na classe leao o metodo correr(), que ja existe na classe animal(),
    // leao x = new leao(): leao correndo
    // animal x = new leao: leao correndo
    x.correr();

    System.out.println(ExemploSobrecarga.soma(10, 20));
    System.out.println(ExemploSobrecarga.soma("30", "40"));
    System.out.println();

  }
}
