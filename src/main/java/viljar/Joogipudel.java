package viljar;
public enum Joogipudel  {
  plast(1, "plast", 0.01, 0.1),
  klaas(0.5,"klaas", 0.2, 0.15);
  double maht;
  String pudelityyp;
  double mass;
  double taara_maksumus;

  public Joogipudel(double maht, String pudelityyp,double uus_mass, double taara_maksumus){
      this.maht= maht;
      this.pudelityyp = pudelityyp;
      this.mass= mass;
      this.taara_maksumus= taara_maksumus;
      }

  public double getPudeliMaht(){
    return maht;
    }
  public String getPudeliTyyp(){
    return pudelityyp;
    }
  public String getPudeliMass(){
    return mass;
      }
  public String getTaaraMaksumus(){
    return taara_maksumus;
      }

}
