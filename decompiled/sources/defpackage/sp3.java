package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

/* renamed from: sp3  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class sp3 extends nd2 {
    public final List B(ae5 ae5) {
        File file = ae5.toFile();
        String[] list = file.list();
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (String str : list) {
                str.getClass();
                arrayList.add(ae5.d(str));
            }
            ht0.f0(arrayList);
            return arrayList;
        } else if (!file.exists()) {
            ta1.m("no such file: ", ae5);
            return null;
        } else {
            kj6.p("failed to list ", ae5);
            return null;
        }
    }

    public dq1 E(ae5 ae5) {
        ae5.getClass();
        File file = ae5.toFile();
        boolean isFile = file.isFile();
        boolean isDirectory = file.isDirectory();
        long lastModified = file.lastModified();
        long length = file.length();
        if (!isFile && !isDirectory && lastModified == 0 && length == 0 && !file.exists()) {
            return null;
        }
        return new dq1(isFile, isDirectory, (ae5) null, Long.valueOf(length), (Long) null, Long.valueOf(lastModified), (Long) null);
    }

    public final go3 G(ae5 ae5) {
        return new go3(new RandomAccessFile(ae5.toFile(), "r"));
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ri7, java.lang.Object] */
    public final tu6 I(ae5 ae5) {
        ae5.getClass();
        return new d95(new FileOutputStream(ae5.toFile(), false), new Object());
    }

    public final oy6 L(ae5 ae5) {
        ae5.getClass();
        return new wc3(new FileInputStream(ae5.toFile()), ri7.d);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [ri7, java.lang.Object] */
    public final tu6 a(ae5 ae5) {
        ae5.getClass();
        return new d95(new FileOutputStream(ae5.toFile(), true), new Object());
    }

    public void k(ae5 ae5, ae5 ae52) {
        ae5.getClass();
        ae52.getClass();
        if (!ae5.toFile().renameTo(ae52.toFile())) {
            throw new IOException("failed to move " + ae5 + " to " + ae52);
        }
    }

    public final void l(ae5 ae5) {
        ae5.getClass();
        if (!ae5.toFile().mkdir()) {
            dq1 E = E(ae5);
            if (E == null || !E.c) {
                kj6.p("failed to create directory: ", ae5);
            }
        }
    }

    public final void o(ae5 ae5) {
        ae5.getClass();
        if (!Thread.interrupted()) {
            File file = ae5.toFile();
            if (!file.delete() && file.exists()) {
                kj6.p("failed to delete ", ae5);
                return;
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    public String toString() {
        return "JvmSystemFileSystem";
    }
}
