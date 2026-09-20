package defpackage;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: au1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class au1 {
    public boolean a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;
    public final Object f;
    public final Serializable g;
    public Object h;

    public au1(AssetManager assetManager, Executor executor, sp5 sp5, String str, File file) {
        byte[] bArr;
        this.a = false;
        this.b = executor;
        this.c = sp5;
        this.g = str;
        this.f = file;
        int i = Build.VERSION.SDK_INT;
        if (i < 31) {
            switch (i) {
                case 24:
                case 25:
                    bArr = pd8.s;
                    break;
                case 26:
                    bArr = pd8.r;
                    break;
                case 27:
                    bArr = pd8.q;
                    break;
                case 28:
                case 29:
                case 30:
                    bArr = pd8.p;
                    break;
                default:
                    bArr = null;
                    break;
            }
        } else {
            bArr = pd8.o;
        }
        this.d = bArr;
    }

    public Integer a(int i) {
        Integer num = (Integer) ((LinkedHashMap) this.g).get(Integer.valueOf(i));
        if (num != null) {
            return num;
        }
        au1 au1 = (au1) this.e;
        if (au1 != null) {
            return au1.a(i);
        }
        return null;
    }

    public FileInputStream b(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e2) {
            String message = e2.getMessage();
            if (message == null || !message.contains("compressed")) {
                return null;
            }
            ((sp5) this.c).d();
            return null;
        }
    }

    public void c(int i, Serializable serializable) {
        ((Executor) this.b).execute(new r80(this, i, serializable, 3));
    }

    public au1 d(List list) {
        list.getClass();
        au1 au1 = new au1((vq4) this.b, (wv1) this.c, (i48) this.d, this.a, this, (List) this.f);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gt5 gt5 = (gt5) it.next();
            ((LinkedHashMap) au1.g).put(Integer.valueOf(gt5.A), Integer.valueOf(gt5.z));
        }
        return au1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ au1(vq4 vq4, wv1 wv1, i48 i48, boolean z, List list, int i) {
        this(vq4, wv1, i48, z, (au1) null, (i & 32) != 0 ? a42.w : list);
    }

    public au1(vq4 vq4, wv1 wv1, i48 i48, boolean z, au1 au1, List list) {
        vq4.getClass();
        wv1.getClass();
        i48.getClass();
        list.getClass();
        this.b = vq4;
        this.c = wv1;
        this.d = i48;
        this.a = z;
        this.e = au1;
        this.f = list;
        this.g = new LinkedHashMap();
        nk4.a.getClass();
        this.h = mk4.a();
    }
}
