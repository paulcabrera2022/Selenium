package pe.visorweb.calculadora;

import java.util.Scanner;

public class Example3 {

	/*
    public static void main(String[] args) {
    	 
        //Declaramos las variables
        int num1=10;
        int num2=5;
         
        System.out.println("El resultado de la suma es "+(num1+num2));
        System.out.println("El resultado de la resta es "+(num1-num2));
        System.out.println("El resultado de la multiplicación es "+(num1*num2));
        System.out.println("El resultado de la división es "+(num1/num2));
	
    }
	*/
	/*
    public static void main(String[] args) {
    	 
        //Declaramos las variables
        int num1=30;
        int num2=10;
 
        //Hacemos la comprobación
        if (num1>=num2){
            //If anidado
            if(num1==num2){
                System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
            }else{
                System.out.println("El número "+num1+" es mayor que el número "+num2);
            }
        }else{
            System.out.println("El número "+num2+" es mayor que el número "+num1);
        }
    }
	*/
	
	/*
    public static void main(String[] args) {
        
        //Nos aparece un cuadro de dialogo
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce tu nombre");
        String nombre=sc.nextLine();
  
        System.out.println("Bienvenido "+nombre);
    }
     
     */
	
	//Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
	/*
    public static void main(String[] args) {
    	 
        int num=1;
 
        //Definimos el bucle, incluye el 100
        while (num<=100){
            System.out.println(num);
            //Incrementamos num
            num++;
        }
    }
    
    */
   
	//Un Bucle con el FOR
	/*
    public static void main(String[] args) {
    	 
        //Definimos el bucle, incluye el 100
        for (int num=1;num<=100;num++){
            System.out.println(num);
        }
    }
    */
    
	//Divisibles entre 2 y 3
	/*
	  public static void main(String[] args) {
		  
	        int num=1;
	 
	        //Definimos el bucle, incluye el 100
	        while (num<=100){
	            if (num%2==0 || num%3==0){
	                System.out.println(num);
	            }
	            //Incrementamos num
	            num++;
	        }
	    }
	
	  */
	
	//Ventas
	/*
	  public static void main(String[] args) {
		  
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Introduce el número de ventas");
	        int numVentas=sc.nextInt();
	  
	        int sumaVentas=0;
	        for (int i=0;i<numVentas;i++){
	            //indico el numero de venta
	            System.out.println("Introduce el precio de la venta "+(i+1));
	            int venta=sc.nextInt();
	  
	            //Acumulamos el valor de la venta
	            sumaVentas=sumaVentas+venta;
	        }
	  
	        System.out.println(sumaVentas);
	    }
	
      */
	
	
	public static void main(String[] args) {
		  
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Voy a cambiar este mensaje a las 11.50");
        String dia = sc.next();
         
        switch(dia){
            case "lunes":
            case "martes":
            case "miercoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un dia laboral");
                break;
            case "sabado":
            case "domingo":
                System.out.println("Es un dia festivo");
            default:
                System.out.println("Introduce un dia de la semana");
        }
    }
	
	
	
	
    
}
