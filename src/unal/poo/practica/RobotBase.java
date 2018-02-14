package unal.poo.practica;

import becker.robots.*;

/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        public static Robot estudiante;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");
	    objetos.showThingCounts(true);
            
            //Direction.NORTH, EAST, SOUTH, WEST
            //Definicion de la ubicacion del robot, Ciudad, posicion, Direccion, Numero things en el bolso.
            estudiante = new Robot(objetos,1, 2, Direction.SOUTH,10);
            
	    //Mover una interseccion en el sentido al cual este apuntando el objeto.
          /*  
            EJERCICIO 1
            
            estudiante.move ();
            
            //Girar a la izquierda
            estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
            
            
          
            estudiante.move ();
            estudiante.move ();
            estudiante.move ();
        
            
             estudiante.turnLeft();
              estudiante.turnLeft();
               estudiante.turnLeft();
               
               
               
               estudiante.move ();
                estudiante.move ();
                 estudiante.move ();
                 
                 
                 
                 estudiante.turnLeft();
                 estudiante.turnLeft();
                 estudiante.turnLeft();
                 
                 
                 
                 estudiante.move ();
                 estudiante.move ();
                 estudiante.move ();
                 
                  estudiante.turnLeft();
                 estudiante.turnLeft();
                 estudiante.turnLeft();
                 
                 
                 estudiante.move ();
                 estudiante.move ();
                 estudiante.move ();
                 
                 
    */
          estudiante.turnLeft();
            estudiante.turnLeft();
            estudiante.turnLeft();
          
          estudiante.move();
          
          estudiante.turnLeft();
          
          estudiante.move();
          
          estudiante.turnLeft();
          
          estudiante.move();
          
          
          
          
          
            //Tomando decisiones, Si puedo tomar un Thing
            boolean puedeTomar = estudiante.canPickThing();
            
            //Tomar un Thing
            if(puedeTomar == true)
               estudiante.pickThing();
            
            //Especifica el numero de Thing que tiene en robot en el bolso
            //int numeroThings = estudiante.countThingsInBackpack();
            
             
            giro(2);
            
            estudiante.move();
            
            giro(3);
            
            estudiante.move();
            
            
            giro(3);
                       
            //Si el frente esta libre de Wall
            //estudiante.frontIsClear();
            
            //Invocando una funcion
            creacionFuncion(1);
            
            giro(3);
            
            
            
            
            
            
	}
        
        public static void creacionFuncion(int parametroEntrada){
            for (int i = 0; i < 1; i++) 
                estudiante.move();
        }
        
        public static void giro(int num_giros){
            
        for(int j=0; j<num_giros;j++)    
        estudiante.turnLeft();
        }
}

