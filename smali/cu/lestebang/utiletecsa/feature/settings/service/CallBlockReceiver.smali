.class public final Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;",
        "Landroid/content/BroadcastReceiver;",
        "<init>",
        "()V",
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
.field public static volatile d:Ljava/lang/String;


# instance fields
.field public volatile a:Z

.field public final b:Ljava/lang/Object;

.field public c:Lvp6;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->a:Z

    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->b:Ljava/lang/Object;

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


# virtual methods
.method public final a(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 1

    .line 1
    iget-boolean p2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->a:Z

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget-object p2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter p2

    .line 8
    :try_start_0
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->a:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-static {p1}, Lb96;->u(Landroid/content/Context;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, Lki0;

    .line 17
    .line 18
    check-cast p1, Lvd1;

    .line 19
    .line 20
    iget-object p1, p1, Lvd1;->x:Llu5;

    .line 21
    .line 22
    invoke-interface {p1}, Lmu5;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Lvp6;

    .line 27
    .line 28
    iput-object p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->c:Lvp6;

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->a:Z

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception p0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    :goto_0
    monitor-exit p2

    .line 37
    return-void

    .line 38
    :goto_1
    monitor-exit p2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    throw p0

    .line 40
    :cond_1
    return-void
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 9

    .line 1
    invoke-virtual {p0, p1, p2}, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "android.intent.action.PHONE_STATE"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 24
    .line 25
    const/16 v1, 0x1c

    .line 26
    .line 27
    if-ge v0, v1, :cond_1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    const/16 v1, 0x1d

    .line 31
    .line 32
    if-lt v0, v1, :cond_2

    .line 33
    .line 34
    invoke-static {}, Lnd;->g()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {v0}, Lnd;->c(Ljava/lang/Object;)Landroid/app/role/RoleManager;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    invoke-static {v0}, Lnd;->u(Landroid/app/role/RoleManager;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    const/4 v1, 0x1

    .line 53
    if-ne v0, v1, :cond_2

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_2
    const-string v0, "state"

    .line 57
    .line 58
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    sget-object v1, Landroid/telephony/TelephonyManager;->EXTRA_STATE_RINGING:Ljava/lang/String;

    .line 63
    .line 64
    invoke-static {v0, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v1, 0x0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    sput-object v1, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->d:Ljava/lang/String;

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    const-string v0, "android.permission.ANSWER_PHONE_CALLS"

    .line 75
    .line 76
    invoke-static {p1, v0}, Lsg3;->A(Landroid/content/Context;Ljava/lang/String;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    :goto_0
    return-void

    .line 83
    :cond_4
    const-string v0, "incoming_number"

    .line 84
    .line 85
    invoke-virtual {p2, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v3

    .line 89
    if-eqz v3, :cond_6

    .line 90
    .line 91
    invoke-static {v3}, Ld57;->I0(Ljava/lang/CharSequence;)Z

    .line 92
    .line 93
    .line 94
    move-result p2

    .line 95
    if-eqz p2, :cond_5

    .line 96
    .line 97
    goto :goto_1

    .line 98
    :cond_5
    sput-object v3, Lcu/lestebang/utiletecsa/feature/settings/service/CallBlockReceiver;->d:Ljava/lang/String;

    .line 99
    .line 100
    :cond_6
    :goto_1
    invoke-virtual {p0}, Landroid/content/BroadcastReceiver;->goAsync()Landroid/content/BroadcastReceiver$PendingResult;

    .line 101
    .line 102
    .line 103
    move-result-object v5

    .line 104
    sget-object p2, Law1;->a:Ldn1;

    .line 105
    .line 106
    sget-object p2, Lcm1;->y:Lcm1;

    .line 107
    .line 108
    invoke-static {p2}, Lgl0;->E(Le81;)Lig0;

    .line 109
    .line 110
    .line 111
    move-result-object p2

    .line 112
    new-instance v2, Lf7;

    .line 113
    .line 114
    const/4 v7, 0x0

    .line 115
    const/4 v8, 0x3

    .line 116
    move-object v6, p0

    .line 117
    move-object v4, p1

    .line 118
    invoke-direct/range {v2 .. v8}, Lf7;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 119
    .line 120
    .line 121
    const/4 p0, 0x3

    .line 122
    invoke-static {p2, v1, v1, v2, p0}, Lar7;->H(Lo81;Le81;Lr81;Lgs2;I)Lh27;

    .line 123
    .line 124
    .line 125
    return-void
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
