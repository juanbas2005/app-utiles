package defpackage;

import android.os.FileObserver;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: fo4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class fo4 extends FileObserver {
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public final CopyOnWriteArrayList a = new CopyOnWriteArrayList();

    public fo4(String str) {
        super(str, 128);
    }

    public final void onEvent(int i, String str) {
        for (vr2 y : this.a) {
            y.y(str);
        }
    }
}
