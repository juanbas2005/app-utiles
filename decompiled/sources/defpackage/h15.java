package defpackage;

import android.app.Notification;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: h15  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class h15 {
    public final String a;
    public final int b;
    public final Notification c;

    public h15(String str, int i, Notification notification) {
        this.a = str;
        this.b = i;
        this.c = notification;
    }

    public final void a(x73 x73) {
        String str = this.a;
        int i = this.b;
        Notification notification = this.c;
        v73 v73 = (v73) x73;
        v73.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(x73.c);
            obtain.writeString(str);
            obtain.writeInt(i);
            obtain.writeString((String) null);
            obtain.writeTypedObject(notification, 0);
            if (!v73.d.transact(1, obtain, (Parcel) null, 1)) {
                throw new RemoteException("Method notify is unimplemented.");
            }
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NotifyTask[packageName:");
        sb.append(this.a);
        sb.append(", id:");
        return hl6.n(sb, this.b, ", tag:null]");
    }
}
