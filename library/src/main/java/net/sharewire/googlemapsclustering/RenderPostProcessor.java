package net.sharewire.googlemapsclustering;

import com.google.android.gms.maps.model.Marker;

import io.reactivex.annotations.NonNull;

public interface RenderPostProcessor<T extends ClusterItem> {

    boolean postProcess(@NonNull Marker marker, @NonNull Cluster<T> cluster);
}
