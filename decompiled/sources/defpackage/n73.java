package defpackage;

import io.github.jan.supabase.auth.providers.IDTokenProvider;

/* renamed from: n73  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n73 implements zr3 {
    public final Object deserialize(ok1 ok1) {
        throw new UnsupportedOperationException();
    }

    public final ll6 getDescriptor() {
        return IDTokenProvider.descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        IDTokenProvider iDTokenProvider = (IDTokenProvider) obj;
        iDTokenProvider.getClass();
        j42.D(iDTokenProvider.getName());
    }

    public final zr3 serializer() {
        return IDTokenProvider.Companion;
    }
}
