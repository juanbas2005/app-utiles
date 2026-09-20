package cu.lestebang.utiletecsa.core.network.model;

import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"cu/lestebang/utiletecsa/core/network/model/NetworkPost.$serializer", "Lav2;", "Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;", "<init>", "()V", "Lj42;", "encoder", "value", "Lvs7;", "serialize", "(Lj42;Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;)V", "Lok1;", "decoder", "deserialize", "(Lok1;)Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;", "", "Lzr3;", "childSerializers", "()[Lzr3;", "Lll6;", "descriptor", "Lll6;", "getDescriptor", "()Lll6;", "network"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@fq1
/* loaded from: classes.dex */
public final /* synthetic */ class NetworkPost$$serializer implements av2 {
    public static final NetworkPost$$serializer INSTANCE;
    private static final ll6 descriptor;

    static {
        NetworkPost$$serializer networkPost$$serializer = new NetworkPost$$serializer();
        INSTANCE = networkPost$$serializer;
        ik5 ik5Var = new ik5("cu.lestebang.utiletecsa.core.network.model.NetworkPost", networkPost$$serializer, 4);
        ik5Var.k("id", false);
        ik5Var.k("title", false);
        ik5Var.k("url", false);
        ik5Var.k("thumbnailUrl", false);
        descriptor = ik5Var;
    }

    private NetworkPost$$serializer() {
    }

    @Override // defpackage.av2
    public final zr3[] childSerializers() {
        t47 t47Var = t47.a;
        return new zr3[]{ue3.a, t47Var, t47Var, t47Var};
    }

    @Override // defpackage.zr3
    public final NetworkPost deserialize(ok1 ok1Var) {
        ok1Var.getClass();
        ll6 ll6Var = descriptor;
        gy0 c = ok1Var.c(ll6Var);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int h = c.h(ll6Var);
            if (h != -1) {
                if (h != 0) {
                    if (h != 1) {
                        if (h != 2) {
                            if (h == 3) {
                                str3 = c.n(ll6Var, 3);
                                i |= 8;
                            } else {
                                h.e(h);
                                return null;
                            }
                        } else {
                            str2 = c.n(ll6Var, 2);
                            i |= 4;
                        }
                    } else {
                        str = c.n(ll6Var, 1);
                        i |= 2;
                    }
                } else {
                    i2 = c.s(ll6Var, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        c.b(ll6Var);
        return new NetworkPost(i, i2, str, str2, str3, null);
    }

    @Override // defpackage.zr3
    public final ll6 getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.zr3
    public final void serialize(j42 j42Var, NetworkPost networkPost) {
        j42Var.getClass();
        networkPost.getClass();
        ll6 ll6Var = descriptor;
        hy0 c = j42Var.c(ll6Var);
        NetworkPost.write$Self$network(networkPost, c, ll6Var);
        c.b(ll6Var);
    }

    @Override // defpackage.av2
    public /* bridge */ zr3[] typeParametersSerializers() {
        return dh4.x;
    }
}
