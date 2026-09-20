package defpackage;

import android.os.Build;
import androidx.core.widget.NestedScrollView;

/* renamed from: ah6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ah6 {
    public final zg6 a;

    public ah6(NestedScrollView nestedScrollView) {
        if (Build.VERSION.SDK_INT >= 35) {
            this.a = new yg6(nestedScrollView);
        } else {
            this.a = new tz2(9);
        }
    }
}
