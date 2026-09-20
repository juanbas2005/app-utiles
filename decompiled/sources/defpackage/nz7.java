package defpackage;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: nz7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nz7 {
    public final zy7 a;
    public final dv7 b;
    public final Map c = sf4.V(new yb5("Recargar Saldo", "*662*CODIGO#"), new yb5("Transferir Saldo", "*234*1*NUMERO*MONTO#"), new yb5("Adelanta Saldo", "*234*2*NUMERO#"));

    public nz7(zy7 zy7, dv7 dv7, h81 h81) {
        zy7.getClass();
        dv7.getClass();
        this.a = zy7;
        this.b = dv7;
        ar7.H(gl0.E(h81), (e81) null, (r81) null, new gw6(this, (f61) null, 12), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x001f  */
    public final Object a(String str, String str2, h61 h61) {
        ez7 ez7;
        int i;
        if (h61 instanceof ez7) {
            ez7 = (ez7) h61;
            int i2 = ez7.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ez7.B = i2 - Integer.MIN_VALUE;
                Object obj = ez7.z;
                i = ez7.B;
                if (i != 0) {
                    o85.q(obj);
                    dv7 dv7 = this.b;
                    ez7.B = 1;
                    Object a2 = ((dy7) dv7).a(str, str2, ez7);
                    p81 p81 = p81.w;
                    if (a2 == p81) {
                        return p81;
                    }
                    return a2;
                } else if (i == 1) {
                    try {
                        o85.q(obj);
                        return obj;
                    } catch (CancellationException e) {
                        throw e;
                    } catch (Exception e2) {
                        return new m66(e2);
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
        }
        ez7 = new ez7(this, h61);
        Object obj2 = ez7.z;
        i = ez7.B;
        if (i != 0) {
        }
    }

    public final c6 b(az7 az7) {
        az7.getClass();
        String str = az7.w;
        zy7 zy7 = this.a;
        zy7.getClass();
        xy7 xy7 = zy7.a;
        xy7.getClass();
        return new c6(gr8.L(t49.E(xy7.a, false, new String[]{"ussd_codes"}, new cb(str, 27)), zy7.b), 26);
    }

    public final c6 c(uy7 uy7) {
        String name = uy7.name();
        zy7 zy7 = this.a;
        zy7.getClass();
        name.getClass();
        xy7 xy7 = zy7.a;
        xy7.getClass();
        return new c6(gr8.L(t49.E(xy7.a, false, new String[]{"ussd_codes"}, new cb(name, 28)), zy7.b), 28);
    }
}
