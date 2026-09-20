package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;

/* renamed from: qd2  reason: default package */
public abstract class qd2 extends dh4 {
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        defpackage.ed1.i(r1, r3);
     */
    public static String L(File file) {
        Charset charset = mo0.a;
        charset.getClass();
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), charset);
        String j = w95.j(inputStreamReader);
        inputStreamReader.close();
        return j;
    }

    public static File M(File file) {
        int F0;
        File file2 = new File("image_cache");
        String path = file2.getPath();
        path.getClass();
        char c = File.separatorChar;
        int i = 0;
        int F02 = d57.F0(path, c, 0, 4);
        if (F02 == 0) {
            if (path.length() <= 1 || path.charAt(1) != c || (F0 = d57.F0(path, c, 2, 4)) < 0) {
                i = 1;
            } else {
                int F03 = d57.F0(path, c, F0 + 1, 4);
                i = F03 >= 0 ? F03 + 1 : path.length();
            }
        } else if (F02 > 0 && path.charAt(F02 - 1) == ':') {
            i = F02 + 1;
        } else if (F02 == -1 && d57.B0(path, ':')) {
            i = path.length();
        }
        if (i > 0) {
            return file2;
        }
        String file3 = file.toString();
        file3.getClass();
        if (file3.length() != 0 && !d57.B0(file3, c)) {
            return new File(file3 + c + file2);
        }
        return new File(file3 + file2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        throw r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0016, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        defpackage.ed1.i(r1, r2);
     */
    public static void N(File file, String str) {
        Charset charset = mo0.a;
        str.getClass();
        charset.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        O(fileOutputStream, str, charset);
        fileOutputStream.close();
    }

    public static final void O(FileOutputStream fileOutputStream, String str, Charset charset) {
        boolean z;
        str.getClass();
        if (str.length() < 16384) {
            byte[] bytes = str.getBytes(charset);
            bytes.getClass();
            fileOutputStream.write(bytes);
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        onUnmappableCharacter.getClass();
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) ((float) Math.ceil((double) onUnmappableCharacter.maxBytesPerChar()))));
        allocate2.getClass();
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            char[] array = allocate.array();
            array.getClass();
            str.getChars(i, i3, array, i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (i3 == str.length()) {
                z = true;
            } else {
                z = false;
            }
            if (onUnmappableCharacter.encode(allocate, allocate2, z).isUnderflow()) {
                fileOutputStream.write(allocate2.array(), 0, allocate2.position());
                if (allocate.position() != allocate.limit()) {
                    allocate.put(0, allocate.get());
                } else {
                    i2 = 0;
                }
                allocate.clear();
                allocate2.clear();
                i = i3;
            } else {
                h.s("Check failed.");
                return;
            }
        }
    }
}
