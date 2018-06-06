SET JAVA_HOME="C:\Program Files\Java\jdk1.8.0_171\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
SET JFLEX_HOME= C:\Users\lienp\Desktop\Fuentes\jflex-1.6.1\lib
cd C:\Users\lienp\Desktop\Proyecto2Compiladores\src\Analizadores
java -jar %JFLEX_HOME%\jflex-1.6.1.jar A_Lexico.jflex
pause
