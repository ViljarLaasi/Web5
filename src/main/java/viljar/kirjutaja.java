package viljar;
import java.io.*;
import java.lang.*;
import java.util.*;

public class kirjutaja{
  private Formatter x;
  public void Ava(){
    try{
    x=new Formatter("valjund.txt");
  }catch(Exception e){
    System.out.println("Viga");
  }
}
  public void SalvestaSisu(String u, double uus_number)throws IOException{
    String[] split;
    Scanner file=new Scanner(new File("sisu.txt"));
    int numTimes =file.nextInt();
    file.nextLine();
      for (int i=0; i<numTimes; i++){
        split=file.nextLine().split(" ");
          if ((split[1].trim()).equals(u.trim())){
            for(int z=0; z<3; z++){
             //x.format(uus_number);
           }
             x.format(System.lineSeparator());
             x.format("tere");
        //System.out.println("tuuur");
        //System.out.println(split[2]);
        //tagasta = Integer.parseInt(split[2]);
        //return split;
          }//else
      }//else{
      //System.out.println("Viga");
    //}
  }
/*  public void SalavestSisu () throws IOException{
  BufferedWriter outputWriter = null;
  outputWriter = new BufferedWriter(new FileWriter("valjund.txt"));
  String[] f={"3","32","23","23","22"};
  for (int i = 0; i < f.length; i++) {
    outputWriter.write(f[i]+" ");
    // Or:
    //outputWriter.write(Integer.toString(x[i]);
    //outputWriter.newLine();
  }
    outputWriter.flush();
    outputWriter.close();
}*/
  /*public void SalavestSisu(){
   String[] f={"3","32","23","23","22"};
   for(int i=0; i<5; i++){
    x.format(f[i]);
  }
    x.format(System.lineSeparator());
    x.format("tere");
  }*/
  public void Sulge(){
    x.close();
  }
}
