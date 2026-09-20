package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: qa  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class qa implements t5, ct {
    public final /* synthetic */ int w;
    public int x;
    public Object y;

    public qa(Context context) {
        this.w = 0;
        int g = ra.g(context, 0);
        this.y = new ma(new ContextThemeWrapper(context, ra.g(context, g)));
        this.x = g;
    }

    public static void f(String str) {
        int i;
        boolean z;
        if (!str.equalsIgnoreCase(":memory:")) {
            int length = str.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                if (!z2) {
                    i = i2;
                } else {
                    i = length;
                }
                if (sg3.k(str.charAt(i), 32) <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z2) {
                    if (!z) {
                        z2 = true;
                    } else {
                        i2++;
                    }
                } else if (!z) {
                    break;
                } else {
                    length--;
                }
            }
            if (str.subSequence(i2, length + 1).toString().length() != 0) {
                Log.w("SupportSQLite", "deleting the database file: ".concat(str));
                try {
                    SQLiteDatabase.deleteDatabase(new File(str));
                } catch (Exception e) {
                    Log.w("SupportSQLite", "delete failed: ", e);
                }
            }
        }
    }

    public boolean a(View view) {
        ((BottomSheetBehavior) this.y).B(this.x);
        return true;
    }

    public void b(long j) {
        if (!d(j)) {
            int i = this.x;
            long[] jArr = (long[]) this.y;
            if (i >= jArr.length) {
                jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
                this.y = jArr;
            }
            jArr[i] = j;
            if (i >= this.x) {
                this.x = i + 1;
            }
        }
    }

    public void c() {
        Bitmap bitmap;
        this.x = 0;
        Iterator it = ((LinkedHashMap) this.y).values().iterator();
        while (it.hasNext()) {
            ArrayList arrayList = (ArrayList) it.next();
            if (arrayList.size() <= 1) {
                ux5 ux5 = (ux5) dt0.y0(arrayList);
                if (ux5 != null) {
                    bitmap = (Bitmap) ux5.b.get();
                } else {
                    bitmap = null;
                }
                if (bitmap == null) {
                    it.remove();
                }
            } else {
                int size = arrayList.size();
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    int i3 = i2 - i;
                    if (((ux5) arrayList.get(i3)).b.get() == null) {
                        arrayList.remove(i3);
                        i++;
                    }
                }
                if (arrayList.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    public /* synthetic */ ListenableFuture call() {
        return ((kd6) this.y).S0(this.x);
    }

    public boolean d(long j) {
        int i = this.x;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.y)[i2] == j) {
                return true;
            }
        }
        return false;
    }

    public ra e() {
        int i;
        ma maVar = (ma) this.y;
        ra raVar = new ra(maVar.a, this.x);
        View view = maVar.e;
        pa paVar = raVar.C;
        if (view != null) {
            paVar.r = view;
        } else {
            CharSequence charSequence = maVar.d;
            if (charSequence != null) {
                paVar.d = charSequence;
                TextView textView = paVar.p;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = maVar.c;
            if (drawable != null) {
                paVar.n = drawable;
                ImageView imageView = paVar.o;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    paVar.o.setImageDrawable(drawable);
                }
            }
        }
        if (maVar.g != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) maVar.b.inflate(paVar.v, (ViewGroup) null);
            if (maVar.i) {
                i = paVar.w;
            } else {
                i = paVar.x;
            }
            ListAdapter listAdapter = maVar.g;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(maVar.a, i, 16908308, (Object[]) null);
            }
            paVar.s = listAdapter;
            paVar.t = maVar.j;
            if (maVar.h != null) {
                alertController$RecycleListView.setOnItemClickListener(new la(maVar, paVar));
            }
            if (maVar.i) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            paVar.e = alertController$RecycleListView;
        }
        raVar.setCancelable(true);
        raVar.setCanceledOnTouchOutside(true);
        raVar.setOnCancelListener((DialogInterface.OnCancelListener) null);
        raVar.setOnDismissListener((DialogInterface.OnDismissListener) null);
        vi4 vi4 = maVar.f;
        if (vi4 != null) {
            raVar.setOnKeyListener(vi4);
        }
        return raVar;
    }

    public void g(int i, int i2) {
        int i3 = i2 + i;
        char[] cArr = (char[]) this.y;
        if (cArr.length <= i3) {
            int i4 = i * 2;
            if (i3 < i4) {
                i3 = i4;
            }
            this.y = Arrays.copyOf(cArr, i3);
        }
    }

    public void h(int i, vt vtVar) {
        while (true) {
            int i2 = i >> 1;
            if (i2 == 0) {
                break;
            }
            vt vtVar2 = ((vt[]) this.y)[i2];
            vtVar2.getClass();
            if (sg3.l(0, vtVar.g - vtVar2.g) <= 0) {
                break;
            }
            vtVar2.f = i;
            ((vt[]) this.y)[i] = vtVar2;
            i = i2;
        }
        ((vt[]) this.y)[i] = vtVar;
        vtVar.f = i;
    }

    public void i(ir2 ir2, int i, int i2) {
        ((dq1) this.y).k(new h87(ir2), i, i2);
    }

    public void j() {
        xn0 xn0 = xn0.c;
        char[] cArr = (char[]) this.y;
        xn0.getClass();
        cArr.getClass();
        synchronized (xn0) {
            int i = xn0.b;
            if (cArr.length + i < ms.a) {
                xn0.b = i + cArr.length;
                xn0.a.addLast(cArr);
            }
        }
    }

    public void k(long j) {
        int i = this.x;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.y)[i2]) {
                int i3 = this.x - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.y;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.x--;
                return;
            }
            i2++;
        }
    }

    public void l(vt vtVar) {
        vt vtVar2;
        int i = vtVar.f;
        if (i != -1) {
            int i2 = this.x;
            vt vtVar3 = ((vt[]) this.y)[i2];
            vtVar3.getClass();
            vtVar.f = -1;
            ((vt[]) this.y)[i2] = null;
            this.x = i2 - 1;
            if (vtVar != vtVar3) {
                int l = sg3.l(0, vtVar3.g - vtVar.g);
                if (l == 0) {
                    ((vt[]) this.y)[i] = vtVar3;
                    vtVar3.f = i;
                } else if (l < 0) {
                    while (true) {
                        int i3 = i << 1;
                        int i4 = i3 + 1;
                        int i5 = this.x;
                        if (i4 > i5) {
                            if (i3 > i5) {
                                break;
                            }
                            vtVar2 = ((vt[]) this.y)[i3];
                            vtVar2.getClass();
                        } else {
                            vtVar2 = ((vt[]) this.y)[i3];
                            vtVar2.getClass();
                            vt vtVar4 = ((vt[]) this.y)[i4];
                            vtVar4.getClass();
                            if (sg3.l(0, vtVar4.g - vtVar2.g) >= 0) {
                                vtVar2 = vtVar4;
                            }
                        }
                        if (sg3.l(0, vtVar2.g - vtVar3.g) <= 0) {
                            break;
                        }
                        int i6 = vtVar2.f;
                        vtVar2.f = i;
                        ((vt[]) this.y)[i] = vtVar2;
                        i = i6;
                    }
                    ((vt[]) this.y)[i] = vtVar3;
                    vtVar3.f = i;
                } else {
                    h(i, vtVar3);
                }
            }
        } else {
            h.q("Failed requirement.");
        }
    }

    public synchronized void m(mi4 mi4, Bitmap bitmap, Map map, int i) {
        try {
            LinkedHashMap linkedHashMap = (LinkedHashMap) this.y;
            Object obj = linkedHashMap.get(mi4);
            if (obj == null) {
                obj = new ArrayList();
                linkedHashMap.put(mi4, obj);
            }
            ArrayList arrayList = (ArrayList) obj;
            int identityHashCode = System.identityHashCode(bitmap);
            ux5 ux5 = new ux5(identityHashCode, new WeakReference(bitmap), map, i);
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    arrayList.add(ux5);
                    break;
                }
                ux5 ux52 = (ux5) arrayList.get(i2);
                if (i < ux52.d) {
                    i2++;
                } else if (ux52.a == identityHashCode && ux52.b.get() == bitmap) {
                    arrayList.set(i2, ux5);
                } else {
                    arrayList.add(i2, ux5);
                }
            }
            int i3 = this.x;
            this.x = i3 + 1;
            if (i3 >= 10) {
                c();
            }
        } catch (Throwable th) {
            while (true) {
                throw th;
            }
        }
    }

    public void n(String str) {
        str.getClass();
        int length = str.length();
        if (length != 0) {
            g(this.x, length);
            str.getChars(0, str.length(), (char[]) this.y, this.x);
            this.x += length;
        }
    }

    public String toString() {
        switch (this.w) {
            case 5:
                return new String((char[]) this.y, 0, this.x);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ qa(int i, int i2, Object obj) {
        this.w = i2;
        this.y = obj;
        this.x = i;
    }

    public qa(m11 m11, int i) {
        this.w = 14;
        z65.k(m11);
        this.y = m11;
        this.x = i;
    }

    public qa() {
        this.w = 9;
        this.y = new LinkedHashMap();
    }

    public qa(int i, dv5 dv5) {
        this.w = 13;
        this.x = i;
        this.y = new dv5[]{dv5};
    }

    public qa(dv5 dv5, dv5 dv52) {
        this.w = 13;
        this.x = 62;
        this.y = new dv5[]{dv5, dv52};
    }

    public qa(dq1 dq1, int i) {
        this.w = 10;
        this.y = dq1;
        this.w = 10;
        this.x = i;
    }

    public qa(int i, dv5[] dv5Arr) {
        this.w = 12;
        this.x = i;
        this.y = dv5Arr;
    }

    public /* synthetic */ qa(int i, byte b) {
        this.w = i;
    }
}
