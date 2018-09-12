package siefech.com.firebaseauthdemo;

import android.location.Location;

import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

@IgnoreExtraProperties
public class User {
    public Location loc;


    public User(){

    }

    public User(Location latlng){

        this.loc = latlng;
    }

}
