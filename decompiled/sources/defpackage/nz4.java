package defpackage;

import java.io.FileNotFoundException;
import java.nio.file.CopyOption;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* renamed from: nz4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nz4 extends sp3 {
    public static Long M(FileTime fileTime) {
        long d = fileTime.toMillis();
        Long valueOf = Long.valueOf(d);
        if (d != 0) {
            return valueOf;
        }
        return null;
    }

    public final dq1 E(ae5 ae5) {
        Path path;
        ae5 ae52;
        Long l;
        Long l2;
        ae5.getClass();
        Path m = Paths.get(ae5.w.r(), new String[0]);
        m.getClass();
        Long l3 = null;
        try {
            BasicFileAttributes readAttributes = Files.readAttributes(m, BasicFileAttributes.class, new LinkOption[]{LinkOption.NOFOLLOW_LINKS});
            if (readAttributes.isSymbolicLink()) {
                path = Files.readSymbolicLink(m);
            } else {
                path = null;
            }
            boolean isRegularFile = readAttributes.isRegularFile();
            boolean isDirectory = readAttributes.isDirectory();
            if (path != null) {
                String str = ae5.x;
                ae52 = tz2.k(path.toString());
            } else {
                ae52 = null;
            }
            Long valueOf = Long.valueOf(readAttributes.size());
            FileTime creationTime = readAttributes.creationTime();
            if (creationTime != null) {
                l = M(creationTime);
            } else {
                l = null;
            }
            FileTime lastModifiedTime = readAttributes.lastModifiedTime();
            if (lastModifiedTime != null) {
                l2 = M(lastModifiedTime);
            } else {
                l2 = null;
            }
            FileTime lastAccessTime = readAttributes.lastAccessTime();
            if (lastAccessTime != null) {
                l3 = M(lastAccessTime);
            }
            return new dq1(isRegularFile, isDirectory, ae52, valueOf, l, l2, l3);
        } catch (FileSystemException | NoSuchFileException unused) {
            return null;
        }
    }

    public final void k(ae5 ae5, ae5 ae52) {
        ae5.getClass();
        ae52.getClass();
        try {
            Path m = Paths.get(ae5.w.r(), new String[0]);
            m.getClass();
            Path m2 = Paths.get(ae52.w.r(), new String[0]);
            m2.getClass();
            Files.move(m, m2, new CopyOption[]{StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING});
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        } catch (UnsupportedOperationException unused) {
            rf2.i("atomic move not supported");
        }
    }

    public final String toString() {
        return "NioSystemFileSystem";
    }
}
