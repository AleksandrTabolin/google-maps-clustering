package net.sharewire.googlemapsclustering;

import android.support.annotation.NonNull;

import com.google.android.gms.maps.model.Marker;

public class MarkerState {

    private final Marker marker;
    private boolean isDirty;

    public MarkerState(@NonNull Marker marker, boolean isDirty) {
        this.marker = marker;
        this.isDirty = isDirty;
    }

    public MarkerState(@NonNull Marker marker) {
        this(marker, false);
    }

    @NonNull
    public Marker getMarker() {
        return marker;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MarkerState that = (MarkerState) o;

        if (isDirty != that.isDirty) return false;
        return marker.equals(that.marker);
    }

    @Override
    public int hashCode() {
        int result = marker.hashCode();
        result = 31 * result + (isDirty ? 1 : 0);
        return result;
    }
}
