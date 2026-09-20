package defpackage;

import android.os.Message;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import cu.lestebang.utiletecsa.R;

/* renamed from: r7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class r7 implements View.OnClickListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ r7(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.os.Message} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: yi4} */
    /* JADX WARNING: type inference failed for: r2v0 */
    /* JADX WARNING: type inference failed for: r2v5 */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    public final void onClick(View view) {
        Message message;
        int i = this.w;
        ? r2 = 0;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                ((h8) obj).b();
                return;
            case 1:
                pa paVar = (pa) obj;
                if (view == paVar.i && (message = paVar.k) != null) {
                    r2 = Message.obtain(message);
                }
                if (r2 != 0) {
                    r2.sendToTarget();
                }
                paVar.z.obtainMessage(1, paVar.b).sendToTarget();
                return;
            case 2:
                kg4 kg4 = (kg4) obj;
                int i2 = kg4.x0;
                if (i2 == 2) {
                    kg4.Q(1);
                    kg4.A0.announceForAccessibility(kg4.q(R.string.mtrl_picker_toggled_to_day_selection));
                    return;
                } else if (i2 == 1) {
                    kg4.Q(2);
                    kg4.z0.announceForAccessibility(kg4.q(R.string.mtrl_picker_toggled_to_year_selection));
                    return;
                } else {
                    return;
                }
            default:
                mj7 mj7 = ((Toolbar) obj).k0;
                if (mj7 != null) {
                    r2 = mj7.x;
                }
                if (r2 != 0) {
                    r2.collapseActionView();
                    return;
                }
                return;
        }
    }
}
