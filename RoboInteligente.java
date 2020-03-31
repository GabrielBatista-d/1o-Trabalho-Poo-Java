package atv1;
public class RoboInteligente extends Robo{
    public RoboInteligente(String cor) {
        super(cor);
    }
    @Override
    public boolean mover(int m){
        if(m == 1){
            setY(getY()+1);
        }
        if(m==2){
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
                    setX(getX()+1);
                    setX(0);
                    System.out.println("Movimento de X invalido");
                    throw new MovimentoInvalidoException(x);
                }
                if(y < 0){
                    setX(getX()+1);
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
}
    