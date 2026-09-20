package defpackage;

import com.wireguard.android.backend.GoBackend;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* renamed from: q78  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q78 extends a97 implements gs2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ v78 B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q78(v78 v78, f61 f61, int i) {
        super(2, f61);
        this.A = i;
        this.B = v78;
    }

    public final Object H(Object obj, Object obj2) {
        int i = this.A;
        vs7 vs7 = vs7.a;
        o81 o81 = (o81) obj;
        f61 f61 = (f61) obj2;
        switch (i) {
            case b85.b:
                return ((q78) o(f61, o81)).s(vs7);
            case 1:
                return ((q78) o(f61, o81)).s(vs7);
            case 2:
                return ((q78) o(f61, o81)).s(vs7);
            default:
                return ((q78) o(f61, o81)).s(vs7);
        }
    }

    public final f61 o(f61 f61, Object obj) {
        int i = this.A;
        v78 v78 = this.B;
        switch (i) {
            case b85.b:
                return new q78(v78, f61, 0);
            case 1:
                return new q78(v78, f61, 1);
            case 2:
                return new q78(v78, f61, 2);
            default:
                return new q78(v78, f61, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d8, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        defpackage.ed1.i(r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00dc, code lost:
        throw r5;
     */
    public final Object s(Object obj) {
        Object obj2;
        Object obj3;
        int i = this.A;
        Object obj4 = vs7.a;
        e = null;
        v78 v78 = this.B;
        switch (i) {
            case b85.b:
                o85.q(obj);
                try {
                    v78.b(v78);
                    kz0 kz0 = v78.d;
                    if (kz0 != null) {
                        ((GoBackend) v78.c.getValue()).c(3, kz0, v78.i);
                        d37 d37 = v78.e;
                        Boolean bool = Boolean.TRUE;
                        d37.getClass();
                        d37.l((Object) null, bool);
                        return new o66(obj4);
                    }
                    throw new IllegalStateException("Carga una configuración WireGuard antes de conectar");
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    obj4 = new m66(e2);
                }
            case 1:
                o85.q(obj);
                try {
                    ((GoBackend) v78.c.getValue()).c(1, v78.d, v78.i);
                    d37 d372 = v78.e;
                    Boolean bool2 = Boolean.FALSE;
                    d372.getClass();
                    d372.l((Object) null, bool2);
                } catch (CancellationException e3) {
                    throw e3;
                } catch (Exception e4) {
                    obj4 = new m66(e4);
                }
                return new o66(obj4);
            case 2:
                o85.q(obj);
                int i2 = 0;
                while (i2 < 5) {
                    try {
                        String str = "wg0-client-" + wv5.a.b();
                        try {
                            o9 o9Var = new o9(12);
                            o9Var.N("http://happypet.space/wgconfigs/" + str + ".conf");
                            kd6 kd6 = new kd6(o9Var);
                            d45 d45 = (d45) v78.j.getValue();
                            d45.getClass();
                            a66 f = new dx5(d45, kd6, false).f();
                            if (f.M) {
                                obj2 = v78.g(f.C.o(), str, true);
                                f.close();
                                return new o66(obj2);
                            }
                            IOException iOException = new IOException("HTTP " + f.z + " para " + str + ".conf");
                            f.close();
                            e = iOException;
                            i2++;
                        } catch (IOException e5) {
                            e = e5;
                        }
                    } catch (CancellationException e6) {
                        throw e6;
                    } catch (Exception e7) {
                        obj2 = new m66(e7);
                    }
                }
                if (e == null) {
                    e = new IOException("No se pudo descargar la configuración");
                }
                throw e;
            default:
                o85.q(obj);
                try {
                    v78.b(v78);
                    boolean contains = ((GoBackend) v78.c.getValue()).b().contains("utiles");
                    d37 d373 = v78.e;
                    Boolean valueOf = Boolean.valueOf(contains);
                    d373.getClass();
                    d373.l((Object) null, valueOf);
                    obj3 = Boolean.valueOf(contains);
                } catch (CancellationException e8) {
                    throw e8;
                } catch (Exception e9) {
                    obj3 = new m66(e9);
                }
                return new o66(obj3);
        }
    }
}
