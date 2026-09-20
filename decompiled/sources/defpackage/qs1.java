package defpackage;

import java.util.Collection;
import java.util.LinkedHashSet;

/* renamed from: qs1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qs1 extends t49 {
    public final /* synthetic */ r62 f;
    public final /* synthetic */ LinkedHashSet g;
    public final /* synthetic */ boolean h;

    public qs1(r62 r62, LinkedHashSet linkedHashSet, boolean z) {
        this.f = r62;
        this.g = linkedHashSet;
        this.h = z;
    }

    public static /* synthetic */ void h0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i == 2) {
            objArr[0] = "fromCurrent";
        } else if (i == 3) {
            objArr[0] = "member";
        } else if (i != 4) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "overridden";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else if (i == 3 || i == 4) {
            objArr[2] = "setOverriddenDescriptors";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void b0(ri0 ri0, Collection collection) {
        if (ri0 == null) {
            h0(3);
            throw null;
        } else if (!this.h || ri0.u() == 2) {
            ri0.m0(collection);
        }
    }

    public final void o(ri0 ri0) {
        if (ri0 != null) {
            h95.r(ri0, new b0(14, this));
            this.g.add(ri0);
            return;
        }
        h0(0);
        throw null;
    }

    public final void z(ri0 ri0, ri0 ri02) {
        if (ri02 == null) {
            h0(2);
            throw null;
        }
    }
}
