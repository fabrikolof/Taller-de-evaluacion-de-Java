package com.example.tallerjava1.Ejercicio16;

/* PRIMERA PARTE
*     Haz una clase llamada Persona que siga las siguientes condiciones:

    Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura. No queremos que se accedan directamente a ellos.
    Piensa que modificador de acceso es el más adecuado, también su tipo. Si quieres añadir algún atributo puedes hacerlo.

    Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo (0 números, cadena vacía para String, etc.).
    Sexo será hombre por defecto, usa una constante para ello.

Se implantarán varios constructores:

    Un constructor por defecto.
    Un constructor con el nombre, edad y sexo, el resto por defecto.
    Un constructor con todos los atributos como parámetro.

Los métodos que se implementaran son:

    calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20,
    * la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve
    * un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para
    * devolver estos valores.

    esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
    comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
    toString(): devuelve toda la información del objeto.
    generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método será invocado cuando
    * e construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
    Métodos set de cada parámetro, excepto de DNI.
* */
public class Persona {
    /*Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
     * Modificadores de Acceso:
     * -PUBLIC
     * -PRIVATE
     * -DEFAULT
     * -PROTECTED
     * */
    public static final char MALE = 'H';
    public static final char FAMALE = 'M';
    public static final int SOBREPESO = 1;
    public static final int UNDERPESO = -1;
    public static final int PESOIDEAL = 0;

    private String name = "";
    private String DNI;
    private int age = 0;
    private double height = 0;
    private double weight = 0;
    private char sexo = MALE;

    public Persona() {
        this.DNI = generateDNI();
    }

    public Persona(String name, int age, char sexo) {
        this.name = name;
        this.age = age;
        this.sexo = comprobarSexo(sexo);
    }

    public Persona(String name, int age, double height, double weight, char sexo) {
        this.name = name;
        this.DNI = generateDNI();
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.sexo = comprobarSexo(sexo);
    }

    /*
     *  calcularIMC(): calculara si la persona está en su peso ideal (peso en kg/(altura^2  en m)), si esta fórmula devuelve un valor menor que 20,
     * la función devuelve un -1, si devuelve un número entre 20 y 25 (incluidos), significa que está por debajo de su peso ideal la función devuelve
     * un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso, la función devuelve un 1. Te recomiendo que uses constantes para
     * devolver estos valores.
     * */
    public int calcularIMC() {
        int res = PESOIDEAL;
        double cal = this.weight / Math.pow(this.height, 2);

        if (cal < 20) {
            res = SOBREPESO;
        } else if (20 >= cal && cal <= 25) {
            res = PESOIDEAL;
        } else if (cal > 25) {
            res = UNDERPESO;
        }
        return res;
    }

    /*
     *     esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.
     * */
    public boolean esMayorDeEdad() {
        return this.age >= 18;
    }

    /*    comprobarSexo(char sexo): comprueba que el sexo introducido es correcto. Si no es correcto, sera H. No será visible al exterior.
     */
    private char comprobarSexo(char sexo) {
        if (sexo == MALE || sexo == FAMALE) {
            return sexo;
        } else {
            return MALE;
        }
    }

    /*    toString(): devuelve toda la información del objeto.*/
    @Override
    public String toString() {
        return "Persona{" +
                "name='" + name + '\'' +
                ", DNI='" + DNI + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", sexo=" + sexo +
                '}';
    }

    /*
        generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente. Este método será invocado cuando
        se construya el objeto. Puedes dividir el método para que te sea más fácil. No será visible al exterior.
        Métodos set de cada parámetro, excepto de DNI.*/

    //8 Numbers Randoms
    public int generatorOfDNI() {
        double dni = 10000000 + Math.random() * 90000000;
        return (int) dni;
    }

    //Random Letters
    public char letterGenerator(int num) {
        String characters = "ABCDEFGHJKLMNPQRSTVWXYZ";
        int res = num % 23;
        return characters.charAt(res);
    }

    //DNI Generator
    public String generateDNI() {
        int num = generatorOfDNI();
        String serie = String.valueOf(letterGenerator(num));
        return serie + num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSexo(char sexo) {
        this.sexo = comprobarSexo(sexo);
    }

    public String getName() {
        return name;
    }
}
