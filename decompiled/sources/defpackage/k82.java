package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* renamed from: k82  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class k82 extends InputStream implements DataInput {
    public final int A;
    public final DataInputStream w;
    public int x;
    public ByteOrder y;
    public byte[] z;

    public k82(InputStream inputStream, int i) {
        int i2;
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.w = dataInputStream;
        dataInputStream.mark(0);
        this.x = 0;
        this.y = byteOrder;
        if (inputStream instanceof k82) {
            i2 = ((k82) inputStream).A;
        } else {
            i2 = -1;
        }
        this.A = i2;
    }

    public final void a(int i) {
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            DataInputStream dataInputStream = this.w;
            int skip = (int) dataInputStream.skip((long) i3);
            if (skip <= 0) {
                if (this.z == null) {
                    this.z = new byte[8192];
                }
                skip = dataInputStream.read(this.z, 0, Math.min(8192, i3));
                if (skip == -1) {
                    throw new EOFException(pb4.i(i, "Reached EOF while skipping ", " bytes."));
                }
            }
            i2 += skip;
        }
        this.x += i2;
    }

    public final int available() {
        return this.w.available();
    }

    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    public final int read() {
        this.x++;
        return this.w.read();
    }

    public final boolean readBoolean() {
        this.x++;
        return this.w.readBoolean();
    }

    public final byte readByte() {
        this.x++;
        int read = this.w.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    public final char readChar() {
        this.x += 2;
        return this.w.readChar();
    }

    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public final void readFully(byte[] bArr) {
        this.x += bArr.length;
        this.w.readFully(bArr);
    }

    public final int readInt() {
        this.x += 4;
        DataInputStream dataInputStream = this.w;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.y;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            rf2.s("Invalid byte order: ", this.y);
            return 0;
        }
        throw new EOFException();
    }

    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    public final long readLong() {
        this.x += 8;
        DataInputStream dataInputStream = this.w;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.y;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (((long) read8) << 56) + (((long) read7) << 48) + (((long) read6) << 40) + (((long) read5) << 32) + (((long) read4) << 24) + (((long) read3) << 16) + (((long) read2) << 8) + ((long) read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (((long) read) << 56) + (((long) read2) << 48) + (((long) read3) << 40) + (((long) read4) << 32) + (((long) read5) << 24) + (((long) read6) << 16) + (((long) read7) << 8) + ((long) read8);
            }
            rf2.s("Invalid byte order: ", this.y);
            return 0;
        }
        throw new EOFException();
    }

    public final short readShort() {
        this.x += 2;
        DataInputStream dataInputStream = this.w;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.y;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            rf2.s("Invalid byte order: ", this.y);
            return 0;
        }
        throw new EOFException();
    }

    public final String readUTF() {
        this.x += 2;
        return this.w.readUTF();
    }

    public final int readUnsignedByte() {
        this.x++;
        return this.w.readUnsignedByte();
    }

    public final int readUnsignedShort() {
        this.x += 2;
        DataInputStream dataInputStream = this.w;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.y;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            rf2.s("Invalid byte order: ", this.y);
            return 0;
        }
        throw new EOFException();
    }

    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public final void readFully(byte[] bArr, int i, int i2) {
        this.x += i2;
        this.w.readFully(bArr, i, i2);
    }

    public final int read(byte[] bArr, int i, int i2) {
        int read = this.w.read(bArr, i, i2);
        this.x += read;
        return read;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public k82(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    public k82(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.A = bArr.length;
    }
}
