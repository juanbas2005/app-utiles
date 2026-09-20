package defpackage;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* renamed from: vi4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class vi4 implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, qj4 {
    public i67 w;
    public ra x;
    public z74 y;

    public final void a(ti4 ti4, boolean z) {
        ra raVar;
        if ((z || ti4 == this.w) && (raVar = this.x) != null) {
            raVar.dismiss();
        }
    }

    public final boolean m(ti4 ti4) {
        return false;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        i67 i67 = this.w;
        z74 z74 = this.y;
        if (z74.B == null) {
            z74.B = new y74(z74);
        }
        i67.q(z74.B.getItem(i), (rj4) null, 0);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        this.y.a(this.w, true);
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        i67 i67 = this.w;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.x.getWindow();
                if (!(window2 == null || (decorView2 = window2.getDecorView()) == null || (keyDispatcherState2 = decorView2.getKeyDispatcherState()) == null)) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.x.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                i67.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return i67.performShortcut(i, keyEvent, 0);
    }
}
