package defpackage;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: ta8  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class ta8 extends sa8 {
    public ta8(db8 db8, WindowInsets windowInsets) {
        super(db8, windowInsets);
    }

    public db8 a() {
        return db8.g((View) null, this.c.consumeDisplayCutout());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta8)) {
            return false;
        }
        ta8 ta8 = (ta8) obj;
        if (!Objects.equals(this.c, ta8.c) || !Objects.equals(this.g, ta8.g) || !ra8.L(this.h, ta8.h)) {
            return false;
        }
        return true;
    }

    public bw1 g() {
        DisplayCutout b = this.c.getDisplayCutout();
        if (b == null) {
            return null;
        }
        return new bw1(b);
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
