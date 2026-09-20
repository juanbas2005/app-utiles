package defpackage;

import java.util.Arrays;

/* renamed from: ec7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ec7 implements ym {
    public static final ec7 x = new ec7((String) null);
    public final String w;

    public /* synthetic */ ec7(String str) {
        this.w = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ec7)) {
            return false;
        }
        return b35.j(this.w, ((ec7) obj).w);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.w});
    }
}
