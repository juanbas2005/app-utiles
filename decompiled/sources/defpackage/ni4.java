package defpackage;

import android.graphics.Bitmap;
import java.util.Map;

/* renamed from: ni4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ni4 {
    public final Bitmap a;
    public final Map b;

    public ni4(Bitmap bitmap, Map map) {
        this.a = bitmap;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni4)) {
            return false;
        }
        ni4 ni4 = (ni4) obj;
        if (!this.a.equals(ni4.a) || !sg3.e(this.b, ni4.b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Value(bitmap=" + this.a + ", extras=" + this.b + ')';
    }
}
