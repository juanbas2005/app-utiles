package defpackage;

import android.graphics.Path;
import android.util.Log;
import androidx.recyclerview.widget.RecyclerView;
import java.time.Instant;
import java.util.List;

/* renamed from: z53  reason: default package */
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
public class z53 implements ds0, d81, of3, sp5, e72, mm8, fs8 {
    public static final /* synthetic */ z53 A = new z53(20);
    public static final /* synthetic */ z53 B = new z53(21);
    public static final /* synthetic */ z53 C = new z53(22);
    public static final /* synthetic */ z53 D = new z53(23);
    public static final /* synthetic */ z53 E = new z53(24);
    public static final /* synthetic */ z53 F = new z53(25);
    public static final /* synthetic */ z53 G = new z53(26);
    public static final /* synthetic */ z53 H = new z53(27);
    public static final /* synthetic */ z53 I = new z53(28);
    public static final /* synthetic */ z53 J = new z53(29);
    public static final /* synthetic */ z53 x = new z53(15);
    public static final /* synthetic */ z53 y = new z53(18);
    public static final /* synthetic */ z53 z = new z53(19);
    public final /* synthetic */ int w;

    public z53(RecyclerView recyclerView) {
        this.w = 7;
    }

    public static void f(z53 z53, gq3 gq3) {
        z53.getClass();
        gq3.getClass();
    }

    public static Path i(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public Object a() {
        switch (this.w) {
            case 18:
                List list = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(14, "measurement.edpb.events_cached_in_no_data_mode", "_f,_v,_cmp").get();
            case 19:
                List list2 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(20, 100000, "measurement.store.max_stored_events_per_app").get()).longValue());
            case 20:
                List list3 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(41, 1800000, "measurement.sgtm.batch.retry_interval").get();
            case 21:
                List list4 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(40, 240000, "measurement.sgtm.batch.long_queuing_threshold").get();
            case 22:
                List list5 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(28, 500, "measurement.upload.minimum_delay").get();
            case 23:
                List list6 = by8.a;
                qn8.x.get();
                return (Long) rn8.a.s(77, 1800000, "measurement.upload.retry_time").get();
            case 24:
                List list7 = by8.a;
                uo8.x.get();
                return (Boolean) vo8.a.n(0, "measurement.test.boolean_flag", false).get();
            case 25:
                List list8 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(23, 27, "measurement.upload.max_item_scoped_custom_parameters").get()).longValue());
            case 26:
                List list9 = by8.a;
                qn8.x.get();
                return (String) rn8.a.u(60, "measurement.rb.attribution.uri_scheme", "https").get();
            case 27:
                List list10 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(75, 65536, "measurement.upload.max_batch_size").get()).longValue());
            case 28:
                List list11 = by8.a;
                qn8.x.get();
                return Integer.valueOf((int) ((Long) rn8.a.s(30, 3000, "measurement.rb.attribution.notify_app_delay_millis").get()).longValue());
            default:
                List list12 = by8.a;
                np8 np8 = (np8) mp8.x.w.w;
                return (Boolean) np8.a.get();
        }
    }

    public void b(gq3 gq3, List list) {
        gq3.getClass();
        list.getClass();
    }

    public qd3 c() {
        Instant j = Instant.now();
        j.getClass();
        qd3 qd3 = qd3.y;
        return tz2.i(j.getEpochSecond(), (long) j.getNano());
    }

    public void d() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    public void e(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case ry4.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
            default:
                str = "";
                break;
        }
        if (i == 6 || i == 7 || i == 8) {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        } else {
            Log.d("ProfileInstaller", str);
        }
    }

    public boolean g(Class cls) {
        return false;
    }

    public vm8 h(Class cls) {
        throw new IllegalStateException("This should never be called.");
    }

    public boolean j(CharSequence charSequence) {
        return false;
    }

    public /* synthetic */ z53(int i) {
        this.w = i;
    }
}
