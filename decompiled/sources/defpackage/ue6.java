package defpackage;

import android.os.Bundle;
import java.util.Map;

/* renamed from: ue6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ue6 implements re6, if6 {
    public final /* synthetic */ se6 w;
    public w54 x;
    public kg5 y;

    public ue6(se6 se6) {
        Bundle bundle;
        this.w = se6;
        Object e = se6.e("androidx.savedstate.SavedStateRegistry");
        if (e instanceof Bundle) {
            bundle = (Bundle) e;
        } else {
            bundle = null;
        }
        if (bundle != null && this.y == null) {
            kg5 kg5 = new kg5(new hf6(this, new hx4(18, this)));
            this.y = kg5;
            kg5.G(bundle);
        }
        se6.a(new hx4(16, this), "androidx.savedstate.SavedStateRegistry");
    }

    public final cf4 a(sr2 sr2, String str) {
        return this.w.a(sr2, str);
    }

    public final boolean c(Object obj) {
        return this.w.c(obj);
    }

    public final Map d() {
        return this.w.d();
    }

    public final Object e(String str) {
        return this.w.e(str);
    }

    public final kg5 h() {
        kg5 kg5 = this.y;
        if (kg5 == null) {
            kg5 kg52 = new kg5(new hf6(this, new hx4(18, this)));
            this.y = kg52;
            kg52.G((Bundle) null);
            kg5 = kg52;
        }
        return (kg5) kg5.y;
    }

    public final in8 k() {
        w54 w54 = this.x;
        if (w54 != null) {
            return w54;
        }
        w54 w542 = new w54(this, false);
        this.x = w542;
        return w542;
    }
}
