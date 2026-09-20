package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import cu.lestebang.utiletecsa.R;
import java.lang.ref.WeakReference;

/* renamed from: pa  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class pa {
    public final r7 A = new r7(1, this);
    public final Context a;
    public final ra b;
    public final Window c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f;
    public boolean g = false;
    public Button h;
    public Button i;
    public CharSequence j;
    public Message k;
    public Button l;
    public NestedScrollView m;
    public Drawable n;
    public ImageView o;
    public TextView p;
    public TextView q;
    public View r;
    public ListAdapter s;
    public int t = -1;
    public final int u;
    public final int v;
    public final int w;
    public final int x;
    public final boolean y;
    public final na z;

    /* JADX WARNING: type inference failed for: r7v1, types: [na, android.os.Handler] */
    public pa(Context context, ra raVar, Window window) {
        this.a = context;
        this.b = raVar;
        this.c = window;
        ? handler = new Handler();
        handler.a = new WeakReference(raVar);
        this.z = handler;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, qv5.e, R.attr.alertDialogStyle, 0);
        this.u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.w = obtainStyledAttributes.getResourceId(7, 0);
        this.x = obtainStyledAttributes.getResourceId(3, 0);
        this.y = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        raVar.e().i(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
