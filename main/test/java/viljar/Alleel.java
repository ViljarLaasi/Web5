package viljar;
public class Alleel{
  String nimetus;
  int toevaartus;

	public Alleel(String nimetus, int toevaartus){
    setNimetus(nimetus);
    settoevaartus(toevaartus);
	}
	public void setNimetus(String nimetus){
    this.nimetus=nimetus;
  }
  public String getNimetus(){
    return nimetus;
  }
  public void settoevaartus(int toevaartus){
    this.toevaartus=toevaartus;
  }
  public int gettoevaartus(){
    return toevaartus;
  }
}
