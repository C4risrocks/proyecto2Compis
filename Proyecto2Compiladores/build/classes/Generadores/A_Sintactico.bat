SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_171\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\lienp\Desktop\Proyecto2Compiladores\src\Analizadores
java -jar C:\Users\lienp\Desktop\Fuentes\java-cup-11b.jar -parser analisis_sintactico -symbols Simbolos A_Sintactico.cup
pause
