package defpackage;

import io.github.jan.supabase.auth.providers.builtin.Phone$Channel;

/* renamed from: ng5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ng5 implements zr3 {
    public final Object deserialize(ok1 ok1) {
        for (Phone$Channel phone$Channel : Phone$Channel.getEntries()) {
            if (sg3.e(phone$Channel.getValue(), ok1.t())) {
                return phone$Channel;
            }
        }
        kj6.i("Collection contains no element matching the predicate.");
        return null;
    }

    public final ll6 getDescriptor() {
        return Phone$Channel.descriptor;
    }

    public final void serialize(j42 j42, Object obj) {
        Phone$Channel phone$Channel = (Phone$Channel) obj;
        phone$Channel.getClass();
        j42.D(phone$Channel.getValue());
    }

    public final zr3 serializer() {
        return Phone$Channel.Companion;
    }
}
