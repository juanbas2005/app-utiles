package defpackage;

import java.util.List;

/* renamed from: js3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class js3 implements as3 {
    public final as3 w;

    public js3(as3 as3) {
        as3.getClass();
        this.w = as3;
    }

    public final List I() {
        return this.w.I();
    }

    public final vq3 J() {
        return this.w.J();
    }

    public final boolean equals(Object obj) {
        js3 js3;
        as3 as3;
        as3 as32;
        if (obj == null) {
            return false;
        }
        vq3 vq3 = null;
        if (obj instanceof js3) {
            js3 = (js3) obj;
        } else {
            js3 = null;
        }
        if (js3 != null) {
            as3 = js3.w;
        } else {
            as3 = null;
        }
        as3 as33 = this.w;
        if (!sg3.e(as33, as3)) {
            return false;
        }
        vq3 J = as33.J();
        if (J instanceof gq3) {
            if (obj instanceof as3) {
                as32 = (as3) obj;
            } else {
                as32 = null;
            }
            if (as32 != null) {
                vq3 = as32.J();
            }
            if (vq3 != null && (vq3 instanceof gq3)) {
                return kl8.u((gq3) J).equals(kl8.u((gq3) vq3));
            }
        }
        return false;
    }

    public final List getAnnotations() {
        return this.w.getAnnotations();
    }

    public final int hashCode() {
        return this.w.hashCode();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.w;
    }

    public final boolean v() {
        return this.w.v();
    }
}
