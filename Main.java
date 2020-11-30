public class Main {
  
  public static void main(String[] args) {
    Personagem p = new Personagem();
    FacadeRanking f = new FacadeRanking();
    p.setTendencia(new MundoHard());
    p.getTedenciaMundo();
    f.litarRanking();
  }
}
