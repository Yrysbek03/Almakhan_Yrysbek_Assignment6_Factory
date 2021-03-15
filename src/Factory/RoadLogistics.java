package Factory;

import Entity.Transport;
import Entity.Trunk;

public class RoadLogistics extends Logistics {
    @Override
    Transport createTransport() {
        return new Trunk();
    }
}
