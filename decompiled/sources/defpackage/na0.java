package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.List;

/* renamed from: na0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class na0 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ na0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
        this.z = obj3;
        this.A = obj4;
        this.B = obj5;
        this.C = obj6;
    }

    public final Object y(Object obj) {
        boolean z2;
        vs7 vs7;
        int i = this.w;
        vs7 vs72 = vs7.a;
        Object obj2 = this.C;
        Object obj3 = this.B;
        Object obj4 = this.A;
        Object obj5 = this.z;
        Object obj6 = this.y;
        Object obj7 = this.x;
        switch (i) {
            case b85.b:
                l96 l96 = (l96) obj6;
                e06 e06 = (e06) obj5;
                h06 h06 = (h06) obj4;
                eh ehVar = (eh) obj3;
                kc0 kc0 = (kc0) obj2;
                hz1 hz1 = (hz1) obj;
                w57 w57 = (w57) ((o9) obj7).y;
                w57.getClass();
                float floatValue = Float.valueOf(w57.w).floatValue();
                if (floatValue < 0.0f) {
                    floatValue = 0.0f;
                }
                if (2.0f * floatValue > Math.min(Math.abs(l96.b()), Math.abs(l96.a()))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (e06.w == floatValue) {
                    vs7 = vs72;
                } else {
                    ehVar.g();
                    eh.c(ehVar, l96);
                    if (!z2) {
                        eh a = gh.a();
                        vs7 = vs72;
                        eh.c(a, new l96(l96.a + floatValue, l96.b + floatValue, l96.c - floatValue, l96.d - floatValue, sg3.X(floatValue, l96.e), sg3.X(floatValue, l96.f), sg3.X(floatValue, l96.g), sg3.X(floatValue, l96.h)));
                        ehVar.f(ehVar, a, 0);
                    } else {
                        vs7 = vs72;
                    }
                    h06.w = ehVar;
                    e06.w = floatValue;
                }
                Object obj8 = h06.w;
                obj8.getClass();
                hz1.U(hz1, (eh) obj8, kc0, 0.0f, (l57) null, (lt0) null, 60);
                return vs7;
            case 1:
                eh5[] eh5Arr = (eh5[]) obj7;
                List list = (List) obj6;
                oh4 oh4 = (oh4) obj5;
                f06 f06 = (f06) obj4;
                f06 f062 = (f06) obj3;
                ob0 ob0 = (ob0) obj2;
                dh5 dh5 = (dh5) obj;
                int length = eh5Arr.length;
                int i2 = 0;
                int i3 = 0;
                while (i2 < length) {
                    eh5 eh5 = eh5Arr[i2];
                    eh5.getClass();
                    mb0.b(dh5, eh5, (gh4) list.get(i3), oh4.getLayoutDirection(), f06.w, f062.w, ob0.a);
                    i2++;
                    i3++;
                }
                return vs72;
            case 2:
                o81 o81 = (o81) obj7;
                aq4 aq4 = (aq4) obj6;
                Context context = (Context) obj5;
                aq4 aq42 = (aq4) obj4;
                aq4 aq43 = (aq4) obj3;
                aq4 aq44 = (aq4) obj2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    aq4.setValue(Boolean.TRUE);
                    ar7.H(o81, (e81) null, (r81) null, new f7(context, uri, aq42, aq43, aq44, aq4, (f61) null), 3);
                }
                return vs72;
            default:
                bb0.O((Context) obj6, (se4) obj5, (se4) obj4, (aq4) obj3, (aq4) obj2, (vr2) obj7, ((Boolean) obj).booleanValue());
                return vs72;
        }
    }
}
