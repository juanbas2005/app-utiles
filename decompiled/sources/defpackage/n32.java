package defpackage;

import android.os.Handler;
import android.widget.EditText;
import java.lang.ref.WeakReference;

/* renamed from: n32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n32 extends u22 implements Runnable {
    public final WeakReference w;

    public n32(EditText editText) {
        this.w = new WeakReference(editText);
    }

    public final void b() {
        Handler handler;
        EditText editText = (EditText) this.w.get();
        if (editText != null && (handler = editText.getHandler()) != null) {
            handler.post(this);
        }
    }

    public final void run() {
        o32.a((EditText) this.w.get(), 1);
    }
}
