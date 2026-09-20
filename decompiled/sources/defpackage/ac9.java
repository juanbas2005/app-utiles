package defpackage;

import com.google.android.gms.internal.measurement.zzvr;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: ac9  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ac9 extends tb9 implements sb9 {
    public final Exception C;
    public final boolean D;

    public ac9(String str, sb9 sb9, fc9 fc9, boolean z, ic9 ic9) {
        super("<missing root>:".concat(str), (qb9) sb9, fc9.a(fc9, ec9.f), ic9);
        this.C = sb9.d();
        this.D = z;
    }

    public final jc9 S(String str, fc9 fc9, ic9 ic9) {
        AtomicReference atomicReference = vb9.a;
        return U(str, fc9, true, ic9);
    }

    public final ac9 U(String str, fc9 fc9, boolean z, ic9 ic9) {
        boolean z2 = this.D;
        if (z && !z2) {
            AtomicReference atomicReference = vb9.a;
        }
        boolean z3 = true;
        if ((!z || z2) && !z2) {
            z3 = false;
        }
        return new ac9(str, this, fc9, z3, ic9);
    }

    public final Exception d() {
        return this.C;
    }

    public final fc9 i() {
        return ec9.e;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ac9(UUID uuid, String str, String str2, fc9 fc9, zzvr zzvr, ic9 ic9) {
        super("<missing root>:".concat(str2), uuid, str, fc9.a(fc9, ec9.f), ic9);
        this.C = zzvr;
        this.D = false;
    }
}
