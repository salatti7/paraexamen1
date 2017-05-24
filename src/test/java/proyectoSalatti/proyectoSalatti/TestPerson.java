package proyectoSalatti.proyectoSalatti;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class TestPerson {
 @Test
 public void testPerson() {
  List<String> list= new ArrayList<String>(Arrays.asList("bici","senderismo","dibujar"));
  Person p = new Person("Joe Q Author", 42, 173, 82, "Brown", "MALE");
  assertEquals("Joe Q Author", p.getName());
  assertEquals(42, p.getAge());
  assertEquals(173, p.getHeight());
  assertEquals(82, p.getWeight());
  assertEquals("Brown", p.getEyeColor());
  assertEquals("MALE", p.getGender());
  assertEquals(list,p.getAficiones());
}

}
