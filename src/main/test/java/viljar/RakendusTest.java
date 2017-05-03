package viljar;
import org.junit.*;
import static org.junit.Assert.*;

public class RakendusTest{
	@Test
	public void katse1(){
		Geen u=new Geen();
		Alleel[] sisu=new Alleel[2];
		sisu[0]= new Alleel("ARG",1);
		sisu[1]= new Alleel("ARG",0);
		assertEquals(true,u.Reesus(sisu));
	}

    //@Test
    //public void tervituseTest(){
		//Rakendus r=new Rakendus();
		//assertEquals("Tere, Juku", r.tervitusfunktsioon3("Juku"));
	//}
	/*@Test
	public void tervituseTest2(){
		Rakendus r=new Rakendus();
		assertEquals("Tere, kodanik Juurikas J", r.tervitusfunktsioon4("Juku", "Juurikas"));
	}*/
}
