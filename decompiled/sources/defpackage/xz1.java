package defpackage;

/* renamed from: xz1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class xz1 {
    public final vr2 a;
    public final bd b;
    public final ed5 c = u55.p((Object) null);
    public je2 d = kl8.L();
    public je2 e = kl8.L();

    public xz1(yz1 yz1, vr2 vr2) {
        this.a = vr2;
        jo7 jo7 = pv4.a;
        tj1 tj1 = ic.c;
        f81 f81 = new f81(27);
        zh zhVar = new zh(12, (Object) this);
        bd bdVar = new bd(yz1, vr2);
        bdVar.b = f81;
        bdVar.c = zhVar;
        bdVar.d = jo7;
        bdVar.e = tj1;
        this.b = bdVar;
    }

    public static Object a(xz1 xz1, yz1 yz1, hl hlVar, a97 a97) {
        bd bdVar = xz1.b;
        Object a2 = bdVar.a(yz1, hq4.w, new wz1(xz1, bdVar.k.d(), hlVar, (f61) null), a97);
        if (a2 == p81.w) {
            return a2;
        }
        return vs7.a;
    }

    public final Object b(a97 a97) {
        Object a2 = a(this, yz1.w, this.e, a97);
        if (a2 == p81.w) {
            return a2;
        }
        return vs7.a;
    }

    public final boolean c() {
        if (((yz1) this.b.h.getValue()) == yz1.x) {
            return true;
        }
        return false;
    }
}
