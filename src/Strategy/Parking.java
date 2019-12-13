package Strategy;

import Strategy.Strategies.Strategie;

import java.util.ArrayList;

public class Parking {
    private ArrayList<Place> places;

    public Parking() {
        places = new ArrayList<Place>();
    }

    public void ajouter(Place place) {
        places.add(place);
    }

    public ArrayList<Place> getPlaces() {
        return places;
    }

    public void garerVehicule(Vehicule v, Strategie s) {
        Place place = s.meilleurePlace(this);
        place.affecterVehicule(v);

    }
}
