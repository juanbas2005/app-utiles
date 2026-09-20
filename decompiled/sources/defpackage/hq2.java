package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.strictmode.Violation;

/* renamed from: hq2  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class hq2 implements LayoutInflater.Factory2 {
    public final rq2 w;

    public hq2(rq2 rq2) {
        this.w = rq2;
    }

    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z;
        bq2 bq2;
        wq2 wq2;
        eq2 eq2;
        int i;
        eq2 eq22;
        boolean equals = FragmentContainerView.class.getName().equals(str);
        rq2 rq2 = this.w;
        if (equals) {
            return new FragmentContainerView(context, attributeSet, rq2);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue((String) null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, mv5.a);
            int i2 = 0;
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(0);
            }
            int resourceId = obtainStyledAttributes.getResourceId(1, -1);
            String string = obtainStyledAttributes.getString(2);
            obtainStyledAttributes.recycle();
            if (attributeValue != null) {
                try {
                    z = bq2.class.isAssignableFrom(lq2.b(context.getClassLoader(), attributeValue));
                } catch (ClassNotFoundException unused) {
                    z = false;
                }
                if (z) {
                    if (view != null) {
                        i2 = view.getId();
                    }
                    if (i2 == -1 && resourceId == -1 && string == null) {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
                    }
                    if (resourceId != -1) {
                        bq2 = rq2.D(resourceId);
                    } else {
                        bq2 = null;
                    }
                    if (bq2 == null && string != null) {
                        bq2 = rq2.E(string);
                    }
                    if (bq2 == null && i2 != -1) {
                        bq2 = rq2.D(i2);
                    }
                    if (bq2 == null) {
                        lq2 I = rq2.I();
                        context.getClassLoader();
                        bq2 = I.a(attributeValue);
                        bq2.J = true;
                        if (resourceId != 0) {
                            i = resourceId;
                        } else {
                            i = i2;
                        }
                        bq2.T = i;
                        bq2.U = i2;
                        bq2.V = string;
                        bq2.K = true;
                        bq2.P = rq2;
                        dq2 dq2 = rq2.w;
                        bq2.Q = dq2;
                        eq2 eq23 = dq2.M;
                        bq2.a0 = true;
                        if (dq2 == null) {
                            eq22 = null;
                        } else {
                            eq22 = dq2.L;
                        }
                        if (eq22 != null) {
                            bq2.a0 = true;
                        }
                        wq2 = rq2.a(bq2);
                        if (rq2.L(2)) {
                            Log.v("FragmentManager", "Fragment " + bq2 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else if (!bq2.K) {
                        bq2.K = true;
                        bq2.P = rq2;
                        dq2 dq22 = rq2.w;
                        bq2.Q = dq22;
                        eq2 eq24 = dq22.M;
                        bq2.a0 = true;
                        if (dq22 == null) {
                            eq2 = null;
                        } else {
                            eq2 = dq22.L;
                        }
                        if (eq2 != null) {
                            bq2.a0 = true;
                        }
                        wq2 = rq2.g(bq2);
                        if (rq2.L(2)) {
                            Log.v("FragmentManager", "Retained Fragment " + bq2 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                        }
                    } else {
                        throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(i2) + " with another fragment for " + attributeValue);
                    }
                    ViewGroup viewGroup = (ViewGroup) view;
                    yq2 yq2 = zq2.a;
                    zq2.b(new Violation(bq2, "Attempting to use <fragment> tag to add fragment " + bq2 + " to container " + viewGroup));
                    zq2.a(bq2).getClass();
                    bq2.b0 = viewGroup;
                    wq2.k();
                    wq2.j();
                    View view2 = bq2.c0;
                    if (view2 != null) {
                        if (resourceId != 0) {
                            view2.setId(resourceId);
                        }
                        if (bq2.c0.getTag() == null) {
                            bq2.c0.setTag(string);
                        }
                        bq2.c0.addOnAttachStateChangeListener(new gq2(this, wq2));
                        return bq2.c0;
                    }
                    h.s(f21.h("Fragment ", attributeValue, " did not create a view."));
                    return null;
                }
            }
        }
        return null;
    }

    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView((View) null, str, context, attributeSet);
    }
}
