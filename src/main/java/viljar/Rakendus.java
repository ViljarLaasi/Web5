package jaagup;
import kuvamine.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class Rakendus {
	@RequestMapping("/aprilliuusid")
	string uudis1(String pealkiri, String sisu){
		PealkirjagaTekst pt1=new PealkirjagaTekst(pealkiri, sisu);
		return "<!doctype html><html><body>"+pt1.html()+"</div></html>";
	}
    
	@RequestMapping("/tervita")
	    String tervitusfunktsioon3(String eesnimi) {
	        return "Tere," +eesnimi;
	    }


    public static void main(String[] args) {
		//System.getProperties().put("server.port", 35878);
        SpringApplication.run(Rakendus.class, args);
    }
}

//scl enable rh-maven33 bash tellib pakku kaasa
//mvn package commpileerib
//java -jar target/boot3-1.0-SNAPSHOT.jar commpileerib koodi
