package defpackage;

import com.google.firebase.sessions.settings.SessionConfigs;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nt  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class nt implements fi2, ps2 {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ nt(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final ds2 a() {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                return new m9(2, 4, qt.class, (qt) obj, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
            default:
                return new m9(2, 4, AtomicReference.class, (AtomicReference) obj, "set", "set(Ljava/lang/Object;)V");
        }
    }

    public final boolean equals(Object obj) {
        switch (this.w) {
            case b85.b:
                if (!(obj instanceof fi2) || !(obj instanceof ps2)) {
                    return false;
                }
                return a().equals(((ps2) obj).a());
            default:
                if (!(obj instanceof fi2) || !(obj instanceof ps2)) {
                    return false;
                }
                return a().equals(((ps2) obj).a());
        }
    }

    public final int hashCode() {
        switch (this.w) {
            case b85.b:
                return a().hashCode();
            default:
                return a().hashCode();
        }
    }

    public final Object k(Object obj, f61 f61) {
        int i = this.w;
        vs7 vs7 = vs7.a;
        Object obj2 = this.x;
        switch (i) {
            case b85.b:
                ((qt) obj2).l((mt) obj);
                return vs7;
            default:
                ((AtomicReference) obj2).set((SessionConfigs) obj);
                return vs7;
        }
    }
}
