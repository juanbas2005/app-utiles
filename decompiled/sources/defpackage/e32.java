package defpackage;

import android.os.Handler;
import android.text.InputFilter;
import android.text.Selection;
import android.text.Spannable;
import android.widget.TextView;
import java.lang.ref.WeakReference;

/* renamed from: e32  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class e32 extends u22 implements Runnable {
    public final WeakReference w;
    public final WeakReference x;

    public e32(TextView textView, f32 f32) {
        this.w = new WeakReference(textView);
        this.x = new WeakReference(f32);
    }

    public final void b() {
        Handler handler;
        TextView textView = (TextView) this.w.get();
        if (textView != null && (handler = textView.getHandler()) != null) {
            handler.post(this);
        }
    }

    public final void run() {
        InputFilter[] filters;
        int i;
        TextView textView = (TextView) this.w.get();
        InputFilter inputFilter = (InputFilter) this.x.get();
        if (inputFilter != null && textView != null && (filters = textView.getFilters()) != null) {
            int i2 = 0;
            while (i2 < filters.length) {
                if (filters[i2] != inputFilter) {
                    i2++;
                } else if (textView.isAttachedToWindow()) {
                    CharSequence text = textView.getText();
                    w22 a = w22.a();
                    if (text == null) {
                        i = 0;
                    } else {
                        a.getClass();
                        i = text.length();
                    }
                    CharSequence g = a.g(0, i, 0, text);
                    if (text != g) {
                        int selectionStart = Selection.getSelectionStart(g);
                        int selectionEnd = Selection.getSelectionEnd(g);
                        textView.setText(g);
                        if (g instanceof Spannable) {
                            Spannable spannable = (Spannable) g;
                            if (selectionStart >= 0 && selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionStart, selectionEnd);
                                return;
                            } else if (selectionStart >= 0) {
                                Selection.setSelection(spannable, selectionStart);
                                return;
                            } else if (selectionEnd >= 0) {
                                Selection.setSelection(spannable, selectionEnd);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
    }
}
