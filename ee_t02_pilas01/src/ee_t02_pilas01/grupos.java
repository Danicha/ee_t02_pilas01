package ee_t02_pilas01;
import java.io.*;
public class grupos {
	
	
	
	    
	  Pilas miPila;
	  Integer tamaño;
	  
	 
	    public void leerArchivo()throws FileNotFoundException,IOException{ 
	        File file=new File("Archivo.txt");  
	        FileReader archivo =new FileReader(file);
	        BufferedReader input=new BufferedReader(archivo);
	        String entrada="";
	        tamaño=Integer.parseInt(input.readLine());
	       
	        while((entrada=input.readLine())!=null){
	        this.balanceada(entrada);
	        }
	    }
	    
	    public void balanceada(String cadena){
	        boolean flag=true;
	        String caracter;
	        miPila=new Pilas(tamaño*100);
	        while(cadena.length()!=0&& flag){
	           caracter=cadena.substring(0, 1);
	             cadena=cadena.substring(1, cadena.length());
	           
	           if(caracter.equals("{")||caracter.equals("[")||caracter.equals("(")){ 
	                 miPila.push(caracter);
	           }else{
	            if(miPila.isEmpty()){
	                 flag=false;
	           }else{
	            String aux=miPila.pop();
	               
	            if(aux.equals("(")&& caracter.equals(")")){  
	                  flag=true;
	           }else{
	            if(aux.equals("[")&& caracter.equals("]")){  
	                  flag=true;
	           }else{
	            if(aux.equals("{")&& caracter.equals("}")){  
	                  flag=true;
	           }else{
	                  flag=false;
	             }
	            }
	           }
	          }
	         }
	        }
	        
	        if(flag){
	            System.out.println("SI");
	        }else{
	            System.out.println("NO");
	        }
	}
	    
	    
	    
	    public static void main(String[]args)throws FileNotFoundException,IOException{
	      grupos agru=new grupos();
	      agru.leerArchivo();
	    }
	

}
