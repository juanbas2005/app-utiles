package defpackage;

import com.google.android.gms.internal.measurement.zzvr;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zb9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class zb9 extends qb9 implements sb9 {
    public static final zzvr C = new Exception();
    public final Exception B;

    public zb9(UUID uuid, String str, zzvr zzvr, ic9 ic9) {
        super("<missing root>", uuid, str, ic9);
        this.B = zzvr;
    }

    public final jc9 S(String str, fc9 fc9, ic9 ic9) {
        AtomicReference atomicReference = vb9.a;
        return U(str, fc9, true, ic9);
    }

    public final ac9 U(String str, fc9 fc9, boolean z, ic9 ic9) {
        if (z) {
            AtomicReference atomicReference = vb9.a;
        }
        return new ac9(str, this, fc9, z, ic9);
    }

    public final Exception d() {
        return this.B;
    }

    public final fc9 e() {
        return ec9.e;
    }
}
