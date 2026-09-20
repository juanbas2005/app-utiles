package defpackage;

/* renamed from: v24  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class v24 implements vr2 {
    public final /* synthetic */ d06 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ float C;
    public final /* synthetic */ f06 D;
    public final /* synthetic */ int E;
    public final /* synthetic */ h06 F;
    public final /* synthetic */ o34 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ float y;
    public final /* synthetic */ e06 z;

    public /* synthetic */ v24(o34 o34, int i, float f, e06 e06, d06 d06, boolean z2, float f2, f06 f06, int i2, h06 h06) {
        this.w = o34;
        this.x = i;
        this.y = f;
        this.z = e06;
        this.A = d06;
        this.B = z2;
        this.C = f2;
        this.D = f06;
        this.E = i2;
        this.F = h06;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r2 > r7) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (r2 < r7) goto L_0x003d;
     */
    public final Object y(Object obj) {
        float floatValue;
        gl glVar = (gl) obj;
        o34 o34 = this.w;
        int i = this.x;
        boolean w2 = pd8.w(o34, i);
        d06 d06 = this.A;
        boolean z2 = this.B;
        vs7 vs7 = vs7.a;
        if (!w2) {
            float f = this.y;
            if (f > 0.0f) {
                floatValue = ((Number) glVar.e.getValue()).floatValue();
            } else {
                floatValue = ((Number) glVar.e.getValue()).floatValue();
            }
            f = floatValue;
            e06 e06 = this.z;
            float f2 = f - e06.w;
            float a = o34.a(f2);
            if (!pd8.w(o34, i) && !pd8.f(z2, o34, i)) {
                if (f2 == a) {
                    e06.w += f2;
                    float f3 = this.C;
                    if (z2) {
                        if (((Number) glVar.e.getValue()).floatValue() > f3) {
                            glVar.a();
                        }
                    } else if (((Number) glVar.e.getValue()).floatValue() < (-f3)) {
                        glVar.a();
                    }
                    int i2 = this.D.w;
                    int i3 = this.E;
                    if (z2) {
                        if (i2 >= 2 && i - o34.e() > i3) {
                            o34.f(i - i3);
                        }
                    } else if (i2 >= 2 && o34.c() - i > i3) {
                        o34.f(i3 + i);
                    }
                } else {
                    glVar.a();
                    d06.w = false;
                    return vs7;
                }
            }
        }
        if (pd8.f(z2, o34, i)) {
            o34.f(i);
            d06.w = false;
            glVar.a();
            return vs7;
        } else if (!pd8.w(o34, i)) {
            return vs7;
        } else {
            throw new mh3(o34.b(i), (il) this.F.w);
        }
    }
}
