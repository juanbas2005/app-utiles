package defpackage;

import android.util.Log;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: wa1  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class wa1 {
    public static final Charset e = Charset.forName("UTF-8");
    public static final int f = 15;
    public static final va1 g = new Object();
    public static final wh h = new wh(2);
    public static final g91 i = new g91(2);
    public final AtomicInteger a = new AtomicInteger(0);
    public final md2 b;
    public final z00 c;
    public final h91 d;

    public wa1(md2 md2, z00 z00, h91 h91) {
        this.b = md2;
        this.c = z00;
        this.d = h91;
    }

    public static void a(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
    }

    public static String e(File file) {
        byte[] bArr = new byte[8192];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = new FileInputStream(file);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str = new String(byteArrayOutputStream.toByteArray(), e);
                    fileInputStream.close();
                    return str;
                }
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        throw th;
    }

    public static void f(File file, String str) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file), e);
        try {
            outputStreamWriter.write(str);
            outputStreamWriter.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public final ArrayList b() {
        ArrayList arrayList = new ArrayList();
        md2 md2 = this.b;
        arrayList.addAll(md2.f(((File) md2.g).listFiles()));
        arrayList.addAll(md2.f(((File) md2.h).listFiles()));
        wh whVar = h;
        Collections.sort(arrayList, whVar);
        List f2 = md2.f(((File) md2.f).listFiles());
        Collections.sort(f2, whVar);
        arrayList.addAll(f2);
        return arrayList;
    }

    public final NavigableSet c() {
        return new TreeSet(md2.f(((File) this.b.e).list())).descendingSet();
    }

    public final void d(na1 na1, String str, boolean z) {
        String str2;
        md2 md2 = this.b;
        int i2 = this.c.d().a.x;
        g.getClass();
        String u = va1.a.u(na1);
        String format = String.format(Locale.US, "%010d", new Object[]{Integer.valueOf(this.a.getAndIncrement())});
        if (z) {
            str2 = "_";
        } else {
            str2 = "";
        }
        try {
            f(md2.c(str, f21.h("event", format, str2)), u);
        } catch (IOException e2) {
            Log.w("FirebaseCrashlytics", "Could not persist event for session " + str, e2);
        }
        g91 g91 = new g91(3);
        md2.getClass();
        File file = new File((File) md2.e, str);
        file.mkdirs();
        List<File> f2 = md2.f(file.listFiles(g91));
        Collections.sort(f2, new wh(3));
        int size = f2.size();
        for (File file2 : f2) {
            if (size > i2) {
                md2.e(file2);
                size--;
            } else {
                return;
            }
        }
    }
}
