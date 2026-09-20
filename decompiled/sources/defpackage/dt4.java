package defpackage;

import androidx.navigation3.runtime.NavBackStack;
import java.util.List;

/* renamed from: dt4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class dt4 implements zr3 {
    public final /* synthetic */ int a;
    public final we8 b;
    public final zr3 c;

    public dt4(zr3 zr3, int i) {
        this.a = i;
        switch (i) {
            case 1:
                zr3.getClass();
                cs csVar = new cs(zr3, 0);
                this.c = csVar;
                this.b = b85.c("androidx.compose.runtime.SnapshotStateList", (zr) csVar.c);
                return;
            default:
                dt4 dt4 = new dt4(zr3, 1);
                this.c = dt4;
                this.b = b85.c("androidx.navigation3.runtime.NavBackStack", dt4.b);
                return;
        }
    }

    public final Object deserialize(ok1 ok1) {
        int i = this.a;
        zr3 zr3 = this.c;
        switch (i) {
            case b85.b:
                return new NavBackStack((yx6) ok1.g((dt4) zr3));
            default:
                yx6 yx6 = new yx6();
                yx6.addAll(dt0.b1((List) ok1.g((cs) zr3)));
                return yx6;
        }
    }

    public final ll6 getDescriptor() {
        switch (this.a) {
            case b85.b:
                return this.b;
            default:
                return this.b;
        }
    }

    public final void serialize(j42 j42, Object obj) {
        int i = this.a;
        zr3 zr3 = this.c;
        switch (i) {
            case b85.b:
                j42.g((dt4) zr3, ((NavBackStack) obj).getBase$navigation3_runtime());
                return;
            default:
                yx6 yx6 = (yx6) obj;
                yx6.getClass();
                j42.g((cs) zr3, yx6);
                return;
        }
    }
}
