package defpackage;

import java.io.File;
import java.util.Comparator;

/* renamed from: wh  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final /* synthetic */ class wh implements Comparator {
    public final /* synthetic */ int w;

    public /* synthetic */ wh(int i) {
        this.w = i;
    }

    public final int compare(Object obj, Object obj2) {
        switch (this.w) {
            case b85.b:
                return sg3.k(((wo5) obj2).a, ((wo5) obj).a);
            case 1:
                return Long.compare(((File) obj2).lastModified(), ((File) obj).lastModified());
            case 2:
                return ((File) obj2).getName().compareTo(((File) obj).getName());
            case 3:
                String name = ((File) obj).getName();
                int i = wa1.f;
                return name.substring(0, i).compareTo(((File) obj2).getName().substring(0, i));
            case 4:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i2 = 0; i2 < bArr.length; i2++) {
                    byte b = bArr[i2];
                    byte b2 = bArr2[i2];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
            case 5:
                return sg3.k(((ch3) obj).b, ((ch3) obj2).b);
            case 6:
                re3 re3 = (re3) obj;
                re3 re32 = (re3) obj2;
                return (re3.x - re3.w) - (re32.x - re32.w);
            case 7:
                uy3 uy3 = (uy3) obj;
                uy3 uy32 = (uy3) obj2;
                float f = uy3.b0.p.a0;
                float f2 = uy32.b0.p.a0;
                if (f == f2) {
                    return sg3.k(uy3.w(), uy32.w());
                }
                return Float.compare(f, f2);
            case 8:
                return sg3.k(((k24) obj).getIndex(), ((k24) obj2).getIndex());
            default:
                return ((hz) ((u91) obj)).a.compareTo(((hz) ((u91) obj2)).a);
        }
    }
}
