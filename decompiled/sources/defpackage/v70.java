package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.util.Log;
import com.journeyapps.barcodescanner.CaptureActivity;
import cu.lestebang.utiletecsa.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: v70  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class v70 implements g35, fv5, tx4, wc5 {
    public final /* synthetic */ int w;
    public boolean x;
    public Object y;

    public v70(CaptureActivity captureActivity) {
        this.w = 0;
        this.x = true;
        captureActivity.setVolumeControlStream(3);
        this.y = captureActivity.getApplicationContext();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0021  */
    public Object A(long j, long j2, f61 f61) {
        nh6 nh6;
        int i;
        long j3;
        if (f61 instanceof nh6) {
            nh6 = (nh6) f61;
            int i2 = nh6.C;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nh6.C = i2 - Integer.MIN_VALUE;
                Object obj = nh6.A;
                i = nh6.C;
                if (i != 0) {
                    o85.q(obj);
                    j3 = 0;
                    if (this.x) {
                        zh6 zh6 = (zh6) this.y;
                        if (!zh6.i) {
                            nh6.z = j2;
                            nh6.C = 1;
                            obj = zh6.a(j2, nh6);
                            p81 p81 = p81.w;
                            if (obj == p81) {
                                return p81;
                            }
                        }
                        j3 = x38.d(j2, j3);
                    }
                    return new x38(j3);
                } else if (i == 1) {
                    j2 = nh6.z;
                    o85.q(obj);
                } else {
                    h.s("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                j3 = ((x38) obj).a;
                j3 = x38.d(j2, j3);
                return new x38(j3);
            }
        }
        nh6 = new nh6(this, (h61) f61);
        Object obj2 = nh6.A;
        i = nh6.C;
        if (i != 0) {
        }
        j3 = ((x38) obj2).a;
        j3 = x38.d(j2, j3);
        return new x38(j3);
    }

    public void J(String str, String str2) {
        str2.getClass();
        ((wc5) this.y).J(ss0.e(str, false), ss0.e(str2, true));
    }

    public void L(String str, List list) {
        str.getClass();
        list.getClass();
        wc5 wc5 = (wc5) this.y;
        String e = ss0.e(str, false);
        ArrayList arrayList = new ArrayList(et0.e0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            arrayList.add(ss0.e(str2, true));
        }
        wc5.L(e, arrayList);
    }

    public void a(ev5 ev5, int i) {
        StringBuilder sb = (StringBuilder) this.y;
        if (this.x) {
            this.x = false;
        } else {
            sb.append(", ");
        }
        sb.append(i);
    }

    public boolean b() {
        return this.x;
    }

    public boolean c(int i, CharSequence charSequence) {
        if (charSequence == null || i < 0 || charSequence.length() - i < 0) {
            ku4.v();
            return false;
        } else if (((kw5) this.y) == null) {
            return b();
        } else {
            boolean z = true;
            for (int i2 = 0; i2 < i && z; i2++) {
                byte directionality = Character.getDirectionality(charSequence.charAt(i2));
                v70 v70 = vd7.a;
                if (directionality != 0) {
                    if (!(directionality == 1 || directionality == 2)) {
                        switch (directionality) {
                            case 14:
                            case h75.g:
                                break;
                            case 16:
                            case 17:
                                break;
                            default:
                                z = true;
                                break;
                        }
                    }
                    z = false;
                }
                z = true;
            }
            if (!z) {
                return true;
            }
            if (!z) {
                return b();
            }
            return false;
        }
    }

    public void clear() {
        ((wc5) this.y).clear();
    }

    public boolean contains(String str) {
        str.getClass();
        return ((wc5) this.y).contains(ss0.e(str, false));
    }

    public void d() {
        this.x = false;
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, android.media.MediaPlayer$OnCompletionListener] */
    /* JADX WARNING: type inference failed for: r0v4, types: [android.media.MediaPlayer$OnErrorListener, java.lang.Object] */
    public void e() {
        AssetFileDescriptor openRawResourceFd;
        MediaPlayer mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(2).build());
        mediaPlayer.setOnCompletionListener(new Object());
        mediaPlayer.setOnErrorListener(new Object());
        try {
            openRawResourceFd = ((Context) this.y).getResources().openRawResourceFd(R.raw.zxing_beep);
            mediaPlayer.setDataSource(openRawResourceFd.getFileDescriptor(), openRawResourceFd.getStartOffset(), openRawResourceFd.getLength());
            openRawResourceFd.close();
            mediaPlayer.setVolume(0.1f, 0.1f);
            mediaPlayer.prepare();
            mediaPlayer.start();
        } catch (IOException e) {
            Log.w("v70", e);
            mediaPlayer.reset();
            mediaPlayer.release();
        } catch (Throwable th) {
            openRawResourceFd.close();
            throw th;
        }
    }

    public void f(byte b) {
        ((qa) this.y).n(String.valueOf((long) b));
    }

    public void g(char c) {
        qa qaVar = (qa) this.y;
        qaVar.g(qaVar.x, 1);
        int i = qaVar.x;
        qaVar.x = i + 1;
        ((char[]) qaVar.y)[i] = c;
    }

    public void h(int i) {
        ((qa) this.y).n(String.valueOf((long) i));
    }

    public void i(long j) {
        ((qa) this.y).n(String.valueOf(j));
    }

    public boolean isEmpty() {
        return ((wc5) this.y).isEmpty();
    }

    public void j(short s) {
        ((qa) this.y).n(String.valueOf((long) s));
    }

    public void k(String str) {
        int i;
        int i2;
        str.getClass();
        qa qaVar = (qa) this.y;
        qaVar.g(qaVar.x, str.length() + 2);
        char[] cArr = (char[]) qaVar.y;
        int i3 = qaVar.x;
        int i4 = i3 + 1;
        cArr[i3] = '\"';
        int length = str.length();
        str.getChars(0, length, cArr, i4);
        int i5 = length + i4;
        int i6 = i4;
        while (i < i5) {
            char c = cArr[i];
            byte[] bArr = r47.b;
            if (c >= bArr.length || bArr[c] == 0) {
                i6 = i + 1;
            } else {
                int length2 = str.length();
                for (int i7 = i - i4; i7 < length2; i7++) {
                    qaVar.g(i, 2);
                    char charAt = str.charAt(i7);
                    byte[] bArr2 = r47.b;
                    if (charAt < bArr2.length) {
                        byte b = bArr2[charAt];
                        if (b == 0) {
                            i2 = i + 1;
                            ((char[]) qaVar.y)[i] = (char) charAt;
                        } else {
                            if (b == 1) {
                                String str2 = r47.a[charAt];
                                str2.getClass();
                                qaVar.g(i, str2.length());
                                str2.getChars(0, str2.length(), (char[]) qaVar.y, i);
                                int length3 = str2.length() + i;
                                qaVar.x = length3;
                                i = length3;
                            } else {
                                char[] cArr2 = (char[]) qaVar.y;
                                cArr2[i] = '\\';
                                cArr2[i + 1] = (char) b;
                                i += 2;
                                qaVar.x = i;
                            }
                        }
                    } else {
                        i2 = i + 1;
                        ((char[]) qaVar.y)[i] = (char) charAt;
                    }
                    i = i2;
                }
                qaVar.g(i, 1);
                ((char[]) qaVar.y)[i] = '\"';
                qaVar.x = i + 1;
                return;
            }
        }
        cArr[i5] = '\"';
        qaVar.x = i5 + 1;
    }

    public Set l() {
        return ((b57) h75.f((wc5) this.y)).l();
    }

    public void m(Object obj) {
        this.x = true;
        ((g94) this.y).f(obj);
    }

    public long n0(int i, long j, long j2) {
        if (!this.x) {
            return 0;
        }
        zh6 zh6 = (zh6) this.y;
        if (zh6.a.a()) {
            return 0;
        }
        return zh6.i(zh6.e(zh6.a.e(zh6.e(zh6.h(j2)))));
    }

    public Set names() {
        Iterable<String> names = ((wc5) this.y).names();
        ArrayList arrayList = new ArrayList(et0.e0(names, 10));
        for (String d : names) {
            arrayList.add(ss0.d(0, 0, 15, d));
        }
        return dt0.g1(arrayList);
    }

    public void p0(String str, String str2) {
        str.getClass();
        str2.getClass();
        ((wc5) this.y).p0(ss0.e(str, false), ss0.e(str2, true));
    }

    public boolean t() {
        return this.x;
    }

    public String toString() {
        switch (this.w) {
            case 5:
                return ((g94) this.y).toString();
            case 6:
                if (this.x) {
                    return "FALL_THROUGH";
                }
                return String.valueOf(this.y);
            default:
                return super.toString();
        }
    }

    public List v(String str) {
        str.getClass();
        List<String> v = ((wc5) this.y).v(ss0.e(str, false));
        if (v == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(et0.e0(v, 10));
        for (String d : v) {
            arrayList.add(ss0.d(0, 0, 11, d));
        }
        return arrayList;
    }

    public /* synthetic */ v70(int i, Object obj, boolean z) {
        this.w = i;
        this.x = z;
        this.y = obj;
    }

    public void n() {
    }

    public void o() {
    }

    public v70(wc5 wc5) {
        this.w = 11;
        wc5.getClass();
        this.y = wc5;
        this.x = wc5.t();
    }

    public /* synthetic */ v70(int i, Object obj) {
        this.w = i;
        this.y = obj;
        this.x = true;
    }

    public v70(kw5 kw5, boolean z) {
        this.w = 10;
        this.w = 10;
        this.y = kw5;
        this.x = z;
    }

    public v70(ai8 ai8, g94 g94) {
        this.w = 5;
        this.x = false;
        this.y = g94;
    }
}
