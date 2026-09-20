package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;

/* renamed from: qv0  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class qv0 extends Activity implements t54, rs3 {
    public final w54 w = new w54(this, true);

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (h03.h(decorView, keyEvent)) {
            return true;
        }
        return h03.i(this, decorView, this, keyEvent);
    }

    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        View decorView = getWindow().getDecorView();
        decorView.getClass();
        if (h03.h(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    public final boolean f(KeyEvent keyEvent) {
        keyEvent.getClass();
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i = w46.x;
        u46.b(this);
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        this.w.h1(k54.y);
        super.onSaveInstanceState(bundle);
    }
}
