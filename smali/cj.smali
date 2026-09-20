.class public final Lcj;
.super Ljava/lang/ThreadLocal;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lcj;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
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


# virtual methods
.method public final initialValue()Ljava/lang/Object;
    .locals 3

    .line 1
    iget p0, p0, Lcj;->a:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const/4 v1, 0x0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance p0, Ljava/util/Random;

    .line 9
    .line 10
    invoke-direct {p0}, Ljava/util/Random;-><init>()V

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :pswitch_0
    new-instance p0, Lic9;

    .line 15
    .line 16
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2}, Lag8;->M(Ljava/lang/Thread;)Z

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    iput-boolean v1, p0, Lic9;->a:Z

    .line 27
    .line 28
    iput-object v0, p0, Lic9;->b:Ljc9;

    .line 29
    .line 30
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    sget-object v1, Lvb9;->c:Ljava/util/WeakHashMap;

    .line 35
    .line 36
    monitor-enter v1

    .line 37
    :try_start_0
    invoke-virtual {v1, v0, p0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    monitor-exit v1

    .line 41
    return-object p0

    .line 42
    :catchall_0
    move-exception p0

    .line 43
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    throw p0

    .line 45
    :pswitch_1
    const-wide/16 v0, 0x0

    .line 46
    .line 47
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0

    .line 52
    :pswitch_2
    new-instance p0, Lvq8;

    .line 53
    .line 54
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 55
    .line 56
    .line 57
    sget-object v2, Lp25;->d:Ljava/lang/Thread;

    .line 58
    .line 59
    if-nez v2, :cond_0

    .line 60
    .line 61
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v2}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    sput-object v2, Lp25;->d:Ljava/lang/Thread;

    .line 70
    .line 71
    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-boolean v1, p0, Lvq8;->a:Z

    .line 75
    .line 76
    iput-object v0, p0, Lvq8;->b:Lcq8;

    .line 77
    .line 78
    iput-object v0, p0, Lvq8;->c:Lcq8;

    .line 79
    .line 80
    iput-object v0, p0, Lvq8;->d:Luy5;

    .line 81
    .line 82
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    sget-object v2, Lsp8;->d:Ljava/util/WeakHashMap;

    .line 87
    .line 88
    monitor-enter v2

    .line 89
    :try_start_1
    invoke-virtual {v2, v0, p0}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    monitor-exit v2

    .line 93
    return-object p0

    .line 94
    :catchall_1
    move-exception p0

    .line 95
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 96
    throw p0

    .line 97
    :pswitch_3
    new-instance p0, Lgk8;

    .line 98
    .line 99
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 100
    .line 101
    .line 102
    iput v1, p0, Lgk8;->w:I

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_4
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_5
    new-instance p0, Ljava/util/Random;

    .line 109
    .line 110
    invoke-direct {p0}, Ljava/util/Random;-><init>()V

    .line 111
    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_6
    new-instance p0, Ljava/text/SimpleDateFormat;

    .line 115
    .line 116
    const-string v0, "EEE, dd MMM yyyy HH:mm:ss \'GMT\'"

    .line 117
    .line 118
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 119
    .line 120
    invoke-direct {p0, v0, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, v1}, Ljava/text/DateFormat;->setLenient(Z)V

    .line 124
    .line 125
    .line 126
    sget-object v0, Lfg8;->a:Ljava/util/TimeZone;

    .line 127
    .line 128
    invoke-virtual {p0, v0}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 129
    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_7
    new-instance p0, Lej;

    .line 133
    .line 134
    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    if-eqz v2, :cond_1

    .line 143
    .line 144
    invoke-static {v2}, Lx91;->u(Landroid/os/Looper;)Landroid/os/Handler;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    invoke-direct {p0, v1, v0}, Lej;-><init>(Landroid/view/Choreographer;Landroid/os/Handler;)V

    .line 149
    .line 150
    .line 151
    iget-object v0, p0, Lej;->H:Lgj;

    .line 152
    .line 153
    invoke-static {p0, v0}, Lrc9;->D0(Lc81;Le81;)Le81;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    goto :goto_0

    .line 158
    :cond_1
    const-string p0, "no Looper on this thread"

    .line 159
    .line 160
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :goto_0
    return-object v0

    .line 164
    nop

    .line 165
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method
