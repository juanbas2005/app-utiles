package defpackage;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: q30  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class q30 implements oq2 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public String h;
    public int i;
    public CharSequence j;
    public int k;
    public CharSequence l;
    public ArrayList m;
    public ArrayList n;
    public boolean o;
    public ArrayList p;
    public final rq2 q;
    public boolean r;
    public int s;

    public q30(rq2 rq2) {
        rq2.I();
        dq2 dq2 = rq2.w;
        if (dq2 != null) {
            dq2.M.getClassLoader();
        }
        this.a = new ArrayList();
        this.o = false;
        this.s = -1;
        this.q = rq2;
    }

    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (rq2.L(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.g) {
            return true;
        }
        this.q.d.add(this);
        return true;
    }

    public final void b(ar2 ar2) {
        this.a.add(ar2);
        ar2.d = this.b;
        ar2.e = this.c;
        ar2.f = this.d;
        ar2.g = this.e;
    }

    public final void c(int i2) {
        if (this.g) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i2);
            }
            ArrayList arrayList = this.a;
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                ar2 ar2 = (ar2) arrayList.get(i3);
                bq2 bq2 = ar2.b;
                if (bq2 != null) {
                    bq2.O += i2;
                    if (rq2.L(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + ar2.b + " to " + ar2.b.O);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            ar2 ar2 = (ar2) arrayList.get(size);
            if (ar2.c) {
                if (ar2.a == 8) {
                    ar2.c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i2 = ar2.b.U;
                    ar2.a = 2;
                    ar2.c = false;
                    for (int i3 = size - 1; i3 >= 0; i3--) {
                        ar2 ar22 = (ar2) arrayList.get(i3);
                        if (ar22.c && ar22.b.U == i2) {
                            arrayList.remove(i3);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z, boolean z2) {
        if (!this.r) {
            if (rq2.L(2)) {
                Log.v("FragmentManager", "Commit: " + this);
                PrintWriter printWriter = new PrintWriter(new zb4());
                g("  ", printWriter, true);
                printWriter.close();
            }
            this.r = true;
            boolean z3 = this.g;
            rq2 rq2 = this.q;
            if (z3) {
                this.s = rq2.k.getAndIncrement();
            } else {
                this.s = -1;
            }
            if (z2) {
                rq2.y(this, z);
            }
            return this.s;
        }
        h.s("commit already called");
        return 0;
    }

    public final void f(int i2, bq2 bq2, String str, int i3) {
        String str2 = bq2.j0;
        if (str2 != null) {
            zq2.c(bq2, str2);
        }
        Class<?> cls = bq2.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            h.k(cls.getCanonicalName(), " must be a public static class to be  properly recreated from instance state.", "Fragment ");
            return;
        }
        if (str != null) {
            String str3 = bq2.V;
            if (str3 == null || str.equals(str3)) {
                bq2.V = str;
            } else {
                StringBuilder sb = new StringBuilder("Can't change tag of fragment ");
                sb.append(bq2);
                sb.append(": was ");
                h.s(f21.m(sb, bq2.V, " now ", str));
                return;
            }
        }
        if (i2 != 0) {
            if (i2 != -1) {
                int i4 = bq2.T;
                if (i4 == 0 || i4 == i2) {
                    bq2.T = i2;
                    bq2.U = i2;
                } else {
                    StringBuilder sb2 = new StringBuilder("Can't change container ID of fragment ");
                    sb2.append(bq2);
                    int i5 = bq2.T;
                    sb2.append(": was ");
                    sb2.append(i5);
                    sb2.append(" now ");
                    sb2.append(i2);
                    throw new IllegalStateException(sb2.toString());
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + bq2 + " with tag " + str + " to container view with no id");
            }
        }
        b(new ar2(i3, bq2));
        bq2.P = this.q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z) {
        String str2;
        if (z) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.h);
            printWriter.print(" mIndex=");
            printWriter.print(this.s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.r);
            if (this.f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f));
            }
            if (!(this.b == 0 && this.c == 0)) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.c));
            }
            if (!(this.d == 0 && this.e == 0)) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.e));
            }
            if (!(this.i == 0 && this.j == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (!(this.k == 0 && this.l == null)) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.l);
            }
        }
        ArrayList arrayList = this.a;
        if (!arrayList.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Operations:");
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ar2 ar2 = (ar2) arrayList.get(i2);
                switch (ar2.a) {
                    case b85.b:
                        str2 = "NULL";
                        break;
                    case 1:
                        str2 = "ADD";
                        break;
                    case 2:
                        str2 = "REPLACE";
                        break;
                    case 3:
                        str2 = "REMOVE";
                        break;
                    case 4:
                        str2 = "HIDE";
                        break;
                    case 5:
                        str2 = "SHOW";
                        break;
                    case 6:
                        str2 = "DETACH";
                        break;
                    case 7:
                        str2 = "ATTACH";
                        break;
                    case 8:
                        str2 = "SET_PRIMARY_NAV";
                        break;
                    case 9:
                        str2 = "UNSET_PRIMARY_NAV";
                        break;
                    case 10:
                        str2 = "OP_SET_MAX_LIFECYCLE";
                        break;
                    default:
                        str2 = "cmd=" + ar2.a;
                        break;
                }
                printWriter.print(str);
                printWriter.print("  Op #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.print(str2);
                printWriter.print(" ");
                printWriter.println(ar2.b);
                if (z) {
                    if (!(ar2.d == 0 && ar2.e == 0)) {
                        printWriter.print(str);
                        printWriter.print("enterAnim=#");
                        printWriter.print(Integer.toHexString(ar2.d));
                        printWriter.print(" exitAnim=#");
                        printWriter.println(Integer.toHexString(ar2.e));
                    }
                    if (ar2.f != 0 || ar2.g != 0) {
                        printWriter.print(str);
                        printWriter.print("popEnterAnim=#");
                        printWriter.print(Integer.toHexString(ar2.f));
                        printWriter.print(" popExitAnim=#");
                        printWriter.println(Integer.toHexString(ar2.g));
                    }
                }
            }
        }
    }

    public final void h(bq2 bq2) {
        rq2 rq2 = bq2.P;
        if (rq2 == null || rq2 == this.q) {
            b(new ar2(3, bq2));
            return;
        }
        throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + bq2.toString() + " is already attached to a FragmentManager.");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("BackStackEntry{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.s >= 0) {
            sb.append(" #");
            sb.append(this.s);
        }
        if (this.h != null) {
            sb.append(" ");
            sb.append(this.h);
        }
        sb.append("}");
        return sb.toString();
    }
}
