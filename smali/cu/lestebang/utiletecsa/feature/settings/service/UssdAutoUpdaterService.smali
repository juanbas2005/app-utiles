.class public final Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;
.super Landroid/app/Service;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lnu2;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "k75",
        "settings"
    }
    k = 0x1
    mv = {
        0x2,
        0x4,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final T:Ld37;


# instance fields
.field public A:Lk40;

.field public B:Lh81;

.field public C:Lig0;

.field public final D:Lqq4;

.field public E:Lh27;

.field public F:J

.field public G:Landroid/telephony/TelephonyManager;

.field public H:Landroid/telephony/TelephonyCallback;

.field public I:Lwx2;

.field public J:J

.field public K:Lsy7;

.field public L:J

.field public M:Landroid/net/ConnectivityManager;

.field public N:Ldb3;

.field public O:Z

.field public final P:Landroid/content/IntentFilter;

.field public final Q:Lpy7;

.field public final R:Landroid/content/IntentFilter;

.field public final S:Lpy7;

.field public volatile w:Lyl6;

.field public final x:Ljava/lang/Object;

.field public y:Z

.field public z:Ldv7;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {v0}, Le37;->a(Ljava/lang/Object;)Ld37;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->T:Ld37;

    .line 8
    .line 9
    return-void
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Landroid/app/Service;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->x:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->y:Z

    .line 13
    .line 14
    new-instance v0, Lqq4;

    .line 15
    .line 16
    invoke-direct {v0}, Lqq4;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->D:Lqq4;

    .line 20
    .line 21
    new-instance v0, Landroid/content/IntentFilter;

    .line 22
    .line 23
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v1, "android.intent.action.NEW_OUTGOING_CALL"

    .line 27
    .line 28
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->P:Landroid/content/IntentFilter;

    .line 32
    .line 33
    new-instance v0, Lpy7;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    invoke-direct {v0, p0, v1}, Lpy7;-><init>(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->Q:Lpy7;

    .line 40
    .line 41
    new-instance v0, Landroid/content/IntentFilter;

    .line 42
    .line 43
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 44
    .line 45
    .line 46
    const-string v1, "cu.lestebang.utiletecsa.action.SMS_SENT"

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->R:Landroid/content/IntentFilter;

    .line 52
    .line 53
    new-instance v0, Lpy7;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, v1}, Lpy7;-><init>(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;I)V

    .line 57
    .line 58
    .line 59
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->S:Lpy7;

    .line 60
    .line 61
    return-void
    .line 62
    .line 63
.end method

.method public static final b(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;Ljava/lang/String;Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;Lh61;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p3, Loy7;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p3

    .line 6
    check-cast v0, Loy7;

    .line 7
    .line 8
    iget v1, v0, Loy7;->E:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Loy7;->E:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Loy7;

    .line 21
    .line 22
    invoke-direct {v0, p0, p3}, Loy7;-><init>(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;Lh61;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p3, v0, Loy7;->C:Ljava/lang/Object;

    .line 26
    .line 27
    iget v1, v0, Loy7;->E:I

    .line 28
    .line 29
    const/4 v2, 0x3

    .line 30
    const/4 v3, 0x0

    .line 31
    const v4, 0x7f11041a

    .line 32
    .line 33
    .line 34
    const/4 v5, 0x2

    .line 35
    const/4 v6, 0x1

    .line 36
    sget-object v7, Lp81;->w:Lp81;

    .line 37
    .line 38
    if-eqz v1, :cond_3

    .line 39
    .line 40
    if-eq v1, v6, :cond_2

    .line 41
    .line 42
    if-ne v1, v5, :cond_1

    .line 43
    .line 44
    iget p1, v0, Loy7;->B:I

    .line 45
    .line 46
    iget-object p2, v0, Loy7;->A:Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 47
    .line 48
    iget-object v1, v0, Loy7;->z:Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    move-object p3, p2

    .line 54
    move-object p2, v1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    const/4 p0, 0x0

    .line 62
    return-object p0

    .line 63
    :cond_2
    iget p1, v0, Loy7;->B:I

    .line 64
    .line 65
    iget-object p2, v0, Loy7;->A:Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 66
    .line 67
    iget-object v1, v0, Loy7;->z:Ljava/lang/String;

    .line 68
    .line 69
    :try_start_0
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    .line 72
    return-object p3

    .line 73
    :catch_0
    move-object p3, p2

    .line 74
    move-object p2, v1

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {p3}, Lo85;->q(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    const-string p3, "android.permission.CALL_PHONE"

    .line 80
    .line 81
    invoke-static {p0, p3}, Lsg3;->A(Landroid/content/Context;Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result p3

    .line 85
    if-nez p3, :cond_4

    .line 86
    .line 87
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_4
    move-object p3, p2

    .line 96
    move-object p2, p1

    .line 97
    move p1, v3

    .line 98
    :cond_5
    :goto_1
    if-ge p1, v2, :cond_7

    .line 99
    .line 100
    :try_start_1
    invoke-virtual {p3}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getDefaultSimSlot()I

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    iput-object p2, v0, Loy7;->z:Ljava/lang/String;

    .line 105
    .line 106
    iput-object p3, v0, Loy7;->A:Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 107
    .line 108
    iput p1, v0, Loy7;->B:I

    .line 109
    .line 110
    iput v6, v0, Loy7;->E:I

    .line 111
    .line 112
    invoke-virtual {p0, v1, v0, p2}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->h(ILh61;Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 116
    if-ne p0, v7, :cond_6

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_6
    move-object v7, p0

    .line 120
    goto :goto_3

    .line 121
    :catch_1
    :goto_2
    add-int/2addr p1, v6

    .line 122
    if-ge p1, v2, :cond_5

    .line 123
    .line 124
    const-wide/16 v8, 0x1388

    .line 125
    .line 126
    int-to-long v10, p1

    .line 127
    mul-long/2addr v10, v8

    .line 128
    sget-object v1, Lyh7;->a:Lhr2;

    .line 129
    .line 130
    new-instance v8, Ljava/lang/Long;

    .line 131
    .line 132
    invoke-direct {v8, v10, v11}, Ljava/lang/Long;-><init>(J)V

    .line 133
    .line 134
    .line 135
    filled-new-array {v8}, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    move-result-object v8

    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-static {v8}, Lhr2;->A([Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput-object p2, v0, Loy7;->z:Ljava/lang/String;

    .line 146
    .line 147
    iput-object p3, v0, Loy7;->A:Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;

    .line 148
    .line 149
    iput p1, v0, Loy7;->B:I

    .line 150
    .line 151
    iput v5, v0, Loy7;->E:I

    .line 152
    .line 153
    invoke-static {v10, v11, v0}, Lt49;->G(JLf61;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v1

    .line 157
    if-ne v1, v7, :cond_5

    .line 158
    .line 159
    goto :goto_3

    .line 160
    :cond_7
    sget-object p1, Lyh7;->a:Lhr2;

    .line 161
    .line 162
    new-array p2, v3, [Ljava/lang/Object;

    .line 163
    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-static {p2}, Lhr2;->A([Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v7

    .line 174
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 175
    .line 176
    .line 177
    :goto_3
    return-object v7
.end method

.method public static final c(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;)V
    .locals 4

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->J:J

    .line 6
    .line 7
    sub-long/2addr v0, v2

    .line 8
    const-wide/32 v2, 0x927c0

    .line 9
    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    iput-wide v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->J:J

    .line 19
    .line 20
    const v0, 0x7f11042b

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v1, Lha7;

    .line 31
    .line 32
    const/16 v2, 0x14

    .line 33
    .line 34
    invoke-direct {v1, v2}, Lha7;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, v1}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->i(Ljava/lang/String;Lvr2;)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
.end method

.method public static final d(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;Ljava/lang/String;)V
    .locals 4

    .line 1
    new-instance v0, Ljava/text/SimpleDateFormat;

    .line 2
    .line 3
    const-string v1, "HH:mm"

    .line 4
    .line 5
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 10
    .line 11
    .line 12
    new-instance v1, Ljava/util/Date;

    .line 13
    .line 14
    invoke-direct {v1}, Ljava/util/Date;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ld15;

    .line 22
    .line 23
    const-string v2, "UssdAutoUpdateChannel"

    .line 24
    .line 25
    invoke-direct {v1, p0, v2}, Ld15;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 33
    .line 34
    iget-object v3, v1, Ld15;->y:Landroid/app/Notification;

    .line 35
    .line 36
    iput v2, v3, Landroid/app/Notification;->icon:I

    .line 37
    .line 38
    const v2, 0x7f110431

    .line 39
    .line 40
    .line 41
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    invoke-virtual {p0, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-static {v0}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    iput-object v0, v1, Ld15;->e:Ljava/lang/CharSequence;

    .line 54
    .line 55
    invoke-static {p1}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, v1, Ld15;->f:Ljava/lang/CharSequence;

    .line 60
    .line 61
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const/4 v0, 0x0

    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    const/high16 v2, 0xc000000

    .line 77
    .line 78
    invoke-static {p0, v0, p1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    goto :goto_0

    .line 83
    :cond_0
    const/4 p1, 0x0

    .line 84
    :goto_0
    iput-object p1, v1, Ld15;->g:Landroid/app/PendingIntent;

    .line 85
    .line 86
    iput v0, v1, Ld15;->k:I

    .line 87
    .line 88
    const/4 p1, 0x1

    .line 89
    const/16 v0, 0x10

    .line 90
    .line 91
    invoke-virtual {v1, v0, p1}, Ld15;->c(IZ)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v1}, Ld15;->a()Landroid/app/Notification;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    const v0, 0x317cd

    .line 102
    .line 103
    .line 104
    invoke-static {p0, v0, p1}, Lsg3;->W(Landroid/content/Context;ILandroid/app/Notification;)V

    .line 105
    .line 106
    .line 107
    return-void
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
.end method


# virtual methods
.method public final a()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->w:Lyl6;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->x:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->w:Lyl6;

    .line 9
    .line 10
    if-nez v1, :cond_0

    .line 11
    .line 12
    new-instance v1, Lyl6;

    .line 13
    .line 14
    invoke-direct {v1, p0}, Lyl6;-><init>(Landroid/app/Service;)V

    .line 15
    .line 16
    .line 17
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->w:Lyl6;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_2
    iget-object p0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->w:Lyl6;

    .line 27
    .line 28
    invoke-virtual {p0}, Lyl6;->a()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final e(Ljava/lang/String;)Landroid/app/Notification;
    .locals 3

    .line 1
    new-instance v0, Ld15;

    .line 2
    .line 3
    const-string v1, "UssdAutoStatusChannel"

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Ld15;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 13
    .line 14
    iget-object v2, v0, Ld15;->y:Landroid/app/Notification;

    .line 15
    .line 16
    iput v1, v2, Landroid/app/Notification;->icon:I

    .line 17
    .line 18
    const v1, 0x7f110429

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v1}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iput-object v1, v0, Ld15;->e:Ljava/lang/CharSequence;

    .line 30
    .line 31
    invoke-static {p1}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iput-object p1, v0, Ld15;->f:Ljava/lang/CharSequence;

    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    const/4 v1, 0x0

    .line 50
    if-eqz p1, :cond_0

    .line 51
    .line 52
    const/high16 v2, 0xc000000

    .line 53
    .line 54
    invoke-static {p0, v1, p1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 p0, 0x0

    .line 60
    :goto_0
    iput-object p0, v0, Ld15;->g:Landroid/app/PendingIntent;

    .line 61
    .line 62
    const/4 p0, -0x1

    .line 63
    iput p0, v0, Ld15;->k:I

    .line 64
    .line 65
    const/4 p0, 0x2

    .line 66
    const/4 p1, 0x1

    .line 67
    invoke-virtual {v0, p0, p1}, Ld15;->c(IZ)V

    .line 68
    .line 69
    .line 70
    const/16 p0, 0x8

    .line 71
    .line 72
    invoke-virtual {v0, p0, p1}, Ld15;->c(IZ)V

    .line 73
    .line 74
    .line 75
    iput-boolean v1, v0, Ld15;->l:Z

    .line 76
    .line 77
    invoke-virtual {v0}, Ld15;->a()Landroid/app/Notification;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    return-object p0
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
.end method

.method public final f()Lk40;
    .locals 0

    .line 1
    iget-object p0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->A:Lk40;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const-string p0, "balanceRepository"

    .line 7
    .line 8
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x0

    .line 12
    throw p0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final g()V
    .locals 2

    .line 1
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->y:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lty7;

    .line 13
    .line 14
    check-cast v0, Lsd1;

    .line 15
    .line 16
    iget-object v0, v0, Lsd1;->a:Lvd1;

    .line 17
    .line 18
    iget-object v1, v0, Lvd1;->l:Llu5;

    .line 19
    .line 20
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ldv7;

    .line 25
    .line 26
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->z:Ldv7;

    .line 27
    .line 28
    iget-object v1, v0, Lvd1;->s:Llu5;

    .line 29
    .line 30
    invoke-interface {v1}, Lmu5;->get()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lk40;

    .line 35
    .line 36
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->A:Lk40;

    .line 37
    .line 38
    iget-object v0, v0, Lvd1;->g:Llu5;

    .line 39
    .line 40
    invoke-interface {v0}, Lmu5;->get()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    check-cast v0, Lcz7;

    .line 45
    .line 46
    invoke-static {}, Lzv1;->a()Lh81;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->B:Lh81;

    .line 51
    .line 52
    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 53
    .line 54
    .line 55
    return-void
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final h(ILh61;Ljava/lang/String;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    instance-of v4, v2, Lqy7;

    .line 10
    .line 11
    if-eqz v4, :cond_0

    .line 12
    .line 13
    move-object v4, v2

    .line 14
    check-cast v4, Lqy7;

    .line 15
    .line 16
    iget v5, v4, Lqy7;->I:I

    .line 17
    .line 18
    const/high16 v6, -0x80000000

    .line 19
    .line 20
    and-int v7, v5, v6

    .line 21
    .line 22
    if-eqz v7, :cond_0

    .line 23
    .line 24
    sub-int/2addr v5, v6

    .line 25
    iput v5, v4, Lqy7;->I:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v4, Lqy7;

    .line 29
    .line 30
    invoke-direct {v4, v0, v2}, Lqy7;-><init>(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;Lh61;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v2, v4, Lqy7;->G:Ljava/lang/Object;

    .line 34
    .line 35
    iget v5, v4, Lqy7;->I:I

    .line 36
    .line 37
    const-string v6, "voz"

    .line 38
    .line 39
    const-string v7, "--"

    .line 40
    .line 41
    const-string v8, "*264"

    .line 42
    .line 43
    const-string v9, "*732"

    .line 44
    .line 45
    const-string v10, "*266"

    .line 46
    .line 47
    const-string v12, "*328"

    .line 48
    .line 49
    const-string v13, "*767"

    .line 50
    .line 51
    const-string v14, "*869"

    .line 52
    .line 53
    const/4 v11, 0x0

    .line 54
    const/16 v16, 0x0

    .line 55
    .line 56
    sget-object v15, Lp81;->w:Lp81;

    .line 57
    .line 58
    packed-switch v5, :pswitch_data_0

    .line 59
    .line 60
    .line 61
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v16

    .line 67
    :pswitch_0
    iget v11, v4, Lqy7;->F:I

    .line 68
    .line 69
    iget v0, v4, Lqy7;->E:I

    .line 70
    .line 71
    iget-object v1, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 74
    .line 75
    iget-object v4, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 76
    .line 77
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    goto/16 :goto_e

    .line 81
    .line 82
    :pswitch_1
    iget v1, v4, Lqy7;->F:I

    .line 83
    .line 84
    iget v3, v4, Lqy7;->E:I

    .line 85
    .line 86
    iget v5, v4, Lqy7;->D:I

    .line 87
    .line 88
    iget-object v6, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 89
    .line 90
    iget-object v7, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 91
    .line 92
    iget-object v8, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 93
    .line 94
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    move-object/from16 v17, v7

    .line 98
    .line 99
    move v7, v1

    .line 100
    move v1, v3

    .line 101
    move-object/from16 v3, v17

    .line 102
    .line 103
    goto/16 :goto_c

    .line 104
    .line 105
    :pswitch_2
    iget v11, v4, Lqy7;->F:I

    .line 106
    .line 107
    iget v1, v4, Lqy7;->E:I

    .line 108
    .line 109
    iget v3, v4, Lqy7;->D:I

    .line 110
    .line 111
    iget-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 112
    .line 113
    iget-object v7, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 114
    .line 115
    iget-object v8, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 116
    .line 117
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    goto/16 :goto_b

    .line 121
    .line 122
    :pswitch_3
    iget v11, v4, Lqy7;->F:I

    .line 123
    .line 124
    iget v0, v4, Lqy7;->E:I

    .line 125
    .line 126
    iget-object v1, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 127
    .line 128
    iget-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 129
    .line 130
    iget-object v4, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 131
    .line 132
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    move-object/from16 v17, v1

    .line 136
    .line 137
    move v1, v0

    .line 138
    move-object v0, v3

    .line 139
    move-object v3, v2

    .line 140
    move-object/from16 v2, v17

    .line 141
    .line 142
    goto/16 :goto_a

    .line 143
    .line 144
    :pswitch_4
    iget v11, v4, Lqy7;->F:I

    .line 145
    .line 146
    iget v0, v4, Lqy7;->E:I

    .line 147
    .line 148
    iget-object v1, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 149
    .line 150
    iget-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 151
    .line 152
    iget-object v4, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 153
    .line 154
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    move-object/from16 v17, v1

    .line 158
    .line 159
    move v1, v0

    .line 160
    move-object v0, v3

    .line 161
    move-object v3, v2

    .line 162
    move-object/from16 v2, v17

    .line 163
    .line 164
    goto/16 :goto_9

    .line 165
    .line 166
    :pswitch_5
    iget v11, v4, Lqy7;->F:I

    .line 167
    .line 168
    iget v0, v4, Lqy7;->E:I

    .line 169
    .line 170
    iget-object v1, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 171
    .line 172
    iget-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 173
    .line 174
    iget-object v4, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 175
    .line 176
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    move-object/from16 v17, v1

    .line 180
    .line 181
    move v1, v0

    .line 182
    move-object v0, v3

    .line 183
    move-object v3, v2

    .line 184
    move-object/from16 v2, v17

    .line 185
    .line 186
    goto/16 :goto_8

    .line 187
    .line 188
    :pswitch_6
    iget v15, v4, Lqy7;->F:I

    .line 189
    .line 190
    iget v0, v4, Lqy7;->E:I

    .line 191
    .line 192
    iget-object v1, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 193
    .line 194
    iget-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 195
    .line 196
    iget-object v4, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 197
    .line 198
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 199
    .line 200
    .line 201
    goto/16 :goto_7

    .line 202
    .line 203
    :pswitch_7
    iget v11, v4, Lqy7;->F:I

    .line 204
    .line 205
    iget v1, v4, Lqy7;->E:I

    .line 206
    .line 207
    iget v3, v4, Lqy7;->D:I

    .line 208
    .line 209
    iget-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 210
    .line 211
    iget-object v6, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 212
    .line 213
    iget-object v8, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 214
    .line 215
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 216
    .line 217
    .line 218
    move/from16 v17, v3

    .line 219
    .line 220
    move-object v3, v2

    .line 221
    move-object v2, v8

    .line 222
    move-object v8, v5

    .line 223
    move/from16 v5, v17

    .line 224
    .line 225
    goto/16 :goto_6

    .line 226
    .line 227
    :pswitch_8
    iget v15, v4, Lqy7;->F:I

    .line 228
    .line 229
    iget v0, v4, Lqy7;->E:I

    .line 230
    .line 231
    iget-object v1, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 232
    .line 233
    iget-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 234
    .line 235
    iget-object v4, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 236
    .line 237
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    goto/16 :goto_5

    .line 241
    .line 242
    :pswitch_9
    iget v11, v4, Lqy7;->F:I

    .line 243
    .line 244
    iget v1, v4, Lqy7;->E:I

    .line 245
    .line 246
    iget v3, v4, Lqy7;->D:I

    .line 247
    .line 248
    iget-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 249
    .line 250
    iget-object v6, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 251
    .line 252
    iget-object v8, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 253
    .line 254
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    move-object/from16 v17, v6

    .line 258
    .line 259
    move v6, v3

    .line 260
    move-object/from16 v3, v17

    .line 261
    .line 262
    move-object/from16 v17, v8

    .line 263
    .line 264
    move-object v8, v5

    .line 265
    move-object/from16 v5, v17

    .line 266
    .line 267
    goto/16 :goto_4

    .line 268
    .line 269
    :pswitch_a
    iget v15, v4, Lqy7;->F:I

    .line 270
    .line 271
    iget v0, v4, Lqy7;->E:I

    .line 272
    .line 273
    iget-object v1, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 274
    .line 275
    iget-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 276
    .line 277
    iget-object v4, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 278
    .line 279
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    goto/16 :goto_3

    .line 283
    .line 284
    :pswitch_b
    iget v11, v4, Lqy7;->F:I

    .line 285
    .line 286
    iget v1, v4, Lqy7;->E:I

    .line 287
    .line 288
    iget v3, v4, Lqy7;->D:I

    .line 289
    .line 290
    iget-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 291
    .line 292
    iget-object v6, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 293
    .line 294
    iget-object v8, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 295
    .line 296
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    move-object/from16 v17, v6

    .line 300
    .line 301
    move v6, v3

    .line 302
    move-object/from16 v3, v17

    .line 303
    .line 304
    move-object/from16 v17, v8

    .line 305
    .line 306
    move-object v8, v5

    .line 307
    move-object/from16 v5, v17

    .line 308
    .line 309
    goto/16 :goto_2

    .line 310
    .line 311
    :pswitch_c
    iget v1, v4, Lqy7;->D:I

    .line 312
    .line 313
    iget-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 314
    .line 315
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 316
    .line 317
    .line 318
    check-cast v2, Lo66;

    .line 319
    .line 320
    iget-object v2, v2, Lo66;->w:Ljava/lang/Object;

    .line 321
    .line 322
    goto/16 :goto_1

    .line 323
    .line 324
    :pswitch_d
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 325
    .line 326
    .line 327
    invoke-static {v3, v14, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 328
    .line 329
    .line 330
    move-result v2

    .line 331
    if-eqz v2, :cond_1

    .line 332
    .line 333
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 334
    .line 335
    .line 336
    move-result-object v2

    .line 337
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 338
    .line 339
    iput v1, v4, Lqy7;->D:I

    .line 340
    .line 341
    const/4 v5, 0x1

    .line 342
    iput v5, v4, Lqy7;->I:I

    .line 343
    .line 344
    check-cast v2, Lc50;

    .line 345
    .line 346
    invoke-virtual {v2, v4}, Lc50;->m(Lh61;)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    if-ne v2, v15, :cond_7

    .line 351
    .line 352
    goto/16 :goto_d

    .line 353
    .line 354
    :cond_1
    invoke-static {v3, v13, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 355
    .line 356
    .line 357
    move-result v2

    .line 358
    if-eqz v2, :cond_2

    .line 359
    .line 360
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 365
    .line 366
    iput v1, v4, Lqy7;->D:I

    .line 367
    .line 368
    const/4 v5, 0x2

    .line 369
    iput v5, v4, Lqy7;->I:I

    .line 370
    .line 371
    check-cast v2, Lc50;

    .line 372
    .line 373
    invoke-virtual {v2, v4}, Lc50;->j(Lh61;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    if-ne v2, v15, :cond_7

    .line 378
    .line 379
    goto/16 :goto_d

    .line 380
    .line 381
    :cond_2
    invoke-static {v3, v12, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 382
    .line 383
    .line 384
    move-result v2

    .line 385
    if-eqz v2, :cond_3

    .line 386
    .line 387
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 388
    .line 389
    .line 390
    move-result-object v2

    .line 391
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 392
    .line 393
    iput v1, v4, Lqy7;->D:I

    .line 394
    .line 395
    const/4 v5, 0x3

    .line 396
    iput v5, v4, Lqy7;->I:I

    .line 397
    .line 398
    check-cast v2, Lc50;

    .line 399
    .line 400
    invoke-virtual {v2, v4}, Lc50;->g(Lh61;)Ljava/lang/Object;

    .line 401
    .line 402
    .line 403
    move-result-object v2

    .line 404
    if-ne v2, v15, :cond_7

    .line 405
    .line 406
    goto/16 :goto_d

    .line 407
    .line 408
    :cond_3
    invoke-static {v3, v10, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 409
    .line 410
    .line 411
    move-result v2

    .line 412
    if-eqz v2, :cond_4

    .line 413
    .line 414
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 415
    .line 416
    .line 417
    move-result-object v2

    .line 418
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 419
    .line 420
    iput v1, v4, Lqy7;->D:I

    .line 421
    .line 422
    const/4 v5, 0x4

    .line 423
    iput v5, v4, Lqy7;->I:I

    .line 424
    .line 425
    check-cast v2, Lc50;

    .line 426
    .line 427
    invoke-virtual {v2, v4}, Lc50;->f(Lh61;)Ljava/lang/Object;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    if-ne v2, v15, :cond_7

    .line 432
    .line 433
    goto/16 :goto_d

    .line 434
    .line 435
    :cond_4
    invoke-static {v3, v9, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 436
    .line 437
    .line 438
    move-result v2

    .line 439
    if-eqz v2, :cond_5

    .line 440
    .line 441
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 442
    .line 443
    .line 444
    move-result-object v2

    .line 445
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 446
    .line 447
    iput v1, v4, Lqy7;->D:I

    .line 448
    .line 449
    const/4 v5, 0x5

    .line 450
    iput v5, v4, Lqy7;->I:I

    .line 451
    .line 452
    check-cast v2, Lc50;

    .line 453
    .line 454
    invoke-virtual {v2, v4}, Lc50;->h(Lh61;)Ljava/lang/Object;

    .line 455
    .line 456
    .line 457
    move-result-object v2

    .line 458
    if-ne v2, v15, :cond_7

    .line 459
    .line 460
    goto/16 :goto_d

    .line 461
    .line 462
    :cond_5
    invoke-static {v3, v8, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 463
    .line 464
    .line 465
    move-result v2

    .line 466
    if-eqz v2, :cond_6

    .line 467
    .line 468
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 473
    .line 474
    iput v1, v4, Lqy7;->D:I

    .line 475
    .line 476
    const/4 v5, 0x6

    .line 477
    iput v5, v4, Lqy7;->I:I

    .line 478
    .line 479
    check-cast v2, Lc50;

    .line 480
    .line 481
    invoke-virtual {v2, v4}, Lc50;->e(Lh61;)Ljava/lang/Object;

    .line 482
    .line 483
    .line 484
    move-result-object v2

    .line 485
    if-ne v2, v15, :cond_7

    .line 486
    .line 487
    goto/16 :goto_d

    .line 488
    .line 489
    :cond_6
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 494
    .line 495
    iput v1, v4, Lqy7;->D:I

    .line 496
    .line 497
    const/4 v5, 0x7

    .line 498
    iput v5, v4, Lqy7;->I:I

    .line 499
    .line 500
    check-cast v2, Lc50;

    .line 501
    .line 502
    invoke-virtual {v2, v4}, Lc50;->i(Lh61;)Ljava/lang/Object;

    .line 503
    .line 504
    .line 505
    move-result-object v2

    .line 506
    if-ne v2, v15, :cond_7

    .line 507
    .line 508
    goto/16 :goto_d

    .line 509
    .line 510
    :cond_7
    :goto_1
    invoke-static {v2}, Lo85;->q(Ljava/lang/Object;)V

    .line 511
    .line 512
    .line 513
    invoke-static {v3, v14, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 514
    .line 515
    .line 516
    move-result v2

    .line 517
    if-eqz v2, :cond_a

    .line 518
    .line 519
    const/4 v5, 0x2

    .line 520
    new-array v5, v5, [Ljava/lang/Object;

    .line 521
    .line 522
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 523
    .line 524
    .line 525
    move-result-object v2

    .line 526
    check-cast v2, Lc50;

    .line 527
    .line 528
    sget-object v3, Luz7;->a:Luz7;

    .line 529
    .line 530
    invoke-virtual {v2, v3, v6, v7}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 531
    .line 532
    .line 533
    move-result-object v2

    .line 534
    move-object/from16 v3, v16

    .line 535
    .line 536
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 537
    .line 538
    iput-object v5, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 539
    .line 540
    iput-object v0, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 541
    .line 542
    iput-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 543
    .line 544
    iput v1, v4, Lqy7;->D:I

    .line 545
    .line 546
    const v3, 0x7f110421

    .line 547
    .line 548
    .line 549
    iput v3, v4, Lqy7;->E:I

    .line 550
    .line 551
    iput v11, v4, Lqy7;->F:I

    .line 552
    .line 553
    const/16 v6, 0x8

    .line 554
    .line 555
    iput v6, v4, Lqy7;->I:I

    .line 556
    .line 557
    invoke-static {v2, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v2

    .line 561
    if-ne v2, v15, :cond_8

    .line 562
    .line 563
    goto/16 :goto_d

    .line 564
    .line 565
    :cond_8
    move v6, v1

    .line 566
    move v1, v3

    .line 567
    move-object v8, v5

    .line 568
    move-object v3, v0

    .line 569
    :goto_2
    aput-object v2, v8, v11

    .line 570
    .line 571
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    check-cast v0, Lc50;

    .line 576
    .line 577
    sget-object v2, Luz7;->a:Luz7;

    .line 578
    .line 579
    const-string v8, "vozDias"

    .line 580
    .line 581
    invoke-virtual {v0, v2, v8, v7}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 582
    .line 583
    .line 584
    move-result-object v0

    .line 585
    const/4 v2, 0x0

    .line 586
    iput-object v2, v4, Lqy7;->z:Ljava/lang/String;

    .line 587
    .line 588
    iput-object v5, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 589
    .line 590
    iput-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 591
    .line 592
    iput-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 593
    .line 594
    iput v6, v4, Lqy7;->D:I

    .line 595
    .line 596
    iput v1, v4, Lqy7;->E:I

    .line 597
    .line 598
    const/4 v2, 0x1

    .line 599
    iput v2, v4, Lqy7;->F:I

    .line 600
    .line 601
    const/16 v2, 0x9

    .line 602
    .line 603
    iput v2, v4, Lqy7;->I:I

    .line 604
    .line 605
    invoke-static {v0, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 606
    .line 607
    .line 608
    move-result-object v2

    .line 609
    if-ne v2, v15, :cond_9

    .line 610
    .line 611
    goto/16 :goto_d

    .line 612
    .line 613
    :cond_9
    move v0, v1

    .line 614
    move-object v1, v5

    .line 615
    move-object v4, v1

    .line 616
    const/4 v15, 0x1

    .line 617
    :goto_3
    aput-object v2, v1, v15

    .line 618
    .line 619
    invoke-virtual {v3, v0, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 620
    .line 621
    .line 622
    move-result-object v0

    .line 623
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 624
    .line 625
    .line 626
    return-object v0

    .line 627
    :cond_a
    invoke-static {v3, v13, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 628
    .line 629
    .line 630
    move-result v2

    .line 631
    if-eqz v2, :cond_d

    .line 632
    .line 633
    const/4 v5, 0x2

    .line 634
    new-array v5, v5, [Ljava/lang/Object;

    .line 635
    .line 636
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 637
    .line 638
    .line 639
    move-result-object v2

    .line 640
    check-cast v2, Lc50;

    .line 641
    .line 642
    sget-object v3, Ltz7;->a:Ltz7;

    .line 643
    .line 644
    const-string v6, "sms"

    .line 645
    .line 646
    invoke-virtual {v2, v3, v6, v7}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 647
    .line 648
    .line 649
    move-result-object v2

    .line 650
    const/4 v3, 0x0

    .line 651
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 652
    .line 653
    iput-object v5, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 654
    .line 655
    iput-object v0, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 656
    .line 657
    iput-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 658
    .line 659
    iput v1, v4, Lqy7;->D:I

    .line 660
    .line 661
    const v3, 0x7f110420

    .line 662
    .line 663
    .line 664
    iput v3, v4, Lqy7;->E:I

    .line 665
    .line 666
    iput v11, v4, Lqy7;->F:I

    .line 667
    .line 668
    const/16 v6, 0xa

    .line 669
    .line 670
    iput v6, v4, Lqy7;->I:I

    .line 671
    .line 672
    invoke-static {v2, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 673
    .line 674
    .line 675
    move-result-object v2

    .line 676
    if-ne v2, v15, :cond_b

    .line 677
    .line 678
    goto/16 :goto_d

    .line 679
    .line 680
    :cond_b
    move v6, v1

    .line 681
    move v1, v3

    .line 682
    move-object v8, v5

    .line 683
    move-object v3, v0

    .line 684
    :goto_4
    aput-object v2, v8, v11

    .line 685
    .line 686
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 687
    .line 688
    .line 689
    move-result-object v0

    .line 690
    check-cast v0, Lc50;

    .line 691
    .line 692
    sget-object v2, Ltz7;->a:Ltz7;

    .line 693
    .line 694
    const-string v8, "smsDias"

    .line 695
    .line 696
    invoke-virtual {v0, v2, v8, v7}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 697
    .line 698
    .line 699
    move-result-object v0

    .line 700
    const/4 v2, 0x0

    .line 701
    iput-object v2, v4, Lqy7;->z:Ljava/lang/String;

    .line 702
    .line 703
    iput-object v5, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 704
    .line 705
    iput-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 706
    .line 707
    iput-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 708
    .line 709
    iput v6, v4, Lqy7;->D:I

    .line 710
    .line 711
    iput v1, v4, Lqy7;->E:I

    .line 712
    .line 713
    const/4 v2, 0x1

    .line 714
    iput v2, v4, Lqy7;->F:I

    .line 715
    .line 716
    const/16 v2, 0xb

    .line 717
    .line 718
    iput v2, v4, Lqy7;->I:I

    .line 719
    .line 720
    invoke-static {v0, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 721
    .line 722
    .line 723
    move-result-object v2

    .line 724
    if-ne v2, v15, :cond_c

    .line 725
    .line 726
    goto/16 :goto_d

    .line 727
    .line 728
    :cond_c
    move v0, v1

    .line 729
    move-object v1, v5

    .line 730
    move-object v4, v1

    .line 731
    const/4 v15, 0x1

    .line 732
    :goto_5
    aput-object v2, v1, v15

    .line 733
    .line 734
    invoke-virtual {v3, v0, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 735
    .line 736
    .line 737
    move-result-object v0

    .line 738
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 739
    .line 740
    .line 741
    return-object v0

    .line 742
    :cond_d
    invoke-static {v3, v12, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 743
    .line 744
    .line 745
    move-result v2

    .line 746
    const-string v5, ""

    .line 747
    .line 748
    if-eqz v2, :cond_10

    .line 749
    .line 750
    const/4 v2, 0x2

    .line 751
    new-array v2, v2, [Ljava/lang/Object;

    .line 752
    .line 753
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 754
    .line 755
    .line 756
    move-result-object v3

    .line 757
    check-cast v3, Lc50;

    .line 758
    .line 759
    sget-object v6, Lxz7;->a:Lxz7;

    .line 760
    .line 761
    const-string v8, "datos"

    .line 762
    .line 763
    invoke-virtual {v3, v6, v8, v5}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 764
    .line 765
    .line 766
    move-result-object v3

    .line 767
    const/4 v5, 0x0

    .line 768
    iput-object v5, v4, Lqy7;->z:Ljava/lang/String;

    .line 769
    .line 770
    iput-object v2, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 771
    .line 772
    iput-object v0, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 773
    .line 774
    iput-object v2, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 775
    .line 776
    iput v1, v4, Lqy7;->D:I

    .line 777
    .line 778
    const v5, 0x7f11041d

    .line 779
    .line 780
    .line 781
    iput v5, v4, Lqy7;->E:I

    .line 782
    .line 783
    iput v11, v4, Lqy7;->F:I

    .line 784
    .line 785
    const/16 v6, 0xc

    .line 786
    .line 787
    iput v6, v4, Lqy7;->I:I

    .line 788
    .line 789
    invoke-static {v3, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 790
    .line 791
    .line 792
    move-result-object v3

    .line 793
    if-ne v3, v15, :cond_e

    .line 794
    .line 795
    goto/16 :goto_d

    .line 796
    .line 797
    :cond_e
    move v6, v5

    .line 798
    move v5, v1

    .line 799
    move v1, v6

    .line 800
    move-object v6, v0

    .line 801
    move-object v8, v2

    .line 802
    :goto_6
    aput-object v3, v8, v11

    .line 803
    .line 804
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 805
    .line 806
    .line 807
    move-result-object v0

    .line 808
    check-cast v0, Lc50;

    .line 809
    .line 810
    sget-object v3, Lxz7;->a:Lxz7;

    .line 811
    .line 812
    const-string v8, "datosDias"

    .line 813
    .line 814
    invoke-virtual {v0, v3, v8, v7}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 815
    .line 816
    .line 817
    move-result-object v0

    .line 818
    const/4 v3, 0x0

    .line 819
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 820
    .line 821
    iput-object v2, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 822
    .line 823
    iput-object v6, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 824
    .line 825
    iput-object v2, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 826
    .line 827
    iput v5, v4, Lqy7;->D:I

    .line 828
    .line 829
    iput v1, v4, Lqy7;->E:I

    .line 830
    .line 831
    const/4 v5, 0x1

    .line 832
    iput v5, v4, Lqy7;->F:I

    .line 833
    .line 834
    const/16 v3, 0xd

    .line 835
    .line 836
    iput v3, v4, Lqy7;->I:I

    .line 837
    .line 838
    invoke-static {v0, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 839
    .line 840
    .line 841
    move-result-object v0

    .line 842
    if-ne v0, v15, :cond_f

    .line 843
    .line 844
    goto/16 :goto_d

    .line 845
    .line 846
    :cond_f
    move-object v4, v2

    .line 847
    move-object v3, v6

    .line 848
    const/4 v15, 0x1

    .line 849
    move-object v2, v0

    .line 850
    move v0, v1

    .line 851
    move-object v1, v4

    .line 852
    :goto_7
    aput-object v2, v1, v15

    .line 853
    .line 854
    invoke-virtual {v3, v0, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 855
    .line 856
    .line 857
    move-result-object v0

    .line 858
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 859
    .line 860
    .line 861
    return-object v0

    .line 862
    :cond_10
    invoke-static {v3, v10, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 863
    .line 864
    .line 865
    move-result v2

    .line 866
    if-eqz v2, :cond_12

    .line 867
    .line 868
    const/4 v2, 0x1

    .line 869
    new-array v2, v2, [Ljava/lang/Object;

    .line 870
    .line 871
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    check-cast v3, Lc50;

    .line 876
    .line 877
    sget-object v6, Lrz7;->a:Lrz7;

    .line 878
    .line 879
    const-string v7, "bonoDatosCu"

    .line 880
    .line 881
    invoke-virtual {v3, v6, v7, v5}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 882
    .line 883
    .line 884
    move-result-object v3

    .line 885
    const/4 v5, 0x0

    .line 886
    iput-object v5, v4, Lqy7;->z:Ljava/lang/String;

    .line 887
    .line 888
    iput-object v2, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 889
    .line 890
    iput-object v0, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 891
    .line 892
    iput-object v2, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 893
    .line 894
    iput v1, v4, Lqy7;->D:I

    .line 895
    .line 896
    const v1, 0x7f11041c

    .line 897
    .line 898
    .line 899
    iput v1, v4, Lqy7;->E:I

    .line 900
    .line 901
    iput v11, v4, Lqy7;->F:I

    .line 902
    .line 903
    const/16 v5, 0xe

    .line 904
    .line 905
    iput v5, v4, Lqy7;->I:I

    .line 906
    .line 907
    invoke-static {v3, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 908
    .line 909
    .line 910
    move-result-object v3

    .line 911
    if-ne v3, v15, :cond_11

    .line 912
    .line 913
    goto/16 :goto_d

    .line 914
    .line 915
    :cond_11
    move-object v4, v2

    .line 916
    :goto_8
    aput-object v3, v2, v11

    .line 917
    .line 918
    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 919
    .line 920
    .line 921
    move-result-object v0

    .line 922
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 923
    .line 924
    .line 925
    return-object v0

    .line 926
    :cond_12
    invoke-static {v3, v9, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 927
    .line 928
    .line 929
    move-result v2

    .line 930
    if-eqz v2, :cond_14

    .line 931
    .line 932
    const/4 v2, 0x1

    .line 933
    new-array v2, v2, [Ljava/lang/Object;

    .line 934
    .line 935
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 936
    .line 937
    .line 938
    move-result-object v3

    .line 939
    check-cast v3, Lc50;

    .line 940
    .line 941
    sget-object v5, Lwz7;->a:Lwz7;

    .line 942
    .line 943
    const-string v6, "fechaNacional"

    .line 944
    .line 945
    invoke-virtual {v3, v5, v6, v7}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 946
    .line 947
    .line 948
    move-result-object v3

    .line 949
    const/4 v5, 0x0

    .line 950
    iput-object v5, v4, Lqy7;->z:Ljava/lang/String;

    .line 951
    .line 952
    iput-object v2, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 953
    .line 954
    iput-object v0, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 955
    .line 956
    iput-object v2, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 957
    .line 958
    iput v1, v4, Lqy7;->D:I

    .line 959
    .line 960
    const v1, 0x7f11041e

    .line 961
    .line 962
    .line 963
    iput v1, v4, Lqy7;->E:I

    .line 964
    .line 965
    iput v11, v4, Lqy7;->F:I

    .line 966
    .line 967
    const/16 v5, 0xf

    .line 968
    .line 969
    iput v5, v4, Lqy7;->I:I

    .line 970
    .line 971
    invoke-static {v3, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 972
    .line 973
    .line 974
    move-result-object v3

    .line 975
    if-ne v3, v15, :cond_13

    .line 976
    .line 977
    goto/16 :goto_d

    .line 978
    .line 979
    :cond_13
    move-object v4, v2

    .line 980
    :goto_9
    aput-object v3, v2, v11

    .line 981
    .line 982
    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 983
    .line 984
    .line 985
    move-result-object v0

    .line 986
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 987
    .line 988
    .line 989
    return-object v0

    .line 990
    :cond_14
    invoke-static {v3, v8, v11}, Ld57;->x0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 991
    .line 992
    .line 993
    move-result v2

    .line 994
    if-eqz v2, :cond_16

    .line 995
    .line 996
    const/4 v2, 0x1

    .line 997
    new-array v2, v2, [Ljava/lang/Object;

    .line 998
    .line 999
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 1000
    .line 1001
    .line 1002
    move-result-object v3

    .line 1003
    check-cast v3, Lc50;

    .line 1004
    .line 1005
    sget-object v5, Lsz7;->a:Lsz7;

    .line 1006
    .line 1007
    const-string v6, "amigoStatus"

    .line 1008
    .line 1009
    invoke-virtual {v3, v5, v6, v7}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v3

    .line 1013
    const/4 v5, 0x0

    .line 1014
    iput-object v5, v4, Lqy7;->z:Ljava/lang/String;

    .line 1015
    .line 1016
    iput-object v2, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 1017
    .line 1018
    iput-object v0, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 1019
    .line 1020
    iput-object v2, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 1021
    .line 1022
    iput v1, v4, Lqy7;->D:I

    .line 1023
    .line 1024
    const v1, 0x7f11041b

    .line 1025
    .line 1026
    .line 1027
    iput v1, v4, Lqy7;->E:I

    .line 1028
    .line 1029
    iput v11, v4, Lqy7;->F:I

    .line 1030
    .line 1031
    const/16 v5, 0x10

    .line 1032
    .line 1033
    iput v5, v4, Lqy7;->I:I

    .line 1034
    .line 1035
    invoke-static {v3, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v3

    .line 1039
    if-ne v3, v15, :cond_15

    .line 1040
    .line 1041
    goto/16 :goto_d

    .line 1042
    .line 1043
    :cond_15
    move-object v4, v2

    .line 1044
    :goto_a
    aput-object v3, v2, v11

    .line 1045
    .line 1046
    invoke-virtual {v0, v1, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1047
    .line 1048
    .line 1049
    move-result-object v0

    .line 1050
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1051
    .line 1052
    .line 1053
    return-object v0

    .line 1054
    :cond_16
    const/4 v5, 0x3

    .line 1055
    new-array v5, v5, [Ljava/lang/Object;

    .line 1056
    .line 1057
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 1058
    .line 1059
    .line 1060
    move-result-object v2

    .line 1061
    check-cast v2, Lc50;

    .line 1062
    .line 1063
    invoke-virtual {v2}, Lc50;->d()Ldi2;

    .line 1064
    .line 1065
    .line 1066
    move-result-object v2

    .line 1067
    const/4 v3, 0x0

    .line 1068
    iput-object v3, v4, Lqy7;->z:Ljava/lang/String;

    .line 1069
    .line 1070
    iput-object v5, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 1071
    .line 1072
    iput-object v0, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 1073
    .line 1074
    iput-object v5, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 1075
    .line 1076
    iput v1, v4, Lqy7;->D:I

    .line 1077
    .line 1078
    const v3, 0x7f11041f

    .line 1079
    .line 1080
    .line 1081
    iput v3, v4, Lqy7;->E:I

    .line 1082
    .line 1083
    iput v11, v4, Lqy7;->F:I

    .line 1084
    .line 1085
    const/16 v7, 0x11

    .line 1086
    .line 1087
    iput v7, v4, Lqy7;->I:I

    .line 1088
    .line 1089
    invoke-static {v2, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 1090
    .line 1091
    .line 1092
    move-result-object v2

    .line 1093
    if-ne v2, v15, :cond_17

    .line 1094
    .line 1095
    goto :goto_d

    .line 1096
    :cond_17
    move v7, v3

    .line 1097
    move v3, v1

    .line 1098
    move v1, v7

    .line 1099
    move-object v7, v0

    .line 1100
    move-object v8, v5

    .line 1101
    :goto_b
    aput-object v2, v5, v11

    .line 1102
    .line 1103
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 1104
    .line 1105
    .line 1106
    move-result-object v2

    .line 1107
    check-cast v2, Lc50;

    .line 1108
    .line 1109
    sget-object v5, Lvz7;->a:Lvz7;

    .line 1110
    .line 1111
    const-string v9, "00:00:00"

    .line 1112
    .line 1113
    invoke-virtual {v2, v5, v6, v9}, Lc50;->b(Lyz7;Ljava/lang/String;Ljava/lang/String;)Ldi2;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    const/4 v5, 0x0

    .line 1118
    iput-object v5, v4, Lqy7;->z:Ljava/lang/String;

    .line 1119
    .line 1120
    iput-object v8, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 1121
    .line 1122
    iput-object v7, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 1123
    .line 1124
    iput-object v8, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 1125
    .line 1126
    iput v3, v4, Lqy7;->D:I

    .line 1127
    .line 1128
    iput v1, v4, Lqy7;->E:I

    .line 1129
    .line 1130
    const/4 v5, 0x1

    .line 1131
    iput v5, v4, Lqy7;->F:I

    .line 1132
    .line 1133
    const/16 v6, 0x12

    .line 1134
    .line 1135
    iput v6, v4, Lqy7;->I:I

    .line 1136
    .line 1137
    invoke-static {v2, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 1138
    .line 1139
    .line 1140
    move-result-object v2

    .line 1141
    if-ne v2, v15, :cond_18

    .line 1142
    .line 1143
    goto :goto_d

    .line 1144
    :cond_18
    move v6, v5

    .line 1145
    move v5, v3

    .line 1146
    move-object v3, v7

    .line 1147
    move v7, v6

    .line 1148
    move-object v6, v8

    .line 1149
    :goto_c
    aput-object v2, v6, v7

    .line 1150
    .line 1151
    invoke-virtual {v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->f()Lk40;

    .line 1152
    .line 1153
    .line 1154
    move-result-object v0

    .line 1155
    check-cast v0, Lc50;

    .line 1156
    .line 1157
    invoke-virtual {v0}, Lc50;->c()Ldi2;

    .line 1158
    .line 1159
    .line 1160
    move-result-object v0

    .line 1161
    const/4 v2, 0x0

    .line 1162
    iput-object v2, v4, Lqy7;->z:Ljava/lang/String;

    .line 1163
    .line 1164
    iput-object v8, v4, Lqy7;->A:[Ljava/lang/Object;

    .line 1165
    .line 1166
    iput-object v3, v4, Lqy7;->B:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 1167
    .line 1168
    iput-object v8, v4, Lqy7;->C:[Ljava/lang/Object;

    .line 1169
    .line 1170
    iput v5, v4, Lqy7;->D:I

    .line 1171
    .line 1172
    iput v1, v4, Lqy7;->E:I

    .line 1173
    .line 1174
    const/4 v5, 0x2

    .line 1175
    iput v5, v4, Lqy7;->F:I

    .line 1176
    .line 1177
    const/16 v2, 0x13

    .line 1178
    .line 1179
    iput v2, v4, Lqy7;->I:I

    .line 1180
    .line 1181
    invoke-static {v0, v4}, Lgr8;->H(Ldi2;Lf61;)Ljava/lang/Object;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v2

    .line 1185
    if-ne v2, v15, :cond_19

    .line 1186
    .line 1187
    :goto_d
    return-object v15

    .line 1188
    :cond_19
    move v0, v1

    .line 1189
    move v11, v5

    .line 1190
    move-object v1, v8

    .line 1191
    move-object v4, v1

    .line 1192
    :goto_e
    aput-object v2, v1, v11

    .line 1193
    .line 1194
    invoke-virtual {v3, v0, v4}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 1195
    .line 1196
    .line 1197
    move-result-object v0

    .line 1198
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1199
    .line 1200
    .line 1201
    return-object v0

    .line 1202
    nop

    .line 1203
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
.end method

.method public final i(Ljava/lang/String;Lvr2;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->C:Lig0;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v2, Lp6;

    .line 7
    .line 8
    invoke-direct {v2, p0, p1, p2, v1}, Lp6;-><init>(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;Ljava/lang/String;Lvr2;Lf61;)V

    .line 9
    .line 10
    .line 11
    const/4 p0, 0x3

    .line 12
    invoke-static {v0, v1, v1, v2, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    const-string p0, "scope"

    .line 17
    .line 18
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw v1
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final j(Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-nez p2, :cond_1

    .line 2
    .line 3
    invoke-virtual {p1}, Lcu/lestebang/utiletecsa/core/preferences/model/UserDataPreferences;->getUssdAutoIntervalMinutes()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    const/16 p2, 0x1e

    .line 8
    .line 9
    if-ge p1, p2, :cond_0

    .line 10
    .line 11
    move p1, p2

    .line 12
    :cond_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    const p2, 0x7f110425

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    :cond_1
    const p1, 0x317cc

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p2}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->e(Ljava/lang/String;)Landroid/app/Notification;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-static {p0, p1, p2}, Lsg3;->W(Landroid/content/Context;ILandroid/app/Notification;)V

    .line 38
    .line 39
    .line 40
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final onBind(Landroid/content/Intent;)Landroid/os/IBinder;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final onCreate()V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->g()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lb85;->d()Lw77;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->B:Lh81;

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    if-eqz v1, :cond_9

    .line 12
    .line 13
    invoke-static {v0, v1}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lgl0;->E(Le81;)Lig0;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->C:Lig0;

    .line 22
    .line 23
    const v0, 0x7f110423

    .line 24
    .line 25
    .line 26
    const/4 v1, 0x2

    .line 27
    const-string v3, "UssdAutoStatusChannel"

    .line 28
    .line 29
    const v4, 0x7f110424

    .line 30
    .line 31
    .line 32
    invoke-static {p0, v3, v4, v0, v1}, Lsg3;->p(Landroid/content/Context;Ljava/lang/String;III)V

    .line 33
    .line 34
    .line 35
    const v0, 0x7f110430

    .line 36
    .line 37
    .line 38
    const v1, 0x7f11042f

    .line 39
    .line 40
    .line 41
    const-string v3, "UssdAutoUpdateChannel"

    .line 42
    .line 43
    const/4 v4, 0x3

    .line 44
    invoke-static {p0, v3, v0, v1, v4}, Lsg3;->p(Landroid/content/Context;Ljava/lang/String;III)V

    .line 45
    .line 46
    .line 47
    const v0, 0x7f110427

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->e(Ljava/lang/String;)Landroid/app/Notification;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 62
    .line 63
    const/16 v3, 0x22

    .line 64
    .line 65
    if-lt v1, v3, :cond_0

    .line 66
    .line 67
    invoke-static {p0, v0}, Lg07;->w(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;Landroid/app/Notification;)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const v3, 0x317cc

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v3, v0}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 75
    .line 76
    .line 77
    :goto_0
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->C:Lig0;

    .line 78
    .line 79
    if-eqz v0, :cond_8

    .line 80
    .line 81
    new-instance v3, Lgw6;

    .line 82
    .line 83
    const/16 v5, 0xb

    .line 84
    .line 85
    invoke-direct {v3, p0, v2, v5}, Lgw6;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 86
    .line 87
    .line 88
    invoke-static {v0, v2, v2, v3, v4}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 89
    .line 90
    .line 91
    const-string v0, "android.permission.READ_PHONE_STATE"

    .line 92
    .line 93
    invoke-static {p0, v0}, Lsg3;->A(Landroid/content/Context;Ljava/lang/String;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    const/16 v3, 0x21

    .line 98
    .line 99
    const/4 v4, 0x1

    .line 100
    if-nez v0, :cond_1

    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_1
    const-class v0, Landroid/telephony/TelephonyManager;

    .line 104
    .line 105
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    check-cast v0, Landroid/telephony/TelephonyManager;

    .line 110
    .line 111
    if-nez v0, :cond_2

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_2
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->G:Landroid/telephony/TelephonyManager;

    .line 115
    .line 116
    const/16 v5, 0x1f

    .line 117
    .line 118
    if-lt v1, v5, :cond_3

    .line 119
    .line 120
    new-instance v5, Lry7;

    .line 121
    .line 122
    invoke-direct {v5, p0}, Lry7;-><init>(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;)V

    .line 123
    .line 124
    .line 125
    iput-object v5, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->H:Landroid/telephony/TelephonyCallback;

    .line 126
    .line 127
    invoke-static {p0}, Lag8;->v(Landroid/content/ContextWrapper;)Ljava/util/concurrent/Executor;

    .line 128
    .line 129
    .line 130
    move-result-object v6

    .line 131
    invoke-static {v0, v6, v5}, Lv41;->v(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyCallback;)V

    .line 132
    .line 133
    .line 134
    goto :goto_1

    .line 135
    :cond_3
    new-instance v5, Lwx2;

    .line 136
    .line 137
    invoke-direct {v5, p0, v4}, Lwx2;-><init>(Landroid/app/Service;I)V

    .line 138
    .line 139
    .line 140
    iput-object v5, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->I:Lwx2;

    .line 141
    .line 142
    const/16 v6, 0x20

    .line 143
    .line 144
    invoke-virtual {v0, v5, v6}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 145
    .line 146
    .line 147
    :goto_1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->P:Landroid/content/IntentFilter;

    .line 148
    .line 149
    iget-object v5, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->Q:Lpy7;

    .line 150
    .line 151
    if-lt v1, v3, :cond_4

    .line 152
    .line 153
    invoke-static {p0, v5, v0}, Lpc7;->z(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 154
    .line 155
    .line 156
    goto :goto_2

    .line 157
    :cond_4
    invoke-virtual {p0, v5, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 158
    .line 159
    .line 160
    :goto_2
    const-string v0, "android.permission.READ_SMS"

    .line 161
    .line 162
    invoke-static {p0, v0}, Lsg3;->A(Landroid/content/Context;Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v0

    .line 166
    if-nez v0, :cond_5

    .line 167
    .line 168
    goto :goto_3

    .line 169
    :cond_5
    new-instance v0, Landroid/os/Handler;

    .line 170
    .line 171
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 172
    .line 173
    .line 174
    move-result-object v5

    .line 175
    invoke-direct {v0, v5}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 176
    .line 177
    .line 178
    new-instance v5, Lsy7;

    .line 179
    .line 180
    invoke-direct {v5, v0, p0}, Lsy7;-><init>(Landroid/os/Handler;Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;)V

    .line 181
    .line 182
    .line 183
    iput-object v5, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->K:Lsy7;

    .line 184
    .line 185
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    sget-object v6, Landroid/provider/Telephony$Sms;->CONTENT_URI:Landroid/net/Uri;

    .line 190
    .line 191
    invoke-virtual {v0, v6, v4, v5}, Landroid/content/ContentResolver;->registerContentObserver(Landroid/net/Uri;ZLandroid/database/ContentObserver;)V

    .line 192
    .line 193
    .line 194
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->R:Landroid/content/IntentFilter;

    .line 195
    .line 196
    iget-object v4, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->S:Lpy7;

    .line 197
    .line 198
    if-lt v1, v3, :cond_6

    .line 199
    .line 200
    invoke-static {p0, v4, v0}, Lpc7;->z(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)V

    .line 201
    .line 202
    .line 203
    goto :goto_3

    .line 204
    :cond_6
    invoke-virtual {p0, v4, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

    .line 205
    .line 206
    .line 207
    :goto_3
    const-class v0, Landroid/net/ConnectivityManager;

    .line 208
    .line 209
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    check-cast v0, Landroid/net/ConnectivityManager;

    .line 214
    .line 215
    if-nez v0, :cond_7

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_7
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->M:Landroid/net/ConnectivityManager;

    .line 219
    .line 220
    new-instance v1, Landroid/net/NetworkRequest$Builder;

    .line 221
    .line 222
    invoke-direct {v1}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 223
    .line 224
    .line 225
    const/4 v3, 0x0

    .line 226
    invoke-virtual {v1, v3}, Landroid/net/NetworkRequest$Builder;->addTransportType(I)Landroid/net/NetworkRequest$Builder;

    .line 227
    .line 228
    .line 229
    move-result-object v1

    .line 230
    invoke-virtual {v1}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    new-instance v3, Ldb3;

    .line 235
    .line 236
    const/4 v4, 0x4

    .line 237
    invoke-direct {v3, v4, p0}, Ldb3;-><init>(ILjava/lang/Object;)V

    .line 238
    .line 239
    .line 240
    iput-object v3, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->N:Ldb3;

    .line 241
    .line 242
    :try_start_0
    invoke-virtual {v0, v1, v3}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 243
    .line 244
    .line 245
    :catchall_0
    :goto_4
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 246
    .line 247
    sget-object v0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->T:Ld37;

    .line 248
    .line 249
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0, v2, p0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :cond_8
    const-string p0, "scope"

    .line 257
    .line 258
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 259
    .line 260
    .line 261
    throw v2

    .line 262
    :cond_9
    const-string p0, "ioDispatcher"

    .line 263
    .line 264
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    throw v2
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
.end method

.method public final onDestroy()V
    .locals 4

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->T:Ld37;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    invoke-virtual {v1, v2, v0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->E:Lh27;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {v0, v2}, Lll3;->o(Ljava/util/concurrent/CancellationException;)V

    .line 17
    .line 18
    .line 19
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 20
    .line 21
    const/16 v1, 0x1f

    .line 22
    .line 23
    if-lt v0, v1, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->H:Landroid/telephony/TelephonyCallback;

    .line 26
    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->G:Landroid/telephony/TelephonyManager;

    .line 30
    .line 31
    if-eqz v1, :cond_2

    .line 32
    .line 33
    invoke-static {v1, v0}, Lv41;->u(Landroid/telephony/TelephonyManager;Landroid/telephony/TelephonyCallback;)V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->I:Lwx2;

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->G:Landroid/telephony/TelephonyManager;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    const/4 v3, 0x0

    .line 46
    invoke-virtual {v1, v0, v3}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 47
    .line 48
    .line 49
    :cond_2
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->Q:Lpy7;

    .line 50
    .line 51
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :catchall_0
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->K:Lsy7;

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {v1, v0}, Landroid/content/ContentResolver;->unregisterContentObserver(Landroid/database/ContentObserver;)V

    .line 63
    .line 64
    .line 65
    :cond_3
    iput-object v2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->K:Lsy7;

    .line 66
    .line 67
    :try_start_1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->S:Lpy7;

    .line 68
    .line 69
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    .line 71
    .line 72
    :catchall_1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->M:Landroid/net/ConnectivityManager;

    .line 73
    .line 74
    if-nez v0, :cond_4

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_4
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->N:Ldb3;

    .line 78
    .line 79
    if-eqz v1, :cond_5

    .line 80
    .line 81
    :try_start_2
    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 82
    .line 83
    .line 84
    :catchall_2
    :cond_5
    iput-object v2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->N:Ldb3;

    .line 85
    .line 86
    :goto_1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->C:Lig0;

    .line 87
    .line 88
    if-eqz v0, :cond_6

    .line 89
    .line 90
    invoke-static {v0, v2}, Lgl0;->J(Lo81;Ljava/util/concurrent/CancellationException;)V

    .line 91
    .line 92
    .line 93
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 94
    .line 95
    .line 96
    return-void

    .line 97
    :cond_6
    const-string p0, "scope"

    .line 98
    .line 99
    invoke-static {p0}, Lsg3;->a0(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    throw v2
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final onStartCommand(Landroid/content/Intent;II)I
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
.end method
