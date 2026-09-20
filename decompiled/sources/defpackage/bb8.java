package defpackage;

import android.view.WindowInsets;

/* renamed from: bb8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public abstract class bb8 {
    public static int a(int i) {
        int v;
        int i2 = 0;
        for (int i3 = 1; i3 <= 512; i3 <<= 1) {
            if ((i & i3) != 0) {
                if (i3 == 1) {
                    v = WindowInsets.Type.statusBars();
                } else if (i3 == 2) {
                    v = WindowInsets.Type.navigationBars();
                } else if (i3 == 4) {
                    v = WindowInsets.Type.captionBar();
                } else if (i3 == 8) {
                    v = WindowInsets.Type.ime();
                } else if (i3 == 16) {
                    v = WindowInsets.Type.systemGestures();
                } else if (i3 == 32) {
                    v = WindowInsets.Type.mandatorySystemGestures();
                } else if (i3 == 64) {
                    v = WindowInsets.Type.tappableElement();
                } else if (i3 == 128) {
                    v = WindowInsets.Type.displayCutout();
                }
                i2 |= v;
            }
        }
        return i2;
    }
}
