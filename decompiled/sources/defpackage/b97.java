package defpackage;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb97;", "Lpl4;", "Lh97;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: b97  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class b97 extends pl4 {
    public final Object w;
    public final Object x;
    public final PointerInputEventHandler y;

    public b97(Object obj, Object obj2, PointerInputEventHandler pointerInputEventHandler, int i) {
        obj2 = (i & 2) != 0 ? null : obj2;
        this.w = obj;
        this.x = obj2;
        this.y = pointerInputEventHandler;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b97)) {
            return false;
        }
        b97 b97 = (b97) obj;
        if (sg3.e(this.w, b97.w) && sg3.e(this.x, b97.x) && this.y == b97.y) {
            return true;
        }
        return false;
    }

    public final ll4 g() {
        return new h97(this.w, this.x, this.y);
    }

    public final void h(ll4 ll4) {
        h97 h97 = (h97) ll4;
        Object obj = h97.K;
        Object obj2 = this.w;
        boolean z = true;
        boolean z2 = !sg3.e(obj, obj2);
        h97.K = obj2;
        Object obj3 = h97.L;
        Object obj4 = this.x;
        if (!sg3.e(obj3, obj4)) {
            z2 = true;
        }
        h97.L = obj4;
        Class<?> cls = h97.M.getClass();
        PointerInputEventHandler pointerInputEventHandler = this.y;
        if (cls == pointerInputEventHandler.getClass()) {
            z = z2;
        }
        if (z) {
            h97.X0();
        }
        h97.M = pointerInputEventHandler;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        Object obj = this.w;
        if (obj != null) {
            i = obj.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        Object obj2 = this.x;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        return this.y.hashCode() + ((i3 + i2) * 961);
    }
}
