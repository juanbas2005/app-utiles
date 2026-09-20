package cu.lestebang.utiletecsa.core.room.data;

import cu.lestebang.utiletecsa.core.room.data.JetpackDatabase_Impl;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
/* compiled from: r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcu/lestebang/utiletecsa/core/room/data/JetpackDatabase_Impl;", "Lcu/lestebang/utiletecsa/core/room/data/JetpackDatabase;", "<init>", "()V", "room"}, k = 1, mv = {2, 4, b85.b}, xi = h75.h)
/* loaded from: classes.dex */
public final class JetpackDatabase_Impl extends JetpackDatabase {
    public final z97 l = new z97(new sr2(this) { // from class: yk3
        public final /* synthetic */ JetpackDatabase_Impl x;

        {
            this.x = this;
        }

        @Override // defpackage.sr2
        public final Object b() {
            int i = r2;
            JetpackDatabase_Impl jetpackDatabase_Impl = this.x;
            switch (i) {
                case b85.b /* 0 */:
                    return new xk3(jetpackDatabase_Impl);
                case 1:
                    return new xy7(jetpackDatabase_Impl);
                case 2:
                    return new oz7(jetpackDatabase_Impl);
                case 3:
                    return new ml7(jetpackDatabase_Impl);
                default:
                    return new fr4(jetpackDatabase_Impl);
            }
        }
    });
    public final z97 m = new z97(new sr2(this) { // from class: yk3
        public final /* synthetic */ JetpackDatabase_Impl x;

        {
            this.x = this;
        }

        @Override // defpackage.sr2
        public final Object b() {
            int i = r2;
            JetpackDatabase_Impl jetpackDatabase_Impl = this.x;
            switch (i) {
                case b85.b /* 0 */:
                    return new xk3(jetpackDatabase_Impl);
                case 1:
                    return new xy7(jetpackDatabase_Impl);
                case 2:
                    return new oz7(jetpackDatabase_Impl);
                case 3:
                    return new ml7(jetpackDatabase_Impl);
                default:
                    return new fr4(jetpackDatabase_Impl);
            }
        }
    });
    public final z97 n = new z97(new sr2(this) { // from class: yk3
        public final /* synthetic */ JetpackDatabase_Impl x;

        {
            this.x = this;
        }

        @Override // defpackage.sr2
        public final Object b() {
            int i = r2;
            JetpackDatabase_Impl jetpackDatabase_Impl = this.x;
            switch (i) {
                case b85.b /* 0 */:
                    return new xk3(jetpackDatabase_Impl);
                case 1:
                    return new xy7(jetpackDatabase_Impl);
                case 2:
                    return new oz7(jetpackDatabase_Impl);
                case 3:
                    return new ml7(jetpackDatabase_Impl);
                default:
                    return new fr4(jetpackDatabase_Impl);
            }
        }
    });
    public final z97 o = new z97(new sr2(this) { // from class: yk3
        public final /* synthetic */ JetpackDatabase_Impl x;

        {
            this.x = this;
        }

        @Override // defpackage.sr2
        public final Object b() {
            int i = r2;
            JetpackDatabase_Impl jetpackDatabase_Impl = this.x;
            switch (i) {
                case b85.b /* 0 */:
                    return new xk3(jetpackDatabase_Impl);
                case 1:
                    return new xy7(jetpackDatabase_Impl);
                case 2:
                    return new oz7(jetpackDatabase_Impl);
                case 3:
                    return new ml7(jetpackDatabase_Impl);
                default:
                    return new fr4(jetpackDatabase_Impl);
            }
        }
    });
    public final z97 p = new z97(new sr2(this) { // from class: yk3
        public final /* synthetic */ JetpackDatabase_Impl x;

        {
            this.x = this;
        }

        @Override // defpackage.sr2
        public final Object b() {
            int i = r2;
            JetpackDatabase_Impl jetpackDatabase_Impl = this.x;
            switch (i) {
                case b85.b /* 0 */:
                    return new xk3(jetpackDatabase_Impl);
                case 1:
                    return new xy7(jetpackDatabase_Impl);
                case 2:
                    return new oz7(jetpackDatabase_Impl);
                case 3:
                    return new ml7(jetpackDatabase_Impl);
                default:
                    return new fr4(jetpackDatabase_Impl);
            }
        }
    });

    @Override // defpackage.a96
    public final List c(LinkedHashMap linkedHashMap) {
        return new ArrayList();
    }

    @Override // defpackage.a96
    public final eh3 d() {
        return new eh3(this, new LinkedHashMap(), new LinkedHashMap(), "jetpacks", "ussd_codes", "ussd_responses", "transfer_recipients", "nauta_accounts");
    }

    @Override // defpackage.a96
    public final t22 e() {
        return new zk3(this);
    }

    @Override // defpackage.a96
    public final Set i() {
        return new LinkedHashSet();
    }

    @Override // defpackage.a96
    public final LinkedHashMap j() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c26 c26Var = b26.a;
        gq3 b = c26Var.b(xk3.class);
        a42 a42Var = a42.w;
        linkedHashMap.put(b, a42Var);
        linkedHashMap.put(c26Var.b(xy7.class), a42Var);
        linkedHashMap.put(c26Var.b(oz7.class), a42Var);
        linkedHashMap.put(c26Var.b(ml7.class), a42Var);
        linkedHashMap.put(c26Var.b(fr4.class), a42Var);
        return linkedHashMap;
    }

    @Override // cu.lestebang.utiletecsa.core.room.data.JetpackDatabase
    public final xk3 r() {
        return (xk3) this.l.getValue();
    }

    @Override // cu.lestebang.utiletecsa.core.room.data.JetpackDatabase
    public final fr4 s() {
        return (fr4) this.p.getValue();
    }

    @Override // cu.lestebang.utiletecsa.core.room.data.JetpackDatabase
    public final ml7 t() {
        return (ml7) this.o.getValue();
    }

    @Override // cu.lestebang.utiletecsa.core.room.data.JetpackDatabase
    public final xy7 u() {
        return (xy7) this.m.getValue();
    }

    @Override // cu.lestebang.utiletecsa.core.room.data.JetpackDatabase
    public final oz7 v() {
        return (oz7) this.n.getValue();
    }
}
