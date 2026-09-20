package defpackage;

/* renamed from: v18  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v18 extends z85 {
    public final Object d;
    public final d48 e;
    public final kw5 f;

    public v18(Object obj, d48 d48, kw5 kw5) {
        obj.getClass();
        d48.getClass();
        this.d = obj;
        this.e = d48;
        this.f = kw5;
    }

    public final Object f() {
        return this.d;
    }

    public final z85 v(String str, vr2 vr2) {
        Object obj = this.d;
        if (((Boolean) vr2.y(obj)).booleanValue()) {
            return this;
        }
        return new kb2(obj, str, this.f, this.e);
    }
}
