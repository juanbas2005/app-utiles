package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* renamed from: w56  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w56 {
    public final Resources a;
    public final Resources.Theme b;

    public w56(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && w56.class == obj.getClass()) {
            w56 w56 = (w56) obj;
            if (!this.a.equals(w56.a) || !Objects.equals(this.b, w56.b)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(new Object[]{this.a, this.b});
    }
}
