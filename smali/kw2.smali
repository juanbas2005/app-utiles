.class public abstract Lkw2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/String;

.field public final c:Lns8;

.field public final d:Lqc3;

.field public final e:Lym;

.field public final f:Lln;

.field public final g:Landroid/os/Looper;

.field public final h:I

.field public final i:Lpg8;

.field public final j:Lg22;

.field public final k:Lpw2;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lqc3;Lym;Ljw2;)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "Null context is not permitted."

    .line 5
    .line 6
    invoke-static {v0, p1}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    const-string v0, "Api must not be null."

    .line 10
    .line 11
    invoke-static {v0, p2}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const-string v0, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead."

    .line 15
    .line 16
    invoke-static {v0, p4}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const-string v1, "The provided context did not have an application context."

    .line 24
    .line 25
    invoke-static {v1, v0}, Lz65;->l(Ljava/lang/String;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iput-object v0, p0, Lkw2;->a:Landroid/content/Context;

    .line 29
    .line 30
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 31
    .line 32
    const/4 v2, 0x0

    .line 33
    const/16 v3, 0x1e

    .line 34
    .line 35
    if-lt v1, v3, :cond_0

    .line 36
    .line 37
    if-lt v1, v3, :cond_0

    .line 38
    .line 39
    invoke-static {p1}, Lx4;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    move-object v3, v2

    .line 45
    :goto_0
    iput-object v3, p0, Lkw2;->b:Ljava/lang/String;

    .line 46
    .line 47
    const/16 v4, 0x1f

    .line 48
    .line 49
    if-lt v1, v4, :cond_1

    .line 50
    .line 51
    new-instance v2, Lns8;

    .line 52
    .line 53
    invoke-static {p1}, Lv41;->e(Landroid/content/Context;)Landroid/content/AttributionSource;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 v1, 0x6

    .line 58
    invoke-direct {v2, v1, p1}, Lns8;-><init>(ILjava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    :cond_1
    iput-object v2, p0, Lkw2;->c:Lns8;

    .line 62
    .line 63
    iput-object p2, p0, Lkw2;->d:Lqc3;

    .line 64
    .line 65
    iput-object p3, p0, Lkw2;->e:Lym;

    .line 66
    .line 67
    iget-object p1, p4, Ljw2;->b:Landroid/os/Looper;

    .line 68
    .line 69
    iput-object p1, p0, Lkw2;->g:Landroid/os/Looper;

    .line 70
    .line 71
    new-instance p1, Lln;

    .line 72
    .line 73
    invoke-direct {p1, p2, p3, v3}, Lln;-><init>(Lqc3;Lym;Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    iput-object p1, p0, Lkw2;->f:Lln;

    .line 77
    .line 78
    new-instance p1, Lpg8;

    .line 79
    .line 80
    invoke-direct {p1, p0}, Lpg8;-><init>(Lkw2;)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lkw2;->i:Lpg8;

    .line 84
    .line 85
    invoke-static {v0}, Lpw2;->e(Landroid/content/Context;)Lpw2;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    iput-object p1, p0, Lkw2;->k:Lpw2;

    .line 90
    .line 91
    iget-object p2, p1, Lpw2;->D:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    .line 94
    .line 95
    .line 96
    move-result p2

    .line 97
    iput p2, p0, Lkw2;->h:I

    .line 98
    .line 99
    iget-object p2, p4, Ljw2;->a:Lg22;

    .line 100
    .line 101
    iput-object p2, p0, Lkw2;->j:Lg22;

    .line 102
    .line 103
    iget-object p1, p1, Lpw2;->I:Lph8;

    .line 104
    .line 105
    const/4 p2, 0x7

    .line 106
    invoke-virtual {p1, p2, p0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p1, p0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 111
    .line 112
    .line 113
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final a()Lwr0;
    .locals 4

    .line 1
    new-instance v0, Lwr0;

    .line 2
    .line 3
    const/16 v1, 0xf

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lwr0;-><init>(IZ)V

    .line 7
    .line 8
    .line 9
    sget-object v1, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    .line 10
    .line 11
    iget-object v3, v0, Lwr0;->x:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Los;

    .line 14
    .line 15
    if-nez v3, :cond_0

    .line 16
    .line 17
    new-instance v3, Los;

    .line 18
    .line 19
    invoke-direct {v3, v2}, Los;-><init>(I)V

    .line 20
    .line 21
    .line 22
    iput-object v3, v0, Lwr0;->x:Ljava/lang/Object;

    .line 23
    .line 24
    :cond_0
    iget-object v2, v0, Lwr0;->x:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v2, Los;

    .line 27
    .line 28
    invoke-virtual {v2, v1}, Los;->addAll(Ljava/util/Collection;)Z

    .line 29
    .line 30
    .line 31
    iget-object p0, p0, Lkw2;->a:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    iput-object v1, v0, Lwr0;->z:Ljava/lang/Object;

    .line 42
    .line 43
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    iput-object p0, v0, Lwr0;->y:Ljava/lang/Object;

    .line 48
    .line 49
    return-object v0
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

.method public final b(ILi93;)Lyb9;
    .locals 4

    .line 1
    new-instance v0, Lxb7;

    .line 2
    .line 3
    invoke-direct {v0}, Lxb7;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lkw2;->k:Lpw2;

    .line 7
    .line 8
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget v2, p2, Li93;->b:I

    .line 12
    .line 13
    invoke-virtual {v1, v0, v2, p0}, Lpw2;->c(Lxb7;ILkw2;)V

    .line 14
    .line 15
    .line 16
    new-instance v2, Lhh8;

    .line 17
    .line 18
    iget-object v3, p0, Lkw2;->j:Lg22;

    .line 19
    .line 20
    invoke-direct {v2, p1, p2, v0, v3}, Lhh8;-><init>(ILi93;Lxb7;Lg22;)V

    .line 21
    .line 22
    .line 23
    iget-object p1, v1, Lpw2;->E:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 24
    .line 25
    new-instance p2, Lug8;

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    invoke-direct {p2, v2, p1, p0}, Lug8;-><init>(Ljh8;ILkw2;)V

    .line 32
    .line 33
    .line 34
    iget-object p0, v1, Lpw2;->I:Lph8;

    .line 35
    .line 36
    const/4 p1, 0x4

    .line 37
    invoke-virtual {p0, p1, p2}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z

    .line 42
    .line 43
    .line 44
    iget-object p0, v0, Lxb7;->a:Lyb9;

    .line 45
    .line 46
    return-object p0
    .line 47
.end method
