package defpackage;

import com.google.protobuf.b;

/* renamed from: qu2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qu2 implements Cloneable {
    public final b w;
    public b x;

    public qu2(b bVar) {
        this.w = bVar;
        if (!bVar.n()) {
            this.x = (b) bVar.k(4);
        } else {
            h.q("Default instance must be immutable.");
            throw null;
        }
    }

    public final Object clone() {
        qu2 qu2 = (qu2) this.w.k(5);
        boolean n = this.x.n();
        b bVar = this.x;
        if (n) {
            bVar.getClass();
            au5 au5 = au5.c;
            au5.getClass();
            au5.a(bVar.getClass()).b(bVar);
            bVar.o();
            bVar = this.x;
        }
        qu2.x = bVar;
        return qu2;
    }

    public final b g() {
        boolean n = this.x.n();
        b bVar = this.x;
        if (n) {
            bVar.getClass();
            au5 au5 = au5.c;
            au5.getClass();
            au5.a(bVar.getClass()).b(bVar);
            bVar.o();
            bVar = this.x;
        }
        bVar.getClass();
        boolean z = true;
        byte byteValue = ((Byte) bVar.k(1)).byteValue();
        if (byteValue != 1) {
            if (byteValue == 0) {
                z = false;
            } else {
                au5 au52 = au5.c;
                au52.getClass();
                z = au52.a(bVar.getClass()).c(bVar);
                bVar.k(2);
            }
        }
        if (z) {
            return bVar;
        }
        throw new RuntimeException("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void h() {
        if (!this.x.n()) {
            b bVar = (b) this.w.k(4);
            b bVar2 = this.x;
            au5 au5 = au5.c;
            au5.getClass();
            au5.a(bVar.getClass()).a(bVar, bVar2);
            this.x = bVar;
        }
    }
}
