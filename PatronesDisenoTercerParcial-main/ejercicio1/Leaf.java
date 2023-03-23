package ejercicio1;

public class Leaf {
    public class Leaf {
        public Leaf(String attribute1, String attribute2) {
            super(attribute1, attribute2);
        }

        public void operation() {
            System.out.println("Leaf > attribute1: " + this.getAttribute1());
            System.out.println("Leaf > attribute2: " + this.getAttribute2());
        }

        public void add(Component composite) {
            System.out.println("Este es el objeto simple no puede agregar a otros");
        }

        public void remove(Component composite) {
            System.out.println("Este es el objeto simple no puede agregar a otros");
        }

        public Component get(int position) {
            System.out.println("Este es el objeto simple no puede agregar a otros");
            return null;
        }
    }

}
