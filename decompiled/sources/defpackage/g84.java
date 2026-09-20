package defpackage;

import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;

/* renamed from: g84  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g84 implements View.OnTouchListener {
    public final /* synthetic */ int w;
    public final /* synthetic */ Object x;

    public /* synthetic */ g84(int i, Object obj) {
        this.w = i;
        this.x = obj;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = this.w;
        Object obj = this.x;
        switch (i) {
            case b85.b:
                h84 h84 = (h84) obj;
                d84 d84 = h84.N;
                Handler handler = h84.R;
                fp fpVar = h84.V;
                int action = motionEvent.getAction();
                int x2 = (int) motionEvent.getX();
                int y = (int) motionEvent.getY();
                if (action == 0 && fpVar != null && fpVar.isShowing() && x2 >= 0 && x2 < fpVar.getWidth() && y >= 0 && y < fpVar.getHeight()) {
                    handler.postDelayed(d84, 250);
                } else if (action == 1) {
                    handler.removeCallbacks(d84);
                }
                return false;
            default:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) obj).onTouchEvent(motionEvent);
                }
                return false;
        }
    }
}
