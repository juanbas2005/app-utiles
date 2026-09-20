package defpackage;

import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: g32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class g32 implements KeyListener {
    public final KeyListener a;

    public g32(KeyListener keyListener) {
        this.a = keyListener;
    }

    public final void clearMetaKeyState(View view, Editable editable, int i) {
        this.a.clearMetaKeyState(view, editable, i);
    }

    public final int getInputType() {
        return this.a.getInputType();
    }

    public final boolean onKeyDown(View view, Editable editable, int i, KeyEvent keyEvent) {
        boolean z;
        if (i == 67) {
            z = wr0.x(editable, keyEvent, false);
        } else if (i != 112) {
            z = false;
        } else {
            z = wr0.x(editable, keyEvent, true);
        }
        if (z) {
            MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
            return true;
        } else if (this.a.onKeyDown(view, editable, i, keyEvent)) {
            return true;
        } else {
            return false;
        }
    }

    public final boolean onKeyOther(View view, Editable editable, KeyEvent keyEvent) {
        return this.a.onKeyOther(view, editable, keyEvent);
    }

    public final boolean onKeyUp(View view, Editable editable, int i, KeyEvent keyEvent) {
        return this.a.onKeyUp(view, editable, i, keyEvent);
    }
}
