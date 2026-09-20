package defpackage;

import android.os.Build;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: az6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class az6 implements TextWatcher, SpanWatcher {
    public final Object w;
    public final AtomicInteger x = new AtomicInteger(0);

    public az6(Object obj) {
        this.w = obj;
    }

    public final void afterTextChanged(Editable editable) {
        ((TextWatcher) this.w).afterTextChanged(editable);
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.w).beforeTextChanged(charSequence, i, i2, i3);
    }

    public final void onSpanAdded(Spannable spannable, Object obj, int i, int i2) {
        if (this.x.get() <= 0 || !(obj instanceof uq7)) {
            ((SpanWatcher) this.w).onSpanAdded(spannable, obj, i, i2);
        }
    }

    public final void onSpanChanged(Spannable spannable, Object obj, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        if (this.x.get() <= 0 || !(obj instanceof uq7)) {
            if (Build.VERSION.SDK_INT < 28) {
                if (i > i2) {
                    i = 0;
                }
                if (i3 > i4) {
                    i6 = i;
                    i5 = 0;
                    ((SpanWatcher) this.w).onSpanChanged(spannable, obj, i6, i2, i5, i4);
                }
            }
            i6 = i;
            i5 = i3;
            ((SpanWatcher) this.w).onSpanChanged(spannable, obj, i6, i2, i5, i4);
        }
    }

    public final void onSpanRemoved(Spannable spannable, Object obj, int i, int i2) {
        if (this.x.get() <= 0 || !(obj instanceof uq7)) {
            ((SpanWatcher) this.w).onSpanRemoved(spannable, obj, i, i2);
        }
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        ((TextWatcher) this.w).onTextChanged(charSequence, i, i2, i3);
    }
}
