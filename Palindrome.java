import java.util.Scanner;

/**
Escribe un programa que pida una cadena al usuario y que revise si esta es un palindromo o no y terminar.

Un palindromo significa que los caracteres de la cadena son los mismos al leer hacia adelante o hace atras.
Debes ignorar los espacios, los acentos, puntuaciones y mayusculas y minusculas.

Ejemplos de palindromos:
Amor a Roma
Bob
Somos o no somos
Acaso hubo buhos aca.
Ana, la tacana catalana
racecar
was it a car or a cat I saw
never odd or even
rats live on no evil star

El programa debe imprimir true si es un palindromo y false si no lo es.
*/
class Palindrome {
  public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.print("In:");
    String s = inp.nextLine();
   	//write your code below
     String cadena="";
     String unionCadena1="";
     String unionCadena2="";

     // quitar los espacios de la cadena
      String[] cadena1 = s.split(" ");

     for(int i=0; i< cadena1.length; i++){
       if(cadena1[i].substring(i, i+1).equals(cadena1[i].substring(i, i+1).toUpperCase())){
         unionCadena1+=cadena1[i].substring(i, i+1).toLowerCase();
       }else{
         unionCadena1+=cadena1[i];
       }
     }

   	for(int j=s.length()-1;j>= 0; j--){
       if((s.substring(j, j+1).equals("á"))){
         cadena+=s.replace("á", "a");
       }else if(s.substring(j, j+1).equals("é")){
         cadena+=s.replace("é", "e");
       }else if(s.substring(j, j+1).equals("í")){
         cadena+=s.replace("í", "i");
       }else if(s.substring(j, j+1).equals("ó")){
         cadena+=s.replace("ó", "o");
       }else if(s.substring(j, j+1).equals("ú")){
         cadena+=s.replace("ú", "u");
       }else if(s.substring(j, j+1).equals(s.toUpperCase())){

         cadena+=s.substring(j, j+1).toLowerCase();
       }else{
         cadena+=s.substring(j, j+1);
       }
     }
     String[] cadena2 = cadena.split(" ");
      
     for(int i=0; i< cadena2.length; i++){
       if(cadena2[i].substring(i, i+1).equals(cadena2[i].substring(i, i+1).toUpperCase())){
         unionCadena2+=cadena2[i].substring(i, i+1).toLowerCase();
       }else{
         unionCadena2+=cadena2[i];
       }
     }
     if(unionCadena2.equals(unionCadena1)){
       System.out.println("true");
     }else{
       System.out.println("false");
     }
  }
}
