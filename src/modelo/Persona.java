package modelo;

/**
 *
 * @author david
 */
//1.-estableciendo un clase
public class Persona {
//2.-ATRIBUTOS ->DECLARACION DE VARIABLES (GLOBALES)
    //public-private-protected
    public int idPersona;
    public String nombres;
    public String apellidos;
    public String etnia;
    public int cedula;
    public int numTelefono;
    public String horoscopo;
    
//3.-METODOS/ACCIONES O COMPORTAMIENTOS
    //public-private
    //para declarar un metodo de no retorno usamos public y la palabra void que no devuelbe nada
    //son secciones de codigo
    //pueden poseer variables locales
    public void saludar(){
        System.out.println("Hola: " + nombres);
    }
    //1.1.-METODO DE NO RETORNO UTILIZANDO ARGUMENTO
    //UN ARGUMENTO ES UNA VARIABLE LOCAL
    //QUE SE DECLARA DENTRO DE LOS ()
    //SOLO SE RECONOCE EN ESA INSTANCIA DEL CODIGO
    public void saludarEdad(int edad){
        if(edad>18){
            System.out.println("Eres mayor de edad");
        }else{
            System.out.println("Eres menor de edad");
        }
    }
    //METODO QUE NOS INDIQUE EL HOROSCOPO
    public void saludarHoroscopo() {
        if("Virgo".equals(horoscopo)){
            System.out.println("El horoscopo dice:\n"
                    +horoscopo+", La paciencia sera clave para ti este mes." );
        }
        System.out.println("----------------------------------------------");
    }

    public void horoscopo() {
        if("Aries".equals(horoscopo)){
            System.out.println("El horoscopo dice:\n"
                    +horoscopo+", El coraje no siempre ruge. A veces, es una voz tranquila al \n"
                            + " final de día que dice: 'Lo intentaré de nuevo mañana'." );
        }
        System.out.println("--------------------------------------------------------");

    }
    
    public void horoscopo1() {
        if("Leo".equals(horoscopo)){
            System.out.println("El horoscopo dice:\n"
                    +horoscopo+", El coraje no siempre ruge. A veces, es una voz tranquila al \n"
                            + " final de día que dice: 'Lo intentaré de nuevo mañana'." );
        }
        System.out.println("--------------------------------------------------------");

    }

    public void horoscopo2() {
        if("Cáncer".equals(horoscopo)){
            System.out.println("El horoscopo dice:\n"
                    +horoscopo+", La verdadera felicidad consiste en hacer felices a los demás." );
        }
        System.out.println("--------------------------------------------------------");
    }
    
    public void horoscopo3() {
        if("Acuario".equals(horoscopo)){
            System.out.println("El horoscopo dice:\n"
                    +horoscopo+", Sé tú mismo, todos los demás ya están tomados." );
        }
        System.out.println("--------------------------------------------------------");
    }
    
    
    
    
    
    
}

