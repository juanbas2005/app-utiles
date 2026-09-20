package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;

/* renamed from: h70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h70 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public /* synthetic */ boolean B;
    public final /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h70(Object obj, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.C = obj;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                ((h70) o(f61, bool)).s(vs7);
                return vs7;
            case 1:
                ((h70) o(f61, bool)).s(vs7);
                return vs7;
            case 2:
                ((h70) o(f61, bool)).s(vs7);
                return vs7;
            case 3:
                ((h70) o(f61, bool)).s(vs7);
                return vs7;
            default:
                ((h70) o(f61, bool)).s(vs7);
                return vs7;
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.C;
        switch (i) {
            case b85.b:
                h70 h70 = new h70((ek7) obj2, f61, 0);
                h70.B = ((Boolean) obj).booleanValue();
                return h70;
            case 1:
                h70 h702 = new h70((rz6) obj2, f61, 1);
                h702.B = ((Boolean) obj).booleanValue();
                return h702;
            case 2:
                h70 h703 = new h70((Context) obj2, f61, 2);
                h703.B = ((Boolean) obj).booleanValue();
                return h703;
            case 3:
                h70 h704 = new h70((my7) obj2, f61, 3);
                h704.B = ((Boolean) obj).booleanValue();
                return h704;
            default:
                h70 h705 = new h70((e88) obj2, f61, 4);
                h705.B = ((Boolean) obj).booleanValue();
                return h705;
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object value;
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj3 = this.C;
        switch (i) {
            case b85.b:
                o85.q(obj);
                if (!this.B) {
                    ((ek7) obj3).a();
                }
                return vs7;
            case 1:
                boolean z = this.B;
                o85.q(obj);
                rz6 rz6 = (rz6) obj3;
                if (z) {
                    ConnectivityManager connectivityManager = rz6.d;
                    if (connectivityManager != null && !rz6.h) {
                        try {
                            connectivityManager.registerNetworkCallback(rz6.e, rz6.g);
                            obj2 = vs7;
                        } catch (Throwable th) {
                            obj2 = new m66(th);
                        }
                        if (!(obj2 instanceof m66)) {
                            vs7 vs72 = (vs7) obj2;
                            rz6.h = true;
                            rz6.a();
                        }
                    }
                } else {
                    ConnectivityManager connectivityManager2 = rz6.d;
                    if (connectivityManager2 != null && rz6.h) {
                        try {
                            connectivityManager2.unregisterNetworkCallback(rz6.g);
                        } catch (Throwable unused) {
                        }
                        rz6.f.clear();
                        rz6.h = false;
                    }
                }
                return vs7;
            case 2:
                o85.q(obj);
                ca5.a((Context) obj3, RescheduleReceiver.class, this.B);
                return vs7;
            case 3:
                boolean z2 = this.B;
                o85.q(obj);
                my7 my7 = (my7) obj3;
                if (z2) {
                    my7.a();
                } else {
                    my7.b();
                }
                return vs7;
            default:
                boolean z3 = this.B;
                o85.q(obj);
                d37 d37 = ((e88) obj3).c;
                do {
                    value = d37.getValue();
                } while (!d37.i(value, new is7(6, w78.a((w78) ((is7) value).a, (String) null, (String) null, (String) null, z3, 7))));
                return vs7;
        }
    }
}
