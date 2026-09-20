package defpackage;

import android.util.Log;
import java.util.Collection;
import java.util.Map;

/* renamed from: vm6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vm6 {
    public static final double f = Math.random();
    public static final /* synthetic */ int g = 0;
    public final oe2 a;
    public final we2 b;
    public final rn6 c;
    public final c72 d;
    public final e81 e;

    public vm6(oe2 oe2, we2 we2, rn6 rn6, c72 c72, e81 e81) {
        oe2.getClass();
        we2.getClass();
        rn6.getClass();
        c72.getClass();
        e81.getClass();
        this.a = oe2;
        this.b = we2;
        this.c = rn6;
        this.d = c72;
        this.e = e81;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0044, code lost:
        if (r6 == r5) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007b, code lost:
        if (r0.b(r1) == r5) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007d, code lost:
        return r5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026  */
    public static final Object a(vm6 vm6, h61 h61) {
        um6 um6;
        int i;
        Iterable<h91> values;
        rn6 rn6 = vm6.c;
        if (h61 instanceof um6) {
            um6 = (um6) h61;
            int i2 = um6.B;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                um6.B = i2 - Integer.MIN_VALUE;
                Object obj = um6.z;
                i = um6.B;
                boolean z = true;
                p81 p81 = p81.w;
                if (i != 0) {
                    o85.q(obj);
                    zf2 zf2 = zf2.a;
                    um6.B = 1;
                    obj = zf2.b(um6);
                } else if (i == 1) {
                    o85.q(obj);
                } else if (i == 2) {
                    o85.q(obj);
                    Boolean a2 = rn6.a.a();
                    if (!(a2 == null && (a2 = rn6.b.a()) == null)) {
                        z = a2.booleanValue();
                    }
                    if (!z) {
                        Log.d("FirebaseSessions", "Sessions SDK disabled through settings API. Events will not be sent.");
                        return Boolean.FALSE;
                    } else if (f <= rn6.a()) {
                        return Boolean.TRUE;
                    } else {
                        Log.d("FirebaseSessions", "Sessions SDK has dropped this session due to sampling.");
                        return Boolean.FALSE;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                values = ((Map) obj).values();
                if (!(values instanceof Collection) || !((Collection) values).isEmpty()) {
                    for (h91 h91 : values) {
                        if (h91.a.a()) {
                            um6.B = 2;
                        }
                    }
                }
                Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
                return Boolean.FALSE;
            }
        }
        um6 = new um6(vm6, h61);
        Object obj2 = um6.z;
        i = um6.B;
        boolean z2 = true;
        p81 p812 = p81.w;
        if (i != 0) {
        }
        values = ((Map) obj2).values();
        while (r6.hasNext()) {
        }
        Log.d("FirebaseSessions", "Sessions SDK disabled through data collection. Events will not be sent.");
        return Boolean.FALSE;
    }
}
