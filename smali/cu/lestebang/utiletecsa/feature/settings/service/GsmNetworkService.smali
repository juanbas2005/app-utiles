.class public final Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;
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
        "Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;",
        "Landroid/app/Service;",
        "<init>",
        "()V",
        "bb0",
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
.field public static final D:Ld37;


# instance fields
.field public A:Landroid/telephony/TelephonyCallback;

.field public B:Lwx2;

.field public C:Ljava/lang/Boolean;

.field public volatile w:Lyl6;

.field public final x:Ljava/lang/Object;

.field public y:Z

.field public z:Landroid/telephony/TelephonyManager;


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
    sput-object v0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->D:Ld37;

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
    .locals 1

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
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->x:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->y:Z

    .line 13
    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public static final b(Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->C:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->C:Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {p0, v1}, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->c(Ljava/lang/Boolean;)Landroid/app/Notification;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    const v2, 0x31772

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v2, v1}, Lsg3;->W(Landroid/content/Context;ILandroid/app/Notification;)V

    .line 21
    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    if-eqz p1, :cond_0

    .line 36
    .line 37
    const p1, 0x7f11015e

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    const p1, 0x7f11015d

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    new-instance v0, Ld15;

    .line 56
    .line 57
    const-string v1, "GsmNetworkAlertChannel"

    .line 58
    .line 59
    invoke-direct {v0, p0, v1}, Ld15;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    iget v1, v1, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 67
    .line 68
    iget-object v2, v0, Ld15;->y:Landroid/app/Notification;

    .line 69
    .line 70
    iput v1, v2, Landroid/app/Notification;->icon:I

    .line 71
    .line 72
    const v1, 0x7f110162

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    invoke-static {v1}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    iput-object v1, v0, Ld15;->e:Ljava/lang/CharSequence;

    .line 84
    .line 85
    invoke-static {p1}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, v0, Ld15;->f:Ljava/lang/CharSequence;

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    invoke-virtual {p1, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    if-eqz p1, :cond_1

    .line 104
    .line 105
    const/4 v1, 0x0

    .line 106
    const/high16 v2, 0xc000000

    .line 107
    .line 108
    invoke-static {p0, v1, p1, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    goto :goto_1

    .line 113
    :cond_1
    const/4 p1, 0x0

    .line 114
    :goto_1
    iput-object p1, v0, Ld15;->g:Landroid/app/PendingIntent;

    .line 115
    .line 116
    const/4 p1, 0x1

    .line 117
    iput p1, v0, Ld15;->k:I

    .line 118
    .line 119
    const/16 v1, 0x10

    .line 120
    .line 121
    invoke-virtual {v0, v1, p1}, Ld15;->c(IZ)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v0}, Ld15;->a()Landroid/app/Notification;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 129
    .line 130
    .line 131
    const v0, 0x31773

    .line 132
    .line 133
    .line 134
    invoke-static {p0, v0, p1}, Lsg3;->W(Landroid/content/Context;ILandroid/app/Notification;)V

    .line 135
    .line 136
    .line 137
    :cond_2
    return-void
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
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->w:Lyl6;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->x:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter v0

    .line 8
    :try_start_0
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->w:Lyl6;

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
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->w:Lyl6;

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
    iget-object p0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->w:Lyl6;

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

.method public final c(Ljava/lang/Boolean;)Landroid/app/Notification;
    .locals 4

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    const p1, 0x7f110164

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 19
    .line 20
    invoke-static {p1, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    const p1, 0x7f110166

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    if-nez p1, :cond_3

    .line 35
    .line 36
    const p1, 0x7f110165

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    new-instance v0, Ld15;

    .line 47
    .line 48
    const-string v2, "GsmNetworkStatusChannel"

    .line 49
    .line 50
    invoke-direct {v0, p0, v2}, Ld15;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    iget v2, v2, Landroid/content/pm/ApplicationInfo;->icon:I

    .line 58
    .line 59
    iget-object v3, v0, Ld15;->y:Landroid/app/Notification;

    .line 60
    .line 61
    iput v2, v3, Landroid/app/Notification;->icon:I

    .line 62
    .line 63
    const v2, 0x7f110162

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-static {v2}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    iput-object v2, v0, Ld15;->e:Ljava/lang/CharSequence;

    .line 75
    .line 76
    invoke-static {p1}, Ld15;->b(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iput-object p1, v0, Ld15;->f:Ljava/lang/CharSequence;

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {p1, v2}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const/4 v2, 0x0

    .line 95
    if-eqz p1, :cond_2

    .line 96
    .line 97
    const/high16 v1, 0xc000000

    .line 98
    .line 99
    invoke-static {p0, v2, p1, v1}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    :cond_2
    iput-object v1, v0, Ld15;->g:Landroid/app/PendingIntent;

    .line 104
    .line 105
    const/4 p0, -0x1

    .line 106
    iput p0, v0, Ld15;->k:I

    .line 107
    .line 108
    const/4 p0, 0x2

    .line 109
    const/4 p1, 0x1

    .line 110
    invoke-virtual {v0, p0, p1}, Ld15;->c(IZ)V

    .line 111
    .line 112
    .line 113
    const/16 p0, 0x8

    .line 114
    .line 115
    invoke-virtual {v0, p0, p1}, Ld15;->c(IZ)V

    .line 116
    .line 117
    .line 118
    iput-boolean v2, v0, Ld15;->l:Z

    .line 119
    .line 120
    invoke-virtual {v0}, Ld15;->a()Landroid/app/Notification;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    return-object p0

    .line 128
    :cond_3
    invoke-static {}, Lh;->c()V

    .line 129
    .line 130
    .line 131
    return-object v1
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

.method public final d()V
    .locals 1

    .line 1
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->y:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->y:Z

    .line 7
    .line 8
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->a()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    check-cast v0, Lxx2;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-super {p0}, Landroid/app/Service;->onCreate()V

    .line 18
    .line 19
    .line 20
    return-void
    .line 21
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
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->d()V

    .line 2
    .line 3
    .line 4
    const v0, 0x7f11015f

    .line 5
    .line 6
    .line 7
    const/4 v1, 0x2

    .line 8
    const-string v2, "GsmNetworkStatusChannel"

    .line 9
    .line 10
    const v3, 0x7f110160

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v2, v3, v0, v1}, Lsg3;->p(Landroid/content/Context;Ljava/lang/String;III)V

    .line 14
    .line 15
    .line 16
    const v0, 0x7f11015b

    .line 17
    .line 18
    .line 19
    const/4 v1, 0x4

    .line 20
    const-string v2, "GsmNetworkAlertChannel"

    .line 21
    .line 22
    const v3, 0x7f11015c

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v2, v3, v0, v1}, Lsg3;->p(Landroid/content/Context;Ljava/lang/String;III)V

    .line 26
    .line 27
    .line 28
    const/4 v0, 0x0

    .line 29
    invoke-virtual {p0, v0}, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->c(Ljava/lang/Boolean;)Landroid/app/Notification;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 34
    .line 35
    const/16 v3, 0x22

    .line 36
    .line 37
    if-lt v2, v3, :cond_0

    .line 38
    .line 39
    invoke-static {p0, v1}, Lix2;->p(Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;Landroid/app/Notification;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const v3, 0x31772

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v3, v1}, Landroid/app/Service;->startForeground(ILandroid/app/Notification;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    const-class v1, Landroid/telephony/TelephonyManager;

    .line 50
    .line 51
    invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    check-cast v1, Landroid/telephony/TelephonyManager;

    .line 56
    .line 57
    if-nez v1, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    iput-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->z:Landroid/telephony/TelephonyManager;

    .line 61
    .line 62
    const/16 v3, 0x1f

    .line 63
    .line 64
    if-lt v2, v3, :cond_2

    .line 65
    .line 66
    new-instance v2, Lvx2;

    .line 67
    .line 68
    invoke-direct {v2, p0}, Lvx2;-><init>(Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;)V

    .line 69
    .line 70
    .line 71
    iput-object v2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->A:Landroid/telephony/TelephonyCallback;

    .line 72
    .line 73
    invoke-static {p0}, Lag8;->v(Landroid/content/ContextWrapper;)Ljava/util/concurrent/Executor;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    invoke-static {v1, p0, v2}, Lv41;->v(Landroid/telephony/TelephonyManager;Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyCallback;)V

    .line 78
    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    new-instance v2, Lwx2;

    .line 82
    .line 83
    const/4 v3, 0x0

    .line 84
    invoke-direct {v2, p0, v3}, Lwx2;-><init>(Landroid/app/Service;I)V

    .line 85
    .line 86
    .line 87
    iput-object v2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->B:Lwx2;

    .line 88
    .line 89
    const/4 p0, 0x1

    .line 90
    invoke-virtual {v1, v2, p0}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 91
    .line 92
    .line 93
    :goto_1
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 94
    .line 95
    sget-object v1, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->D:Ld37;

    .line 96
    .line 97
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v0, p0}, Ld37;->l(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    return-void
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

.method public final onDestroy()V
    .locals 3

    .line 1
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 2
    .line 3
    sget-object v1, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->D:Ld37;

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
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 13
    .line 14
    const/16 v1, 0x1f

    .line 15
    .line 16
    if-lt v0, v1, :cond_0

    .line 17
    .line 18
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->A:Landroid/telephony/TelephonyCallback;

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->z:Landroid/telephony/TelephonyManager;

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    invoke-static {v1, v0}, Lv41;->u(Landroid/telephony/TelephonyManager;Landroid/telephony/TelephonyCallback;)V

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    iget-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->B:Lwx2;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    iget-object v1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/GsmNetworkService;->z:Landroid/telephony/TelephonyManager;

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    .line 38
    const/4 v2, 0x0

    .line 39
    invoke-virtual {v1, v0, v2}, Landroid/telephony/TelephonyManager;->listen(Landroid/telephony/PhoneStateListener;I)V

    .line 40
    .line 41
    .line 42
    :cond_1
    :goto_0
    invoke-super {p0}, Landroid/app/Service;->onDestroy()V

    .line 43
    .line 44
    .line 45
    return-void
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
