class Gato extends Animal {
    public Gato(String nombre) {
        super(nombre);
    }

    @Override
    public void hacerSonido() {
        System.out.println("El gato " + getNombre() + " hace: Miau Miau");
    }
}
