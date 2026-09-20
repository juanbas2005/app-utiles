.class public final Lpy7;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;


# direct methods
.method public synthetic constructor <init>(Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;I)V
    .locals 0

    .line 1
    iput p2, p0, Lpy7;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lpy7;->b:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 4
    .line 5
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
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
.end method


# virtual methods
.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 4

    .line 1
    iget p1, p0, Lpy7;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lpy7;->b:Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    packed-switch p1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    if-eqz p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    :cond_0
    const-string p1, "cu.lestebang.utiletecsa.action.SMS_SENT"

    .line 16
    .line 17
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    .line 26
    .line 27
    move-result-wide p1

    .line 28
    iget-wide v0, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->L:J

    .line 29
    .line 30
    sub-long v0, p1, v0

    .line 31
    .line 32
    const-wide/16 v2, 0x2710

    .line 33
    .line 34
    cmp-long v0, v0, v2

    .line 35
    .line 36
    if-gez v0, :cond_2

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_2
    iput-wide p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->L:J

    .line 40
    .line 41
    const p1, 0x7f11042e

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    new-instance p2, Lha7;

    .line 52
    .line 53
    const/16 v0, 0x18

    .line 54
    .line 55
    invoke-direct {p2, v0}, Lha7;-><init>(I)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1, p2}, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->i(Ljava/lang/String;Lvr2;)V

    .line 59
    .line 60
    .line 61
    :goto_0
    return-void

    .line 62
    :pswitch_0
    if-eqz p2, :cond_3

    .line 63
    .line 64
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    :cond_3
    const-string p1, "android.intent.action.NEW_OUTGOING_CALL"

    .line 69
    .line 70
    invoke-static {v0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 77
    .line 78
    .line 79
    move-result-wide p1

    .line 80
    iput-wide p1, p0, Lcu/lestebang/utiletecsa/feature/settings/service/UssdAutoUpdaterService;->J:J

    .line 81
    .line 82
    :cond_4
    return-void

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
