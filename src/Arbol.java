
public class Arbol {
	protected Nodo raiz;
	 
	public Arbol (){
		this.raiz = null;
	}
	 
	public boolean isEmty() {
		return (this.raiz == null);
	}
	

    public void setRaiz(Nodo raiz) {
        this.raiz = raiz;
    }
    
    public void insert( int v) {
    	if (this.raiz == null)
			raiz = new Nodo(v);
		else
			insert(this.raiz,v);
    }
    
	private void insert(Nodo raiz, int v) {
				
			if (v < raiz.getValor())
				if (raiz.getIzq()!=null)
					insert(raiz.getIzq(),v);
				else
					raiz.setIzq(new Nodo(v));
			if (v > raiz.getValor())
				if (raiz.getDer()!=null)
					insert(raiz.getDer(),v);
				else
					raiz.setDer(new Nodo(v));
		
	}	

	
	public boolean hasElem(int dato) {
		return hasElem (this.raiz, dato);
	}
	
	private boolean hasElem (Nodo raiz, int v) {
		if (raiz != null) {
			if (raiz.getValor() == v) {
				return true;
			}
			else if (v < raiz.getValor()) {
				return hasElem(raiz.getIzq(),v);
			}
			else {
				return hasElem (raiz.getDer(),v);
			}
		}
		return false;
	}
	

	
	public void imprimirEnOrden(){
		imprimirEnOrden(this.raiz);
	}

	 private void imprimirEnOrden(Nodo raiz){
	        if (raiz != null) {
	        	imprimirEnOrden(raiz.getIzq());
	            System.out.print( raiz.getValor()+ ", "  );
	            imprimirEnOrden(raiz.getDer());
	        }
	    }
	
} 
	