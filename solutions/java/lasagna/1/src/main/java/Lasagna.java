public class Lasagna {
    int expectedMinutesInOven = 40;
    int remainingMinutesInOven;
    int preparationTimeInMinutes;
    // TODO: define the 'expectedMinutesInOven()' method
    public int expectedMinutesInOven() {
        // System.out.println("minutes in oven is:" + minutesInOven);
        Lasagna lasagna = new Lasagna();
        return lasagna.expectedMinutesInOven;
    }
    
    // TODO: define the 'remainingMinutesInOven()' method
    public int remainingMinutesInOven(int actualMinutes) {
        Lasagna lasagna = new Lasagna();
        return (lasagna.expectedMinutesInOven - actualMinutes);
        
    }

    // TODO: define the 'preparationTimeInMinutes()' method
    public int preparationTimeInMinutes(int amountLayers) {
        return (2 * amountLayers);        
    }

    // TODO: define the 'totalTimeInMinutes()' method
    public int totalTimeInMinutes(int amountLayers, int actualMinutes){
        Lasagna lasagna = new Lasagna();
        preparationTimeInMinutes = lasagna.preparationTimeInMinutes(amountLayers);
        return (preparationTimeInMinutes + actualMinutes);
    }
}
