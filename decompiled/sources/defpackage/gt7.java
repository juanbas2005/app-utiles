package defpackage;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* renamed from: gt7  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class gt7 implements Spannable {
    public boolean w = false;
    public Spannable x;

    public gt7(Spannable spannable) {
        this.x = spannable;
    }

    public final void a() {
        z53 z53;
        Spannable spannable = this.x;
        if (!this.w) {
            if (Build.VERSION.SDK_INT < 28) {
                z53 = new z53(13);
            } else {
                z53 = new z53(13);
            }
            if (z53.j(spannable)) {
                this.x = new SpannableString(spannable);
            }
        }
        this.w = true;
    }

    public final char charAt(int i) {
        return this.x.charAt(i);
    }

    public final IntStream chars() {
        return this.x.chars();
    }

    public final IntStream codePoints() {
        return this.x.codePoints();
    }

    public final int getSpanEnd(Object obj) {
        return this.x.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        return this.x.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        return this.x.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.x.getSpans(i, i2, cls);
    }

    public final int length() {
        return this.x.length();
    }

    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.x.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        a();
        this.x.removeSpan(obj);
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        a();
        this.x.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return this.x.subSequence(i, i2);
    }

    public final String toString() {
        return this.x.toString();
    }
}
