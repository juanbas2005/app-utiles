package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.view.textclassifier.TextClassification;
import io.ktor.http.Url;
import java.util.List;

/* renamed from: n17  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class n17 implements sr2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    public /* synthetic */ n17(fg7 fg7, ul ulVar, hj hjVar) {
        this.w = 4;
        this.x = ulVar;
        this.y = hjVar;
    }

    public final Object b() {
        int i;
        long j;
        cg7 d;
        u44 u44;
        vl vlVar;
        int i2 = this.w;
        int i3 = 0;
        vs7 vs7 = vs7.a;
        Object obj = this.y;
        Object obj2 = this.x;
        switch (i2) {
            case b85.b:
                ((aq4) obj).setValue((r11) obj2);
                return vs7;
            case 1:
                Context context = (Context) obj2;
                TextClassification textClassification = (TextClassification) obj;
                String l = textClassification.getText();
                if (l != null) {
                    i3 = l.hashCode();
                }
                j45.p(PendingIntent.getActivity(context, i3, textClassification.getIntent(), 201326592));
                return vs7;
            case 2:
                ar7.H((o81) obj2, (e81) null, r81.z, new gw6((vr2) obj, (f61) null, 5), 1);
                return vs7;
            case 3:
                ze7 ze7 = (ze7) obj2;
                long j2 = ((we3) ((aq4) obj).getValue()).a;
                l35 i4 = ze7.i();
                long j3 = 9205357640488583168L;
                if (i4 != null) {
                    long j4 = i4.a;
                    vl m = ze7.m();
                    if (!(m == null || m.x.length() == 0)) {
                        cy2 cy2 = (cy2) ze7.r.getValue();
                        if (cy2 == null) {
                            i = -1;
                        } else {
                            i = bf7.a[cy2.ordinal()];
                        }
                        if (i != -1) {
                            if (i == 1 || i == 2) {
                                long j5 = ze7.n().b;
                                int i5 = lg7.c;
                                j = j5 >> 32;
                            } else if (i == 3) {
                                long j6 = ze7.n().b;
                                int i6 = lg7.c;
                                j = j6 & 4294967295L;
                            } else {
                                h.c();
                                return null;
                            }
                            int i7 = (int) j;
                            u44 u442 = ze7.d;
                            if (!(u442 == null || (d = u442.d()) == null || (u44 = ze7.d) == null || (vlVar = u44.a.a) == null)) {
                                int p = z65.p(ze7.b.p(i7), 0, vlVar.x.length());
                                float intBitsToFloat = Float.intBitsToFloat((int) (d.d(j4) >> 32));
                                bg7 bg7 = d.a;
                                pn4 pn4 = bg7.b;
                                int d2 = pn4.d(p);
                                float e = bg7.e(d2);
                                float f = bg7.f(d2);
                                float o = z65.o(intBitsToFloat, Math.min(e, f), Math.max(e, f));
                                if (we3.a(j2, 0) || Math.abs(intBitsToFloat - o) <= ((float) (((int) (j2 >> 32)) / 2))) {
                                    float f2 = pn4.f(d2);
                                    j3 = (((long) Float.floatToRawIntBits(o)) << 32) | (((long) Float.floatToRawIntBits(((pn4.b(d2) - f2) / 2.0f) + f2)) & 4294967295L);
                                }
                            }
                        }
                    }
                }
                return new l35(j3);
            case 4:
                hj hjVar = (hj) obj;
                b74 b74 = (b74) ((ul) obj2).a;
                if (b74 instanceof a74) {
                    try {
                        hjVar.a(((a74) b74).a);
                    } catch (IllegalArgumentException unused) {
                    }
                }
                return vs7;
            case 5:
                return Url.encodedPath_delegate$lambda$0((List) obj2, (Url) obj);
            default:
                ((n98) ((ay4) obj2).x).b((l8) obj);
                return vs7;
        }
    }

    public /* synthetic */ n17(int i, Object obj, Object obj2) {
        this.w = i;
        this.x = obj;
        this.y = obj2;
    }
}
