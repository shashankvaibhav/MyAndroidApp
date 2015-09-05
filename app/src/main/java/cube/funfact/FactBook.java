package cube.funfact;

import java.util.Random;

public class FactBook {
    String[] mfacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than Horses.",
            "Olympic gold medals are actually made mostly of Silver.",
            "You are born with 300 bones, by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the sun to reaach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England",
            "Some Penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 Days to forma new habit",
            "Mammoths still walked the Earth when the Great Pyramid was being built."
    };

    public String getFact(){
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(mfacts.length);
        String fact = mfacts[randomNumber];
        return fact;
    }
}
