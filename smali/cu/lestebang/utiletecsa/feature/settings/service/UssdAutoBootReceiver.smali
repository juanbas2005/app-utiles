.class public final Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;",
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


# instance fields
.field public volatile a:Z

.field public final b:Ljava/lang/Object;

.field public c:Ldv7;


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
    iput-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;->a:Z

    .line 6
    .line 7
    new-instance v0, Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;->b:Ljava/lang/Object;

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
    iget-boolean p2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;->a:Z

    .line 2
    .line 3
    if-nez p2, :cond_1

    .line 4
    .line 5
    iget-object p2, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;->b:Ljava/lang/Object;

    .line 6
    .line 7
    monitor-enter p2

    .line 8
    :try_start_0
    iget-boolean v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;->a:Z

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
    check-cast p1, Liy7;

    .line 17
    .line 18
    check-cast p1, Lvd1;

    .line 19
    .line 20
    iget-object p1, p1, Lvd1;->l:Llu5;

    .line 21
    .line 22
    invoke-interface {p1}, Lmu5;->get()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    check-cast p1, Ldv7;

    .line 27
    .line 28
    iput-object p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;->c:Ldv7;

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    iput-boolean p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;->a:Z

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
    .locals 2

    .line 1
    invoke-virtual {p0, p1, p2}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoBootReceiver;->a(Landroid/content/Context;Landroid/content/Intent;)V

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
    move-result-object p2

    .line 14
    const-string v0, "android.intent.action.BOOT_COMPLETED"

    .line 15
    .line 16
    invoke-static {p2, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    const-string v0, "android.intent.action.MY_PACKAGE_REPLACED"

    .line 23
    .line 24
    invoke-static {p2, v0}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    if-nez p2, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    new-instance p2, Lzw7;

    .line 32
    .line 33
    const/4 v0, 0x3

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-direct {p2, p0, v1, v0}, Lzw7;-><init>(Ljava/lang/Object;Lf61;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lx32;->w:Lx32;

    .line 39
    .line 40
    invoke-static {p0, p2}, Lar7;->U(Le81;Lgs2;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Ljava/lang/Boolean;

    .line 45
    .line 46
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_2

    .line 51
    .line 52
    sget-object p0, Lyh7;->a:Lhr2;

    .line 53
    .line 54
    const/4 p2, 0x0

    .line 55
    new-array p2, p2, [Ljava/lang/Object;

    .line 56
    .line 57
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    invoke-static {p2}, Lhr2;->m([Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    sget-object p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->T:Ld37;

    .line 64
    .line 65
    new-instance p0, Landroid/content/Intent;

    .line 66
    .line 67
    const-class p2, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 68
    .line 69
    invoke-direct {p0, p1, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 70
    .line 71
    .line 72
    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 73
    .line 74
    const/16 v0, 0x1a

    .line 75
    .line 76
    if-lt p2, v0, :cond_1

    .line 77
    .line 78
    invoke-static {p1, p0}, Lag8;->H(Landroid/content/Context;Landroid/content/Intent;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :cond_1
    invoke-virtual {p1, p0}, Landroid/content/Context;->startService(Landroid/content/Intent;)Landroid/content/ComponentName;

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_0
    return-void
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
.end method
