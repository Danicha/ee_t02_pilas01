package ee_t02_pilas01;

public class Pilas {
	   private String [] pila;
	   private Integer tama�o,tope;
	  
	public Pilas(Integer tama�o){
	   pila=new String[tama�o];
	   tope=-1;
	   this.tama�o=tama�o;

	}   

	public void push(String dato){
	   if(tope<tama�o-1){
	     tope=tope+1;
	     pila[tope]=dato;
	   }else{
	       System.out.println("Pila Llena");
	           
	   }
	}

	public String pop(){
	   String resultado=null;
	   if(tope>-1){
	   resultado=pila[tope];
	   tope=tope-1;
	   }else{
	       System.out.println("Pila Vacia");
	   } 
	   return resultado;
	   
	}

	public String peek(){
	   String resultado=null;
	   if(tope>-1){
	   resultado=pila[tope];
	   }else{
	       System.out.println("Pila vacia");
	   }
	   return resultado;

	}

	public boolean isEmpty(){
	    boolean flag=false;
	    if(tope==-1)
	     flag=true;
	    else
	       flag=false;
	    
	    return flag;
	    

	}

	}


