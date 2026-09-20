package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import dev.whyoleg.cryptography.serialization.asn1.ObjectIdentifier;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: j5  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class j5 implements vr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ j5(int i) {
        this.w = i;
    }

    public final Object y(Object obj) {
        String str;
        int i = this.w;
        vs7 vs7 = vs7.a;
        switch (i) {
            case b85.b:
                ok6 ok6 = (ok6) obj;
                ml4 ml4 = l5.a;
                return vs7;
            case 1:
                ku7 ku7 = (ku7) obj;
                ku7.getClass();
                ku7.a = n51.a;
                return vs7;
            case 2:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 3:
                nq0 nq0 = (nq0) obj;
                nq0.getClass();
                nq0.b(nq0, "algorithm", ObjectIdentifier.Companion.serializer().getDescriptor(), 12);
                nq0.b(nq0, "parameters", b85.g("Any", pl6.l, new ll6[0]), 12);
                return vs7;
            case 4:
                return Float.valueOf(((Float) obj).floatValue() / 2.0f);
            case 5:
                wk5 wk5 = (wk5) obj;
                return Boolean.TRUE;
            case 6:
                ((Integer) obj).getClass();
                return Float.valueOf(Float.NaN);
            case 7:
                return Boolean.TRUE;
            case 8:
                return Boolean.valueOf(!(((rl) obj) instanceof nc5));
            case 9:
                mk6.i((ok6) obj);
                return vs7;
            case 10:
                CharSequence charSequence = (CharSequence) obj;
                charSequence.getClass();
                return Integer.valueOf(charSequence.length());
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return (mt) obj;
            case 12:
                vy7 vy7 = (vy7) obj;
                vy7.getClass();
                return vy7.a;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                yc4 yc4 = (yc4) obj;
                yc4.c(mp7.x, (float) ((int) (yc4.a().k() >> 32)));
                yc4.c(mp7.w, 0.0f);
                return vs7;
            case 14:
                bg7 bg7 = (bg7) obj;
                int i2 = t60.a;
                return vs7;
            case h75.g:
                vr0 vr0 = (vr0) obj;
                vr0.getClass();
                vr0.a(d63.x, new ca0(3, (f61) null));
                vr0.a(hz2.x, new da0(2, (f61) null, 0));
                return vs7;
            case 16:
                ((wy3) obj).a();
                return vs7;
            case 17:
                if (((Context) ((qy0) obj).g0(ye.b)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return hc0.b;
                }
                fc0.a.getClass();
                return ec0.c;
            case 18:
                mk6.f((ok6) obj, 0);
                return vs7;
            case 19:
                i53 i53 = (i53) obj;
                i53.getClass();
                return Integer.valueOf(i53.a.length());
            case 20:
                ok6 ok62 = (ok6) obj;
                return vs7;
            case 21:
                ln7 ln7 = (ln7) obj;
                ln7.getClass();
                hd5 hd5 = (hd5) ln7;
                hd5.L = false;
                g75.D(hd5);
                return Boolean.FALSE;
            case 22:
                mk6.f((ok6) obj, 1);
                return vs7;
            case 23:
                vr0 vr02 = (vr0) obj;
                vr02.getClass();
                z41 z41 = (z41) vr02.b;
                ArrayList arrayList = z41.b;
                Set set = z41.a;
                vr02.a(td0.O, new b51(vr02, (f61) null, arrayList, set));
                vr02.a(g22.L, new c51(vr02, (f61) null, arrayList, set));
                return vs7;
            case 24:
                y41 y41 = (y41) obj;
                y41.getClass();
                return y41.a.toString();
            case 25:
                return Boolean.valueOf(tf4.B(((Character) obj).charValue()));
            case 26:
                return Boolean.valueOf(tf4.D(((Character) obj).charValue()));
            case 27:
                return Boolean.valueOf(tf4.B(((Character) obj).charValue()));
            case 28:
                xf4 xf4 = (xf4) obj;
                xf4.getClass();
                wf4 wf4 = xf4.c;
                uf4 g = wf4.g(2);
                String str2 = "";
                if (g != null) {
                    str = g.a;
                } else {
                    str = str2;
                }
                uf4 g2 = wf4.g(4);
                if (g2 != null) {
                    str2 = g2.a;
                }
                return new yb5(str, str2);
            default:
                ((yb5) obj).getClass();
                return true;
        }
    }
}
