package Strategy.Strategies;

import Strategy.Parking;
import Strategy.Place;

public class StrategiePetitCout implements Strategie {

    @Override
    public Place meilleurePlace(Parking pa) {
        Place currplace = pa.getPlaces().get(0);
        for (Place place : pa.getPlaces()) {
            if (place.getCoutJour() < currplace.getCoutJour() && place.estLibre()) {
                currplace = place;
            }
        }
        return currplace;
    }
}
