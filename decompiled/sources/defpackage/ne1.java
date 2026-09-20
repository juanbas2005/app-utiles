package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Set;

/* renamed from: ne1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ne1 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public final /* synthetic */ Object C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ne1(Object obj, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.C = obj;
    }

    public final f61 l(f61 f61) {
        int i = this.A;
        Object obj = this.C;
        switch (i) {
            case b85.b:
                return new ne1((wr6) obj, f61, 0);
            case 1:
                return new ne1((v6) obj, f61, 1);
            case 2:
                return new ne1((ze7) obj, f61, 2);
            default:
                return new ne1((ek7) obj, f61, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        if (r2.s(r14) == r4) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r14 == r4) goto L_0x00a7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:?, code lost:
        return r4;
     */
    public final Object s(Object obj) {
        Context context;
        Object obj2;
        int i = this.A;
        Object obj3 = vs7.a;
        Object obj4 = this.C;
        Object obj5 = p81.w;
        switch (i) {
            case b85.b:
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    wr6 wr6 = (wr6) obj4;
                    this.B = 1;
                    SharedPreferences.Editor edit = ((SharedPreferences) wr6.e.getValue()).edit();
                    Set<String> set = wr6.f;
                    if (set == null) {
                        edit.clear();
                    } else {
                        for (String remove : set) {
                            edit.remove(remove);
                        }
                    }
                    if (edit.commit()) {
                        if (((SharedPreferences) wr6.e.getValue()).getAll().isEmpty() && (context = wr6.c) != null) {
                            context.deleteSharedPreferences(wr6.d);
                        }
                        if (set != null) {
                            set.clear();
                        }
                        if (obj3 == obj5) {
                            return obj5;
                        }
                        return obj3;
                    }
                    rf2.i("Unable to delete migrated keys from SharedPreferences.");
                } else if (i2 == 1) {
                    o85.q(obj);
                    return obj3;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            case 1:
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    Object y = ((v6) obj4).y(this);
                    if (y == obj5) {
                        return obj5;
                    }
                    return y;
                } else if (i3 == 1) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            case 2:
                ze7 ze7 = (ze7) obj4;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    break;
                } else if (i4 == 1) {
                    o85.q(obj);
                } else if (i4 == 2) {
                    o85.q(obj);
                    ze7.B = true;
                    return obj3;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                yb5 a = ze7.a(ze7);
                if (a != null) {
                    String str = (String) a.w;
                    long j = ((lg7) a.x).a;
                    wj5 wj5 = ze7.j;
                    if (wj5 != null) {
                        this.B = 2;
                        if (str.length() != 0 && !lg7.c(j)) {
                            obj2 = ar7.e0(wj5.a, new ng((Object) wj5, (Object) new q0(j, (f61) null, wj5, str), (f61) null, 13), this);
                        } else {
                            obj2 = obj3;
                        }
                        if (obj2 != obj5) {
                            obj2 = obj3;
                            break;
                        }
                    }
                }
                ze7.B = true;
                return obj3;
            default:
                int i5 = this.B;
                if (i5 == 0) {
                    o85.q(obj);
                    ek7 ek7 = (ek7) obj4;
                    this.B = 1;
                    kk0 kk0 = new kk0(1, rc9.a0(this));
                    kk0.v();
                    dq4 dq4 = ek7.b;
                    dq4.y.setValue(Boolean.TRUE);
                    ek7.c = kk0;
                    if (kk0.t() == obj5) {
                        return obj5;
                    }
                    return obj3;
                } else if (i5 == 1) {
                    o85.q(obj);
                    return obj3;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                return ((ne1) l(f61)).s(vs7);
            case 1:
                return ((ne1) l(f61)).s(vs7);
            case 2:
                return ((ne1) l(f61)).s(vs7);
            default:
                return ((ne1) l(f61)).s(vs7);
        }
    }
}
