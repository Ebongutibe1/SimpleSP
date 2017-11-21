package ebongcreative.max.ssp;

import android.support.annotation.NonNull;

/**
 * Created by Max on 9/29/17.
 */

public interface SSP {
    void store(String key, Object toStore);
    @NonNull <T> T get(String key, T defaultObj);
}
