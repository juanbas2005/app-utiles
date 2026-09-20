.class public final Lf09;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Lv89;

.field public b:Z

.field public c:Z


# direct methods
.method public constructor <init>(Lv89;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lz65;->k(Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lf09;->a:Lv89;

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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method


# virtual methods
.method public final a()V
    .locals 3

    .line 1
    iget-object v0, p0, Lf09;->a:Lv89;

    .line 2
    .line 3
    invoke-virtual {v0}, Lv89;->j0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Lv89;->n0()Lr19;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v1}, Lr19;->b1()V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lv89;->n0()Lr19;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v1}, Lr19;->b1()V

    .line 18
    .line 19
    .line 20
    iget-boolean v1, p0, Lf09;->b:Z

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    invoke-virtual {v0}, Lv89;->G()Lpz8;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 30
    .line 31
    const-string v2, "Unregistering connectivity change receiver"

    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const/4 v1, 0x0

    .line 37
    iput-boolean v1, p0, Lf09;->b:Z

    .line 38
    .line 39
    iput-boolean v1, p0, Lf09;->c:Z

    .line 40
    .line 41
    iget-object v1, v0, Lv89;->H:Ly19;

    .line 42
    .line 43
    iget-object v1, v1, Ly19;->w:Landroid/content/Context;

    .line 44
    .line 45
    :try_start_0
    invoke-virtual {v1, p0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catch_0
    move-exception p0

    .line 50
    invoke-virtual {v0}, Lv89;->G()Lpz8;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 55
    .line 56
    const-string v1, "Failed to unregister the network broadcast receiver"

    .line 57
    .line 58
    invoke-virtual {v0, v1, p0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    return-void
    .line 62
    .line 63
.end method

.method public final onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    iget-object p1, p0, Lf09;->a:Lv89;

    .line 2
    .line 3
    invoke-virtual {p1}, Lv89;->j0()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-virtual {p1}, Lv89;->G()Lpz8;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 15
    .line 16
    const-string v1, "NetworkBroadcastReceiver received action"

    .line 17
    .line 18
    invoke-virtual {v0, v1, p2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const-string v0, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_1

    .line 28
    .line 29
    iget-object p2, p1, Lv89;->x:Lxz8;

    .line 30
    .line 31
    invoke-static {p2}, Lv89;->R(Lg89;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p2}, Lxz8;->g1()Z

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    iget-boolean v0, p0, Lf09;->c:Z

    .line 39
    .line 40
    if-eq v0, p2, :cond_0

    .line 41
    .line 42
    iput-boolean p2, p0, Lf09;->c:Z

    .line 43
    .line 44
    invoke-virtual {p1}, Lv89;->n0()Lr19;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    new-instance v0, Lge;

    .line 49
    .line 50
    invoke-direct {v0, p0, p2}, Lge;-><init>(Lf09;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1, v0}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 54
    .line 55
    .line 56
    :cond_0
    return-void

    .line 57
    :cond_1
    invoke-virtual {p1}, Lv89;->G()Lpz8;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    iget-object p0, p0, Lpz8;->E:Lmz8;

    .line 62
    .line 63
    const-string p1, "NetworkBroadcastReceiver received unknown action"

    .line 64
    .line 65
    invoke-virtual {p0, p1, p2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    return-void
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
