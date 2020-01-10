public class pkmn{
  public String nom;
  public String talent;
  public int dex;
  public int hp;
  public int atk;
  public int def;
  public int atksp;
  public int defsp;
  public int vit;
  public int exp;
  public int lvl;
  public pkmn(String nom, String talent, int dex){
  System.out.println("Création d'un pokemon !");
  this.nom = nom;
  this.talent = talent;
  this.dex = dex;
  }
  public pkmn(){
  System.out.println("Création d'un pokemon !");
  this.nom = "OMAR";
  this.talent = "connerie";
  this.dex = 22;
  this.hp = 20;
  }
}
