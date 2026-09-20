package defpackage;

/* renamed from: bo1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bo1 extends h85 {
    public final q51 a;
    public final long b;
    public final /* synthetic */ Object c;

    public bo1(q51 q51, Object obj) {
        this.c = obj;
        if (q51 == null) {
            q51 q512 = l51.a;
            q51 = l51.e;
        }
        this.a = q51;
        this.b = (long) ((byte[]) obj).length;
    }

    public final Long a() {
        return Long.valueOf(this.b);
    }

    public final q51 b() {
        return this.a;
    }

    public final byte[] d() {
        return (byte[]) this.c;
    }
}
