package defpackage;

import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import androidx.appcompat.widget.ContentFrameLayout;

/* renamed from: uo  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class uo extends ContentFrameLayout {
    public final /* synthetic */ wo E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public uo(wo woVar, d61 d61) {
        super(d61, (AttributeSet) null);
        this.E = woVar;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (this.E.w(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        return false;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            if (x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5) {
                wo woVar = this.E;
                woVar.u(woVar.B(0), true);
                return true;
            }
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public final void setBackgroundResource(int i) {
        setBackgroundDrawable(rc9.N(getContext(), i));
    }
}
