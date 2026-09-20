package defpackage;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* renamed from: dt1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dt1 extends t49 {
    public final /* synthetic */ int f;
    public final /* synthetic */ AbstractCollection g;

    public /* synthetic */ dt1(AbstractCollection abstractCollection, int i) {
        this.f = i;
        this.g = abstractCollection;
    }

    public static /* synthetic */ void h0(int i) {
        Object[] objArr = new Object[3];
        if (i == 1) {
            objArr[0] = "fromSuper";
        } else if (i != 2) {
            objArr[0] = "fakeOverride";
        } else {
            objArr[0] = "fromCurrent";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
        if (i == 1 || i == 2) {
            objArr[2] = "conflict";
        } else {
            objArr[2] = "addFakeOverride";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public final void o(ri0 ri0) {
        int i = this.f;
        AbstractCollection abstractCollection = this.g;
        switch (i) {
            case b85.b:
                ri0.getClass();
                h95.r(ri0, (vr2) null);
                ((ArrayList) abstractCollection).add(ri0);
                return;
            default:
                if (ri0 != null) {
                    h95.r(ri0, (vr2) null);
                    ((LinkedHashSet) abstractCollection).add(ri0);
                    return;
                }
                h0(0);
                throw null;
        }
    }

    public final void z(ri0 ri0, ri0 ri02) {
        switch (this.f) {
            case b85.b:
                ri02.getClass();
                if (ri02 instanceof zs2) {
                    ((zs2) ri02).m1(jt1.a, ri0);
                    return;
                }
                return;
            default:
                if (ri02 == null) {
                    h0(2);
                    throw null;
                }
                return;
        }
    }
}
