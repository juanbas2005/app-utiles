package defpackage;

/* renamed from: gn1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gn1 implements eh6 {
    public final /* synthetic */ hn1 a;

    public gn1(hn1 hn1) {
        this.a = hn1;
    }

    public final float a(float f) {
        boolean z;
        if (Float.isNaN(f)) {
            return 0.0f;
        }
        hn1 hn1 = this.a;
        float floatValue = ((Number) hn1.a.y(Float.valueOf(f))).floatValue();
        ed5 ed5 = hn1.e;
        boolean z2 = false;
        if (floatValue > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        ed5.setValue(Boolean.valueOf(z));
        ed5 ed52 = hn1.f;
        if (floatValue < 0.0f) {
            z2 = true;
        }
        ed52.setValue(Boolean.valueOf(z2));
        return floatValue;
    }
}
