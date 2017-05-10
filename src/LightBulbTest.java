import static org.junit.Assert.*;

import org.junit.Test;

public class LightBulbTest {

	@Test
	public void test() {
		LightBulb lb=new LightBulb(60,"Halogen","Blue");
		int w=lb.getBulbWattage();
			assertEquals(60,w);
		String t=lb.getBulbType();
			assertEquals("Halogen",t);
		String c=lb.getBulbColor();
			assertEquals("Blue",c);
			
			}

}
