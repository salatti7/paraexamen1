package proyectoSalatti.proyectoSalatti;
import java.util.List;
import java.util.ArrayList;

public class Person {
 private String name;
 private int age;
 private int height;
 private int weight;
 private String eyeColor;
 private String gender;
 private List<String> aficiones;

 public Person() {
  // Nothing to do...
 }

 public Person(String name, int age, int height, int weight, String eyeColor, String gender){
   this.name = name;
   this.age = age;
   this.height = height;
   this.weight = weight;
   this.eyeColor = eyeColor;
   this.gender = gender;
   settingAficiones();
  }

  public void settingAficiones() {
   aficiones=new ArrayList<String>();
   aficiones.add("bici");
   aficiones.add("senderismo");
   aficiones.add("dibujar");
  }

  public int getWeight() {
     return weight;
  }
  public int getAge() {
     return age;
  }
  public int getHeight() {
     return height;
  }
  public String getGender() {
     return gender;
  }
  public String getName() {
     return name;
  }
  public String getEyeColor() {
     return eyeColor;
  }
  public List<String> getAficiones() {
     return aficiones;
  }
  public void setAficiones() {
     this.aficiones = aficiones;
  }

}

