package defpackage;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;

/* renamed from: ay  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class ay {
    public static final ArrayList g;
    public boolean a;
    public boolean b;
    public final boolean c;
    public final Camera d;
    public final Handler e;
    public final zx f = new zx(this);

    static {
        ArrayList arrayList = new ArrayList(2);
        g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public ay(Camera camera, ek0 ek0) {
        yx yxVar = new yx(0, this);
        this.e = new Handler(yxVar);
        this.d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        ek0.getClass();
        boolean contains = g.contains(focusMode);
        this.c = contains;
        Log.i("ay", "Current focus mode '" + focusMode + "'; use auto focus? " + contains);
        this.a = false;
        b();
    }

    public final synchronized void a() {
        if (!this.a && !this.e.hasMessages(1)) {
            Handler handler = this.e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000);
        }
    }

    public final void b() {
        if (this.c && !this.a && !this.b) {
            try {
                this.d.autoFocus(this.f);
                this.b = true;
            } catch (RuntimeException e2) {
                Log.w("ay", "Unexpected exception while focusing", e2);
                a();
            }
        }
    }

    public final void c() {
        this.a = true;
        this.b = false;
        this.e.removeMessages(1);
        if (this.c) {
            try {
                this.d.cancelAutoFocus();
            } catch (RuntimeException e2) {
                Log.w("ay", "Unexpected exception while cancelling focusing", e2);
            }
        }
    }
}
