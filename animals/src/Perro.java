public class Perro extends Animal {

    public Perro(String name){
        super(name);
    }

    @Override
    public void hacerSonido(){
        System.out.println(getName() + "Esta ladrando");
    }

    public void marcarTerritorio(){
        System.out.println(getName() + "esta marcando territorio");
    }
}
