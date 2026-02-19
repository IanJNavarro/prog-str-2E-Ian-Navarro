public class Main {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Botas");
        Perro perro1 = new Perro("Max");

        gato1.comer();
        gato1.hacerSonido();

        System.out.println("-------------------");

        perro1.comer();
        perro1.hacerSonido();

        Animal[] animals = new Animal[3];

        animals[0] = new Perro("Solovino");
        animals[1] = new Gato("michi");
        animals[2] = new Animal("Tobi");

        for (Animal animal : animals){
            System.out.println("---------------");
            animal.comer();
            animal.hacerSonido();
        }

        Animal animal1 = new Perro("Maximilian Pegasus");
        // animal1.marcarTerritorio() no es posible si no se ha
        // Perro perro1 = (animal1)perro1;
    }
}