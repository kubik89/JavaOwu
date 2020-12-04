package lection4.classWork;

import lection3.lection.Paintable;

public enum CarType implements Paintable {
    SEDAN("Седан") {
        @Override
        public void paint() {
            System.out.println(this.getUkrTranslation() + " was painted");
        }
    },
    UNIVERSAL("Універсал") {
        @Override
        public void paint() {
            System.out.println(this.getUkrTranslation() + " was painted");
        }
    },
    HATCHBACK("Хетчбек") {
        @Override
        public void paint() {
            System.out.println(this.getUkrTranslation() + " was painted");
        }
    };

    private String ukrTranslation;

    private CarType (String ukrainiantranslation) {
        this.ukrTranslation = ukrainiantranslation;
    }

    public String getUkrTranslation() {
        return ukrTranslation;
    }

    @Override
    public abstract void paint();
}
