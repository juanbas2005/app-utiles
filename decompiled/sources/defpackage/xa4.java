package defpackage;

import java.util.Locale;

/* renamed from: xa4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xa4 {
    public final Locale a;

    public xa4(Locale locale) {
        this.a = locale;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof xa4)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return sg3.e(this.a.toLanguageTag(), ((xa4) obj).a.toLanguageTag());
    }

    public final int hashCode() {
        return this.a.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.a.toLanguageTag();
    }
}
