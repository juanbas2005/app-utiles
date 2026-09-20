package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: w40  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class w40 extends a97 implements gs2 {
    public final /* synthetic */ int A = 0;
    public int B;
    public final /* synthetic */ long C;
    public /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w40(c50 c50, LinkedHashMap linkedHashMap, yz7 yz7, String str, long j, f61 f61) {
        super(2, f61);
        this.D = c50;
        this.E = linkedHashMap;
        this.F = yz7;
        this.G = str;
        this.C = j;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((w40) o(f61, o81)).s(vs7);
            default:
                return ((w40) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        Object obj2 = this.G;
        Object obj3 = this.F;
        Object obj4 = this.E;
        switch (i) {
            case b85.b:
                return new w40((c50) this.D, (LinkedHashMap) obj4, (yz7) obj3, (String) obj2, this.C, f61);
            default:
                w40 w40 = new w40((s41) obj4, (fu7) obj3, (fc0) obj2, this.C, f61);
                w40.D = obj;
                return w40;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0078, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0079, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        r3 = false;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:5:0x0021, B:14:0x0041] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0026 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0021] */
    public final Object s(Object obj) {
        boolean z;
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj2 = this.G;
        Object obj3 = this.F;
        p81 p81 = p81.w;
        Object obj4 = this.E;
        CancellationException cancellationException = null;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    qz7 qz7 = ((c50) this.D).c;
                    Iterable<Map.Entry> entrySet = ((LinkedHashMap) obj4).entrySet();
                    yz7 yz7 = (yz7) obj3;
                    String str = (String) obj2;
                    ArrayList arrayList = new ArrayList(et0.e0(entrySet, 10));
                    for (Map.Entry entry : entrySet) {
                        arrayList.add(new pz7(yz7.c().name(), (String) entry.getKey(), (String) entry.getValue(), str, this.C));
                    }
                    this.B = 1;
                    Object e0 = ar7.e0(qz7.b, new zw7(qz7, arrayList, (f61) null, 6), this);
                    if (e0 != p81) {
                        e0 = vs7;
                    }
                    if (e0 == p81) {
                        return p81;
                    }
                    return vs7;
                } else if (i2 == 1) {
                    o85.q(obj);
                    return vs7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            default:
                s41 s41 = (s41) obj4;
                f96 f96 = s41.P;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    el3 Q = r16.Q(((o81) this.D).k());
                    s41.S = true;
                    zh6 zh6 = s41.L;
                    hq4 hq4 = hq4.w;
                    try {
                        fc0 fc0 = (fc0) obj2;
                        z = false;
                        try {
                            r41 r41 = new r41((fu7) obj3, s41, fc0, this.C, Q, (f61) null);
                            this.B = 1;
                            if (zh6.g(hq4, r41, this) == p81) {
                                return p81;
                            }
                        } catch (CancellationException e) {
                            e = e;
                            cancellationException = e;
                            throw cancellationException;
                        }
                    } catch (CancellationException e2) {
                        e = e2;
                        z = false;
                        cancellationException = e;
                        throw cancellationException;
                    } catch (Throwable th) {
                        th = th;
                        z = false;
                        s41.S = z;
                        f96.k(cancellationException);
                        s41.Q = z;
                        throw th;
                    }
                } else if (i3 == 1) {
                    try {
                        o85.q(obj);
                        z = false;
                    } catch (CancellationException e3) {
                        cancellationException = e3;
                        z = false;
                        try {
                            throw cancellationException;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (Throwable th3) {
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f96.E();
                s41.S = z;
                f96.k((CancellationException) null);
                s41.Q = z;
                return vs7;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w40(s41 s41, fu7 fu7, fc0 fc0, long j, f61 f61) {
        super(2, f61);
        this.E = s41;
        this.F = fu7;
        this.G = fc0;
        this.C = j;
    }
}
