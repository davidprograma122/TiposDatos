package vista;

import modelo.Persona;

/**
 *
 * @author david
 */
//1.-CONSUMIENDO OBJETOS
public class Main1 {
    //2.-HACER EL LLAMADO AL METODO MAIN TRADUCTOR
    //O INTERPRETE DEL CODIGO
    //SIRVE PARA PROBAR O COMPROBAR EL CODIGO (psvm)
    public static void main(String[] args) {
        //1.- CREAR UNA INSTANCIA DEL OBJETO
        //NombreClase nombreObjeto=new NombreClase();
        Persona david=new Persona();
        //2.-DARLE DATOS 
        //nombreObjeto.variable=dato
        //ACCEDIENTO A LOS ATRIBUTOS
        david.idPersona=001;
        david.nombres="David";
        david.apellidos="Puetate";
        david.etnia="mestiza";
        david.cedula=1004735617;
        david.numTelefono=963294841;
        david.horoscopo="Virgo";
        
        
        //ACCEDIENDO A METODOS
        david.saludar();
             
        //CONSUMIENDO METODO CON PARAMETROS
        david.saludarEdad(19);
        
        david.saludarHoroscopo();
        
        
        Persona marlon=new Persona();
        marlon.idPersona=002;
        marlon.nombres="Marlon";
        marlon.apellidos="Lopez";
        marlon.etnia="mestiza";
        marlon.cedula=1004735817;
        marlon.numTelefono=965294841;
        marlon.horoscopo="Aries";
        
        marlon.saludar();
        marlon.saludarEdad(17);
        marlon.horoscopo();
        
        
        
        Persona daniel=new Persona();
        daniel.idPersona=003;
        daniel.nombres="Daniel";
        daniel.apellidos="Lopera";
        daniel.etnia="mestiza";
        daniel.cedula=1004735717;
        daniel.numTelefono=965297841;
        daniel.horoscopo="Leo";
        
        daniel.saludar();
        daniel.saludarEdad(22);
        daniel.horoscopo1();
        
        
        Persona darwin=new Persona();
        darwin.idPersona=004;
        darwin.nombres="Darwin";
        darwin.apellidos="Paez";
        darwin.etnia="afro";
        darwin.cedula=1004795717;
        darwin.numTelefono=965297841;
        darwin.horoscopo="Cáncer";
        
        darwin.saludar();
        darwin.saludarEdad(55);
        darwin.horoscopo2();
        
        Persona lucia=new Persona();
        lucia.idPersona=005;
        lucia.nombres="Lucia";
        lucia.apellidos="Poso";
        lucia.etnia="trigueña";
        lucia.cedula=1004795317;
        lucia.numTelefono=965292541;
        lucia.horoscopo="Acuario";
        
        lucia.saludar();
        lucia.saludarEdad(15);
        lucia.horoscopo3();
    }
        
        
}
