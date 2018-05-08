package net.sharewire.googlemapsclustering;

import com.google.android.gms.maps.model.Marker;

public class DefaultRenderPostProcessor<T extends ClusterItem> implements RenderPostProcessor<T> {

    @Override
    public boolean postProcess(Marker marker, Cluster<T> cluster) {
        return false;
    }
}
