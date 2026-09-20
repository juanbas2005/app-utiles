package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: bx6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class bx6 implements vr2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int w;
    public final /* synthetic */ float x;
    public final /* synthetic */ e06 y;
    public final /* synthetic */ Object z;

    public /* synthetic */ bx6(float f, e06 e06, Object obj, Object obj2, int i) {
        this.w = i;
        this.x = f;
        this.y = e06;
        this.z = obj;
        this.A = obj2;
    }

    public final Object y(Object obj) {
        int i = this.w;
        float f = 0.0f;
        vs7 vs7 = vs7.a;
        Object obj2 = this.A;
        Object obj3 = this.z;
        e06 e06 = this.y;
        float f2 = this.x;
        switch (i) {
            case b85.b:
                eh6 eh6 = (eh6) obj3;
                vr2 vr2 = (vr2) obj2;
                gl glVar = (gl) obj;
                int i2 = (Math.abs(((Number) glVar.e.getValue()).floatValue()) > Math.abs(f2) ? 1 : (Math.abs(((Number) glVar.e.getValue()).floatValue()) == Math.abs(f2) ? 0 : -1));
                ed5 ed5 = glVar.e;
                if (i2 >= 0) {
                    float k = t35.k(((Number) ed5.getValue()).floatValue(), f2);
                    t35.i(glVar, eh6, vr2, k - e06.w);
                    glVar.a();
                    e06.w = k;
                } else {
                    t35.i(glVar, eh6, vr2, ((Number) ed5.getValue()).floatValue() - e06.w);
                    e06.w = ((Number) ed5.getValue()).floatValue();
                }
                return vs7;
            case 1:
                eh6 eh62 = (eh6) obj3;
                vr2 vr22 = (vr2) obj2;
                gl glVar2 = (gl) obj;
                float k2 = t35.k(((Number) glVar2.e.getValue()).floatValue(), f2);
                float f3 = k2 - e06.w;
                try {
                    f = eh62.a(f3);
                } catch (CancellationException unused) {
                    glVar2.a();
                }
                vr22.y(Float.valueOf(f));
                if (Math.abs(f3 - f) > 0.5f || k2 != ((Number) glVar2.e.getValue()).floatValue()) {
                    glVar2.a();
                }
                e06.w += f;
                return vs7;
            default:
                ad adVar = (ad) obj3;
                e06 e062 = (e06) obj2;
                gl glVar3 = (gl) obj;
                ed5 ed52 = glVar3.e;
                if ((((Number) ed52.getValue()).floatValue() >= f2 || e06.w <= f2) && (((Number) ed52.getValue()).floatValue() <= f2 || e06.w >= f2)) {
                    adVar.a(((Number) ed52.getValue()).floatValue(), ((Number) glVar3.b()).floatValue());
                    e062.w = ((Number) glVar3.b()).floatValue();
                    e06.w = ((Number) ed52.getValue()).floatValue();
                } else {
                    float floatValue = ((Number) ed52.getValue()).floatValue();
                    if (f2 == 0.0f) {
                        f2 = 0.0f;
                    } else if (f2 <= 0.0f ? floatValue >= f2 : floatValue <= f2) {
                        f2 = floatValue;
                    }
                    adVar.a(f2, ((Number) glVar3.b()).floatValue());
                    if (!Float.isNaN(((Number) glVar3.b()).floatValue())) {
                        f = ((Number) glVar3.b()).floatValue();
                    }
                    e062.w = f;
                    e06.w = f2;
                    glVar3.a();
                }
                return vs7;
        }
    }
}
