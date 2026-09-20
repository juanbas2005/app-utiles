package defpackage;

/* renamed from: oj  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class oj {
    public final /* synthetic */ qc1 a;
    public final /* synthetic */ pj b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;

    public /* synthetic */ oj(qc1 qc1, pj pjVar, float f, float f2) {
        this.a = qc1;
        this.b = pjVar;
        this.c = f;
        this.d = f2;
    }

    public final float a(float f) {
        qc1 qc1 = this.a;
        qc1.getClass();
        pj pjVar = this.b;
        pjVar.getClass();
        long c2 = qc1.c(f);
        return Math.abs(j18.d(j18.a(jb5.r(c2) - pjVar.w, jb5.s(c2) - pjVar.x) - this.c, j18.c) - this.d);
    }
}
