package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;

/* renamed from: zu4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zu4 extends bv4 {
    public final Class q;

    public zu4(Class cls) {
        super(true);
        if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            rf2.p(cls, " does not implement Parcelable or Serializable.");
            throw null;
        }
    }

    public final Object a(String str, Bundle bundle) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    public final String b() {
        return this.q.getName();
    }

    public final Object c(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.q.cast(obj);
        if (obj == null || (obj instanceof Parcelable)) {
            bundle.putParcelable(str, (Parcelable) obj);
        } else if (obj instanceof Serializable) {
            bundle.putSerializable(str, (Serializable) obj);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !zu4.class.equals(obj.getClass())) {
            return false;
        }
        return sg3.e(this.q, ((zu4) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}
