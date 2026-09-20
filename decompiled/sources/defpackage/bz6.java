package defpackage;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;

/* renamed from: bz6  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class bz6 extends SpannableStringBuilder {
    public final Class w;
    public final ArrayList x = new ArrayList();

    public bz6(Class cls, CharSequence charSequence) {
        super(charSequence);
        k75.i("watcherClass cannot be null", cls);
        this.w = cls;
    }

    public final void a() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i < arrayList.size()) {
                ((az6) arrayList.get(i)).x.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final void b() {
        e();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i < arrayList.size()) {
                ((az6) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final az6 c(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i >= arrayList.size()) {
                return null;
            }
            az6 az6 = (az6) arrayList.get(i);
            if (az6.w == obj) {
                return az6;
            }
            i++;
        }
    }

    public final boolean d(Object obj) {
        if (obj == null || this.w != obj.getClass()) {
            return false;
        }
        return true;
    }

    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.x;
            if (i < arrayList.size()) {
                ((az6) arrayList.get(i)).x.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final int getSpanEnd(Object obj) {
        az6 c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanEnd(obj);
    }

    public final int getSpanFlags(Object obj) {
        az6 c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanFlags(obj);
    }

    public final int getSpanStart(Object obj) {
        az6 c;
        if (d(obj) && (c = c(obj)) != null) {
            obj = c;
        }
        return super.getSpanStart(obj);
    }

    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.w != cls) {
            return super.getSpans(i, i2, cls);
        }
        az6[] az6Arr = (az6[]) super.getSpans(i, i2, az6.class);
        Object[] objArr = (Object[]) Array.newInstance(cls, az6Arr.length);
        for (int i3 = 0; i3 < az6Arr.length; i3++) {
            objArr[i3] = az6Arr[i3].w;
        }
        return objArr;
    }

    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    public final int nextSpanTransition(int i, int i2, Class<az6> cls) {
        if (cls == null || this.w == cls) {
            cls = az6.class;
        }
        return super.nextSpanTransition(i, i2, cls);
    }

    public final void removeSpan(Object obj) {
        az6 az6;
        if (d(obj)) {
            az6 = c(obj);
            if (az6 != null) {
                obj = az6;
            }
        } else {
            az6 = null;
        }
        super.removeSpan(obj);
        if (az6 != null) {
            this.x.remove(az6);
        }
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        a();
        super.replace(i, i2, charSequence);
        e();
        return this;
    }

    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (d(obj)) {
            az6 az6 = new az6(obj);
            this.x.add(az6);
            obj = az6;
        }
        super.setSpan(obj, i, i2, i3);
    }

    public final CharSequence subSequence(int i, int i2) {
        return new bz6(this.w, this, i, i2);
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m7append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    /* renamed from: delete  reason: collision with other method in class */
    public final SpannableStringBuilder m12delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m13insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m10append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: insert  reason: collision with other method in class */
    public final SpannableStringBuilder m14insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m6append(char c) {
        super.append(c);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m9append(char c) {
        super.append(c);
        return this;
    }

    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final SpannableStringBuilder m8append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    /* renamed from: append  reason: collision with other method in class */
    public final Appendable m11append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        a();
        super.replace(i, i2, charSequence, i3, i4);
        e();
        return this;
    }

    public bz6(Class cls, bz6 bz6, int i, int i2) {
        super(bz6, i, i2);
        k75.i("watcherClass cannot be null", cls);
        this.w = cls;
    }
}
