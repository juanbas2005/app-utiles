package defpackage;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.MultiInstanceInvalidationService;

/* renamed from: nn4  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public final class nn4 extends Binder implements u73 {
    public final /* synthetic */ MultiInstanceInvalidationService d;

    public nn4(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.d = multiInstanceInvalidationService;
        attachInterface(this, u73.b);
    }

    public final void G(int i, String[] strArr) {
        strArr.getClass();
        MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
        synchronized (multiInstanceInvalidationService.y) {
            String str = (String) multiInstanceInvalidationService.x.get(Integer.valueOf(i));
            if (str == null) {
                Log.w("ROOM", "Remote invalidation client ID not registered");
                return;
            }
            int beginBroadcast = multiInstanceInvalidationService.y.beginBroadcast();
            int i2 = 0;
            while (true) {
                on4 on4 = multiInstanceInvalidationService.y;
                if (i2 < beginBroadcast) {
                    try {
                        Object broadcastCookie = on4.getBroadcastCookie(i2);
                        broadcastCookie.getClass();
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.x.get(num);
                        if (i != intValue && str.equals(str2)) {
                            try {
                                ((t73) multiInstanceInvalidationService.y.getBroadcastItem(i2)).k(strArr);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                        i2++;
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.y.finishBroadcast();
                        throw th;
                    }
                } else {
                    on4.finishBroadcast();
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, s73] */
    /* JADX WARNING: type inference failed for: r0v9, types: [java.lang.Object, s73] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = u73.b;
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface(str);
        }
        if (i == 1598968902) {
            parcel2.writeString(str);
            return true;
        }
        t73 t73 = null;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(t73.a);
                if (queryLocalInterface == null || !(queryLocalInterface instanceof t73)) {
                    ? obj = new Object();
                    obj.d = readStrongBinder;
                    t73 = obj;
                } else {
                    t73 = (t73) queryLocalInterface;
                }
            }
            String readString = parcel.readString();
            t73.getClass();
            int i3 = 0;
            if (readString != null) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = this.d;
                synchronized (multiInstanceInvalidationService.y) {
                    try {
                        int i4 = multiInstanceInvalidationService.w + 1;
                        multiInstanceInvalidationService.w = i4;
                        if (multiInstanceInvalidationService.y.register(t73, Integer.valueOf(i4))) {
                            multiInstanceInvalidationService.x.put(Integer.valueOf(i4), readString);
                            i3 = i4;
                        } else {
                            multiInstanceInvalidationService.w--;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            parcel2.writeNoException();
            parcel2.writeInt(i3);
            return true;
        } else if (i == 2) {
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface(t73.a);
                if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof t73)) {
                    ? obj2 = new Object();
                    obj2.d = readStrongBinder2;
                    t73 = obj2;
                } else {
                    t73 = (t73) queryLocalInterface2;
                }
            }
            int readInt = parcel.readInt();
            t73.getClass();
            MultiInstanceInvalidationService multiInstanceInvalidationService2 = this.d;
            synchronized (multiInstanceInvalidationService2.y) {
                multiInstanceInvalidationService2.y.unregister(t73);
                String str2 = (String) multiInstanceInvalidationService2.x.remove(Integer.valueOf(readInt));
            }
            parcel2.writeNoException();
            return true;
        } else if (i != 3) {
            return super.onTransact(i, parcel, parcel2, i2);
        } else {
            G(parcel.readInt(), parcel.createStringArray());
            return true;
        }
    }

    public final IBinder asBinder() {
        return this;
    }
}
