package cu.lestebang.utiletecsa.feature.home.navigation;

import java.lang.annotation.Annotation;
import kotlin.Metadata;
import kotlinx.serialization.Serializable;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00000\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcu/lestebang/utiletecsa/feature/home/navigation/HomeNavGraph;", "", "<init>", "()V", "Lzr3;", "serializer", "()Lzr3;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "home"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
@Serializable
/* loaded from: classes.dex */
public final class HomeNavGraph {
    public static final int $stable = 0;
    public static final HomeNavGraph INSTANCE = new HomeNavGraph();
    private static final /* synthetic */ nz3 $cachedSerializer$delegate = rg3.y(i44.w, new nf1(21));

    private HomeNavGraph() {
    }

    public static final /* synthetic */ zr3 _init_$_anonymous_() {
        return new a62("cu.lestebang.utiletecsa.feature.home.navigation.HomeNavGraph", INSTANCE, new Annotation[0]);
    }

    private final /* synthetic */ zr3 get$cachedSerializer() {
        return (zr3) $cachedSerializer$delegate.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj || (obj instanceof HomeNavGraph)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return -1029117417;
    }

    public final zr3 serializer() {
        return get$cachedSerializer();
    }

    public String toString() {
        return "HomeNavGraph";
    }
}
