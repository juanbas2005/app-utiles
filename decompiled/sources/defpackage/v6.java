package defpackage;

import androidx.datastore.core.CorruptionException;
import io.github.jan.supabase.auth.a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.Serializable;

/* renamed from: v6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class v6 extends a97 implements vr2 {
    public final /* synthetic */ int A;
    public int B;
    public Object C;
    public Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v6(p7 p7Var, String str, String str2, String str3, f61 f61) {
        super(1, f61);
        this.A = 0;
        this.C = p7Var;
        this.D = str;
        this.E = str2;
        this.F = str3;
    }

    public final f61 l(f61 f61) {
        int i = this.A;
        Object obj = this.F;
        Object obj2 = this.E;
        switch (i) {
            case b85.b:
                return new v6((p7) this.C, (String) this.D, (String) obj2, (String) obj, f61);
            case 1:
                return new v6((Object) (h06) this.D, (Object) (jf1) obj2, (Object) (f06) obj, f61, 1);
            case 2:
                return new v6((Object) (jf1) this.D, (Object) (e81) obj2, (Object) (gs2) obj, f61, 2);
            default:
                return new v6((pd2) obj2, obj, f61);
        }
    }

    /* JADX WARNING: type inference failed for: r11v3, types: [java.io.Serializable] */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x014f, code lost:
        if (r12 != r7) goto L_0x0153;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0194, code lost:
        if (defpackage.uu.k(defpackage.rg3.t(r0), defpackage.c85.RECOVERY, (java.lang.String) r11.D, r3, r11) == r7) goto L_0x01b1;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00de  */
    public final Object s(Object obj) {
        f06 f06;
        h06 h06;
        de1 de1;
        Object obj2;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        int i = this.A;
        int i2 = 0;
        vs7 vs7 = vs7.a;
        Object obj3 = this.F;
        p81 p81 = p81.w;
        Object obj4 = this.E;
        switch (i) {
            case b85.b:
                j77 j77 = ((p7) this.C).a;
                int i3 = this.B;
                if (i3 == 0) {
                    o85.q(obj);
                    String obj5 = d57.k1((String) obj4).toString();
                    this.B = 1;
                    break;
                } else if (i3 == 1) {
                    o85.q(obj);
                } else if (i3 == 2) {
                    o85.q(obj);
                    return obj;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uu t = rg3.t(j77);
                u6 u6Var = new u6((String) obj3, 0);
                this.B = 2;
                a aVar = (a) t;
                aVar.c.getClass();
                Object y = aVar.y(true, u6Var, this);
                if (y != p81) {
                    return y;
                }
                return p81;
            case 1:
                f06 f062 = (f06) obj3;
                h06 h062 = (h06) this.D;
                jf1 jf1 = (jf1) obj4;
                int i4 = this.B;
                if (i4 == 0) {
                    o85.q(obj);
                    this.C = h062;
                    this.B = 1;
                    obj = jf1.j(this);
                    if (obj == p81) {
                        return p81;
                    }
                    h06 = h062;
                } else if (i4 != 1) {
                    if (i4 == 2) {
                        f06 = (f06) ((Serializable) this.C);
                        try {
                            o85.q(obj);
                            f06.w = ((Number) obj).intValue();
                            return vs7;
                        } catch (CorruptionException unused) {
                            Object obj6 = h062.w;
                            this.C = f062;
                            this.B = 3;
                            obj = jf1.k(obj6, true, this);
                            break;
                        }
                    } else if (i4 == 3) {
                        f062 = (Serializable) this.C;
                        o85.q(obj);
                        f062.w = ((Number) obj).intValue();
                        return vs7;
                    } else {
                        h.s("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    h06 = (h06) ((Serializable) this.C);
                    o85.q(obj);
                }
                h06.w = obj;
                cf3 i5 = jf1.i();
                this.C = f062;
                this.B = 2;
                obj = i5.a(this);
                if (obj == p81) {
                    return p81;
                }
                f06 = f062;
                f06.w = ((Number) obj).intValue();
                return vs7;
            case 2:
                jf1 jf12 = (jf1) this.D;
                int i6 = this.B;
                if (i6 == 0) {
                    o85.q(obj);
                    this.B = 1;
                    obj = jf1.h(jf12, true, this);
                    if (obj == p81) {
                        return p81;
                    }
                    de1 = (de1) obj;
                    n0 n0Var = new n0((gs2) obj3, de1, (f61) null, 28);
                    this.C = de1;
                    this.B = 2;
                    obj = ar7.e0((e81) obj4, n0Var, this);
                    if (obj == p81) {
                    }
                    obj2 = de1.b;
                    if (obj2 != null) {
                    }
                    if (i2 == de1.c) {
                    }
                } else if (i6 == 1) {
                    o85.q(obj);
                    de1 = (de1) obj;
                    n0 n0Var2 = new n0((gs2) obj3, de1, (f61) null, 28);
                    this.C = de1;
                    this.B = 2;
                    obj = ar7.e0((e81) obj4, n0Var2, this);
                    if (obj == p81) {
                        return p81;
                    }
                    obj2 = de1.b;
                    if (obj2 != null) {
                    }
                    if (i2 == de1.c) {
                    }
                } else if (i6 == 2) {
                    de1 = (de1) this.C;
                    o85.q(obj);
                    obj2 = de1.b;
                    if (obj2 != null) {
                        i2 = obj2.hashCode();
                    }
                    if (i2 == de1.c) {
                        if (!sg3.e(de1.b, obj)) {
                            this.C = obj;
                            this.B = 3;
                            if (jf12.k(obj, true, this) == p81) {
                                return p81;
                            }
                        }
                        return obj;
                    }
                    h.s("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
                } else if (i6 == 3) {
                    Object obj7 = this.C;
                    o85.q(obj);
                    return obj7;
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                pd2 pd2 = (pd2) obj4;
                File file = pd2.a;
                int i7 = this.B;
                if (i7 == 0) {
                    o85.q(obj);
                    try {
                        fileOutputStream2 = new FileOutputStream(file);
                    } catch (Exception e) {
                        e = e;
                        if (e instanceof FileNotFoundException) {
                            e = ar7.f0(file.getParent(), (FileNotFoundException) e);
                        }
                        throw e;
                    } catch (Throwable th) {
                        ed1.i(fileOutputStream, th);
                        throw th;
                    }
                    try {
                        tl6 tl6 = pd2.b;
                        ls7 ls7 = new ls7(fileOutputStream2);
                        this.C = fileOutputStream2;
                        this.D = fileOutputStream2;
                        this.B = 1;
                        if (tl6.m0(obj3, ls7, this) == p81) {
                            return p81;
                        }
                        fileOutputStream = fileOutputStream2;
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStream2;
                        throw th;
                    }
                } else if (i7 == 1) {
                    fileOutputStream2 = (FileOutputStream) this.D;
                    fileOutputStream = (FileOutputStream) this.C;
                    try {
                        o85.q(obj);
                    } catch (Throwable th3) {
                        th = th3;
                    }
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fileOutputStream2.getFD().sync();
                ed1.i(fileOutputStream, (Throwable) null);
                return vs7;
        }
    }

    public final Object y(Object obj) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        f61 f61 = (f61) obj;
        switch (i) {
            case b85.b:
                return ((v6) l(f61)).s(vs7);
            case 1:
                return ((v6) l(f61)).s(vs7);
            case 2:
                return ((v6) l(f61)).s(vs7);
            default:
                return ((v6) l(f61)).s(vs7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v6(pd2 pd2, Object obj, f61 f61) {
        super(1, f61);
        this.A = 3;
        this.E = pd2;
        this.F = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v6(Object obj, Object obj2, Object obj3, f61 f61, int i) {
        super(1, f61);
        this.A = i;
        this.D = obj;
        this.E = obj2;
        this.F = obj3;
    }
}
