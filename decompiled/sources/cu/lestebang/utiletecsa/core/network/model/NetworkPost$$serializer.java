package cu.lestebang.utiletecsa.core.network.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"cu/lestebang/utiletecsa/core/network/model/NetworkPost.$serializer", "Lav2;", "Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;", "<init>", "()V", "Lj42;", "encoder", "value", "Lvs7;", "serialize", "(Lj42;Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;)V", "Lok1;", "decoder", "deserialize", "(Lok1;)Lcu/lestebang/utiletecsa/core/network/model/NetworkPost;", "", "Lzr3;", "childSerializers", "()[Lzr3;", "Lll6;", "descriptor", "Lll6;", "getDescriptor", "()Lll6;", "network"}, k = 1, mv = {2, 4, 0}, xi = 48)
@fq1
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class NetworkPost$$serializer implements av2 {
    public static final NetworkPost$$serializer INSTANCE;
    private static final ll6 descriptor;

    static {
        NetworkPost$$serializer networkPost$$serializer = new NetworkPost$$serializer();
        INSTANCE = networkPost$$serializer;
        ik5 ik5 = new ik5("cu.lestebang.utiletecsa.core.network.model.NetworkPost", networkPost$$serializer, 4);
        ik5.k("id", false);
        ik5.k("title", false);
        ik5.k("url", false);
        ik5.k("thumbnailUrl", false);
        descriptor = ik5;
    }

    private NetworkPost$$serializer() {
    }

    public final zr3[] childSerializers() {
        t47 t47 = t47.a;
        return new zr3[]{ue3.a, t47, t47, t47};
    }

    public final NetworkPost deserialize(ok1 ok1) {
        ok1.getClass();
        ll6 ll6 = descriptor;
        gy0 c = ok1.c(ll6);
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int h = c.h(ll6);
            if (h == -1) {
                z = false;
            } else if (h == 0) {
                i2 = c.s(ll6, 0);
                i |= 1;
            } else if (h == 1) {
                str = c.n(ll6, 1);
                i |= 2;
            } else if (h == 2) {
                str2 = c.n(ll6, 2);
                i |= 4;
            } else if (h == 3) {
                str3 = c.n(ll6, 3);
                i |= 8;
            } else {
                h.e(h);
                return null;
            }
        }
        c.b(ll6);
        return new NetworkPost(i, i2, str, str2, str3, (rl6) null);
    }

    public final ll6 getDescriptor() {
        return descriptor;
    }

    public final void serialize(j42 j42, NetworkPost networkPost) {
        j42.getClass();
        networkPost.getClass();
        ll6 ll6 = descriptor;
        hy0 c = j42.c(ll6);
        NetworkPost.write$Self$network(networkPost, c, ll6);
        c.b(ll6);
    }

    public /* bridge */ zr3[] typeParametersSerializers() {
        return dh4.x;
    }
}
