package viljar;
import java.io.*;
import java.util.EnumSet;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Avaldaja {
  @RequestMapping("/omahind")
    String Omahind(String anum, String mark ){
      double roo;
      double maht;
      double l_h;
      double taara;
      double mass;
      for(Jook joo:Jook.values()){
        if((joo.getNimi()).equals(mark)){
          roo=joo.getErikaal();
          l_h=joo.getLiitri_Hind();
        }
      }
      for(Joogipudel pudel:Joogipudel){
        if((pudel.getPudeliTyyp()).equals(anum)){
          maht=pudel.getPudeliMaht();
          taara=pudel.getTaaraMaksumus();
          mass=pudel.getPudeliMass();
        }
      }
      String tagasta = Double.toString(mass+(roo* maht));
      return "Joogi nimetuseja: "+mark+ "Kaalub koos"+anum+
      " topsiga"+ tagasta+". Jook maksab: "+ taara_maksumus+l_h*maht   ;
    }
/*
    int r=0;
      if ((new lugeja().getJookVaadis(sisu[1].jook_sees)).equals(sisu[1].jook_sees)||new lugeja().getJoogiKogus(sisu[1].jook_sees)< sisu[1].maht ){
          new muutja().muutja(sisu[1].jook_sees, new lugeja().getJoogiKogus(sisu[1].jook_sees)-sisu[1].maht);
          System.out.println("tere");
          System.out.println(new lugeja().getJoogiKogus(sisu[1].jook_sees));
          r=1;

      }if(r==0){
        System.out.println("Sellist jooki pole voi on liiga vähe");
      }
      */
public static void main(String[] args)throws IOException{
 /* System.getProperties().put("server.port", 2497);*/
  SpringApplication.run(Geen.class, args);
}
}
