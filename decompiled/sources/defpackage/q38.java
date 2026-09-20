package defpackage;

/* renamed from: q38  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q38 {
    public final lh2 a;
    public ol b;
    public ol c;
    public ol d;
    public final float e;

    public q38(lh2 lh2) {
        this.a = lh2;
        this.e = lh2.z();
    }

    public final ol a(long j, ol olVar, ol olVar2) {
        if (this.c == null) {
            this.c = olVar.c();
        }
        ol olVar3 = this.c;
        if (olVar3 != null) {
            int b2 = olVar3.b();
            int i = 0;
            while (true) {
                ol olVar4 = this.c;
                if (i < b2) {
                    if (olVar4 != null) {
                        olVar.getClass();
                        olVar4.e(i, this.a.N(olVar2.a(i), j));
                        i++;
                    } else {
                        sg3.a0("velocityVector");
                        throw null;
                    }
                } else if (olVar4 != null) {
                    return olVar4;
                } else {
                    sg3.a0("velocityVector");
                    throw null;
                }
            }
        } else {
            sg3.a0("velocityVector");
            throw null;
        }
    }
}
