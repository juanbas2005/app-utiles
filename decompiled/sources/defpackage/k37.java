package defpackage;

/* renamed from: k37  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class k37 extends p37 {
    public o2 c;
    public int d;
    public int e;

    public k37(long j, o2 o2Var) {
        super(j);
        this.c = o2Var;
    }

    public final void a(p37 p37) {
        synchronized (rj1.D) {
            p37.getClass();
            this.c = ((k37) p37).c;
            this.d = ((k37) p37).d;
            this.e = ((k37) p37).e;
        }
    }

    public final p37 b(long j) {
        return new k37(j, this.c);
    }
}
