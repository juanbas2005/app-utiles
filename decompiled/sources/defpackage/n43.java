package defpackage;

import android.os.Handler;
import com.journeyapps.barcodescanner.CaptureActivity;
import java.util.LinkedHashMap;

/* renamed from: n43  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class n43 {
    public boolean a;
    public boolean b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public n43() {
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new LinkedHashMap();
        this.f = new vd2(14);
        this.a = true;
        this.b = true;
        int i = gk5.a;
    }

    public void a() {
        ((Handler) this.e).removeCallbacksAndMessages((Object) null);
        if (this.a) {
            ((CaptureActivity) this.c).unregisterReceiver((to) this.d);
            this.a = false;
        }
    }

    public void b(y43 y43, vr2 vr2) {
        y43.getClass();
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.d;
        linkedHashMap.put(y43.getKey(), new m43((vr2) linkedHashMap.get(y43.getKey()), vr2, 0));
        LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.c;
        if (!linkedHashMap2.containsKey(y43.getKey())) {
            linkedHashMap2.put(y43.getKey(), new h43(1, y43));
        }
    }

    public n43(CaptureActivity captureActivity, yk0 yk0) {
        this.a = false;
        this.c = captureActivity;
        this.f = yk0;
        this.d = new to(2, this);
        this.e = new Handler();
    }
}
