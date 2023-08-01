package Batalha;



public class Campo {
   private char simbolo;
   private boolean hasNavio;
   private boolean marcado;

    public Campo(char simbolo, boolean hasNavio) {
        this.simbolo = simbolo;
        this.hasNavio = hasNavio;
    }

    
    public char getSimbolo() {
        return simbolo;
    }

    public boolean isHasNavio() {
        return hasNavio;
    }

    public boolean isMarcado() {
        return marcado;
    }

    
    
    
    
    public void setHasNavio(boolean hasNavio) {
        this.hasNavio = hasNavio;
    }
    
    public void setSimbolo(char simbolo) {
        this.simbolo = simbolo;
    }

    public void setMarcado(boolean marcado) {
        this.marcado = marcado;
    }

 
   
   
   
}
