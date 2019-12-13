package Strategy.Strategies;

import Strategy.Parking;
import Strategy.Place;

public class StrategieGrandeCapacite implements Strategie {

    @Override
    public Place meilleurePlace(Parking pa) {
        Place currplace = pa.getPlaces().get(0);
        for (Place place : pa.getPlaces()) {
            if (place.getCapacite() > currplace.getCapacite() && place.estLibre()) {
                currplace = place;
            }
        }
        return currplace;
    }
}
