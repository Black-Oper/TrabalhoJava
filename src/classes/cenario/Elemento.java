package classes.cenario;

public class Elemento {

    private String sprite;
    private int key; // KEY SERIA PARA IDENTIFICAR A COR DE CADA ELEMENTO
    //TODAS AS CLASSES DE CENARIO SÃO FILHAS DE OBJETOS, OBJETOS É FILHA DE ELEMENTO
    public String getSprite() {
        return this.sprite;
    }

    public int getPosx() {
        throw new UnsupportedOperationException("Unimplemented method 'getPosx'");
    }

    public int getPosy() {
        throw new UnsupportedOperationException("Unimplemented method 'getPosy'");
    }

    public boolean isAndavel() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isAndavel'");
    }


    public int getKey() { //vai retornar a key para verificar a cor do cenario!
        return 0;
    }

}
