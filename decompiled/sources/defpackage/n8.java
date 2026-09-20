package defpackage;

import android.app.Activity;
import android.content.Context;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Ln8;", "Lnx4;", "Lm8;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@mx4("activity")
/* renamed from: n8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class n8 extends nx4 {
    public final Activity c;

    public n8(Context context) {
        Object obj;
        context.getClass();
        Iterator it = cl6.S(new j5(2), context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Context) obj) instanceof Activity) {
                break;
            }
        }
        this.c = (Activity) obj;
    }

    public final qt4 a() {
        return new qt4(this);
    }

    public final qt4 c(qt4 qt4) {
        throw new IllegalStateException(hl6.n(new StringBuilder("Destination "), ((m8) qt4).x.a, " does not have an Intent set.").toString());
    }

    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
