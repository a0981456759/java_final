/**
 * TODO: Write a comment describing your class here.
 * @author TODO: Fill in your name, university email, and student number here.
 *
 */


/**
* You should derive all your entities from this class. 
*/
 public abstract class Entity {

    public enum Direction {
        NORTH, SOUTH, EAST, WEST;
    }
    public static void move (Direction direction) throws InvalidLocationException{
        System.out.println("I am moving");
    }

    public static abstract class SpaceEntity extends Entity {
        protected int xPosition;
        protected int yPosition;
        protected char symbol;

        public SpaceEntity(int x, int y, char symbol) {
            this.xPosition = x;
            this.yPosition = y;
            this.symbol = symbol;
        }

  

        // ... other common methods for SpaceEntity...
    }

    public static class SpaceRobot extends SpaceEntity {
        public SpaceRobot(int x, int y) {
            super(x, y, 'Z');
        }

    }

    public static class SpaceRover extends SpaceEntity {
        public SpaceRover(int x, int y) {
            super(x, y, 'X');
        }  // ... logic for moving SpaceRover...
        }

    public static abstract class Vegetation extends Entity {
        protected String name;
        protected char symbol;
        
        // ... other common methods for Vegetation...
    }

    public static class PlantType extends Vegetation {
        public PlantType(String name, char symbol) {
            this.name = name;
            this.symbol = symbol;
        }
        public static class Rose extends PlantType {
            public Rose() {
                super("Rose", 'R');
            }
        }
        public static class Lily extends PlantType {
            public Lily() {
                super("Lily", 'L');
            }
        }
        public static class Eucalyptus extends PlantType{
            public Eucalyptus() {
                super("Eucalyptus", 'E');
            }
        }
        // ... constructor and other methods specific to PlantType...
    }

    public static class VegetableType extends Vegetation {
        public VegetableType(String name, char symbol) {
            this.name = name;
            this.symbol = symbol;
        }
        public static class Potatoes extends VegetableType {
            public Potatoes() {
                super("Potatoes", 'P');
            }
        }
        public static class Tomatoes extends VegetableType {
            public Tomatoes() {
                super("Tomatoes", 'T');
            }
        }
        public static class Onions extends VegetableType {
            public Onions() {
                super("Onions", 'O');
            }
        }
        public static class Apple extends VegetableType {
            public Apple() {
                super("Apple", 'A');
            }
        }
        public static class Banana extends VegetableType {
            public Banana() {
                super("Banana", 'B');
            }
        }
        // ... constructor and other methods specific to VegetableType...
    }

    public static abstract class Animal extends Entity {
        protected String type;
        protected char symbol;
        
        // ... other common methods for Animal...
    }

    public static class EarthAnimal extends Animal {
        private boolean produces;

        public EarthAnimal(String type, char symbol, boolean produces) {
            this.type = type;
            this.symbol = symbol;
            this.produces = produces;
        }

        public boolean produces() {
            return produces;
        }

        public static class Cow extends EarthAnimal {
            public Cow() {
                super("Cow", 'C', true);
            }
        }
        public static class Goat extends EarthAnimal {
            public Goat() {
                super("Goat", 'G', true);
            }
        }
        public static class Sheep extends EarthAnimal {
            public Sheep() {
                super("Sheep", 'S', true);
            }
        }
        public static class Dog extends EarthAnimal{
            public Dog() {
                super("Dog", 'D', false);
            }
            public void guard (){
                System.out.println("I am guarding the farm");
            }
        }
    }

    public static class MartianAnimal extends Animal {
        public MartianAnimal(String type, char symbol) {
            this.type = type;
            this.symbol = symbol;
        }
        public void destoryVegetation(){
            System.out.println("I am destroying vegetation");
        }
        public void hurtEanimal(){
            System.out.println("I am hurting animal");
        }
        public static class Heebie extends MartianAnimal {
            public Heebie() {
                super("Heebie", 'H');
            }
        }
        public static class Jeebie extends MartianAnimal {
            public Jeebie() {
                super("Jeebie", 'J');
            }
        }
    }

    public static class Terrain extends Entity {
        private boolean isMineral;
        private char symbol;

        public Terrain(boolean isMineral) {
            this.isMineral = isMineral;
            this.symbol = isMineral ? '*' : '@';
        }
        
        // ... constructor and other methods for Terrain...
    }

    // If you wish to include exception classes within the Entity class as well, 
    // they would also be static classes, similar to the above.
    public static class InvalidLocationException extends Exception {
        public InvalidLocationException(String message) {
            super(message);
        }
        // ... methods for InvalidLocationException...
    }
    public static class InvalidFileException extends Exception {
        public InvalidFileException(String message) {
            super(message);
        }
    }
    public static class UnknownEntityException  extends Exception {
        public UnknownEntityException(String message) {
            super(message);
        }
    }

}
