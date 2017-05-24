# Paraexamen
proyecto que piden para el examen de testing

En este proyecto se hace uns testing de dos clases directamente con la clase suite,en la que agregaremos el nombre de las dos clases en dos lineas distinta para su testeo,para ello tiene que estar las dos clases bien y que compile sin problema y despues compilar este suite que nos dara el testeo automatico de las clases que queramos,en este caso de person y math.

Testing

    Git clone:

$ git clone https://github.com/Rebecasarai/JTesting.git
$ cd JTesting

    Compilamos primeramente la clase Math.java dando la dirección de los jars, recordando la dependencia:

$ javac -cp /home/alumnado-pc21/misjars/spring-framework-4.3.7.RELEASE/libs/*:.  Math.java

    Compilamos el testing:

$ javac -cp /home/alumnado-pc21/misjars/spring-framework-4.3.7.RELEASE/libs/*:.  MathTest.java

    Corremos el test:

$ java -cp /home/alumnado-pc21/misjars/spring-framework-4.3.7.RELEASE/libs/*:. org.junit.runner.JUnitCore  MathTest


