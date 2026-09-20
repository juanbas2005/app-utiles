package defpackage;

/* renamed from: j76  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class j76 implements no0 {
    public final vr2 a;
    public final String b;

    public j76(String str, vr2 vr2) {
        this.a = vr2;
        this.b = "must return ".concat(str);
    }

    public final String a() {
        return this.b;
    }

    public final boolean b(lj3 lj3) {
        return sg3.e(lj3.C, this.a.y(ts1.e(lj3)));
    }

    public final /* bridge */ String c(lj3 lj3) {
        return mp7.Z(this, lj3);
    }
}
