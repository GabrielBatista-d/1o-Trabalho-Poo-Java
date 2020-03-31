package atv1;
public class Robo {
    protected int x, y;
    protected String cor;
    //private int ax, ay;
    public Robo(String cor){
        x = 0;
        y = 0;
        this.cor = cor;
    }
    
    public boolean mover(String movimento){
        if(movimento == "up"){
            setY(getY()+1);
        }
        if(movimento == "down"){
            setY(getY()-1);
        }
        if(movimento == "right"){
            setX(getX()+1);
        }
        if(movimento == "left"){
            setX(getX()-1);
        }
            try{
                if(x < 0){
                    setX(0);
                    System.out.println("Movimento de X foi invalido");
                    throw new MovimentoInvalidoException(x);
                }
                if(y < 0){
                    setY(0);
                    System.out.println("Movimento de Y foi invalido");
                    throw new MovimentoInvalidoException(y);
                }
            }
            catch(MovimentoInvalidoException e){
                System.out.println("Ac um erro!");
                e.printStackTrace();
            }
           
            System.out.println("O robo "+this.cor+" andou para(X:"+x+",Y:"+y+")");
            return true;
    }
    
    public boolean mover(int m){
        if(m == 1){
            setY(getY()+1);
        }
        if(m == 2){
            setY(getY()-1);
        }
        if(m == 3){
            setX(getX()+1);
        }
        if(m == 4){
            setX(getX()-1);
        }
         try{
                if(x < 0){
                    setX(0);
                    System.out.println("Movimento de X invalido");
                    throw new MovimentoInvalidoException(x);
                }
                if(y < 0){
                    setY(0);
                    System.out.println("Movimento de Y invalido");
                    throw new MovimentoInvalidoException(y);
                }
            }
            catch(MovimentoInvalidoException e){
                System.out.println("Aconteceu um erro!");
                e.printStackTrace();
            }
        finally{
            System.out.println("O robo "+this.cor+" andou para("+x+","+y+")");
        }
            return true;
    }
    
    public boolean encontrou(int ax, int ay){
        if(getX() == ax && getY() == ay){
            System.out.println("====================================");
            System.out.println("O robô ("+this.cor+") achou a comida");
            System.out.println("====================================");
            return true;
        }else{
            return false;
        }
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
