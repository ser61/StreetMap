package edu.uagrm.sergio_w.mapsig.interfaces;

import android.location.Location;

/**
 * Created by Sergio_W on 03/10/2017.
 */

public class EMainActivity {
    private Location location;

    public EMainActivity(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }
}
