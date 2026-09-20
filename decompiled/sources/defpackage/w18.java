package defpackage;

/* renamed from: w18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class w18 {
    public static final o21 a = new o21((v35) u35.a, 0, 0);

    public static final tl7 a(m78 m78, vl vlVar) {
        tl7 e = m78.e(vlVar);
        int length = vlVar.x.length();
        vl vlVar2 = e.a;
        v35 v35 = e.b;
        int length2 = vlVar2.x.length();
        int min = Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            b(v35.p(i), length2, i);
        }
        b(v35.p(length), length2, length);
        int min2 = Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            c(v35.h(i2), length, i2);
        }
        c(v35.h(length2), length, length2);
        return new tl7(vlVar2, new o21(v35, vlVar.x.length(), vlVar2.x.length()));
    }

    public static final void b(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z) {
            StringBuilder p = pb4.p("OffsetMapping.originalToTransformed returned invalid mapping: ", i3, " -> ", i, " is not in range of transformed text [0, ");
            p.append(i2);
            p.append("]");
            bc3.c(p.toString());
        }
    }

    public static final void c(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (!z) {
            StringBuilder p = pb4.p("OffsetMapping.transformedToOriginal returned invalid mapping: ", i3, " -> ", i, " is not in range of original text [0, ");
            p.append(i2);
            p.append("]");
            bc3.c(p.toString());
        }
    }
}
