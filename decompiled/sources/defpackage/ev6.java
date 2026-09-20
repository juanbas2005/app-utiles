package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: ev6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ev6 extends l66 implements gs2 {
    public int A;
    public int B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ Iterator G;
    public Object y;
    public Iterator z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ev6(int i, int i2, Iterator it, f61 f61) {
        super(2, f61);
        this.E = i;
        this.F = i2;
        this.G = it;
    }

    public final Object H(Object obj, Object obj2) {
        return ((ev6) o((f61) obj2, (bl6) obj)).s(vs7.a);
    }

    public final f61 o(f61 f61, Object obj) {
        ev6 ev6 = new ev6(this.E, this.F, this.G, f61);
        ev6.D = obj;
        return ev6;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0138 A[SYNTHETIC] */
    public final Object s(Object obj) {
        x76 x76;
        Iterator it;
        int i;
        int i2;
        int i3;
        x76 x762;
        boolean z2;
        Object[] objArr;
        int i4;
        ArrayList arrayList;
        Iterator it2;
        int i5;
        int i6;
        bl6 bl6 = (bl6) this.D;
        int i7 = this.C;
        int i8 = this.F;
        boolean z3 = true;
        int i9 = this.E;
        p81 p81 = p81.w;
        if (i7 == 0) {
            o85.q(obj);
            int i10 = 1024;
            if (i9 <= 1024) {
                i10 = i9;
            }
            i4 = i8 - i9;
            Iterator it3 = this.G;
            if (i4 >= 0) {
                arrayList = new ArrayList(i10);
                i5 = i10;
                it2 = it3;
                i6 = 0;
                while (it2.hasNext()) {
                }
                if (!arrayList.isEmpty()) {
                }
                return vs7.a;
            }
            x76 x763 = new x76(0, new Object[i10]);
            i = i10;
            i2 = i4;
            it = it3;
            x76 = x763;
            while (true) {
                int i11 = x76.x;
                Object[] objArr2 = x76.w;
                if (it.hasNext()) {
                }
                z3 = z2;
            }
        } else if (i7 != 1) {
            if (i7 != 2) {
                if (i7 == 3) {
                    i2 = this.B;
                    i = this.A;
                    it = this.z;
                    x76 = (x76) this.y;
                    o85.q(obj);
                    x76.g(i8);
                    while (true) {
                        int i112 = x76.x;
                        Object[] objArr22 = x76.w;
                        if (it.hasNext()) {
                            i3 = i;
                            x762 = x76;
                            break;
                        }
                        Object next = it.next();
                        z2 = z3;
                        if (x76.f() != i112) {
                            int i12 = x76.y;
                            int i13 = x76.z;
                            objArr22[(i12 + i13) % i112] = next;
                            x76.z = i13 + 1;
                            if (x76.f() == i112) {
                                if (x76.z < i9) {
                                    int i14 = i112 + (i112 >> 1) + 1;
                                    if (i14 > i9) {
                                        i14 = i9;
                                    }
                                    if (x76.y == 0) {
                                        objArr = Arrays.copyOf(objArr22, i14);
                                    } else {
                                        objArr = x76.toArray(new Object[i14]);
                                    }
                                    x76 = new x76(x76.z, objArr);
                                } else {
                                    ArrayList arrayList2 = new ArrayList(x76);
                                    this.D = bl6;
                                    this.y = x76;
                                    this.z = it;
                                    this.A = i;
                                    this.B = i2;
                                    this.C = 3;
                                    bl6.c(this, arrayList2);
                                    return p81;
                                }
                            }
                            z3 = z2;
                        } else {
                            h.s("ring buffer is full");
                            return null;
                        }
                    }
                } else if (i7 == 4) {
                    i2 = this.B;
                    i3 = this.A;
                    x762 = (x76) this.y;
                    o85.q(obj);
                    x762.g(i8);
                } else if (i7 == 5) {
                    x76 x764 = (x76) this.y;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                ArrayList arrayList3 = (ArrayList) this.y;
            }
            o85.q(obj);
            return vs7.a;
        } else {
            i6 = this.B;
            i5 = this.A;
            it2 = this.z;
            ArrayList arrayList4 = (ArrayList) this.y;
            o85.q(obj);
            arrayList = new ArrayList(i9);
            i4 = i6;
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (i6 > 0) {
                    i6--;
                } else {
                    arrayList.add(next2);
                    if (arrayList.size() == i9) {
                        this.D = bl6;
                        this.y = arrayList;
                        this.z = it2;
                        this.A = i5;
                        this.B = i4;
                        this.C = 1;
                        bl6.c(this, arrayList);
                        return p81;
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                this.D = null;
                this.y = null;
                this.z = null;
                this.A = i5;
                this.B = i4;
                this.C = 2;
                bl6.c(this, arrayList);
                return p81;
            }
            return vs7.a;
        }
        if (x762.z > i8) {
            ArrayList arrayList5 = new ArrayList(x762);
            this.D = bl6;
            this.y = x762;
            this.z = null;
            this.A = i3;
            this.B = i2;
            this.C = 4;
            bl6.c(this, arrayList5);
            return p81;
        }
        if (!x762.isEmpty()) {
            this.D = null;
            this.y = null;
            this.z = null;
            this.A = i3;
            this.B = i2;
            this.C = 5;
            bl6.c(this, x762);
            return p81;
        }
        return vs7.a;
    }
}
