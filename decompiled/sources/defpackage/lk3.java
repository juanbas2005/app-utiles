package defpackage;

import android.content.Context;

/* renamed from: lk3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class lk3 extends a97 implements is2 {
    public final /* synthetic */ int A;
    public int B;
    public /* synthetic */ String C;
    public /* synthetic */ jw6 D;
    public /* synthetic */ Throwable E;
    public final /* synthetic */ qw6 F;
    public final /* synthetic */ Context G;
    public final /* synthetic */ Object H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lk3(qw6 qw6, Context context, Object obj, f61 f61, int i) {
        super(4, f61);
        this.A = i;
        this.F = qw6;
        this.G = context;
        this.H = obj;
    }

    public final Object C(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        Object obj5 = this.H;
        String str = (String) obj;
        jw6 jw6 = (jw6) obj2;
        Throwable th = (Throwable) obj3;
        f61 f61 = (f61) obj4;
        switch (i) {
            case b85.b:
                lk3 lk3 = new lk3(this.F, this.G, (aq4) obj5, f61, 0);
                lk3.C = str;
                lk3.D = jw6;
                lk3.E = th;
                return lk3.s(vs7);
            default:
                lk3 lk32 = new lk3(this.F, this.G, (gs2) obj5, f61, 1);
                lk32.C = str;
                lk32.D = jw6;
                lk32.E = th;
                return lk32.s(vs7);
        }
    }

    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A;
        Object obj4 = this.H;
        jw6 jw6 = jw6.y;
        boolean z = false;
        vw6 vw6 = vw6.x;
        Context context = this.G;
        qw6 qw6 = this.F;
        p81 p81 = p81.w;
        switch (i) {
            case b85.b:
                String str = this.C;
                jw6 jw62 = this.D;
                Throwable th = this.E;
                int i2 = this.B;
                if (i2 == 0) {
                    o85.q(obj);
                    String string = context.getString(jw62.w);
                    this.C = str;
                    this.D = jw62;
                    this.E = th;
                    this.B = 1;
                    obj2 = qw6.b(qw6, str, string, this, 4);
                    if (obj2 == p81) {
                        return p81;
                    }
                } else if (i2 == 1) {
                    o85.q(obj);
                    obj2 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (obj2 == vw6) {
                    z = true;
                }
                if (z && jw62 == jw6) {
                    yb5 yb5 = new yb5(str, th);
                    o96 o96 = pk3.a;
                    ((aq4) obj4).setValue(yb5);
                }
                return Boolean.valueOf(z);
            default:
                String str2 = this.C;
                jw6 jw63 = this.D;
                Throwable th2 = this.E;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    String string2 = context.getString(jw63.w);
                    this.C = str2;
                    this.D = jw63;
                    this.E = th2;
                    this.B = 1;
                    obj3 = qw6.b(qw6, str2, string2, this, 4);
                    if (obj3 == p81) {
                        return p81;
                    }
                } else if (i3 == 1) {
                    o85.q(obj);
                    obj3 = obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                if (obj3 == vw6) {
                    z = true;
                }
                if (z && jw63 == jw6) {
                    ((gs2) obj4).H(str2, th2);
                }
                return Boolean.valueOf(z);
        }
    }
}
