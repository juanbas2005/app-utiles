package defpackage;

/* renamed from: g79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g79 extends t79 {
    public volatile boolean A;
    public final boolean B;

    public g79(String str, uw2 uw2, boolean z) {
        super(str, uw2);
        this.B = z;
    }

    public final /* synthetic */ Object a() {
        return Boolean.valueOf(this.B);
    }

    public final /* synthetic */ Object b(String str) {
        return Boolean.valueOf(Boolean.parseBoolean(str));
    }

    public final /* synthetic */ Object c(Object obj) {
        return (Boolean) obj;
    }

    public final /* synthetic */ Object d() {
        return Boolean.valueOf(this.A);
    }

    public final /* synthetic */ void e(Object obj) {
        this.A = ((Boolean) obj).booleanValue();
    }
}
