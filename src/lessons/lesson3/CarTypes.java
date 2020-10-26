package lessons.lesson3;

public enum CarTypes {

    SEDAN("Седан"){
        @Override
        public void describeTheCarType(){
            System.out.println("I'm sedan, I have 4 doors and cool bagagnik");
        }
    },
    HATCHBACK("Хетчбек"){
    @Override
    public void describeTheCarType(){
        System.out.println("I have 2 or 4 doors and not that good bagagnik");

    }}
    ,
    MINIVAN("Минивен"){
        @Override
        public void describeTheCarType(){
            System.out.println("Bitch I'm really big");
        }
    };

    private String ukrainianTranslation;

    CarTypes(String ukrainianTranslation){
        this.ukrainianTranslation = ukrainianTranslation;
    }

    public String getUkrainianTranslation(){
        return ukrainianTranslation;
    }

    public abstract void describeTheCarType();


}
