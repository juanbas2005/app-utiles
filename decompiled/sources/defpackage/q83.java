package defpackage;

import cu.lestebang.utiletecsa.feature.ayuda.navigation.Licencia;
import cu.lestebang.utiletecsa.feature.infoutil.navigation.InfoUtil;
import io.github.jan.supabase.auth.jwt.JWK$KeyType;
import io.github.jan.supabase.auth.jwt.JwtHeader;
import io.github.jan.supabase.storage.vectors.data.ListVectorsResponse;
import java.lang.annotation.Annotation;

/* renamed from: q83  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class q83 implements sr2 {
    public final /* synthetic */ int w;

    public /* synthetic */ q83(int i) {
        this.w = i;
    }

    public final Object b() {
        int i = this.w;
        vs7 vs7 = vs7.a;
        ia5 ia5 = ia5.x;
        switch (i) {
            case b85.b:
                return null;
            case 1:
                yy0 yy0 = la3.a;
                return jl1.a;
            case 2:
                return InfoUtil._init_$_anonymous_();
            case 3:
                t37 t37 = ld3.a;
                return null;
            case 4:
                h23 h23 = hf3.a;
                return Boolean.TRUE;
            case 5:
                return new lx1(48.0f);
            case 6:
            case 7:
                return vs7;
            case 8:
                return kl8.i("io.github.jan.supabase.auth.jwt.JWK.KeyType", JWK$KeyType.values(), new String[]{null, null, "oct"}, new Annotation[][]{null, null, null});
            case 9:
                return u55.p(Boolean.FALSE);
            case 10:
                return bn3.b;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /*11*/:
                return sm3.b;
            case 12:
                return om3.b;
            case ry4.PERF_SESSIONS_FIELD_NUMBER /*13*/:
                return xm3.b;
            case 14:
                return sl3.b;
            case h75.g:
                return JwtHeader._childSerializers$_anonymous_();
            case 16:
                return Licencia._init_$_anonymous_();
            case 17:
                return ListVectorsResponse._childSerializers$_anonymous_();
            case 18:
                yy0 yy02 = n94.a;
                return null;
            case 19:
                t94 t94 = new t94(new ns8(4));
                ti1.f(t94);
                ar7.l(t94, '-');
                ti1.h(t94);
                ar7.l(t94, '-');
                t94.c(new k60(new hj1(ia5)));
                return new u94(t94.build());
            case 20:
                t94 t942 = new t94(new ns8(4));
                ti1.f(t942);
                ti1.h(t942);
                t942.c(new k60(new hj1(ia5)));
                return new u94(t942.build());
            case 21:
                ba4 ba4 = new ba4(new ns8(4));
                d1 d1Var = (d1) v94.a.getValue();
                d1Var.getClass();
                ba4.c(((u94) d1Var).a);
                ar7.h(ba4, new vr2[]{new tm3(14)}, new tm3(15));
                sa4 sa4 = (sa4) ta4.a.getValue();
                sa4.getClass();
                ba4.b(sa4.a);
                return new ca4(ba4.build());
            case 22:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 23:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay that is not in a OverlayScene.");
            case 24:
                yy0 yy03 = la4.a;
                return null;
            case 25:
                t37 t372 = na4.a;
                return xb4.S;
            case 26:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 27:
                ra4 ra4 = new ra4(new ns8(4));
                ri1.i(ra4);
                ar7.l(ra4, ':');
                ri1.p(ra4);
                ar7.h(ra4, new vr2[]{new tm3(16)}, new tm3(17));
                return new sa4(ra4.build());
            case 28:
                t37 t373 = ch4.a;
                return Boolean.FALSE;
            default:
                return new zg4(st0.f(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 65535), new br7(), new gr6(), tm4.a);
        }
    }

    public /* synthetic */ q83(eh3 eh3, int i) {
        this.w = i;
    }
}
