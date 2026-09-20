package defpackage;

/* renamed from: n79  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n79 extends t79 {
    public volatile long A;
    public final long B;

    public n79(String str, uw2 uw2, long j) {
        super(str, uw2);
        this.B = j;
    }

    public final /* synthetic */ Object a() {
        return Long.valueOf(this.B);
    }

    public final /* synthetic */ Object b(String str) {
        return Long.valueOf(Long.parseLong(str));
    }

    public final /* synthetic */ Object c(Object obj) {
        return (Long) obj;
    }

    public final /* synthetic */ Object d() {
        return Long.valueOf(this.A);
    }

    public final /* synthetic */ void e(Object obj) {
        this.A = ((Long) obj).longValue();
    }
}
