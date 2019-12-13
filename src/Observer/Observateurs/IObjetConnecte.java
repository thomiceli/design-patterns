package Observer.Observateurs;

public interface IObjetConnecte {
    void add(Observateur obs);

    void remove(Observateur obs);

    void espionner();
}
