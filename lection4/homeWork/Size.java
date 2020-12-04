package lection4.homeWork;

public enum Size {
    XXS (42){
        @Override
        public void getDescription() {
            System.out.println("This size is " + euroSize);
        }
    }, XS (40) {
        @Override
        public void getDescription() {
            System.out.println("This size is " + euroSize);
        }
    }, S (38) {
        @Override
        public void getDescription() {
            System.out.println("This size is " + euroSize);
        }
    }, M (36) {
        @Override
        public void getDescription() {
            System.out.println("This size is " + euroSize);
        }
    }, L (34) {
        @Override
        public void getDescription() {
            System.out.println("This size is " + euroSize);
        }
    };

    int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public abstract void getDescription();
}
