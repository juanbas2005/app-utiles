.class public final Lv49;
.super Lfy8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public final A:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public B:Z

.field public final C:Ljava/util/concurrent/atomic/AtomicReference;

.field public final D:Ljava/lang/Object;

.field public E:Z

.field public F:I

.field public G:Lp39;

.field public H:Lp39;

.field public I:Ljava/util/PriorityQueue;

.field public J:Lh39;

.field public final K:Ljava/util/concurrent/atomic/AtomicLong;

.field public L:J

.field public final M:Lv09;

.field public N:Z

.field public O:Lp39;

.field public P:Lr49;

.field public Q:Lp39;

.field public final R:Lrg4;

.field public y:Lzb2;

.field public z:Lk68;


# direct methods
.method public constructor <init>(Ly19;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, Lfy8;-><init>(Ly19;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lv49;->A:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/Object;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lv49;->D:Ljava/lang/Object;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-boolean v0, p0, Lv49;->E:Z

    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    iput v0, p0, Lv49;->F:I

    .line 23
    .line 24
    iput-boolean v0, p0, Lv49;->N:Z

    .line 25
    .line 26
    new-instance v0, Lrg4;

    .line 27
    .line 28
    const/16 v1, 0x16

    .line 29
    .line 30
    invoke-direct {v0, v1, p0}, Lrg4;-><init>(ILjava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lv49;->R:Lrg4;

    .line 34
    .line 35
    new-instance v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 36
    .line 37
    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lv49;->C:Ljava/util/concurrent/atomic/AtomicReference;

    .line 41
    .line 42
    sget-object v0, Lh39;->c:Lh39;

    .line 43
    .line 44
    iput-object v0, p0, Lv49;->J:Lh39;

    .line 45
    .line 46
    const-wide/16 v0, -0x1

    .line 47
    .line 48
    iput-wide v0, p0, Lv49;->L:J

    .line 49
    .line 50
    new-instance v0, Ljava/util/concurrent/atomic/AtomicLong;

    .line 51
    .line 52
    const-wide/16 v1, 0x0

    .line 53
    .line 54
    invoke-direct {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicLong;-><init>(J)V

    .line 55
    .line 56
    .line 57
    iput-object v0, p0, Lv49;->K:Ljava/util/concurrent/atomic/AtomicLong;

    .line 58
    .line 59
    new-instance v0, Lv09;

    .line 60
    .line 61
    invoke-direct {v0, p1}, Lv09;-><init>(Ly19;)V

    .line 62
    .line 63
    .line 64
    iput-object v0, p0, Lv49;->M:Lv09;

    .line 65
    .line 66
    return-void
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


# virtual methods
.method public final A1()Ljava/util/PriorityQueue;
    .locals 3

    .line 1
    iget-object v0, p0, Lv49;->I:Ljava/util/PriorityQueue;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Ljava/util/PriorityQueue;

    .line 6
    .line 7
    sget-object v1, Lo49;->a:Lo49;

    .line 8
    .line 9
    sget-object v2, Lzf8;->y:Lzf8;

    .line 10
    .line 11
    invoke-static {v1, v2}, Ljava/util/Comparator;->comparing(Ljava/util/function/Function;Ljava/util/Comparator;)Ljava/util/Comparator;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/PriorityQueue;-><init>(Ljava/util/Comparator;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lv49;->I:Ljava/util/PriorityQueue;

    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Lv49;->I:Ljava/util/PriorityQueue;

    .line 21
    .line 22
    return-object p0
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
.end method

.method public final B1()V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lv49;->A1()Ljava/util/PriorityQueue;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_2

    .line 13
    .line 14
    iget-boolean v0, p0, Lv49;->E:Z

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-virtual {p0}, Lv49;->A1()Ljava/util/PriorityQueue;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/util/PriorityQueue;->poll()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lu79;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Lin8;->w:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v1, Ly19;

    .line 34
    .line 35
    iget-object v2, v1, Ly19;->E:Ld99;

    .line 36
    .line 37
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Ld99;->y1()Luh4;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    const/4 v3, 0x1

    .line 47
    iput-boolean v3, p0, Lv49;->E:Z

    .line 48
    .line 49
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 50
    .line 51
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 55
    .line 56
    iget-object v3, v0, Lu79;->w:Ljava/lang/String;

    .line 57
    .line 58
    const-string v4, "Registering trigger URI"

    .line 59
    .line 60
    invoke-virtual {v1, v4, v3}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    invoke-static {v3}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v2, v1}, Luh4;->e(Landroid/net/Uri;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    const/4 v2, 0x0

    .line 72
    if-nez v1, :cond_1

    .line 73
    .line 74
    iput-boolean v2, p0, Lv49;->E:Z

    .line 75
    .line 76
    invoke-virtual {p0}, Lv49;->A1()Ljava/util/PriorityQueue;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    invoke-virtual {p0, v0}, Ljava/util/PriorityQueue;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    return-void

    .line 84
    :cond_1
    new-instance v3, Liy2;

    .line 85
    .line 86
    const/4 v4, 0x3

    .line 87
    invoke-direct {v3, v4, p0}, Liy2;-><init>(ILjava/lang/Object;)V

    .line 88
    .line 89
    .line 90
    new-instance v4, Lk68;

    .line 91
    .line 92
    const/16 v5, 0x10

    .line 93
    .line 94
    invoke-direct {v4, p0, v2, v0, v5}, Lk68;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 95
    .line 96
    .line 97
    new-instance p0, Lnt2;

    .line 98
    .line 99
    invoke-direct {p0, v2, v1, v4}, Lnt2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v1, p0, v3}, Lcom/google/common/util/concurrent/ListenableFuture;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 103
    .line 104
    .line 105
    :cond_2
    :goto_0
    return-void
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

.method public final C1(Lh39;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lf39;->y:Lf39;

    .line 5
    .line 6
    invoke-virtual {p1, v0}, Lh39;->i(Lf39;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/4 v1, 0x0

    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    sget-object v0, Lf39;->x:Lf39;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lh39;->i(Lf39;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-nez p1, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    move p1, v2

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    iget-object p1, p0, Lin8;->w:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast p1, Ly19;

    .line 28
    .line 29
    invoke-virtual {p1}, Ly19;->j()Lr69;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lr69;->l1()Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    move p1, v1

    .line 41
    :goto_2
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ly19;

    .line 44
    .line 45
    iget-object v3, v0, Ly19;->C:Lr19;

    .line 46
    .line 47
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v3}, Lr19;->b1()V

    .line 51
    .line 52
    .line 53
    iget-boolean v3, v0, Ly19;->V:Z

    .line 54
    .line 55
    if-eq p1, v3, :cond_5

    .line 56
    .line 57
    iget-object v3, v0, Ly19;->C:Lr19;

    .line 58
    .line 59
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3}, Lr19;->b1()V

    .line 63
    .line 64
    .line 65
    iput-boolean p1, v0, Ly19;->V:Z

    .line 66
    .line 67
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, Ly19;

    .line 70
    .line 71
    iget-object v0, v0, Ly19;->A:Lq09;

    .line 72
    .line 73
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lin8;->b1()V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    const-string v4, "measurement_enabled_from_api"

    .line 84
    .line 85
    invoke-interface {v3, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    if-eqz v3, :cond_3

    .line 90
    .line 91
    invoke-virtual {v0}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    invoke-interface {v0, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    const/4 v0, 0x0

    .line 105
    :goto_3
    if-eqz p1, :cond_4

    .line 106
    .line 107
    if-eqz v0, :cond_4

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    if-eqz v0, :cond_5

    .line 114
    .line 115
    :cond_4
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 116
    .line 117
    .line 118
    move-result-object p1

    .line 119
    invoke-virtual {p0, p1, v1}, Lv49;->t1(Ljava/lang/Boolean;Z)V

    .line 120
    .line 121
    .line 122
    :cond_5
    return-void
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

.method public final f1()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

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
.end method

.method public final g1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 12

    .line 1
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly19;

    .line 4
    .line 5
    iget-object v1, v0, Ly19;->G:Lxb4;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v8

    .line 14
    iget-object v1, v0, Ly19;->z:Ltp8;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    sget-object v3, Lby8;->e1:Lay8;

    .line 18
    .line 19
    invoke-virtual {v1, v2, v3}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    iget-object v0, v0, Ly19;->G:Lxb4;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    :goto_0
    move-wide v10, v0

    .line 35
    goto :goto_1

    .line 36
    :cond_0
    const-wide/16 v0, 0x0

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :goto_1
    const/4 v6, 0x1

    .line 40
    const/4 v7, 0x1

    .line 41
    move-object v2, p0

    .line 42
    move-object v3, p1

    .line 43
    move-object v4, p2

    .line 44
    move-object v5, p3

    .line 45
    invoke-virtual/range {v2 .. v11}, Lv49;->h1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJJ)V

    .line 46
    .line 47
    .line 48
    return-void
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

.method public final h1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;ZZJJ)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    if-nez p3, :cond_0

    .line 4
    .line 5
    new-instance v0, Landroid/os/Bundle;

    .line 6
    .line 7
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 8
    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object/from16 v0, p3

    .line 12
    .line 13
    :goto_0
    const-string v2, "screen_view"

    .line 14
    .line 15
    move-object/from16 v3, p2

    .line 16
    .line 17
    invoke-static {v3, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v4, 0x0

    .line 22
    const-wide/16 v5, 0x0

    .line 23
    .line 24
    const/4 v7, 0x0

    .line 25
    const/4 v8, 0x1

    .line 26
    if-eqz v2, :cond_c

    .line 27
    .line 28
    iget-object v1, v1, Lin8;->w:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ly19;

    .line 31
    .line 32
    iget-object v2, v1, Ly19;->H:Ll59;

    .line 33
    .line 34
    invoke-static {v2}, Ly19;->f(Lfy8;)V

    .line 35
    .line 36
    .line 37
    iget-object v1, v1, Ly19;->z:Ltp8;

    .line 38
    .line 39
    sget-object v3, Lby8;->e1:Lay8;

    .line 40
    .line 41
    invoke-virtual {v1, v7, v3}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-eq v8, v1, :cond_1

    .line 46
    .line 47
    move-wide/from16 v17, v5

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    move-wide/from16 v17, p8

    .line 51
    .line 52
    :goto_1
    iget-object v9, v2, Ll59;->H:Ljava/lang/Object;

    .line 53
    .line 54
    monitor-enter v9

    .line 55
    :try_start_0
    iget-boolean v1, v2, Ll59;->G:Z

    .line 56
    .line 57
    if-nez v1, :cond_2

    .line 58
    .line 59
    iget-object v0, v2, Lin8;->w:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, Ly19;

    .line 62
    .line 63
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 64
    .line 65
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, v0, Lpz8;->G:Lmz8;

    .line 69
    .line 70
    const-string v1, "Cannot log screen view event when the app is in the background."

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    monitor-exit v9

    .line 76
    return-void

    .line 77
    :catchall_0
    move-exception v0

    .line 78
    goto/16 :goto_6

    .line 79
    .line 80
    :cond_2
    const-string v1, "screen_name"

    .line 81
    .line 82
    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    const/16 v1, 0x1f4

    .line 87
    .line 88
    if-eqz v10, :cond_4

    .line 89
    .line 90
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    if-lez v3, :cond_3

    .line 95
    .line 96
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    iget-object v5, v2, Lin8;->w:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, Ly19;

    .line 103
    .line 104
    iget-object v5, v5, Ly19;->z:Ltp8;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    if-le v3, v1, :cond_4

    .line 110
    .line 111
    :cond_3
    iget-object v0, v2, Lin8;->w:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v0, Ly19;

    .line 114
    .line 115
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 116
    .line 117
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 118
    .line 119
    .line 120
    iget-object v0, v0, Lpz8;->G:Lmz8;

    .line 121
    .line 122
    const-string v1, "Invalid screen name length for screen view. Length"

    .line 123
    .line 124
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    invoke-virtual {v0, v1, v2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    monitor-exit v9

    .line 136
    return-void

    .line 137
    :cond_4
    const-string v3, "screen_class"

    .line 138
    .line 139
    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v3

    .line 143
    if-eqz v3, :cond_6

    .line 144
    .line 145
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 146
    .line 147
    .line 148
    move-result v5

    .line 149
    if-lez v5, :cond_5

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v5

    .line 155
    iget-object v6, v2, Lin8;->w:Ljava/lang/Object;

    .line 156
    .line 157
    check-cast v6, Ly19;

    .line 158
    .line 159
    iget-object v6, v6, Ly19;->z:Ltp8;

    .line 160
    .line 161
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    if-le v5, v1, :cond_6

    .line 165
    .line 166
    :cond_5
    iget-object v0, v2, Lin8;->w:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, Ly19;

    .line 169
    .line 170
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 171
    .line 172
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 173
    .line 174
    .line 175
    iget-object v0, v0, Lpz8;->G:Lmz8;

    .line 176
    .line 177
    const-string v1, "Invalid screen class length for screen view. Length"

    .line 178
    .line 179
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 180
    .line 181
    .line 182
    move-result v2

    .line 183
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    invoke-virtual {v0, v1, v2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 188
    .line 189
    .line 190
    monitor-exit v9

    .line 191
    return-void

    .line 192
    :cond_6
    if-nez v3, :cond_7

    .line 193
    .line 194
    iget-object v1, v2, Ll59;->C:Ljv8;

    .line 195
    .line 196
    if-eqz v1, :cond_8

    .line 197
    .line 198
    iget-object v1, v1, Ljv8;->x:Ljava/lang/String;

    .line 199
    .line 200
    invoke-virtual {v2, v1}, Ll59;->h1(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v3

    .line 204
    :cond_7
    :goto_2
    move-object v11, v3

    .line 205
    goto :goto_3

    .line 206
    :cond_8
    const-string v3, "Activity"

    .line 207
    .line 208
    goto :goto_2

    .line 209
    :goto_3
    iget-object v1, v2, Ll59;->y:Lf59;

    .line 210
    .line 211
    iget-boolean v3, v2, Ll59;->D:Z

    .line 212
    .line 213
    if-eqz v3, :cond_9

    .line 214
    .line 215
    if-eqz v1, :cond_9

    .line 216
    .line 217
    iput-boolean v4, v2, Ll59;->D:Z

    .line 218
    .line 219
    iget-object v3, v1, Lf59;->b:Ljava/lang/String;

    .line 220
    .line 221
    invoke-static {v3, v11}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v3

    .line 225
    iget-object v1, v1, Lf59;->a:Ljava/lang/String;

    .line 226
    .line 227
    invoke-static {v1, v10}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 228
    .line 229
    .line 230
    move-result v1

    .line 231
    if-eqz v3, :cond_9

    .line 232
    .line 233
    if-eqz v1, :cond_9

    .line 234
    .line 235
    iget-object v0, v2, Lin8;->w:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast v0, Ly19;

    .line 238
    .line 239
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 240
    .line 241
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 242
    .line 243
    .line 244
    iget-object v0, v0, Lpz8;->G:Lmz8;

    .line 245
    .line 246
    const-string v1, "Ignoring call to log screen view event with duplicate parameters."

    .line 247
    .line 248
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    monitor-exit v9

    .line 252
    return-void

    .line 253
    :cond_9
    monitor-exit v9
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 254
    iget-object v1, v2, Lin8;->w:Ljava/lang/Object;

    .line 255
    .line 256
    check-cast v1, Ly19;

    .line 257
    .line 258
    iget-object v3, v1, Ly19;->B:Lpz8;

    .line 259
    .line 260
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 261
    .line 262
    .line 263
    iget-object v3, v3, Lpz8;->J:Lmz8;

    .line 264
    .line 265
    if-nez v10, :cond_a

    .line 266
    .line 267
    const-string v4, "null"

    .line 268
    .line 269
    goto :goto_4

    .line 270
    :cond_a
    move-object v4, v10

    .line 271
    :goto_4
    const-string v5, "Logging screen view with name, class"

    .line 272
    .line 273
    invoke-virtual {v3, v4, v11, v5}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    iget-object v3, v2, Ll59;->y:Lf59;

    .line 277
    .line 278
    if-nez v3, :cond_b

    .line 279
    .line 280
    iget-object v3, v2, Ll59;->z:Lf59;

    .line 281
    .line 282
    goto :goto_5

    .line 283
    :cond_b
    iget-object v3, v2, Ll59;->y:Lf59;

    .line 284
    .line 285
    :goto_5
    new-instance v9, Lf59;

    .line 286
    .line 287
    iget-object v4, v1, Ly19;->E:Ld99;

    .line 288
    .line 289
    invoke-static {v4}, Ly19;->e(Lin8;)V

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4}, Ld99;->a2()J

    .line 293
    .line 294
    .line 295
    move-result-wide v12

    .line 296
    const/4 v14, 0x1

    .line 297
    move-wide/from16 v15, p6

    .line 298
    .line 299
    invoke-direct/range {v9 .. v18}, Lf59;-><init>(Ljava/lang/String;Ljava/lang/String;JZJJ)V

    .line 300
    .line 301
    .line 302
    iput-object v9, v2, Ll59;->y:Lf59;

    .line 303
    .line 304
    iput-object v3, v2, Ll59;->z:Lf59;

    .line 305
    .line 306
    iput-object v9, v2, Ll59;->E:Lf59;

    .line 307
    .line 308
    iget-object v4, v1, Ly19;->G:Lxb4;

    .line 309
    .line 310
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 311
    .line 312
    .line 313
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 314
    .line 315
    .line 316
    move-result-wide v4

    .line 317
    iget-object v1, v1, Ly19;->C:Lr19;

    .line 318
    .line 319
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 320
    .line 321
    .line 322
    new-instance v6, Lrk7;

    .line 323
    .line 324
    move-object/from16 p2, v0

    .line 325
    .line 326
    move-object/from16 p1, v2

    .line 327
    .line 328
    move-object/from16 p4, v3

    .line 329
    .line 330
    move-wide/from16 p5, v4

    .line 331
    .line 332
    move-object/from16 p0, v6

    .line 333
    .line 334
    move-object/from16 p3, v9

    .line 335
    .line 336
    invoke-direct/range {p0 .. p6}, Lrk7;-><init>(Ll59;Landroid/os/Bundle;Lf59;Lf59;J)V

    .line 337
    .line 338
    .line 339
    move-object/from16 v0, p0

    .line 340
    .line 341
    invoke-virtual {v1, v0}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 342
    .line 343
    .line 344
    return-void

    .line 345
    :goto_6
    :try_start_1
    monitor-exit v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 346
    throw v0

    .line 347
    :cond_c
    if-eqz p5, :cond_d

    .line 348
    .line 349
    iget-object v2, v1, Lv49;->z:Lk68;

    .line 350
    .line 351
    if-eqz v2, :cond_d

    .line 352
    .line 353
    invoke-static {v3}, Ld99;->G1(Ljava/lang/String;)Z

    .line 354
    .line 355
    .line 356
    move-result v2

    .line 357
    if-eqz v2, :cond_e

    .line 358
    .line 359
    :cond_d
    move v10, v8

    .line 360
    goto :goto_7

    .line 361
    :cond_e
    move v10, v4

    .line 362
    :goto_7
    if-nez p1, :cond_f

    .line 363
    .line 364
    const-string v2, "app"

    .line 365
    .line 366
    goto :goto_8

    .line 367
    :cond_f
    move-object/from16 v2, p1

    .line 368
    .line 369
    :goto_8
    iget-object v9, v1, Lin8;->w:Ljava/lang/Object;

    .line 370
    .line 371
    check-cast v9, Ly19;

    .line 372
    .line 373
    iget-object v9, v9, Ly19;->z:Ltp8;

    .line 374
    .line 375
    sget-object v11, Lby8;->e1:Lay8;

    .line 376
    .line 377
    invoke-virtual {v9, v7, v11}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 378
    .line 379
    .line 380
    move-result v7

    .line 381
    if-eq v8, v7, :cond_10

    .line 382
    .line 383
    move-wide v6, v5

    .line 384
    goto :goto_9

    .line 385
    :cond_10
    move-wide/from16 v6, p8

    .line 386
    .line 387
    :goto_9
    new-instance v8, Landroid/os/Bundle;

    .line 388
    .line 389
    invoke-direct {v8, v0}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v8}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 393
    .line 394
    .line 395
    move-result-object v0

    .line 396
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 397
    .line 398
    .line 399
    move-result-object v0

    .line 400
    :cond_11
    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 401
    .line 402
    .line 403
    move-result v5

    .line 404
    if-eqz v5, :cond_16

    .line 405
    .line 406
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 407
    .line 408
    .line 409
    move-result-object v5

    .line 410
    check-cast v5, Ljava/lang/String;

    .line 411
    .line 412
    invoke-virtual {v8, v5}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    move-result-object v9

    .line 416
    instance-of v11, v9, Landroid/os/Bundle;

    .line 417
    .line 418
    if-eqz v11, :cond_12

    .line 419
    .line 420
    new-instance v11, Landroid/os/Bundle;

    .line 421
    .line 422
    check-cast v9, Landroid/os/Bundle;

    .line 423
    .line 424
    invoke-direct {v11, v9}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 425
    .line 426
    .line 427
    invoke-virtual {v8, v5, v11}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 428
    .line 429
    .line 430
    goto :goto_a

    .line 431
    :cond_12
    instance-of v5, v9, [Landroid/os/Parcelable;

    .line 432
    .line 433
    if-eqz v5, :cond_14

    .line 434
    .line 435
    check-cast v9, [Landroid/os/Parcelable;

    .line 436
    .line 437
    move v5, v4

    .line 438
    :goto_b
    array-length v11, v9

    .line 439
    if-ge v5, v11, :cond_11

    .line 440
    .line 441
    aget-object v11, v9, v5

    .line 442
    .line 443
    instance-of v12, v11, Landroid/os/Bundle;

    .line 444
    .line 445
    if-eqz v12, :cond_13

    .line 446
    .line 447
    new-instance v12, Landroid/os/Bundle;

    .line 448
    .line 449
    check-cast v11, Landroid/os/Bundle;

    .line 450
    .line 451
    invoke-direct {v12, v11}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 452
    .line 453
    .line 454
    aput-object v12, v9, v5

    .line 455
    .line 456
    :cond_13
    add-int/lit8 v5, v5, 0x1

    .line 457
    .line 458
    goto :goto_b

    .line 459
    :cond_14
    instance-of v5, v9, Ljava/util/List;

    .line 460
    .line 461
    if-eqz v5, :cond_11

    .line 462
    .line 463
    check-cast v9, Ljava/util/List;

    .line 464
    .line 465
    move v5, v4

    .line 466
    :goto_c
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 467
    .line 468
    .line 469
    move-result v11

    .line 470
    if-ge v5, v11, :cond_11

    .line 471
    .line 472
    invoke-interface {v9, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 473
    .line 474
    .line 475
    move-result-object v11

    .line 476
    instance-of v12, v11, Landroid/os/Bundle;

    .line 477
    .line 478
    if-eqz v12, :cond_15

    .line 479
    .line 480
    new-instance v12, Landroid/os/Bundle;

    .line 481
    .line 482
    check-cast v11, Landroid/os/Bundle;

    .line 483
    .line 484
    invoke-direct {v12, v11}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 485
    .line 486
    .line 487
    invoke-interface {v9, v5, v12}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    :cond_15
    add-int/lit8 v5, v5, 0x1

    .line 491
    .line 492
    goto :goto_c

    .line 493
    :cond_16
    iget-object v0, v1, Lin8;->w:Ljava/lang/Object;

    .line 494
    .line 495
    check-cast v0, Ly19;

    .line 496
    .line 497
    iget-object v12, v0, Ly19;->C:Lr19;

    .line 498
    .line 499
    invoke-static {v12}, Ly19;->g(Ly29;)V

    .line 500
    .line 501
    .line 502
    new-instance v0, Ly39;

    .line 503
    .line 504
    move/from16 v11, p4

    .line 505
    .line 506
    move/from16 v9, p5

    .line 507
    .line 508
    move-wide/from16 v4, p6

    .line 509
    .line 510
    invoke-direct/range {v0 .. v11}, Ly39;-><init>(Lv49;Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;ZZZ)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v12, v0}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 514
    .line 515
    .line 516
    return-void
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
.end method

.method public final i1()V
    .locals 51

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 4
    .line 5
    .line 6
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Ly19;

    .line 9
    .line 10
    iget-object v2, v1, Ly19;->B:Lpz8;

    .line 11
    .line 12
    iget-object v3, v1, Ly19;->B:Lpz8;

    .line 13
    .line 14
    invoke-static {v2}, Ly19;->g(Ly29;)V

    .line 15
    .line 16
    .line 17
    iget-object v2, v2, Lpz8;->I:Lmz8;

    .line 18
    .line 19
    const-string v4, "Handle tcf update."

    .line 20
    .line 21
    invoke-virtual {v2, v4}, Lmz8;->a(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, v1, Ly19;->A:Lq09;

    .line 25
    .line 26
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Lq09;->h1()Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    sget-object v5, Ls79;->a:Li36;

    .line 34
    .line 35
    sget-object v6, Lik8;->x:Lik8;

    .line 36
    .line 37
    sget-object v7, Lr79;->w:Lr79;

    .line 38
    .line 39
    sget-object v8, Lik8;->y:Lik8;

    .line 40
    .line 41
    sget-object v9, Lr79;->x:Lr79;

    .line 42
    .line 43
    sget-object v10, Lik8;->z:Lik8;

    .line 44
    .line 45
    sget-object v11, Lik8;->A:Lik8;

    .line 46
    .line 47
    sget-object v12, Lik8;->B:Lik8;

    .line 48
    .line 49
    sget-object v16, Lik8;->C:Lik8;

    .line 50
    .line 51
    sget-object v18, Lik8;->D:Lik8;

    .line 52
    .line 53
    move-object v14, v12

    .line 54
    move-object v12, v11

    .line 55
    move-object v11, v7

    .line 56
    move-object v13, v7

    .line 57
    move-object v15, v9

    .line 58
    move-object/from16 v17, v9

    .line 59
    .line 60
    move-object/from16 v19, v9

    .line 61
    .line 62
    filled-new-array/range {v6 .. v19}, [Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    move-object v7, v10

    .line 67
    move-object v8, v12

    .line 68
    move-object v9, v14

    .line 69
    const/4 v10, 0x7

    .line 70
    const/4 v11, 0x0

    .line 71
    invoke-static {v10, v5, v11}, Ln36;->a(I[Ljava/lang/Object;Lig;)Ln36;

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    sget v5, Ls93;->y:I

    .line 76
    .line 77
    new-instance v15, Lsu6;

    .line 78
    .line 79
    const-string v5, "CH"

    .line 80
    .line 81
    invoke-direct {v15, v5}, Lsu6;-><init>(Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    const/4 v5, 0x5

    .line 85
    new-array v10, v5, [C

    .line 86
    .line 87
    const-string v13, "IABTCF_TCString"

    .line 88
    .line 89
    invoke-interface {v4, v13}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 90
    .line 91
    .line 92
    move-result v13

    .line 93
    const-string v14, "IABTCF_CmpSdkID"

    .line 94
    .line 95
    const/4 v5, -0x1

    .line 96
    :try_start_0
    invoke-interface {v4, v14, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 97
    .line 98
    .line 99
    move-result v14
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 100
    goto :goto_0

    .line 101
    :catch_0
    move v14, v5

    .line 102
    :goto_0
    const-string v11, "IABTCF_PolicyVersion"

    .line 103
    .line 104
    :try_start_1
    invoke-interface {v4, v11, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 105
    .line 106
    .line 107
    move-result v11
    :try_end_1
    .catch Ljava/lang/ClassCastException; {:try_start_1 .. :try_end_1} :catch_1

    .line 108
    :goto_1
    move-object/from16 v25, v2

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :catch_1
    move v11, v5

    .line 112
    goto :goto_1

    .line 113
    :goto_2
    const-string v2, "IABTCF_gdprApplies"

    .line 114
    .line 115
    :try_start_2
    invoke-interface {v4, v2, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 116
    .line 117
    .line 118
    move-result v2
    :try_end_2
    .catch Ljava/lang/ClassCastException; {:try_start_2 .. :try_end_2} :catch_2

    .line 119
    :goto_3
    move-object/from16 v17, v10

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :catch_2
    move v2, v5

    .line 123
    goto :goto_3

    .line 124
    :goto_4
    const-string v10, "IABTCF_PurposeOneTreatment"

    .line 125
    .line 126
    :try_start_3
    invoke-interface {v4, v10, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 127
    .line 128
    .line 129
    move-result v10
    :try_end_3
    .catch Ljava/lang/ClassCastException; {:try_start_3 .. :try_end_3} :catch_3

    .line 130
    :goto_5
    move/from16 v18, v11

    .line 131
    .line 132
    goto :goto_6

    .line 133
    :catch_3
    move v10, v5

    .line 134
    goto :goto_5

    .line 135
    :goto_6
    const-string v11, "IABTCF_EnableAdvertiserConsentMode"

    .line 136
    .line 137
    :try_start_4
    invoke-interface {v4, v11, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 138
    .line 139
    .line 140
    move-result v11
    :try_end_4
    .catch Ljava/lang/ClassCastException; {:try_start_4 .. :try_end_4} :catch_4

    .line 141
    goto :goto_7

    .line 142
    :catch_4
    move v11, v5

    .line 143
    :goto_7
    const-string v5, "IABTCF_PublisherCC"

    .line 144
    .line 145
    invoke-static {v4, v5}, Ls79;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v5

    .line 149
    move/from16 v19, v13

    .line 150
    .line 151
    new-instance v13, Lig;

    .line 152
    .line 153
    move/from16 v20, v14

    .line 154
    .line 155
    const/4 v14, 0x4

    .line 156
    invoke-direct {v13, v14}, Lig;-><init>(I)V

    .line 157
    .line 158
    .line 159
    iget-object v14, v12, Ln36;->B:Ljava/util/AbstractCollection;

    .line 160
    .line 161
    check-cast v14, Ll36;

    .line 162
    .line 163
    const/4 v0, 0x0

    .line 164
    if-nez v14, :cond_0

    .line 165
    .line 166
    new-instance v14, Lm36;

    .line 167
    .line 168
    move-object/from16 v22, v15

    .line 169
    .line 170
    iget-object v15, v12, Ln36;->y:[Ljava/lang/Object;

    .line 171
    .line 172
    move-object/from16 v26, v1

    .line 173
    .line 174
    iget v1, v12, Ln36;->z:I

    .line 175
    .line 176
    invoke-direct {v14, v15, v0, v1}, Lm36;-><init>([Ljava/lang/Object;II)V

    .line 177
    .line 178
    .line 179
    new-instance v1, Ll36;

    .line 180
    .line 181
    invoke-direct {v1, v12, v14}, Ll36;-><init>(Ln36;Lm36;)V

    .line 182
    .line 183
    .line 184
    iput-object v1, v12, Ln36;->B:Ljava/util/AbstractCollection;

    .line 185
    .line 186
    move-object v14, v1

    .line 187
    goto :goto_8

    .line 188
    :cond_0
    move-object/from16 v26, v1

    .line 189
    .line 190
    move-object/from16 v22, v15

    .line 191
    .line 192
    :goto_8
    invoke-virtual {v14}, Ll36;->o()Lat7;

    .line 193
    .line 194
    .line 195
    move-result-object v1

    .line 196
    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v14

    .line 200
    sget-object v15, Ljk8;->A:Ljk8;

    .line 201
    .line 202
    move/from16 v27, v0

    .line 203
    .line 204
    if-eqz v14, :cond_7

    .line 205
    .line 206
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object v14

    .line 210
    check-cast v14, Lik8;

    .line 211
    .line 212
    invoke-virtual {v14}, Lik8;->a()I

    .line 213
    .line 214
    .line 215
    move-result v0

    .line 216
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object v29

    .line 220
    invoke-virtual/range {v29 .. v29}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v29

    .line 224
    move-object/from16 v30, v1

    .line 225
    .line 226
    new-instance v1, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    move-object/from16 v31, v12

    .line 229
    .line 230
    add-int/lit8 v12, v29, 0x1c

    .line 231
    .line 232
    invoke-direct {v1, v12}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 233
    .line 234
    .line 235
    const-string v12, "IABTCF_PublisherRestrictions"

    .line 236
    .line 237
    invoke-virtual {v1, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 238
    .line 239
    .line 240
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 244
    .line 245
    .line 246
    move-result-object v0

    .line 247
    invoke-static {v4, v0}, Ls79;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 252
    .line 253
    .line 254
    move-result v1

    .line 255
    if-nez v1, :cond_6

    .line 256
    .line 257
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 258
    .line 259
    .line 260
    move-result v1

    .line 261
    const/16 v12, 0x2f3

    .line 262
    .line 263
    if-ge v1, v12, :cond_1

    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_1
    const/16 v1, 0x2f2

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    const/16 v1, 0xa

    .line 273
    .line 274
    invoke-static {v0, v1}, Ljava/lang/Character;->digit(CI)I

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    sget-object v1, Ljk8;->x:Ljk8;

    .line 279
    .line 280
    if-ltz v0, :cond_5

    .line 281
    .line 282
    invoke-static {}, Ljk8;->values()[Ljk8;

    .line 283
    .line 284
    .line 285
    move-result-object v12

    .line 286
    array-length v12, v12

    .line 287
    if-le v0, v12, :cond_2

    .line 288
    .line 289
    goto :goto_a

    .line 290
    :cond_2
    if-eqz v0, :cond_5

    .line 291
    .line 292
    const/4 v12, 0x1

    .line 293
    if-eq v0, v12, :cond_4

    .line 294
    .line 295
    const/4 v1, 0x2

    .line 296
    if-eq v0, v1, :cond_3

    .line 297
    .line 298
    goto :goto_b

    .line 299
    :cond_3
    sget-object v15, Ljk8;->z:Ljk8;

    .line 300
    .line 301
    goto :goto_b

    .line 302
    :cond_4
    sget-object v15, Ljk8;->y:Ljk8;

    .line 303
    .line 304
    goto :goto_b

    .line 305
    :cond_5
    :goto_a
    move-object v15, v1

    .line 306
    :cond_6
    :goto_b
    invoke-virtual {v13, v14, v15}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 307
    .line 308
    .line 309
    move/from16 v0, v27

    .line 310
    .line 311
    move-object/from16 v1, v30

    .line 312
    .line 313
    move-object/from16 v12, v31

    .line 314
    .line 315
    goto :goto_9

    .line 316
    :cond_7
    move-object/from16 v31, v12

    .line 317
    .line 318
    const/4 v12, 0x1

    .line 319
    invoke-virtual {v13, v12}, Lig;->c(Z)Ln36;

    .line 320
    .line 321
    .line 322
    move-result-object v13

    .line 323
    const-string v0, "IABTCF_PurposeConsents"

    .line 324
    .line 325
    invoke-static {v4, v0}, Ls79;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v0

    .line 329
    const-string v1, "IABTCF_VendorConsents"

    .line 330
    .line 331
    invoke-static {v4, v1}, Ls79;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 336
    .line 337
    .line 338
    move-result v12

    .line 339
    if-nez v12, :cond_8

    .line 340
    .line 341
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 342
    .line 343
    .line 344
    move-result v12

    .line 345
    const/16 v14, 0x2f3

    .line 346
    .line 347
    if-lt v12, v14, :cond_8

    .line 348
    .line 349
    const/16 v12, 0x2f2

    .line 350
    .line 351
    invoke-virtual {v1, v12}, Ljava/lang/String;->charAt(I)C

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    const/16 v12, 0x31

    .line 356
    .line 357
    if-ne v1, v12, :cond_8

    .line 358
    .line 359
    const/4 v1, 0x1

    .line 360
    goto :goto_c

    .line 361
    :cond_8
    move/from16 v1, v27

    .line 362
    .line 363
    :goto_c
    const-string v12, "IABTCF_PurposeLegitimateInterests"

    .line 364
    .line 365
    invoke-static {v4, v12}, Ls79;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v12

    .line 369
    const-string v14, "IABTCF_VendorLegitimateInterests"

    .line 370
    .line 371
    invoke-static {v4, v14}, Ls79;->a(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v4

    .line 375
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 376
    .line 377
    .line 378
    move-result v14

    .line 379
    if-nez v14, :cond_a

    .line 380
    .line 381
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result v14

    .line 385
    move-object/from16 v30, v15

    .line 386
    .line 387
    const/16 v15, 0x2f3

    .line 388
    .line 389
    if-lt v14, v15, :cond_9

    .line 390
    .line 391
    const/16 v14, 0x2f2

    .line 392
    .line 393
    invoke-virtual {v4, v14}, Ljava/lang/String;->charAt(I)C

    .line 394
    .line 395
    .line 396
    move-result v4

    .line 397
    const/16 v14, 0x31

    .line 398
    .line 399
    if-ne v4, v14, :cond_9

    .line 400
    .line 401
    const/4 v4, 0x1

    .line 402
    goto :goto_e

    .line 403
    :cond_9
    :goto_d
    move/from16 v4, v27

    .line 404
    .line 405
    goto :goto_e

    .line 406
    :cond_a
    move-object/from16 v30, v15

    .line 407
    .line 408
    goto :goto_d

    .line 409
    :goto_e
    const/16 v14, 0x32

    .line 410
    .line 411
    aput-char v14, v17, v27

    .line 412
    .line 413
    new-instance v14, Lp79;

    .line 414
    .line 415
    const-string v15, "CmpSdkID"

    .line 416
    .line 417
    move-object/from16 v29, v3

    .line 418
    .line 419
    const-string v3, "EnableAdvertiserConsentMode"

    .line 420
    .line 421
    move-object/from16 v23, v14

    .line 422
    .line 423
    const-string v14, "gdprApplies"

    .line 424
    .line 425
    move-object/from16 v24, v0

    .line 426
    .line 427
    const-string v0, "Version"

    .line 428
    .line 429
    move-object/from16 v32, v12

    .line 430
    .line 431
    const-string v12, "0"

    .line 432
    .line 433
    move-object/from16 v33, v12

    .line 434
    .line 435
    const-string v12, "1"

    .line 436
    .line 437
    if-nez v19, :cond_b

    .line 438
    .line 439
    sget-object v1, Ln36;->D:Ln36;

    .line 440
    .line 441
    move-object/from16 v30, v3

    .line 442
    .line 443
    move-object v3, v12

    .line 444
    move-object/from16 v31, v14

    .line 445
    .line 446
    move-object v5, v15

    .line 447
    move-object/from16 v2, v23

    .line 448
    .line 449
    goto/16 :goto_21

    .line 450
    .line 451
    :cond_b
    invoke-virtual {v13, v6}, Ln36;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    move-result-object v19

    .line 455
    check-cast v19, Ljk8;

    .line 456
    .line 457
    invoke-virtual {v13, v7}, Ln36;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v34

    .line 461
    check-cast v34, Ljk8;

    .line 462
    .line 463
    invoke-virtual {v13, v8}, Ln36;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 464
    .line 465
    .line 466
    move-result-object v35

    .line 467
    check-cast v35, Ljk8;

    .line 468
    .line 469
    invoke-virtual {v13, v9}, Ln36;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v36

    .line 473
    check-cast v36, Ljk8;

    .line 474
    .line 475
    move-object/from16 v37, v12

    .line 476
    .line 477
    new-instance v12, Lig;

    .line 478
    .line 479
    move-object/from16 v38, v13

    .line 480
    .line 481
    const/4 v13, 0x4

    .line 482
    invoke-direct {v12, v13}, Lig;-><init>(I)V

    .line 483
    .line 484
    .line 485
    const-string v13, "2"

    .line 486
    .line 487
    invoke-virtual {v12, v0, v13}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    const/4 v13, 0x1

    .line 491
    if-eq v13, v1, :cond_c

    .line 492
    .line 493
    move-object/from16 v13, v33

    .line 494
    .line 495
    :goto_f
    move/from16 v39, v1

    .line 496
    .line 497
    goto :goto_10

    .line 498
    :cond_c
    move-object/from16 v13, v37

    .line 499
    .line 500
    goto :goto_f

    .line 501
    :goto_10
    const-string v1, "VendorConsent"

    .line 502
    .line 503
    invoke-virtual {v12, v1, v13}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 504
    .line 505
    .line 506
    const/4 v13, 0x1

    .line 507
    if-eq v13, v4, :cond_d

    .line 508
    .line 509
    move-object/from16 v1, v33

    .line 510
    .line 511
    :goto_11
    move/from16 v40, v4

    .line 512
    .line 513
    goto :goto_12

    .line 514
    :cond_d
    move-object/from16 v1, v37

    .line 515
    .line 516
    goto :goto_11

    .line 517
    :goto_12
    const-string v4, "VendorLegitimateInterest"

    .line 518
    .line 519
    invoke-virtual {v12, v4, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 520
    .line 521
    .line 522
    if-eq v2, v13, :cond_e

    .line 523
    .line 524
    move-object/from16 v1, v33

    .line 525
    .line 526
    goto :goto_13

    .line 527
    :cond_e
    move-object/from16 v1, v37

    .line 528
    .line 529
    :goto_13
    invoke-virtual {v12, v14, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 530
    .line 531
    .line 532
    if-eq v11, v13, :cond_f

    .line 533
    .line 534
    move-object/from16 v1, v33

    .line 535
    .line 536
    goto :goto_14

    .line 537
    :cond_f
    move-object/from16 v1, v37

    .line 538
    .line 539
    :goto_14
    invoke-virtual {v12, v3, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 540
    .line 541
    .line 542
    invoke-static/range {v18 .. v18}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 543
    .line 544
    .line 545
    move-result-object v1

    .line 546
    const-string v4, "PolicyVersion"

    .line 547
    .line 548
    invoke-virtual {v12, v4, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 549
    .line 550
    .line 551
    invoke-static/range {v20 .. v20}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 552
    .line 553
    .line 554
    move-result-object v1

    .line 555
    invoke-virtual {v12, v15, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 556
    .line 557
    .line 558
    if-eq v10, v13, :cond_10

    .line 559
    .line 560
    move-object/from16 v1, v33

    .line 561
    .line 562
    goto :goto_15

    .line 563
    :cond_10
    move-object/from16 v1, v37

    .line 564
    .line 565
    :goto_15
    const-string v4, "PurposeOneTreatment"

    .line 566
    .line 567
    invoke-virtual {v12, v4, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 568
    .line 569
    .line 570
    const-string v1, "PublisherCC"

    .line 571
    .line 572
    invoke-virtual {v12, v1, v5}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 573
    .line 574
    .line 575
    if-eqz v19, :cond_11

    .line 576
    .line 577
    invoke-virtual/range {v19 .. v19}, Ljk8;->a()I

    .line 578
    .line 579
    .line 580
    move-result v1

    .line 581
    goto :goto_16

    .line 582
    :cond_11
    invoke-virtual/range {v30 .. v30}, Ljk8;->a()I

    .line 583
    .line 584
    .line 585
    move-result v1

    .line 586
    :goto_16
    const-string v4, "PublisherRestrictions1"

    .line 587
    .line 588
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 589
    .line 590
    .line 591
    move-result-object v1

    .line 592
    invoke-virtual {v12, v4, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 593
    .line 594
    .line 595
    if-eqz v34, :cond_12

    .line 596
    .line 597
    invoke-virtual/range {v34 .. v34}, Ljk8;->a()I

    .line 598
    .line 599
    .line 600
    move-result v1

    .line 601
    goto :goto_17

    .line 602
    :cond_12
    invoke-virtual/range {v30 .. v30}, Ljk8;->a()I

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    :goto_17
    const-string v4, "PublisherRestrictions3"

    .line 607
    .line 608
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 609
    .line 610
    .line 611
    move-result-object v1

    .line 612
    invoke-virtual {v12, v4, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 613
    .line 614
    .line 615
    if-eqz v35, :cond_13

    .line 616
    .line 617
    invoke-virtual/range {v35 .. v35}, Ljk8;->a()I

    .line 618
    .line 619
    .line 620
    move-result v1

    .line 621
    goto :goto_18

    .line 622
    :cond_13
    invoke-virtual/range {v30 .. v30}, Ljk8;->a()I

    .line 623
    .line 624
    .line 625
    move-result v1

    .line 626
    :goto_18
    const-string v4, "PublisherRestrictions4"

    .line 627
    .line 628
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 629
    .line 630
    .line 631
    move-result-object v1

    .line 632
    invoke-virtual {v12, v4, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 633
    .line 634
    .line 635
    if-eqz v36, :cond_14

    .line 636
    .line 637
    invoke-virtual/range {v36 .. v36}, Ljk8;->a()I

    .line 638
    .line 639
    .line 640
    move-result v1

    .line 641
    goto :goto_19

    .line 642
    :cond_14
    invoke-virtual/range {v30 .. v30}, Ljk8;->a()I

    .line 643
    .line 644
    .line 645
    move-result v1

    .line 646
    :goto_19
    const-string v4, "PublisherRestrictions7"

    .line 647
    .line 648
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v1

    .line 652
    invoke-virtual {v12, v4, v1}, Lig;->k(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 653
    .line 654
    .line 655
    move-object/from16 v1, v24

    .line 656
    .line 657
    move-object/from16 v4, v32

    .line 658
    .line 659
    invoke-static {v6, v1, v4}, Ls79;->d(Lik8;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v42

    .line 663
    invoke-static {v7, v1, v4}, Ls79;->d(Lik8;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 664
    .line 665
    .line 666
    move-result-object v44

    .line 667
    invoke-static {v8, v1, v4}, Ls79;->d(Lik8;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 668
    .line 669
    .line 670
    move-result-object v46

    .line 671
    invoke-static {v9, v1, v4}, Ls79;->d(Lik8;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 672
    .line 673
    .line 674
    move-result-object v48

    .line 675
    const-string v43, "Purpose3"

    .line 676
    .line 677
    const-string v41, "Purpose1"

    .line 678
    .line 679
    const-string v45, "Purpose4"

    .line 680
    .line 681
    const-string v47, "Purpose7"

    .line 682
    .line 683
    filled-new-array/range {v41 .. v48}, [Ljava/lang/Object;

    .line 684
    .line 685
    .line 686
    move-result-object v13

    .line 687
    move/from16 v16, v2

    .line 688
    .line 689
    const/4 v1, 0x4

    .line 690
    const/4 v2, 0x0

    .line 691
    invoke-static {v1, v13, v2}, Ln36;->a(I[Ljava/lang/Object;Lig;)Ln36;

    .line 692
    .line 693
    .line 694
    move-result-object v1

    .line 695
    invoke-virtual {v12, v1}, Lig;->l(Ln36;)V

    .line 696
    .line 697
    .line 698
    move/from16 v1, v16

    .line 699
    .line 700
    move-object/from16 v16, v4

    .line 701
    .line 702
    move-object v4, v12

    .line 703
    move v12, v1

    .line 704
    move-object v1, v2

    .line 705
    move-object/from16 v30, v3

    .line 706
    .line 707
    move-object/from16 v19, v7

    .line 708
    .line 709
    move v13, v10

    .line 710
    move-object/from16 v10, v17

    .line 711
    .line 712
    move-object/from16 v2, v23

    .line 713
    .line 714
    move-object/from16 v7, v31

    .line 715
    .line 716
    move-object/from16 v3, v37

    .line 717
    .line 718
    move/from16 v17, v39

    .line 719
    .line 720
    move/from16 v18, v40

    .line 721
    .line 722
    move-object/from16 v23, v8

    .line 723
    .line 724
    move-object/from16 v31, v14

    .line 725
    .line 726
    move-object/from16 v8, v38

    .line 727
    .line 728
    move-object v14, v5

    .line 729
    move-object v5, v15

    .line 730
    move-object/from16 v15, v24

    .line 731
    .line 732
    move-object/from16 v24, v9

    .line 733
    .line 734
    move-object/from16 v9, v22

    .line 735
    .line 736
    invoke-static/range {v6 .. v18}, Ls79;->b(Lik8;Ln36;Ln36;Lsu6;[CIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    .line 737
    .line 738
    .line 739
    move-result v6

    .line 740
    move-object/from16 v20, v14

    .line 741
    .line 742
    move-object/from16 v21, v15

    .line 743
    .line 744
    move-object/from16 v32, v16

    .line 745
    .line 746
    move/from16 v22, v17

    .line 747
    .line 748
    move-object v15, v9

    .line 749
    move-object/from16 v16, v10

    .line 750
    .line 751
    move/from16 v17, v12

    .line 752
    .line 753
    move/from16 v18, v13

    .line 754
    .line 755
    const/4 v9, 0x1

    .line 756
    if-eq v9, v6, :cond_15

    .line 757
    .line 758
    move-object/from16 v42, v33

    .line 759
    .line 760
    :goto_1a
    move-object v12, v8

    .line 761
    move-object v13, v15

    .line 762
    move-object/from16 v14, v16

    .line 763
    .line 764
    move/from16 v16, v17

    .line 765
    .line 766
    move/from16 v17, v18

    .line 767
    .line 768
    move-object/from16 v10, v19

    .line 769
    .line 770
    move-object/from16 v18, v20

    .line 771
    .line 772
    move-object/from16 v19, v21

    .line 773
    .line 774
    move/from16 v21, v22

    .line 775
    .line 776
    move-object/from16 v20, v32

    .line 777
    .line 778
    move/from16 v22, v40

    .line 779
    .line 780
    move v15, v11

    .line 781
    move-object v11, v7

    .line 782
    goto :goto_1b

    .line 783
    :cond_15
    move-object/from16 v42, v3

    .line 784
    .line 785
    goto :goto_1a

    .line 786
    :goto_1b
    invoke-static/range {v10 .. v22}, Ls79;->b(Lik8;Ln36;Ln36;Lsu6;[CIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    .line 787
    .line 788
    .line 789
    move-result v6

    .line 790
    move-object v7, v11

    .line 791
    move-object v8, v12

    .line 792
    move v11, v15

    .line 793
    move-object/from16 v32, v20

    .line 794
    .line 795
    move/from16 v40, v22

    .line 796
    .line 797
    move-object v15, v13

    .line 798
    move-object/from16 v20, v18

    .line 799
    .line 800
    move/from16 v22, v21

    .line 801
    .line 802
    move/from16 v18, v17

    .line 803
    .line 804
    move-object/from16 v21, v19

    .line 805
    .line 806
    move/from16 v17, v16

    .line 807
    .line 808
    move-object/from16 v16, v14

    .line 809
    .line 810
    if-eq v9, v6, :cond_16

    .line 811
    .line 812
    move-object/from16 v44, v33

    .line 813
    .line 814
    :goto_1c
    move-object v12, v7

    .line 815
    move-object v13, v8

    .line 816
    move-object v14, v15

    .line 817
    move-object/from16 v15, v16

    .line 818
    .line 819
    move-object/from16 v19, v20

    .line 820
    .line 821
    move-object/from16 v20, v21

    .line 822
    .line 823
    move-object/from16 v21, v32

    .line 824
    .line 825
    move/from16 v16, v11

    .line 826
    .line 827
    move-object/from16 v11, v23

    .line 828
    .line 829
    move/from16 v23, v40

    .line 830
    .line 831
    goto :goto_1d

    .line 832
    :cond_16
    move-object/from16 v44, v3

    .line 833
    .line 834
    goto :goto_1c

    .line 835
    :goto_1d
    invoke-static/range {v11 .. v23}, Ls79;->b(Lik8;Ln36;Ln36;Lsu6;[CIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    .line 836
    .line 837
    .line 838
    move-result v6

    .line 839
    move-object v7, v12

    .line 840
    move-object v8, v13

    .line 841
    move/from16 v11, v16

    .line 842
    .line 843
    move-object/from16 v32, v21

    .line 844
    .line 845
    move/from16 v40, v23

    .line 846
    .line 847
    move-object/from16 v16, v15

    .line 848
    .line 849
    move-object/from16 v21, v20

    .line 850
    .line 851
    move-object v15, v14

    .line 852
    move-object/from16 v20, v19

    .line 853
    .line 854
    if-eq v9, v6, :cond_17

    .line 855
    .line 856
    move-object/from16 v46, v33

    .line 857
    .line 858
    :goto_1e
    move-object v13, v7

    .line 859
    move-object v14, v8

    .line 860
    move/from16 v19, v18

    .line 861
    .line 862
    move/from16 v23, v22

    .line 863
    .line 864
    move-object/from16 v12, v24

    .line 865
    .line 866
    move-object/from16 v22, v32

    .line 867
    .line 868
    move/from16 v24, v40

    .line 869
    .line 870
    move/from16 v18, v17

    .line 871
    .line 872
    move/from16 v17, v11

    .line 873
    .line 874
    goto :goto_1f

    .line 875
    :cond_17
    move-object/from16 v46, v3

    .line 876
    .line 877
    goto :goto_1e

    .line 878
    :goto_1f
    invoke-static/range {v12 .. v24}, Ls79;->b(Lik8;Ln36;Ln36;Lsu6;[CIIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Z

    .line 879
    .line 880
    .line 881
    move-result v6

    .line 882
    move-object/from16 v15, v16

    .line 883
    .line 884
    if-eq v9, v6, :cond_18

    .line 885
    .line 886
    move-object/from16 v48, v33

    .line 887
    .line 888
    goto :goto_20

    .line 889
    :cond_18
    move-object/from16 v48, v3

    .line 890
    .line 891
    :goto_20
    new-instance v6, Ljava/lang/String;

    .line 892
    .line 893
    invoke-direct {v6, v15}, Ljava/lang/String;-><init>([C)V

    .line 894
    .line 895
    .line 896
    const-string v43, "AuthorizePurpose3"

    .line 897
    .line 898
    const-string v41, "AuthorizePurpose1"

    .line 899
    .line 900
    const-string v45, "AuthorizePurpose4"

    .line 901
    .line 902
    const-string v47, "AuthorizePurpose7"

    .line 903
    .line 904
    const-string v49, "PurposeDiagnostics"

    .line 905
    .line 906
    move-object/from16 v50, v6

    .line 907
    .line 908
    filled-new-array/range {v41 .. v50}, [Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    move-result-object v6

    .line 912
    const/4 v7, 0x5

    .line 913
    invoke-static {v7, v6, v1}, Ln36;->a(I[Ljava/lang/Object;Lig;)Ln36;

    .line 914
    .line 915
    .line 916
    move-result-object v1

    .line 917
    invoke-virtual {v4, v1}, Lig;->l(Ln36;)V

    .line 918
    .line 919
    .line 920
    const/4 v12, 0x1

    .line 921
    invoke-virtual {v4, v12}, Lig;->c(Z)Ln36;

    .line 922
    .line 923
    .line 924
    move-result-object v1

    .line 925
    :goto_21
    invoke-direct {v2, v1}, Lp79;-><init>(Ljava/util/Map;)V

    .line 926
    .line 927
    .line 928
    invoke-static/range {v29 .. v29}, Ly19;->g(Ly29;)V

    .line 929
    .line 930
    .line 931
    move-object/from16 v1, v29

    .line 932
    .line 933
    iget-object v4, v1, Lpz8;->J:Lmz8;

    .line 934
    .line 935
    const-string v6, "Tcf preferences read"

    .line 936
    .line 937
    invoke-virtual {v4, v6, v2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 938
    .line 939
    .line 940
    invoke-virtual/range {v25 .. v25}, Lin8;->b1()V

    .line 941
    .line 942
    .line 943
    invoke-virtual/range {v25 .. v25}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 944
    .line 945
    .line 946
    move-result-object v4

    .line 947
    const-string v6, "stored_tcf_param"

    .line 948
    .line 949
    const-string v7, ""

    .line 950
    .line 951
    invoke-interface {v4, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 952
    .line 953
    .line 954
    move-result-object v4

    .line 955
    new-instance v8, Ljava/util/HashMap;

    .line 956
    .line 957
    invoke-direct {v8}, Ljava/util/HashMap;-><init>()V

    .line 958
    .line 959
    .line 960
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 961
    .line 962
    .line 963
    move-result v9

    .line 964
    if-eqz v9, :cond_19

    .line 965
    .line 966
    new-instance v4, Lp79;

    .line 967
    .line 968
    invoke-direct {v4, v8}, Lp79;-><init>(Ljava/util/Map;)V

    .line 969
    .line 970
    .line 971
    const/4 v13, 0x2

    .line 972
    goto :goto_23

    .line 973
    :cond_19
    const-string v9, ";"

    .line 974
    .line 975
    invoke-virtual {v4, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v4

    .line 979
    array-length v9, v4

    .line 980
    move/from16 v10, v27

    .line 981
    .line 982
    :goto_22
    if-ge v10, v9, :cond_1b

    .line 983
    .line 984
    aget-object v11, v4, v10

    .line 985
    .line 986
    const-string v12, "="

    .line 987
    .line 988
    invoke-virtual {v11, v12}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 989
    .line 990
    .line 991
    move-result-object v11

    .line 992
    array-length v12, v11

    .line 993
    const/4 v13, 0x2

    .line 994
    if-lt v12, v13, :cond_1a

    .line 995
    .line 996
    sget-object v12, Ls79;->a:Li36;

    .line 997
    .line 998
    aget-object v14, v11, v27

    .line 999
    .line 1000
    invoke-virtual {v12, v14}, Lq93;->contains(Ljava/lang/Object;)Z

    .line 1001
    .line 1002
    .line 1003
    move-result v12

    .line 1004
    if-eqz v12, :cond_1a

    .line 1005
    .line 1006
    aget-object v12, v11, v27

    .line 1007
    .line 1008
    const/16 v28, 0x1

    .line 1009
    .line 1010
    aget-object v11, v11, v28

    .line 1011
    .line 1012
    invoke-virtual {v8, v12, v11}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    :cond_1a
    add-int/lit8 v10, v10, 0x1

    .line 1016
    .line 1017
    goto :goto_22

    .line 1018
    :cond_1b
    const/4 v13, 0x2

    .line 1019
    new-instance v4, Lp79;

    .line 1020
    .line 1021
    invoke-direct {v4, v8}, Lp79;-><init>(Ljava/util/Map;)V

    .line 1022
    .line 1023
    .line 1024
    :goto_23
    invoke-virtual/range {v25 .. v25}, Lin8;->b1()V

    .line 1025
    .line 1026
    .line 1027
    invoke-virtual/range {v25 .. v25}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 1028
    .line 1029
    .line 1030
    move-result-object v8

    .line 1031
    invoke-interface {v8, v6, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1032
    .line 1033
    .line 1034
    move-result-object v7

    .line 1035
    invoke-virtual {v2}, Lp79;->a()Ljava/lang/String;

    .line 1036
    .line 1037
    .line 1038
    move-result-object v8

    .line 1039
    invoke-virtual {v8, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1040
    .line 1041
    .line 1042
    move-result v7

    .line 1043
    if-nez v7, :cond_28

    .line 1044
    .line 1045
    invoke-virtual/range {v25 .. v25}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v7

    .line 1049
    invoke-interface {v7}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 1050
    .line 1051
    .line 1052
    move-result-object v7

    .line 1053
    invoke-interface {v7, v6, v8}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 1054
    .line 1055
    .line 1056
    invoke-interface {v7}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 1057
    .line 1058
    .line 1059
    invoke-virtual {v2}, Lp79;->b()Landroid/os/Bundle;

    .line 1060
    .line 1061
    .line 1062
    move-result-object v6

    .line 1063
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 1064
    .line 1065
    .line 1066
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 1067
    .line 1068
    const-string v7, "Consent generated from Tcf"

    .line 1069
    .line 1070
    invoke-virtual {v1, v7, v6}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1071
    .line 1072
    .line 1073
    sget-object v1, Landroid/os/Bundle;->EMPTY:Landroid/os/Bundle;

    .line 1074
    .line 1075
    if-eq v6, v1, :cond_1c

    .line 1076
    .line 1077
    move-object/from16 v1, v26

    .line 1078
    .line 1079
    iget-object v1, v1, Ly19;->G:Lxb4;

    .line 1080
    .line 1081
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1082
    .line 1083
    .line 1084
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1085
    .line 1086
    .line 1087
    move-result-wide v7

    .line 1088
    const/16 v1, -0x1e

    .line 1089
    .line 1090
    move-object/from16 v9, p0

    .line 1091
    .line 1092
    invoke-virtual {v9, v6, v1, v7, v8}, Lv49;->w1(Landroid/os/Bundle;IJ)V

    .line 1093
    .line 1094
    .line 1095
    goto :goto_24

    .line 1096
    :cond_1c
    move-object/from16 v9, p0

    .line 1097
    .line 1098
    :goto_24
    new-instance v1, Landroid/os/Bundle;

    .line 1099
    .line 1100
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 1101
    .line 1102
    .line 1103
    iget-object v6, v4, Lp79;->a:Ljava/util/HashMap;

    .line 1104
    .line 1105
    invoke-virtual {v6}, Ljava/util/HashMap;->isEmpty()Z

    .line 1106
    .line 1107
    .line 1108
    move-result v7

    .line 1109
    if-nez v7, :cond_1d

    .line 1110
    .line 1111
    invoke-virtual {v6, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1112
    .line 1113
    .line 1114
    move-result-object v0

    .line 1115
    check-cast v0, Ljava/lang/String;

    .line 1116
    .line 1117
    if-nez v0, :cond_1d

    .line 1118
    .line 1119
    move-object v12, v3

    .line 1120
    goto :goto_25

    .line 1121
    :cond_1d
    move-object/from16 v12, v33

    .line 1122
    .line 1123
    :goto_25
    invoke-virtual {v2}, Lp79;->b()Landroid/os/Bundle;

    .line 1124
    .line 1125
    .line 1126
    move-result-object v0

    .line 1127
    invoke-virtual {v4}, Lp79;->b()Landroid/os/Bundle;

    .line 1128
    .line 1129
    .line 1130
    move-result-object v4

    .line 1131
    invoke-virtual {v0}, Landroid/os/BaseBundle;->size()I

    .line 1132
    .line 1133
    .line 1134
    move-result v6

    .line 1135
    invoke-virtual {v4}, Landroid/os/BaseBundle;->size()I

    .line 1136
    .line 1137
    .line 1138
    move-result v7

    .line 1139
    if-eq v6, v7, :cond_1e

    .line 1140
    .line 1141
    goto :goto_26

    .line 1142
    :cond_1e
    const-string v6, "ad_storage"

    .line 1143
    .line 1144
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1145
    .line 1146
    .line 1147
    move-result-object v7

    .line 1148
    invoke-virtual {v4, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1149
    .line 1150
    .line 1151
    move-result-object v6

    .line 1152
    invoke-static {v7, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1153
    .line 1154
    .line 1155
    move-result v6

    .line 1156
    if-nez v6, :cond_1f

    .line 1157
    .line 1158
    goto :goto_26

    .line 1159
    :cond_1f
    const-string v6, "ad_personalization"

    .line 1160
    .line 1161
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1162
    .line 1163
    .line 1164
    move-result-object v7

    .line 1165
    invoke-virtual {v4, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v6

    .line 1169
    invoke-static {v7, v6}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1170
    .line 1171
    .line 1172
    move-result v6

    .line 1173
    if-nez v6, :cond_20

    .line 1174
    .line 1175
    goto :goto_26

    .line 1176
    :cond_20
    const-string v6, "ad_user_data"

    .line 1177
    .line 1178
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1179
    .line 1180
    .line 1181
    move-result-object v0

    .line 1182
    invoke-virtual {v4, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v4

    .line 1186
    invoke-static {v0, v4}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1187
    .line 1188
    .line 1189
    move-result v0

    .line 1190
    if-nez v0, :cond_21

    .line 1191
    .line 1192
    :goto_26
    move-object v0, v3

    .line 1193
    goto :goto_27

    .line 1194
    :cond_21
    move-object/from16 v0, v33

    .line 1195
    .line 1196
    :goto_27
    invoke-virtual {v12, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v0

    .line 1200
    const-string v4, "_tcfm"

    .line 1201
    .line 1202
    invoke-virtual {v1, v4, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1203
    .line 1204
    .line 1205
    const-string v0, "PurposeDiagnostics"

    .line 1206
    .line 1207
    iget-object v4, v2, Lp79;->a:Ljava/util/HashMap;

    .line 1208
    .line 1209
    invoke-virtual {v4, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1210
    .line 1211
    .line 1212
    move-result-object v0

    .line 1213
    check-cast v0, Ljava/lang/String;

    .line 1214
    .line 1215
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1216
    .line 1217
    .line 1218
    move-result v6

    .line 1219
    if-eqz v6, :cond_22

    .line 1220
    .line 1221
    const-string v0, "200000"

    .line 1222
    .line 1223
    :cond_22
    const-string v6, "_tcfd2"

    .line 1224
    .line 1225
    invoke-virtual {v1, v6, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1226
    .line 1227
    .line 1228
    new-instance v0, Ljava/lang/StringBuilder;

    .line 1229
    .line 1230
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1231
    .line 1232
    .line 1233
    :try_start_5
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1234
    .line 1235
    .line 1236
    move-result-object v5

    .line 1237
    check-cast v5, Ljava/lang/String;

    .line 1238
    .line 1239
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1240
    .line 1241
    .line 1242
    move-result v6

    .line 1243
    if-nez v6, :cond_23

    .line 1244
    .line 1245
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 1246
    .line 1247
    .line 1248
    move-result v5
    :try_end_5
    .catch Ljava/lang/NumberFormatException; {:try_start_5 .. :try_end_5} :catch_5

    .line 1249
    goto :goto_28

    .line 1250
    :catch_5
    :cond_23
    const/4 v5, -0x1

    .line 1251
    :goto_28
    const/16 v6, 0x3f

    .line 1252
    .line 1253
    const-string v7, "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_"

    .line 1254
    .line 1255
    if-ltz v5, :cond_24

    .line 1256
    .line 1257
    const/16 v8, 0xfff

    .line 1258
    .line 1259
    if-gt v5, v8, :cond_24

    .line 1260
    .line 1261
    shr-int/lit8 v8, v5, 0x6

    .line 1262
    .line 1263
    invoke-virtual {v7, v8}, Ljava/lang/String;->charAt(I)C

    .line 1264
    .line 1265
    .line 1266
    move-result v8

    .line 1267
    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1268
    .line 1269
    .line 1270
    and-int/2addr v5, v6

    .line 1271
    invoke-virtual {v7, v5}, Ljava/lang/String;->charAt(I)C

    .line 1272
    .line 1273
    .line 1274
    move-result v5

    .line 1275
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1276
    .line 1277
    .line 1278
    goto :goto_29

    .line 1279
    :cond_24
    const-string v5, "00"

    .line 1280
    .line 1281
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1282
    .line 1283
    .line 1284
    :goto_29
    invoke-virtual {v2}, Lp79;->c()I

    .line 1285
    .line 1286
    .line 1287
    move-result v2

    .line 1288
    if-ltz v2, :cond_25

    .line 1289
    .line 1290
    if-gt v2, v6, :cond_25

    .line 1291
    .line 1292
    invoke-virtual {v7, v2}, Ljava/lang/String;->charAt(I)C

    .line 1293
    .line 1294
    .line 1295
    move-result v2

    .line 1296
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1297
    .line 1298
    .line 1299
    :goto_2a
    move-object/from16 v2, v31

    .line 1300
    .line 1301
    goto :goto_2b

    .line 1302
    :cond_25
    move-object/from16 v2, v33

    .line 1303
    .line 1304
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1305
    .line 1306
    .line 1307
    goto :goto_2a

    .line 1308
    :goto_2b
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1309
    .line 1310
    .line 1311
    move-result-object v2

    .line 1312
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1313
    .line 1314
    .line 1315
    move-result v2

    .line 1316
    const/4 v12, 0x1

    .line 1317
    if-eq v12, v2, :cond_26

    .line 1318
    .line 1319
    :goto_2c
    move-object/from16 v2, v30

    .line 1320
    .line 1321
    goto :goto_2d

    .line 1322
    :cond_26
    move/from16 v27, v13

    .line 1323
    .line 1324
    goto :goto_2c

    .line 1325
    :goto_2d
    invoke-virtual {v4, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1326
    .line 1327
    .line 1328
    move-result-object v2

    .line 1329
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1330
    .line 1331
    .line 1332
    move-result v2

    .line 1333
    or-int/lit8 v3, v27, 0x4

    .line 1334
    .line 1335
    if-eqz v2, :cond_27

    .line 1336
    .line 1337
    or-int/lit8 v3, v27, 0xc

    .line 1338
    .line 1339
    :cond_27
    invoke-virtual {v7, v3}, Ljava/lang/String;->charAt(I)C

    .line 1340
    .line 1341
    .line 1342
    move-result v2

    .line 1343
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 1344
    .line 1345
    .line 1346
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1347
    .line 1348
    .line 1349
    move-result-object v0

    .line 1350
    const-string v2, "_tcfd"

    .line 1351
    .line 1352
    invoke-virtual {v1, v2, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1353
    .line 1354
    .line 1355
    const-string v0, "auto"

    .line 1356
    .line 1357
    const-string v2, "_tcf"

    .line 1358
    .line 1359
    invoke-virtual {v9, v0, v2, v1}, Lv49;->j1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 1360
    .line 1361
    .line 1362
    :cond_28
    return-void
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
.end method

.method public final j1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ly19;

    .line 7
    .line 8
    iget-object v1, v0, Ly19;->G:Lxb4;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v3

    .line 17
    iget-object v1, v0, Ly19;->z:Ltp8;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    sget-object v5, Lby8;->e1:Lay8;

    .line 21
    .line 22
    invoke-virtual {v1, v2, v5}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    iget-object v0, v0, Ly19;->G:Lxb4;

    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 34
    .line 35
    .line 36
    move-result-wide v0

    .line 37
    :goto_0
    move-object v2, p0

    .line 38
    move-object v8, p1

    .line 39
    move-object v9, p2

    .line 40
    move-object v7, p3

    .line 41
    move-wide v5, v0

    .line 42
    goto :goto_1

    .line 43
    :cond_0
    const-wide/16 v0, 0x0

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :goto_1
    invoke-virtual/range {v2 .. v9}, Lv49;->k1(JJLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-void
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

.method public final k1(JJLandroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lv49;->z:Lk68;

    .line 5
    .line 6
    const/4 v2, 0x1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-static/range {p7 .. p7}, Ld99;->G1(Ljava/lang/String;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    :cond_0
    :goto_0
    move v9, v2

    .line 16
    goto :goto_1

    .line 17
    :cond_1
    const/4 v2, 0x0

    .line 18
    goto :goto_0

    .line 19
    :goto_1
    const/4 v8, 0x1

    .line 20
    const/4 v10, 0x1

    .line 21
    move-object v0, p0

    .line 22
    move-wide v3, p1

    .line 23
    move-wide v5, p3

    .line 24
    move-object/from16 v7, p5

    .line 25
    .line 26
    move-object/from16 v1, p6

    .line 27
    .line 28
    move-object/from16 v2, p7

    .line 29
    .line 30
    invoke-virtual/range {v0 .. v10}, Lv49;->l1(Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;ZZZ)V

    .line 31
    .line 32
    .line 33
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
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
.end method

.method public final l1(Ljava/lang/String;Ljava/lang/String;JJLandroid/os/Bundle;ZZZ)V
    .locals 26

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v8, p2

    .line 6
    .line 7
    move-object/from16 v9, p7

    .line 8
    .line 9
    move/from16 v10, p10

    .line 10
    .line 11
    invoke-static {v7}, Lz65;->h(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-static {v9}, Lz65;->k(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcx8;->b1()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1}, Lfy8;->d1()V

    .line 21
    .line 22
    .line 23
    iget-object v0, v1, Lin8;->w:Ljava/lang/Object;

    .line 24
    .line 25
    move-object v11, v0

    .line 26
    check-cast v11, Ly19;

    .line 27
    .line 28
    invoke-virtual {v11}, Ly19;->a()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v12, v11, Ly19;->D:Lo79;

    .line 33
    .line 34
    iget-object v13, v11, Ly19;->z:Ltp8;

    .line 35
    .line 36
    iget-object v2, v11, Ly19;->w:Landroid/content/Context;

    .line 37
    .line 38
    iget-object v14, v11, Ly19;->E:Ld99;

    .line 39
    .line 40
    iget-object v15, v11, Ly19;->B:Lpz8;

    .line 41
    .line 42
    if-eqz v0, :cond_2b

    .line 43
    .line 44
    invoke-virtual {v11}, Ly19;->l()Lvy8;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    iget-object v0, v0, Lvy8;->G:Ljava/util/List;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    invoke-interface {v0, v8}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_0

    .line 57
    .line 58
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 59
    .line 60
    .line 61
    iget-object v0, v15, Lpz8;->I:Lmz8;

    .line 62
    .line 63
    const-string v1, "Dropping non-safelisted event. event name, origin"

    .line 64
    .line 65
    invoke-virtual {v0, v8, v7, v1}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-void

    .line 69
    :cond_0
    iget-boolean v0, v1, Lv49;->B:Z

    .line 70
    .line 71
    const/4 v3, 0x0

    .line 72
    const/4 v4, 0x1

    .line 73
    if-nez v0, :cond_2

    .line 74
    .line 75
    iput-boolean v4, v1, Lv49;->B:Z

    .line 76
    .line 77
    :try_start_0
    iget-boolean v0, v11, Ly19;->x:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1

    .line 78
    .line 79
    const-string v5, "com.google.android.gms.tagmanager.TagManagerService"

    .line 80
    .line 81
    if-nez v0, :cond_1

    .line 82
    .line 83
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v5, v4, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v0

    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 96
    :goto_0
    :try_start_2
    const-string v5, "initialize"

    .line 97
    .line 98
    const-class v6, Landroid/content/Context;

    .line 99
    .line 100
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-virtual {v0, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-virtual {v0, v3, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :catch_0
    move-exception v0

    .line 117
    :try_start_3
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 118
    .line 119
    .line 120
    iget-object v2, v15, Lpz8;->E:Lmz8;

    .line 121
    .line 122
    const-string v5, "Failed to invoke Tag Manager\'s initialize() method"

    .line 123
    .line 124
    invoke-virtual {v2, v5, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_1

    .line 125
    .line 126
    .line 127
    goto :goto_1

    .line 128
    :catch_1
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 129
    .line 130
    .line 131
    iget-object v0, v15, Lpz8;->H:Lmz8;

    .line 132
    .line 133
    const-string v2, "Tag Manager is not found and thus will not be used"

    .line 134
    .line 135
    invoke-virtual {v0, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    :cond_2
    :goto_1
    iget-object v0, v11, Ly19;->F:Lfz8;

    .line 139
    .line 140
    iget-object v2, v11, Ly19;->A:Lq09;

    .line 141
    .line 142
    iget-object v5, v11, Ly19;->G:Lxb4;

    .line 143
    .line 144
    sget-object v6, Lby8;->Z0:Lay8;

    .line 145
    .line 146
    invoke-virtual {v13, v3, v6}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-nez v6, :cond_3

    .line 151
    .line 152
    const-string v6, "_cmp"

    .line 153
    .line 154
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    move-result v6

    .line 158
    if-eqz v6, :cond_3

    .line 159
    .line 160
    const-string v6, "gclid"

    .line 161
    .line 162
    invoke-virtual {v9, v6}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v16

    .line 166
    if-eqz v16, :cond_3

    .line 167
    .line 168
    invoke-virtual {v9, v6}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v6

    .line 172
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-object/from16 v16, v2

    .line 176
    .line 177
    move-object/from16 v17, v3

    .line 178
    .line 179
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 180
    .line 181
    .line 182
    move-result-wide v2

    .line 183
    move-object/from16 v18, v5

    .line 184
    .line 185
    const-string v5, "auto"

    .line 186
    .line 187
    move/from16 v19, v4

    .line 188
    .line 189
    move-object v4, v6

    .line 190
    const-string v6, "_lgclid"

    .line 191
    .line 192
    move-object/from16 v20, v13

    .line 193
    .line 194
    move-object/from16 v13, v17

    .line 195
    .line 196
    invoke-virtual/range {v1 .. v6}, Lv49;->n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    goto :goto_2

    .line 200
    :cond_3
    move-object/from16 v16, v2

    .line 201
    .line 202
    move-object/from16 v18, v5

    .line 203
    .line 204
    move-object/from16 v20, v13

    .line 205
    .line 206
    move-object v13, v3

    .line 207
    :goto_2
    const/4 v2, 0x0

    .line 208
    if-eqz p8, :cond_4

    .line 209
    .line 210
    sget-object v3, Ld99;->F:[Ljava/lang/String;

    .line 211
    .line 212
    aget-object v3, v3, v2

    .line 213
    .line 214
    invoke-virtual {v3, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 215
    .line 216
    .line 217
    move-result v3

    .line 218
    if-nez v3, :cond_4

    .line 219
    .line 220
    invoke-static {v14}, Ly19;->e(Lin8;)V

    .line 221
    .line 222
    .line 223
    invoke-static/range {v16 .. v16}, Ly19;->e(Lin8;)V

    .line 224
    .line 225
    .line 226
    move-object/from16 v3, v16

    .line 227
    .line 228
    iget-object v4, v3, Lq09;->U:Lno7;

    .line 229
    .line 230
    invoke-virtual {v4}, Lno7;->e()Landroid/os/Bundle;

    .line 231
    .line 232
    .line 233
    move-result-object v4

    .line 234
    invoke-virtual {v14, v9, v4}, Ld99;->p1(Landroid/os/Bundle;Landroid/os/Bundle;)V

    .line 235
    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_4
    move-object/from16 v3, v16

    .line 239
    .line 240
    :goto_3
    iget-object v4, v1, Lv49;->R:Lrg4;

    .line 241
    .line 242
    if-nez v10, :cond_b

    .line 243
    .line 244
    const-string v6, "_iap"

    .line 245
    .line 246
    invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 247
    .line 248
    .line 249
    move-result v6

    .line 250
    if-nez v6, :cond_b

    .line 251
    .line 252
    invoke-static {v14}, Ly19;->e(Lin8;)V

    .line 253
    .line 254
    .line 255
    const-string v6, "event"

    .line 256
    .line 257
    invoke-virtual {v14, v6, v8}, Ld99;->f2(Ljava/lang/String;Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v16

    .line 261
    const/16 v17, 0x2

    .line 262
    .line 263
    if-nez v16, :cond_5

    .line 264
    .line 265
    move-object/from16 v22, v4

    .line 266
    .line 267
    :goto_4
    const/16 v2, 0x28

    .line 268
    .line 269
    goto :goto_6

    .line 270
    :cond_5
    iget-object v2, v14, Lin8;->w:Ljava/lang/Object;

    .line 271
    .line 272
    check-cast v2, Ly19;

    .line 273
    .line 274
    sget-object v5, Lr16;->T:[Ljava/lang/String;

    .line 275
    .line 276
    iget-object v2, v2, Ly19;->z:Ltp8;

    .line 277
    .line 278
    move-object/from16 v22, v4

    .line 279
    .line 280
    sget-object v4, Lby8;->f1:Lay8;

    .line 281
    .line 282
    invoke-virtual {v2, v13, v4}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 283
    .line 284
    .line 285
    move-result v2

    .line 286
    if-eqz v2, :cond_6

    .line 287
    .line 288
    sget-object v2, Lr16;->V:[Ljava/lang/String;

    .line 289
    .line 290
    goto :goto_5

    .line 291
    :cond_6
    sget-object v2, Lr16;->U:[Ljava/lang/String;

    .line 292
    .line 293
    :goto_5
    invoke-virtual {v14, v6, v5, v2, v8}, Ld99;->h2(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 294
    .line 295
    .line 296
    move-result v2

    .line 297
    if-nez v2, :cond_7

    .line 298
    .line 299
    const/16 v17, 0xd

    .line 300
    .line 301
    goto :goto_4

    .line 302
    :cond_7
    const/16 v2, 0x28

    .line 303
    .line 304
    invoke-virtual {v14, v2, v6, v8}, Ld99;->i2(ILjava/lang/String;Ljava/lang/String;)Z

    .line 305
    .line 306
    .line 307
    move-result v4

    .line 308
    if-nez v4, :cond_8

    .line 309
    .line 310
    goto :goto_6

    .line 311
    :cond_8
    const/16 v17, 0x0

    .line 312
    .line 313
    :goto_6
    if-eqz v17, :cond_a

    .line 314
    .line 315
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 316
    .line 317
    .line 318
    iget-object v1, v15, Lpz8;->D:Lmz8;

    .line 319
    .line 320
    invoke-virtual {v0, v8}, Lfz8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    const-string v3, "Invalid public event name. Event will not be logged (FE)"

    .line 325
    .line 326
    invoke-virtual {v1, v3, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 327
    .line 328
    .line 329
    invoke-static {v14}, Ly19;->e(Lin8;)V

    .line 330
    .line 331
    .line 332
    const/4 v4, 0x1

    .line 333
    invoke-static {v2, v8, v4}, Ld99;->j1(ILjava/lang/String;Z)Ljava/lang/String;

    .line 334
    .line 335
    .line 336
    move-result-object v0

    .line 337
    if-eqz v8, :cond_9

    .line 338
    .line 339
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 340
    .line 341
    .line 342
    move-result v2

    .line 343
    goto :goto_7

    .line 344
    :cond_9
    const/4 v2, 0x0

    .line 345
    :goto_7
    const/4 v1, 0x0

    .line 346
    const-string v3, "_ev"

    .line 347
    .line 348
    move-object/from16 p4, v0

    .line 349
    .line 350
    move-object/from16 p1, v1

    .line 351
    .line 352
    move/from16 p5, v2

    .line 353
    .line 354
    move-object/from16 p3, v3

    .line 355
    .line 356
    move/from16 p2, v17

    .line 357
    .line 358
    move-object/from16 p0, v22

    .line 359
    .line 360
    invoke-static/range {p0 .. p5}, Ld99;->u1(Lc99;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 361
    .line 362
    .line 363
    return-void

    .line 364
    :cond_a
    :goto_8
    const/4 v4, 0x1

    .line 365
    goto :goto_9

    .line 366
    :cond_b
    move-object/from16 v22, v4

    .line 367
    .line 368
    goto :goto_8

    .line 369
    :goto_9
    iget-object v2, v11, Ly19;->H:Ll59;

    .line 370
    .line 371
    invoke-static {v2}, Ly19;->f(Lfy8;)V

    .line 372
    .line 373
    .line 374
    const/4 v5, 0x0

    .line 375
    invoke-virtual {v2, v5}, Ll59;->g1(Z)Lf59;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    const-string v5, "_sc"

    .line 380
    .line 381
    if-eqz v6, :cond_c

    .line 382
    .line 383
    invoke-virtual {v9, v5}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 384
    .line 385
    .line 386
    move-result v17

    .line 387
    if-nez v17, :cond_c

    .line 388
    .line 389
    iput-boolean v4, v6, Lf59;->d:Z

    .line 390
    .line 391
    :cond_c
    if-eqz p8, :cond_d

    .line 392
    .line 393
    if-nez v10, :cond_d

    .line 394
    .line 395
    move v13, v4

    .line 396
    goto :goto_a

    .line 397
    :cond_d
    const/4 v13, 0x0

    .line 398
    :goto_a
    invoke-static {v6, v9, v13}, Ld99;->Y1(Lf59;Landroid/os/Bundle;Z)V

    .line 399
    .line 400
    .line 401
    const-string v6, "am"

    .line 402
    .line 403
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 404
    .line 405
    .line 406
    move-result v6

    .line 407
    invoke-static {v8}, Ld99;->G1(Ljava/lang/String;)Z

    .line 408
    .line 409
    .line 410
    move-result v13

    .line 411
    if-eqz p8, :cond_f

    .line 412
    .line 413
    iget-object v4, v1, Lv49;->z:Lk68;

    .line 414
    .line 415
    if-eqz v4, :cond_f

    .line 416
    .line 417
    if-nez v13, :cond_f

    .line 418
    .line 419
    if-eqz v6, :cond_e

    .line 420
    .line 421
    const/4 v13, 0x1

    .line 422
    goto :goto_b

    .line 423
    :cond_e
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 424
    .line 425
    .line 426
    iget-object v2, v15, Lpz8;->I:Lmz8;

    .line 427
    .line 428
    invoke-virtual {v0, v8}, Lfz8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v3

    .line 432
    invoke-virtual {v0, v9}, Lfz8;->e(Landroid/os/Bundle;)Ljava/lang/String;

    .line 433
    .line 434
    .line 435
    move-result-object v0

    .line 436
    const-string v4, "Passing event to registered event handler (FE)"

    .line 437
    .line 438
    invoke-virtual {v2, v3, v0, v4}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 439
    .line 440
    .line 441
    iget-object v0, v1, Lv49;->z:Lk68;

    .line 442
    .line 443
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 444
    .line 445
    .line 446
    iget-object v6, v1, Lv49;->z:Lk68;

    .line 447
    .line 448
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 449
    .line 450
    .line 451
    :try_start_4
    iget-object v0, v6, Lk68;->x:Ljava/lang/Object;

    .line 452
    .line 453
    check-cast v0, Ltu8;

    .line 454
    .line 455
    move-wide/from16 v4, p3

    .line 456
    .line 457
    move-object v1, v7

    .line 458
    move-object v2, v8

    .line 459
    move-object v3, v9

    .line 460
    invoke-interface/range {v0 .. v5}, Ltu8;->g(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_2

    .line 461
    .line 462
    .line 463
    goto/16 :goto_1d

    .line 464
    .line 465
    :catch_2
    move-exception v0

    .line 466
    iget-object v1, v6, Lk68;->y:Ljava/lang/Object;

    .line 467
    .line 468
    check-cast v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;

    .line 469
    .line 470
    iget-object v1, v1, Lcom/google/android/gms/measurement/internal/AppMeasurementDynamiteService;->d:Ly19;

    .line 471
    .line 472
    if-eqz v1, :cond_2a

    .line 473
    .line 474
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 475
    .line 476
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 477
    .line 478
    .line 479
    iget-object v1, v1, Lpz8;->E:Lmz8;

    .line 480
    .line 481
    const-string v2, "Event interceptor threw exception"

    .line 482
    .line 483
    invoke-virtual {v1, v2, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 484
    .line 485
    .line 486
    goto/16 :goto_1d

    .line 487
    .line 488
    :cond_f
    move v13, v6

    .line 489
    :goto_b
    invoke-virtual {v11}, Ly19;->c()Z

    .line 490
    .line 491
    .line 492
    move-result v4

    .line 493
    if-nez v4, :cond_10

    .line 494
    .line 495
    goto/16 :goto_1d

    .line 496
    .line 497
    :cond_10
    invoke-static {v14}, Ly19;->e(Lin8;)V

    .line 498
    .line 499
    .line 500
    iget-object v4, v14, Lin8;->w:Ljava/lang/Object;

    .line 501
    .line 502
    check-cast v4, Ly19;

    .line 503
    .line 504
    invoke-virtual {v14, v8}, Ld99;->j2(Ljava/lang/String;)I

    .line 505
    .line 506
    .line 507
    move-result v6

    .line 508
    if-eqz v6, :cond_12

    .line 509
    .line 510
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 511
    .line 512
    .line 513
    iget-object v1, v15, Lpz8;->D:Lmz8;

    .line 514
    .line 515
    invoke-virtual {v0, v8}, Lfz8;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 516
    .line 517
    .line 518
    move-result-object v0

    .line 519
    const-string v2, "Invalid event name. Event will not be logged (FE)"

    .line 520
    .line 521
    invoke-virtual {v1, v2, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 522
    .line 523
    .line 524
    const/4 v1, 0x1

    .line 525
    const/16 v2, 0x28

    .line 526
    .line 527
    invoke-static {v2, v8, v1}, Ld99;->j1(ILjava/lang/String;Z)Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v0

    .line 531
    if-eqz v8, :cond_11

    .line 532
    .line 533
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 534
    .line 535
    .line 536
    move-result v2

    .line 537
    goto :goto_c

    .line 538
    :cond_11
    const/4 v2, 0x0

    .line 539
    :goto_c
    invoke-static {v14}, Ly19;->e(Lin8;)V

    .line 540
    .line 541
    .line 542
    const-string v1, "_ev"

    .line 543
    .line 544
    const/4 v3, 0x0

    .line 545
    move-object/from16 p4, v0

    .line 546
    .line 547
    move-object/from16 p3, v1

    .line 548
    .line 549
    move/from16 p5, v2

    .line 550
    .line 551
    move-object/from16 p1, v3

    .line 552
    .line 553
    move/from16 p2, v6

    .line 554
    .line 555
    move-object/from16 p0, v22

    .line 556
    .line 557
    invoke-static/range {p0 .. p5}, Ld99;->u1(Lc99;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 558
    .line 559
    .line 560
    return-void

    .line 561
    :cond_12
    const/16 v21, 0x1

    .line 562
    .line 563
    const-string v0, "_sn"

    .line 564
    .line 565
    const-string v6, "_si"

    .line 566
    .line 567
    move-object/from16 v19, v11

    .line 568
    .line 569
    const-string v11, "_o"

    .line 570
    .line 571
    filled-new-array {v11, v0, v5, v6}, [Ljava/lang/String;

    .line 572
    .line 573
    .line 574
    move-result-object v0

    .line 575
    invoke-static {v0}, Lh03;->q([Ljava/lang/Object;)Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v0

    .line 579
    invoke-virtual {v14, v8, v9, v0, v10}, Ld99;->m1(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/List;Z)Landroid/os/Bundle;

    .line 580
    .line 581
    .line 582
    move-result-object v0

    .line 583
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 584
    .line 585
    .line 586
    invoke-static {v2}, Ly19;->f(Lfy8;)V

    .line 587
    .line 588
    .line 589
    const/4 v5, 0x0

    .line 590
    invoke-virtual {v2, v5}, Ll59;->g1(Z)Lf59;

    .line 591
    .line 592
    .line 593
    move-result-object v6

    .line 594
    const-string v9, "_ae"

    .line 595
    .line 596
    move-object/from16 p8, v11

    .line 597
    .line 598
    if-eqz v6, :cond_13

    .line 599
    .line 600
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 601
    .line 602
    .line 603
    move-result v6

    .line 604
    if-eqz v6, :cond_13

    .line 605
    .line 606
    invoke-static {v12}, Ly19;->f(Lfy8;)V

    .line 607
    .line 608
    .line 609
    iget-object v6, v12, Lo79;->B:Lr38;

    .line 610
    .line 611
    iget-object v5, v6, Lr38;->z:Ljava/lang/Object;

    .line 612
    .line 613
    check-cast v5, Lo79;

    .line 614
    .line 615
    iget-object v5, v5, Lin8;->w:Ljava/lang/Object;

    .line 616
    .line 617
    check-cast v5, Ly19;

    .line 618
    .line 619
    iget-object v5, v5, Ly19;->G:Lxb4;

    .line 620
    .line 621
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 622
    .line 623
    .line 624
    const-wide/16 v22, 0x0

    .line 625
    .line 626
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 627
    .line 628
    .line 629
    move-result-wide v10

    .line 630
    move-object v5, v2

    .line 631
    iget-wide v1, v6, Lr38;->x:J

    .line 632
    .line 633
    sub-long v1, v10, v1

    .line 634
    .line 635
    iput-wide v10, v6, Lr38;->x:J

    .line 636
    .line 637
    cmp-long v6, v1, v22

    .line 638
    .line 639
    if-lez v6, :cond_14

    .line 640
    .line 641
    invoke-virtual {v14, v0, v1, v2}, Ld99;->O1(Landroid/os/Bundle;J)V

    .line 642
    .line 643
    .line 644
    goto :goto_d

    .line 645
    :cond_13
    move-object v5, v2

    .line 646
    const-wide/16 v22, 0x0

    .line 647
    .line 648
    :cond_14
    :goto_d
    const-string v1, "auto"

    .line 649
    .line 650
    invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 651
    .line 652
    .line 653
    move-result v1

    .line 654
    const-string v2, "_ffr"

    .line 655
    .line 656
    if-nez v1, :cond_19

    .line 657
    .line 658
    const-string v1, "_ssr"

    .line 659
    .line 660
    invoke-virtual {v1, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 661
    .line 662
    .line 663
    move-result v1

    .line 664
    if-eqz v1, :cond_19

    .line 665
    .line 666
    invoke-virtual {v0, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 667
    .line 668
    .line 669
    move-result-object v1

    .line 670
    sget v2, Lc57;->a:I

    .line 671
    .line 672
    if-eqz v1, :cond_16

    .line 673
    .line 674
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 675
    .line 676
    .line 677
    move-result-object v2

    .line 678
    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    .line 679
    .line 680
    .line 681
    move-result v2

    .line 682
    if-eqz v2, :cond_15

    .line 683
    .line 684
    goto :goto_e

    .line 685
    :cond_15
    if-eqz v1, :cond_17

    .line 686
    .line 687
    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 688
    .line 689
    .line 690
    move-result-object v1

    .line 691
    goto :goto_f

    .line 692
    :cond_16
    :goto_e
    const/4 v1, 0x0

    .line 693
    :cond_17
    :goto_f
    iget-object v2, v4, Ly19;->A:Lq09;

    .line 694
    .line 695
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 696
    .line 697
    .line 698
    iget-object v2, v2, Lq09;->R:Ll90;

    .line 699
    .line 700
    invoke-virtual {v2}, Ll90;->j()Ljava/lang/String;

    .line 701
    .line 702
    .line 703
    move-result-object v2

    .line 704
    invoke-static {v1, v2}, Ljava/util/Objects;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 705
    .line 706
    .line 707
    move-result v2

    .line 708
    if-nez v2, :cond_18

    .line 709
    .line 710
    iget-object v2, v4, Ly19;->A:Lq09;

    .line 711
    .line 712
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 713
    .line 714
    .line 715
    iget-object v2, v2, Lq09;->R:Ll90;

    .line 716
    .line 717
    invoke-virtual {v2, v1}, Ll90;->k(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    goto :goto_10

    .line 721
    :cond_18
    iget-object v0, v4, Ly19;->B:Lpz8;

    .line 722
    .line 723
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 724
    .line 725
    .line 726
    iget-object v0, v0, Lpz8;->I:Lmz8;

    .line 727
    .line 728
    const-string v1, "Not logging duplicate session_start_with_rollout event"

    .line 729
    .line 730
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 731
    .line 732
    .line 733
    return-void

    .line 734
    :cond_19
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 735
    .line 736
    .line 737
    move-result v1

    .line 738
    if-eqz v1, :cond_1a

    .line 739
    .line 740
    iget-object v1, v4, Ly19;->A:Lq09;

    .line 741
    .line 742
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 743
    .line 744
    .line 745
    iget-object v1, v1, Lq09;->R:Ll90;

    .line 746
    .line 747
    invoke-virtual {v1}, Ll90;->j()Ljava/lang/String;

    .line 748
    .line 749
    .line 750
    move-result-object v1

    .line 751
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 752
    .line 753
    .line 754
    move-result v4

    .line 755
    if-nez v4, :cond_1a

    .line 756
    .line 757
    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 758
    .line 759
    .line 760
    :cond_1a
    :goto_10
    new-instance v10, Ljava/util/ArrayList;

    .line 761
    .line 762
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 763
    .line 764
    .line 765
    invoke-virtual {v10, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 766
    .line 767
    .line 768
    sget-object v1, Lby8;->S0:Lay8;

    .line 769
    .line 770
    move-object/from16 v2, v20

    .line 771
    .line 772
    const/4 v11, 0x0

    .line 773
    invoke-virtual {v2, v11, v1}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 774
    .line 775
    .line 776
    move-result v1

    .line 777
    if-eqz v1, :cond_1b

    .line 778
    .line 779
    invoke-static {v12}, Ly19;->f(Lfy8;)V

    .line 780
    .line 781
    .line 782
    invoke-virtual {v12}, Lcx8;->b1()V

    .line 783
    .line 784
    .line 785
    iget-boolean v1, v12, Lo79;->z:Z

    .line 786
    .line 787
    goto :goto_11

    .line 788
    :cond_1b
    invoke-static {v3}, Ly19;->e(Lin8;)V

    .line 789
    .line 790
    .line 791
    iget-object v1, v3, Lq09;->O:Lh09;

    .line 792
    .line 793
    invoke-virtual {v1}, Lh09;->a()Z

    .line 794
    .line 795
    .line 796
    move-result v1

    .line 797
    :goto_11
    invoke-static {v3}, Ly19;->e(Lin8;)V

    .line 798
    .line 799
    .line 800
    iget-object v2, v3, Lq09;->L:Ll09;

    .line 801
    .line 802
    invoke-virtual {v2}, Ll09;->a()J

    .line 803
    .line 804
    .line 805
    move-result-wide v24

    .line 806
    cmp-long v2, v24, v22

    .line 807
    .line 808
    if-lez v2, :cond_1d

    .line 809
    .line 810
    move-object/from16 v17, v12

    .line 811
    .line 812
    move-wide/from16 v11, p3

    .line 813
    .line 814
    invoke-virtual {v3, v11, v12}, Lq09;->l1(J)Z

    .line 815
    .line 816
    .line 817
    move-result v2

    .line 818
    if-eqz v2, :cond_1c

    .line 819
    .line 820
    if-eqz v1, :cond_1c

    .line 821
    .line 822
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 823
    .line 824
    .line 825
    iget-object v1, v15, Lpz8;->J:Lmz8;

    .line 826
    .line 827
    const-string v2, "Current session is expired, remove the session number, ID, and engagement time"

    .line 828
    .line 829
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 830
    .line 831
    .line 832
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 833
    .line 834
    .line 835
    move-object v1, v3

    .line 836
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 837
    .line 838
    .line 839
    move-result-wide v2

    .line 840
    const-string v6, "_sid"

    .line 841
    .line 842
    const/4 v4, 0x0

    .line 843
    move-object/from16 v24, v5

    .line 844
    .line 845
    const-string v5, "auto"

    .line 846
    .line 847
    move/from16 v8, v21

    .line 848
    .line 849
    move/from16 v21, v13

    .line 850
    .line 851
    move v13, v8

    .line 852
    move-object v8, v1

    .line 853
    const/16 v16, 0x0

    .line 854
    .line 855
    move-object/from16 v1, p0

    .line 856
    .line 857
    invoke-virtual/range {v1 .. v6}, Lv49;->n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 858
    .line 859
    .line 860
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 861
    .line 862
    .line 863
    move-result-wide v2

    .line 864
    const-string v6, "_sno"

    .line 865
    .line 866
    const-string v5, "auto"

    .line 867
    .line 868
    invoke-virtual/range {v1 .. v6}, Lv49;->n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 869
    .line 870
    .line 871
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 872
    .line 873
    .line 874
    move-result-wide v2

    .line 875
    const-string v6, "_se"

    .line 876
    .line 877
    const-string v5, "auto"

    .line 878
    .line 879
    invoke-virtual/range {v1 .. v6}, Lv49;->n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 880
    .line 881
    .line 882
    iget-object v1, v8, Lq09;->M:Ll09;

    .line 883
    .line 884
    move-wide/from16 v2, v22

    .line 885
    .line 886
    invoke-virtual {v1, v2, v3}, Ll09;->b(J)V

    .line 887
    .line 888
    .line 889
    goto :goto_12

    .line 890
    :cond_1c
    move/from16 v2, v21

    .line 891
    .line 892
    move/from16 v21, v13

    .line 893
    .line 894
    move v13, v2

    .line 895
    move-object/from16 v24, v5

    .line 896
    .line 897
    move-wide/from16 v2, v22

    .line 898
    .line 899
    const/16 v16, 0x0

    .line 900
    .line 901
    goto :goto_12

    .line 902
    :cond_1d
    move/from16 v2, v21

    .line 903
    .line 904
    move/from16 v21, v13

    .line 905
    .line 906
    move v13, v2

    .line 907
    move-object/from16 v24, v5

    .line 908
    .line 909
    move-object/from16 v17, v12

    .line 910
    .line 911
    move-wide/from16 v2, v22

    .line 912
    .line 913
    const/16 v16, 0x0

    .line 914
    .line 915
    move-wide/from16 v11, p3

    .line 916
    .line 917
    :goto_12
    const-string v1, "extend_session"

    .line 918
    .line 919
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 920
    .line 921
    .line 922
    move-result-wide v1

    .line 923
    const-wide/16 v3, 0x1

    .line 924
    .line 925
    cmp-long v1, v1, v3

    .line 926
    .line 927
    if-nez v1, :cond_1e

    .line 928
    .line 929
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 930
    .line 931
    .line 932
    iget-object v1, v15, Lpz8;->J:Lmz8;

    .line 933
    .line 934
    const-string v2, "EXTEND_SESSION param attached: initiate a new session or extend the current active session"

    .line 935
    .line 936
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 937
    .line 938
    .line 939
    invoke-static/range {v17 .. v17}, Ly19;->f(Lfy8;)V

    .line 940
    .line 941
    .line 942
    move-object/from16 v8, v17

    .line 943
    .line 944
    iget-object v1, v8, Lo79;->A:Luy5;

    .line 945
    .line 946
    move-wide/from16 v2, p5

    .line 947
    .line 948
    invoke-virtual {v1, v11, v12, v2, v3}, Luy5;->l(JJ)V

    .line 949
    .line 950
    .line 951
    goto :goto_13

    .line 952
    :cond_1e
    move-wide/from16 v2, p5

    .line 953
    .line 954
    move-object/from16 v8, v17

    .line 955
    .line 956
    :goto_13
    new-instance v1, Ljava/util/ArrayList;

    .line 957
    .line 958
    invoke-virtual {v0}, Landroid/os/BaseBundle;->keySet()Ljava/util/Set;

    .line 959
    .line 960
    .line 961
    move-result-object v4

    .line 962
    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 963
    .line 964
    .line 965
    invoke-static {v1}, Ljava/util/Collections;->sort(Ljava/util/List;)V

    .line 966
    .line 967
    .line 968
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 969
    .line 970
    .line 971
    move-result v4

    .line 972
    move/from16 v5, v16

    .line 973
    .line 974
    :goto_14
    if-ge v5, v4, :cond_24

    .line 975
    .line 976
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 977
    .line 978
    .line 979
    move-result-object v6

    .line 980
    check-cast v6, Ljava/lang/String;

    .line 981
    .line 982
    if-eqz v6, :cond_22

    .line 983
    .line 984
    invoke-static {v14}, Ly19;->e(Lin8;)V

    .line 985
    .line 986
    .line 987
    invoke-virtual {v0, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 988
    .line 989
    .line 990
    move-result-object v15

    .line 991
    move-object/from16 p7, v1

    .line 992
    .line 993
    instance-of v1, v15, Landroid/os/Bundle;

    .line 994
    .line 995
    if-eqz v1, :cond_1f

    .line 996
    .line 997
    new-array v1, v13, [Landroid/os/Bundle;

    .line 998
    .line 999
    check-cast v15, Landroid/os/Bundle;

    .line 1000
    .line 1001
    aput-object v15, v1, v16

    .line 1002
    .line 1003
    goto :goto_15

    .line 1004
    :cond_1f
    instance-of v1, v15, [Landroid/os/Parcelable;

    .line 1005
    .line 1006
    if-eqz v1, :cond_20

    .line 1007
    .line 1008
    check-cast v15, [Landroid/os/Parcelable;

    .line 1009
    .line 1010
    array-length v1, v15

    .line 1011
    const-class v13, [Landroid/os/Bundle;

    .line 1012
    .line 1013
    invoke-static {v15, v1, v13}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;ILjava/lang/Class;)[Ljava/lang/Object;

    .line 1014
    .line 1015
    .line 1016
    move-result-object v1

    .line 1017
    check-cast v1, [Landroid/os/Bundle;

    .line 1018
    .line 1019
    goto :goto_15

    .line 1020
    :cond_20
    instance-of v1, v15, Ljava/util/ArrayList;

    .line 1021
    .line 1022
    if-eqz v1, :cond_21

    .line 1023
    .line 1024
    check-cast v15, Ljava/util/ArrayList;

    .line 1025
    .line 1026
    invoke-virtual {v15}, Ljava/util/ArrayList;->size()I

    .line 1027
    .line 1028
    .line 1029
    move-result v1

    .line 1030
    new-array v1, v1, [Landroid/os/Bundle;

    .line 1031
    .line 1032
    invoke-virtual {v15, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 1033
    .line 1034
    .line 1035
    move-result-object v1

    .line 1036
    check-cast v1, [Landroid/os/Bundle;

    .line 1037
    .line 1038
    goto :goto_15

    .line 1039
    :cond_21
    const/4 v1, 0x0

    .line 1040
    :goto_15
    if-eqz v1, :cond_23

    .line 1041
    .line 1042
    invoke-virtual {v0, v6, v1}, Landroid/os/Bundle;->putParcelableArray(Ljava/lang/String;[Landroid/os/Parcelable;)V

    .line 1043
    .line 1044
    .line 1045
    goto :goto_16

    .line 1046
    :cond_22
    move-object/from16 p7, v1

    .line 1047
    .line 1048
    :cond_23
    :goto_16
    add-int/lit8 v5, v5, 0x1

    .line 1049
    .line 1050
    move-object/from16 v1, p7

    .line 1051
    .line 1052
    const/4 v13, 0x1

    .line 1053
    goto :goto_14

    .line 1054
    :cond_24
    move/from16 v13, v16

    .line 1055
    .line 1056
    :goto_17
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 1057
    .line 1058
    .line 1059
    move-result v0

    .line 1060
    if-ge v13, v0, :cond_29

    .line 1061
    .line 1062
    invoke-virtual {v10, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v0

    .line 1066
    check-cast v0, Landroid/os/Bundle;

    .line 1067
    .line 1068
    if-eqz v13, :cond_25

    .line 1069
    .line 1070
    const-string v1, "_ep"

    .line 1071
    .line 1072
    :goto_18
    move-object/from16 v15, p8

    .line 1073
    .line 1074
    goto :goto_19

    .line 1075
    :cond_25
    move-object/from16 v1, p2

    .line 1076
    .line 1077
    goto :goto_18

    .line 1078
    :goto_19
    invoke-virtual {v0, v15, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1079
    .line 1080
    .line 1081
    if-eqz p9, :cond_26

    .line 1082
    .line 1083
    invoke-virtual {v14, v0}, Ld99;->I1(Landroid/os/Bundle;)Landroid/os/Bundle;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v0

    .line 1087
    :cond_26
    new-instance v6, Lzr8;

    .line 1088
    .line 1089
    new-instance v2, Lur8;

    .line 1090
    .line 1091
    invoke-direct {v2, v0}, Lur8;-><init>(Landroid/os/Bundle;)V

    .line 1092
    .line 1093
    .line 1094
    move-object v3, v7

    .line 1095
    move-wide v4, v11

    .line 1096
    move-object/from16 v11, p0

    .line 1097
    .line 1098
    move-object v12, v0

    .line 1099
    move-object v0, v6

    .line 1100
    move-wide/from16 v6, p5

    .line 1101
    .line 1102
    invoke-direct/range {v0 .. v7}, Lzr8;-><init>(Ljava/lang/String;Lur8;Ljava/lang/String;JJ)V

    .line 1103
    .line 1104
    .line 1105
    move-object v6, v0

    .line 1106
    invoke-virtual/range {v19 .. v19}, Ly19;->j()Lr69;

    .line 1107
    .line 1108
    .line 1109
    move-result-object v3

    .line 1110
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1111
    .line 1112
    .line 1113
    invoke-virtual {v3}, Lcx8;->b1()V

    .line 1114
    .line 1115
    .line 1116
    invoke-virtual {v3}, Lfy8;->d1()V

    .line 1117
    .line 1118
    .line 1119
    invoke-virtual {v3}, Lr69;->o1()V

    .line 1120
    .line 1121
    .line 1122
    iget-object v0, v3, Lin8;->w:Ljava/lang/Object;

    .line 1123
    .line 1124
    check-cast v0, Ly19;

    .line 1125
    .line 1126
    invoke-virtual {v0}, Ly19;->i()Lcz8;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v0

    .line 1130
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1131
    .line 1132
    .line 1133
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 1134
    .line 1135
    .line 1136
    move-result-object v1

    .line 1137
    move/from16 v5, v16

    .line 1138
    .line 1139
    invoke-static {v6, v1, v5}, Lki8;->a(Lzr8;Landroid/os/Parcel;I)V

    .line 1140
    .line 1141
    .line 1142
    invoke-virtual {v1}, Landroid/os/Parcel;->marshall()[B

    .line 1143
    .line 1144
    .line 1145
    move-result-object v2

    .line 1146
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 1147
    .line 1148
    .line 1149
    array-length v1, v2

    .line 1150
    const/high16 v4, 0x20000

    .line 1151
    .line 1152
    if-le v1, v4, :cond_27

    .line 1153
    .line 1154
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 1155
    .line 1156
    check-cast v0, Ly19;

    .line 1157
    .line 1158
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 1159
    .line 1160
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 1161
    .line 1162
    .line 1163
    iget-object v0, v0, Lpz8;->C:Lmz8;

    .line 1164
    .line 1165
    const-string v1, "Event is too long for local database. Sending event directly to service"

    .line 1166
    .line 1167
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 1168
    .line 1169
    .line 1170
    const/4 v5, 0x0

    .line 1171
    :goto_1a
    const/4 v1, 0x1

    .line 1172
    goto :goto_1b

    .line 1173
    :cond_27
    const/4 v5, 0x0

    .line 1174
    invoke-virtual {v0, v5, v2}, Lcz8;->j1(I[B)Z

    .line 1175
    .line 1176
    .line 1177
    move-result v2

    .line 1178
    move v5, v2

    .line 1179
    goto :goto_1a

    .line 1180
    :goto_1b
    invoke-virtual {v3, v1}, Lr69;->s1(Z)Lz99;

    .line 1181
    .line 1182
    .line 1183
    move-result-object v4

    .line 1184
    new-instance v2, Lhy8;

    .line 1185
    .line 1186
    const/4 v7, 0x2

    .line 1187
    invoke-direct/range {v2 .. v7}, Lhy8;-><init>(Lr69;Lz99;ZLa3;I)V

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v3, v2}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 1191
    .line 1192
    .line 1193
    if-nez v21, :cond_28

    .line 1194
    .line 1195
    iget-object v0, v11, Lv49;->A:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 1196
    .line 1197
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->iterator()Ljava/util/Iterator;

    .line 1198
    .line 1199
    .line 1200
    move-result-object v6

    .line 1201
    :goto_1c
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1202
    .line 1203
    .line 1204
    move-result v0

    .line 1205
    if-eqz v0, :cond_28

    .line 1206
    .line 1207
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1208
    .line 1209
    .line 1210
    move-result-object v0

    .line 1211
    check-cast v0, Lk39;

    .line 1212
    .line 1213
    new-instance v3, Landroid/os/Bundle;

    .line 1214
    .line 1215
    invoke-direct {v3, v12}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 1216
    .line 1217
    .line 1218
    move-object/from16 v1, p1

    .line 1219
    .line 1220
    move-object/from16 v2, p2

    .line 1221
    .line 1222
    move-wide/from16 v4, p3

    .line 1223
    .line 1224
    invoke-interface/range {v0 .. v5}, Lk39;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;J)V

    .line 1225
    .line 1226
    .line 1227
    goto :goto_1c

    .line 1228
    :cond_28
    move-object/from16 v2, p2

    .line 1229
    .line 1230
    add-int/lit8 v13, v13, 0x1

    .line 1231
    .line 1232
    move-object/from16 v7, p1

    .line 1233
    .line 1234
    move-wide/from16 v11, p3

    .line 1235
    .line 1236
    move-wide/from16 v2, p5

    .line 1237
    .line 1238
    move-object/from16 p8, v15

    .line 1239
    .line 1240
    const/16 v16, 0x0

    .line 1241
    .line 1242
    goto/16 :goto_17

    .line 1243
    .line 1244
    :cond_29
    move-object/from16 v2, p2

    .line 1245
    .line 1246
    invoke-static/range {v24 .. v24}, Ly19;->f(Lfy8;)V

    .line 1247
    .line 1248
    .line 1249
    move-object/from16 v5, v24

    .line 1250
    .line 1251
    const/4 v0, 0x0

    .line 1252
    invoke-virtual {v5, v0}, Ll59;->g1(Z)Lf59;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v0

    .line 1256
    if-eqz v0, :cond_2a

    .line 1257
    .line 1258
    invoke-virtual {v9, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1259
    .line 1260
    .line 1261
    move-result v0

    .line 1262
    if-eqz v0, :cond_2a

    .line 1263
    .line 1264
    invoke-static {v8}, Ly19;->f(Lfy8;)V

    .line 1265
    .line 1266
    .line 1267
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1268
    .line 1269
    .line 1270
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1271
    .line 1272
    .line 1273
    move-result-wide v0

    .line 1274
    iget-object v2, v8, Lo79;->B:Lr38;

    .line 1275
    .line 1276
    const/4 v13, 0x1

    .line 1277
    invoke-virtual {v2, v13, v13, v0, v1}, Lr38;->e(ZZJ)Z

    .line 1278
    .line 1279
    .line 1280
    :cond_2a
    :goto_1d
    return-void

    .line 1281
    :cond_2b
    invoke-static {v15}, Ly19;->g(Ly29;)V

    .line 1282
    .line 1283
    .line 1284
    iget-object v0, v15, Lpz8;->I:Lmz8;

    .line 1285
    .line 1286
    const-string v1, "Event not sent since app measurement is disabled"

    .line 1287
    .line 1288
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 1289
    .line 1290
    .line 1291
    return-void
.end method

.method public final m1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V
    .locals 11

    .line 1
    iget-object v2, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v2, Ly19;

    .line 4
    .line 5
    const/4 v4, 0x0

    .line 6
    const/16 v5, 0x18

    .line 7
    .line 8
    if-eqz p4, :cond_0

    .line 9
    .line 10
    iget-object v6, v2, Ly19;->E:Ld99;

    .line 11
    .line 12
    invoke-static {v6}, Ly19;->e(Lin8;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v6, p2}, Ld99;->l2(Ljava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v6

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    iget-object v6, v2, Ly19;->E:Ld99;

    .line 21
    .line 22
    invoke-static {v6}, Ly19;->e(Lin8;)V

    .line 23
    .line 24
    .line 25
    const-string v7, "user property"

    .line 26
    .line 27
    invoke-virtual {v6, v7, p2}, Ld99;->f2(Ljava/lang/String;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    const/4 v9, 0x6

    .line 32
    if-nez v8, :cond_1

    .line 33
    .line 34
    :goto_0
    move v6, v9

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    sget-object v8, Lar7;->y0:[Ljava/lang/String;

    .line 37
    .line 38
    const/4 v10, 0x0

    .line 39
    invoke-virtual {v6, v7, v8, v10, p2}, Ld99;->h2(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-nez v8, :cond_2

    .line 44
    .line 45
    const/16 v6, 0xf

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_2
    iget-object v8, v6, Lin8;->w:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v8, Ly19;

    .line 51
    .line 52
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v6, v5, v7, p2}, Ld99;->i2(ILjava/lang/String;Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    if-nez v6, :cond_3

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    move v6, v4

    .line 63
    :goto_1
    iget-object v7, p0, Lv49;->R:Lrg4;

    .line 64
    .line 65
    const/4 v8, 0x1

    .line 66
    if-eqz v6, :cond_5

    .line 67
    .line 68
    iget-object v0, v2, Ly19;->E:Ld99;

    .line 69
    .line 70
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 71
    .line 72
    .line 73
    invoke-static {v5, p2, v8}, Ld99;->j1(ILjava/lang/String;Z)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    if-eqz p2, :cond_4

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result v4

    .line 83
    :cond_4
    iget-object v1, v2, Ly19;->E:Ld99;

    .line 84
    .line 85
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 86
    .line 87
    .line 88
    const/4 v1, 0x0

    .line 89
    const-string v2, "_ev"

    .line 90
    .line 91
    move-object p4, v0

    .line 92
    move-object p1, v1

    .line 93
    move-object p3, v2

    .line 94
    move/from16 p5, v4

    .line 95
    .line 96
    move p2, v6

    .line 97
    move-object p0, v7

    .line 98
    invoke-static/range {p0 .. p5}, Ld99;->u1(Lc99;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    move-object v6, v7

    .line 103
    if-nez p1, :cond_6

    .line 104
    .line 105
    const-string v7, "app"

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_6
    move-object v7, p1

    .line 109
    :goto_2
    if-eqz p3, :cond_b

    .line 110
    .line 111
    iget-object v9, v2, Ly19;->E:Ld99;

    .line 112
    .line 113
    iget-object v10, v2, Ly19;->E:Ld99;

    .line 114
    .line 115
    invoke-static {v9}, Ly19;->e(Lin8;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, p2, p3}, Ld99;->r1(Ljava/lang/String;Ljava/lang/Object;)I

    .line 119
    .line 120
    .line 121
    move-result v9

    .line 122
    if-eqz v9, :cond_9

    .line 123
    .line 124
    invoke-static {v10}, Ly19;->e(Lin8;)V

    .line 125
    .line 126
    .line 127
    invoke-static {v5, p2, v8}, Ld99;->j1(ILjava/lang/String;Z)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    instance-of v2, p3, Ljava/lang/String;

    .line 132
    .line 133
    if-nez v2, :cond_7

    .line 134
    .line 135
    instance-of v2, p3, Ljava/lang/CharSequence;

    .line 136
    .line 137
    if-eqz v2, :cond_8

    .line 138
    .line 139
    :cond_7
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    :cond_8
    invoke-static {v10}, Ly19;->e(Lin8;)V

    .line 148
    .line 149
    .line 150
    const/4 v0, 0x0

    .line 151
    const-string v2, "_ev"

    .line 152
    .line 153
    move-object p1, v0

    .line 154
    move-object p4, v1

    .line 155
    move-object p3, v2

    .line 156
    move/from16 p5, v4

    .line 157
    .line 158
    move-object p0, v6

    .line 159
    move p2, v9

    .line 160
    invoke-static/range {p0 .. p5}, Ld99;->u1(Lc99;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V

    .line 161
    .line 162
    .line 163
    return-void

    .line 164
    :cond_9
    invoke-static {v10}, Ly19;->e(Lin8;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v10, p2, p3}, Ld99;->s1(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v4

    .line 171
    if-eqz v4, :cond_a

    .line 172
    .line 173
    iget-object v8, v2, Ly19;->C:Lr19;

    .line 174
    .line 175
    invoke-static {v8}, Ly19;->g(Ly29;)V

    .line 176
    .line 177
    .line 178
    new-instance v0, Lrk7;

    .line 179
    .line 180
    move-object v2, v7

    .line 181
    const/4 v7, 0x2

    .line 182
    move-object v1, p0

    .line 183
    move-object v3, p2

    .line 184
    move-wide/from16 v5, p5

    .line 185
    .line 186
    invoke-direct/range {v0 .. v7}, Lrk7;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;JI)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v8, v0}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 190
    .line 191
    .line 192
    :cond_a
    return-void

    .line 193
    :cond_b
    iget-object v8, v2, Ly19;->C:Lr19;

    .line 194
    .line 195
    invoke-static {v8}, Ly19;->g(Ly29;)V

    .line 196
    .line 197
    .line 198
    new-instance v0, Lrk7;

    .line 199
    .line 200
    move-object v2, v7

    .line 201
    const/4 v7, 0x2

    .line 202
    const/4 v4, 0x0

    .line 203
    move-object v1, p0

    .line 204
    move-object v3, p2

    .line 205
    move-wide/from16 v5, p5

    .line 206
    .line 207
    invoke-direct/range {v0 .. v7}, Lrk7;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;JI)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v8, v0}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 211
    .line 212
    .line 213
    return-void
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
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
.end method

.method public final n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    iget-object v2, p0, Lin8;->w:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v2, Ly19;

    .line 6
    .line 7
    invoke-static/range {p4 .. p4}, Lz65;->h(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static/range {p5 .. p5}, Lz65;->h(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 17
    .line 18
    .line 19
    const-string v1, "allow_personalized_ads"

    .line 20
    .line 21
    move-object/from16 v3, p5

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    const/4 v4, 0x1

    .line 28
    if-eqz v1, :cond_4

    .line 29
    .line 30
    instance-of v1, v0, Ljava/lang/String;

    .line 31
    .line 32
    const-string v5, "_npa"

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    move-object v1, v0

    .line 37
    check-cast v1, Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result v6

    .line 43
    if-nez v6, :cond_2

    .line 44
    .line 45
    sget-object v0, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const-string v1, "false"

    .line 52
    .line 53
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const-wide/16 v6, 0x1

    .line 58
    .line 59
    if-eq v4, v0, :cond_0

    .line 60
    .line 61
    const-wide/16 v8, 0x0

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    move-wide v8, v6

    .line 65
    :goto_0
    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v3, v2, Ly19;->A:Lq09;

    .line 70
    .line 71
    invoke-static {v3}, Ly19;->e(Lin8;)V

    .line 72
    .line 73
    .line 74
    iget-object v3, v3, Lq09;->I:Ll90;

    .line 75
    .line 76
    cmp-long v6, v8, v6

    .line 77
    .line 78
    if-nez v6, :cond_1

    .line 79
    .line 80
    const-string v1, "true"

    .line 81
    .line 82
    :cond_1
    invoke-virtual {v3, v1}, Ll90;->k(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    if-nez v0, :cond_3

    .line 87
    .line 88
    iget-object v1, v2, Ly19;->A:Lq09;

    .line 89
    .line 90
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 91
    .line 92
    .line 93
    iget-object v1, v1, Lq09;->I:Ll90;

    .line 94
    .line 95
    const-string v3, "unset"

    .line 96
    .line 97
    invoke-virtual {v1, v3}, Ll90;->k(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_3
    move-object v5, v3

    .line 102
    :goto_1
    iget-object v1, v2, Ly19;->B:Lpz8;

    .line 103
    .line 104
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 105
    .line 106
    .line 107
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 108
    .line 109
    const-string v3, "Setting user property(FE)"

    .line 110
    .line 111
    const-string v6, "non_personalized_ads(_npa)"

    .line 112
    .line 113
    invoke-virtual {v1, v6, v0, v3}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    move-object v11, v5

    .line 117
    :goto_2
    move-object v10, v0

    .line 118
    goto :goto_3

    .line 119
    :cond_4
    move-object v11, v3

    .line 120
    goto :goto_2

    .line 121
    :goto_3
    invoke-virtual {v2}, Ly19;->a()Z

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    if-nez v0, :cond_5

    .line 126
    .line 127
    iget-object v0, v2, Ly19;->B:Lpz8;

    .line 128
    .line 129
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 130
    .line 131
    .line 132
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 133
    .line 134
    const-string v1, "User property not set since app measurement is disabled"

    .line 135
    .line 136
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    return-void

    .line 140
    :cond_5
    invoke-virtual {v2}, Ly19;->c()Z

    .line 141
    .line 142
    .line 143
    move-result v0

    .line 144
    if-nez v0, :cond_6

    .line 145
    .line 146
    return-void

    .line 147
    :cond_6
    new-instance v7, Lz89;

    .line 148
    .line 149
    move-wide v8, p1

    .line 150
    move-object/from16 v12, p4

    .line 151
    .line 152
    invoke-direct/range {v7 .. v12}, Lz89;-><init>(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ly19;->j()Lr69;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v0}, Lfy8;->d1()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v0}, Lr69;->o1()V

    .line 166
    .line 167
    .line 168
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v1, Ly19;

    .line 171
    .line 172
    invoke-virtual {v1}, Ly19;->i()Lcz8;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 180
    .line 181
    .line 182
    move-result-object v2

    .line 183
    invoke-static {v7, v2}, Lg39;->b(Lz89;Landroid/os/Parcel;)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v2}, Landroid/os/Parcel;->marshall()[B

    .line 187
    .line 188
    .line 189
    move-result-object v3

    .line 190
    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V

    .line 191
    .line 192
    .line 193
    array-length v2, v3

    .line 194
    const/high16 v5, 0x20000

    .line 195
    .line 196
    if-le v2, v5, :cond_7

    .line 197
    .line 198
    iget-object v1, v1, Lin8;->w:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v1, Ly19;

    .line 201
    .line 202
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 203
    .line 204
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 205
    .line 206
    .line 207
    iget-object v1, v1, Lpz8;->C:Lmz8;

    .line 208
    .line 209
    const-string v2, "User property too long for local database. Sending directly to service"

    .line 210
    .line 211
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 212
    .line 213
    .line 214
    const/4 v1, 0x0

    .line 215
    goto :goto_4

    .line 216
    :cond_7
    invoke-virtual {v1, v4, v3}, Lcz8;->j1(I[B)Z

    .line 217
    .line 218
    .line 219
    move-result v1

    .line 220
    :goto_4
    invoke-virtual {v0, v4}, Lr69;->s1(Z)Lz99;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    new-instance v3, Lhy8;

    .line 225
    .line 226
    const/4 v4, 0x1

    .line 227
    move-object p1, v0

    .line 228
    move/from16 p3, v1

    .line 229
    .line 230
    move-object p2, v2

    .line 231
    move-object p0, v3

    .line 232
    move/from16 p5, v4

    .line 233
    .line 234
    move-object/from16 p4, v7

    .line 235
    .line 236
    invoke-direct/range {p0 .. p5}, Lhy8;-><init>(Lr69;Lz99;ZLa3;I)V

    .line 237
    .line 238
    .line 239
    move-object v1, p0

    .line 240
    invoke-virtual {v0, v1}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 241
    .line 242
    .line 243
    return-void
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
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
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
.end method

.method public final o1()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ly19;

    .line 10
    .line 11
    invoke-virtual {v0}, Ly19;->c()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto/16 :goto_0

    .line 18
    .line 19
    :cond_0
    iget-object v1, v0, Ly19;->z:Ltp8;

    .line 20
    .line 21
    iget-object v2, v1, Lin8;->w:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v2, Ly19;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-string v2, "google_analytics_deferred_deep_link_enabled"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ltp8;->p1(Ljava/lang/String;)Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    if-eqz v1, :cond_1

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_1

    .line 41
    .line 42
    iget-object v1, v0, Ly19;->B:Lpz8;

    .line 43
    .line 44
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 45
    .line 46
    .line 47
    iget-object v1, v1, Lpz8;->I:Lmz8;

    .line 48
    .line 49
    const-string v2, "Deferred Deep Link feature enabled."

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, Ly19;->C:Lr19;

    .line 55
    .line 56
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 57
    .line 58
    .line 59
    new-instance v2, Lo39;

    .line 60
    .line 61
    const/4 v3, 0x2

    .line 62
    invoke-direct {v2, p0, v3}, Lo39;-><init>(Lv49;I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-virtual {v0}, Ly19;->j()Lr69;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Lcx8;->b1()V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1}, Lfy8;->d1()V

    .line 76
    .line 77
    .line 78
    const/4 v2, 0x1

    .line 79
    invoke-virtual {v1, v2}, Lr69;->s1(Z)Lz99;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    invoke-virtual {v1}, Lr69;->o1()V

    .line 84
    .line 85
    .line 86
    iget-object v4, v1, Lin8;->w:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v4, Ly19;

    .line 89
    .line 90
    iget-object v5, v4, Ly19;->z:Ltp8;

    .line 91
    .line 92
    sget-object v6, Lby8;->W0:Lay8;

    .line 93
    .line 94
    const/4 v7, 0x0

    .line 95
    invoke-virtual {v5, v7, v6}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 96
    .line 97
    .line 98
    invoke-virtual {v4}, Ly19;->i()Lcz8;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    const/4 v5, 0x3

    .line 103
    const/4 v6, 0x0

    .line 104
    new-array v8, v6, [B

    .line 105
    .line 106
    invoke-virtual {v4, v5, v8}, Lcz8;->j1(I[B)Z

    .line 107
    .line 108
    .line 109
    new-instance v4, Lv59;

    .line 110
    .line 111
    invoke-direct {v4, v1, v3, v2}, Lv59;-><init>(Lr69;Lz99;I)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v4}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 115
    .line 116
    .line 117
    iput-boolean v6, p0, Lv49;->N:Z

    .line 118
    .line 119
    iget-object v1, v0, Ly19;->A:Lq09;

    .line 120
    .line 121
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Lin8;->b1()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    const-string v3, "previous_os_version"

    .line 132
    .line 133
    invoke-interface {v2, v3, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v4, v1, Lin8;->w:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v4, Ly19;

    .line 140
    .line 141
    invoke-virtual {v4}, Ly19;->k()Lkr8;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    invoke-virtual {v4}, Ly29;->e1()V

    .line 146
    .line 147
    .line 148
    sget-object v4, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 149
    .line 150
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 151
    .line 152
    .line 153
    move-result v5

    .line 154
    if-nez v5, :cond_2

    .line 155
    .line 156
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v5

    .line 160
    if-nez v5, :cond_2

    .line 161
    .line 162
    invoke-virtual {v1}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 171
    .line 172
    .line 173
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 174
    .line 175
    .line 176
    :cond_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 177
    .line 178
    .line 179
    move-result v1

    .line 180
    if-nez v1, :cond_3

    .line 181
    .line 182
    invoke-virtual {v0}, Ly19;->k()Lkr8;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v0}, Ly29;->e1()V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v0

    .line 193
    if-nez v0, :cond_3

    .line 194
    .line 195
    new-instance v0, Landroid/os/Bundle;

    .line 196
    .line 197
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 198
    .line 199
    .line 200
    const-string v1, "_po"

    .line 201
    .line 202
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 203
    .line 204
    .line 205
    const-string v1, "auto"

    .line 206
    .line 207
    const-string v2, "_ou"

    .line 208
    .line 209
    invoke-virtual {p0, v1, v2, v0}, Lv49;->j1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    .line 210
    .line 211
    .line 212
    :cond_3
    :goto_0
    return-void
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
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

.method public final p1(Landroid/os/Bundle;J)V
    .locals 12

    .line 1
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly19;

    .line 4
    .line 5
    invoke-static {p1}, Lz65;->k(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Landroid/os/Bundle;

    .line 9
    .line 10
    invoke-direct {v1, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "app_id"

    .line 14
    .line 15
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-nez v2, :cond_0

    .line 24
    .line 25
    iget-object v2, v0, Ly19;->B:Lpz8;

    .line 26
    .line 27
    invoke-static {v2}, Ly19;->g(Ly29;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, v2, Lpz8;->E:Lmz8;

    .line 31
    .line 32
    const-string v3, "Package name should be null when calling setConditionalUserProperty"

    .line 33
    .line 34
    invoke-virtual {v2, v3}, Lmz8;->a(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    :cond_0
    invoke-virtual {v1, p1}, Landroid/os/Bundle;->remove(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-class v2, Ljava/lang/String;

    .line 41
    .line 42
    const/4 v3, 0x0

    .line 43
    invoke-static {v1, p1, v2, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    const-string p1, "origin"

    .line 47
    .line 48
    invoke-static {v1, p1, v2, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    const-string v4, "name"

    .line 52
    .line 53
    invoke-static {v1, v4, v2, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    const-class v5, Ljava/lang/Object;

    .line 57
    .line 58
    const-string v6, "value"

    .line 59
    .line 60
    invoke-static {v1, v6, v5, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    const-string v5, "trigger_event_name"

    .line 64
    .line 65
    invoke-static {v1, v5, v2, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    const-wide/16 v7, 0x0

    .line 69
    .line 70
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const-string v8, "trigger_timeout"

    .line 75
    .line 76
    const-class v9, Ljava/lang/Long;

    .line 77
    .line 78
    invoke-static {v1, v8, v9, v7}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    const-string v10, "timed_out_event_name"

    .line 82
    .line 83
    invoke-static {v1, v10, v2, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    const-string v10, "timed_out_event_params"

    .line 87
    .line 88
    const-class v11, Landroid/os/Bundle;

    .line 89
    .line 90
    invoke-static {v1, v10, v11, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    const-string v10, "triggered_event_name"

    .line 94
    .line 95
    invoke-static {v1, v10, v2, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    const-string v10, "triggered_event_params"

    .line 99
    .line 100
    invoke-static {v1, v10, v11, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const-string v10, "time_to_live"

    .line 104
    .line 105
    invoke-static {v1, v10, v9, v7}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    const-string v7, "expired_event_name"

    .line 109
    .line 110
    invoke-static {v1, v7, v2, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    const-string v2, "expired_event_params"

    .line 114
    .line 115
    invoke-static {v1, v2, v11, v3}, Lp25;->I(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-static {v2}, Lz65;->h(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1, p1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-static {p1}, Lz65;->h(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    invoke-static {p1}, Lz65;->k(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    const-string p1, "creation_timestamp"

    .line 140
    .line 141
    invoke-virtual {v1, p1, p2, p3}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p1

    .line 148
    invoke-virtual {v1, v6}, Landroid/os/BaseBundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object p2

    .line 152
    iget-object p3, v0, Ly19;->E:Ld99;

    .line 153
    .line 154
    iget-object v2, v0, Ly19;->F:Lfz8;

    .line 155
    .line 156
    iget-object v3, v0, Ly19;->B:Lpz8;

    .line 157
    .line 158
    invoke-static {p3}, Ly19;->e(Lin8;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p3, p1}, Ld99;->l2(Ljava/lang/String;)I

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-nez v4, :cond_7

    .line 166
    .line 167
    invoke-static {p3}, Ly19;->e(Lin8;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p3, p1, p2}, Ld99;->r1(Ljava/lang/String;Ljava/lang/Object;)I

    .line 171
    .line 172
    .line 173
    move-result v4

    .line 174
    if-nez v4, :cond_6

    .line 175
    .line 176
    invoke-virtual {p3, p1, p2}, Ld99;->s1(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    if-nez p3, :cond_1

    .line 181
    .line 182
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 183
    .line 184
    .line 185
    iget-object p0, v3, Lpz8;->B:Lmz8;

    .line 186
    .line 187
    invoke-virtual {v2, p1}, Lfz8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object p1

    .line 191
    const-string p3, "Unable to normalize conditional user property value"

    .line 192
    .line 193
    invoke-virtual {p0, p1, p2, p3}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    return-void

    .line 197
    :cond_1
    invoke-static {v1, p3}, Lp25;->H(Landroid/os/Bundle;Ljava/lang/Object;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v1, v8}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 201
    .line 202
    .line 203
    move-result-wide p2

    .line 204
    invoke-virtual {v1, v5}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 205
    .line 206
    .line 207
    move-result-object v4

    .line 208
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 209
    .line 210
    .line 211
    move-result v4

    .line 212
    const-wide/16 v5, 0x1

    .line 213
    .line 214
    const-wide v7, 0x39ef8b000L

    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    if-nez v4, :cond_3

    .line 220
    .line 221
    cmp-long v4, p2, v7

    .line 222
    .line 223
    if-gtz v4, :cond_2

    .line 224
    .line 225
    cmp-long v4, p2, v5

    .line 226
    .line 227
    if-gez v4, :cond_3

    .line 228
    .line 229
    :cond_2
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 230
    .line 231
    .line 232
    iget-object p0, v3, Lpz8;->B:Lmz8;

    .line 233
    .line 234
    invoke-virtual {v2, p1}, Lfz8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p1

    .line 238
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 239
    .line 240
    .line 241
    move-result-object p2

    .line 242
    const-string p3, "Invalid conditional user property timeout"

    .line 243
    .line 244
    invoke-virtual {p0, p1, p2, p3}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-void

    .line 248
    :cond_3
    invoke-virtual {v1, v10}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 249
    .line 250
    .line 251
    move-result-wide p2

    .line 252
    cmp-long v4, p2, v7

    .line 253
    .line 254
    if-gtz v4, :cond_5

    .line 255
    .line 256
    cmp-long v4, p2, v5

    .line 257
    .line 258
    if-gez v4, :cond_4

    .line 259
    .line 260
    goto :goto_0

    .line 261
    :cond_4
    iget-object p1, v0, Ly19;->C:Lr19;

    .line 262
    .line 263
    invoke-static {p1}, Ly19;->g(Ly29;)V

    .line 264
    .line 265
    .line 266
    new-instance p2, La49;

    .line 267
    .line 268
    const/4 p3, 0x0

    .line 269
    invoke-direct {p2, p0, v1, p3}, La49;-><init>(Lv49;Landroid/os/Bundle;I)V

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, p2}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 273
    .line 274
    .line 275
    return-void

    .line 276
    :cond_5
    :goto_0
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 277
    .line 278
    .line 279
    iget-object p0, v3, Lpz8;->B:Lmz8;

    .line 280
    .line 281
    invoke-virtual {v2, p1}, Lfz8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object p1

    .line 285
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 286
    .line 287
    .line 288
    move-result-object p2

    .line 289
    const-string p3, "Invalid conditional user property time to live"

    .line 290
    .line 291
    invoke-virtual {p0, p1, p2, p3}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    return-void

    .line 295
    :cond_6
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 296
    .line 297
    .line 298
    iget-object p0, v3, Lpz8;->B:Lmz8;

    .line 299
    .line 300
    invoke-virtual {v2, p1}, Lfz8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 301
    .line 302
    .line 303
    move-result-object p1

    .line 304
    const-string p3, "Invalid conditional user property value"

    .line 305
    .line 306
    invoke-virtual {p0, p1, p2, p3}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-void

    .line 310
    :cond_7
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 311
    .line 312
    .line 313
    iget-object p0, v3, Lpz8;->B:Lmz8;

    .line 314
    .line 315
    invoke-virtual {v2, p1}, Lfz8;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 316
    .line 317
    .line 318
    move-result-object p1

    .line 319
    const-string p2, "Invalid conditional user property name"

    .line 320
    .line 321
    invoke-virtual {p0, p2, p1}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 322
    .line 323
    .line 324
    return-void
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
.end method

.method public final q1(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 5

    .line 1
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly19;

    .line 4
    .line 5
    iget-object v1, v0, Ly19;->G:Lxb4;

    .line 6
    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    invoke-static {p1}, Lz65;->h(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    new-instance v3, Landroid/os/Bundle;

    .line 18
    .line 19
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 20
    .line 21
    .line 22
    const-string v4, "name"

    .line 23
    .line 24
    invoke-virtual {v3, v4, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const-string p1, "creation_timestamp"

    .line 28
    .line 29
    invoke-virtual {v3, p1, v1, v2}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 30
    .line 31
    .line 32
    if-eqz p2, :cond_0

    .line 33
    .line 34
    const-string p1, "expired_event_name"

    .line 35
    .line 36
    invoke-virtual {v3, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    const-string p1, "expired_event_params"

    .line 40
    .line 41
    invoke-virtual {v3, p1, p3}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 42
    .line 43
    .line 44
    :cond_0
    iget-object p1, v0, Ly19;->C:Lr19;

    .line 45
    .line 46
    invoke-static {p1}, Ly19;->g(Ly29;)V

    .line 47
    .line 48
    .line 49
    new-instance p2, La49;

    .line 50
    .line 51
    const/4 p3, 0x1

    .line 52
    invoke-direct {p2, p0, v3, p3}, La49;-><init>(Lv49;Landroid/os/Bundle;I)V

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, p2}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final r1()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ly19;

    .line 4
    .line 5
    :try_start_0
    iget-object v0, p0, Ly19;->w:Landroid/content/Context;

    .line 6
    .line 7
    iget-object v1, p0, Ly19;->L:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v0, v1}, Lb35;->F(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p0

    .line 14
    :catch_0
    move-exception v0

    .line 15
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 16
    .line 17
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lpz8;->B:Lmz8;

    .line 21
    .line 22
    const-string v1, "getGoogleAppId failed with exception"

    .line 23
    .line 24
    invoke-virtual {p0, v1, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
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
.end method

.method public final s1(Lh39;JZ)V
    .locals 7

    .line 1
    iget v0, p1, Lh39;->b:I

    .line 2
    .line 3
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lin8;->w:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Ly19;

    .line 12
    .line 13
    iget-object v2, v1, Ly19;->A:Lq09;

    .line 14
    .line 15
    iget-object v3, v1, Ly19;->B:Lpz8;

    .line 16
    .line 17
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lq09;->j1()Lh39;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    iget-wide v4, p0, Lv49;->L:J

    .line 25
    .line 26
    cmp-long v4, p2, v4

    .line 27
    .line 28
    if-gtz v4, :cond_0

    .line 29
    .line 30
    iget v2, v2, Lh39;->b:I

    .line 31
    .line 32
    invoke-static {v2, v0}, Lh39;->l(II)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_0

    .line 37
    .line 38
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 39
    .line 40
    .line 41
    iget-object p0, v3, Lpz8;->H:Lmz8;

    .line 42
    .line 43
    const-string p2, "Dropped out-of-date consent setting, proposed settings"

    .line 44
    .line 45
    invoke-virtual {p0, p2, p1}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :cond_0
    iget-object v2, v1, Ly19;->A:Lq09;

    .line 50
    .line 51
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lin8;->b1()V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const/16 v5, 0x64

    .line 62
    .line 63
    const-string v6, "consent_source"

    .line 64
    .line 65
    invoke-interface {v4, v6, v5}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    invoke-static {v0, v4}, Lh39;->l(II)Z

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-eqz v4, :cond_4

    .line 74
    .line 75
    invoke-virtual {v2}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    invoke-virtual {p1}, Lh39;->g()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    const-string v5, "consent_settings"

    .line 88
    .line 89
    invoke-interface {v2, v5, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 90
    .line 91
    .line 92
    invoke-interface {v2, v6, v0}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 93
    .line 94
    .line 95
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 96
    .line 97
    .line 98
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 99
    .line 100
    .line 101
    iget-object v0, v3, Lpz8;->J:Lmz8;

    .line 102
    .line 103
    const-string v2, "Setting storage consent(FE)"

    .line 104
    .line 105
    invoke-virtual {v0, v2, p1}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 106
    .line 107
    .line 108
    iput-wide p2, p0, Lv49;->L:J

    .line 109
    .line 110
    invoke-virtual {v1}, Ly19;->j()Lr69;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-virtual {p0}, Lr69;->m1()Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_1

    .line 119
    .line 120
    invoke-virtual {v1}, Ly19;->j()Lr69;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 125
    .line 126
    .line 127
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 128
    .line 129
    .line 130
    new-instance p1, Lk69;

    .line 131
    .line 132
    const/4 p2, 0x2

    .line 133
    invoke-direct {p1, p0, p2}, Lk69;-><init>(Lr69;I)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, p1}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 137
    .line 138
    .line 139
    goto :goto_0

    .line 140
    :cond_1
    invoke-virtual {v1}, Ly19;->j()Lr69;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 148
    .line 149
    .line 150
    invoke-virtual {p0}, Lr69;->l1()Z

    .line 151
    .line 152
    .line 153
    move-result p1

    .line 154
    if-eqz p1, :cond_2

    .line 155
    .line 156
    const/4 p1, 0x0

    .line 157
    invoke-virtual {p0, p1}, Lr69;->s1(Z)Lz99;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    new-instance p2, Lv59;

    .line 162
    .line 163
    invoke-direct {p2, p0, p1}, Lv59;-><init>(Lr69;Lz99;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p0, p2}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 167
    .line 168
    .line 169
    :cond_2
    :goto_0
    if-eqz p4, :cond_3

    .line 170
    .line 171
    invoke-virtual {v1}, Ly19;->j()Lr69;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    new-instance p1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 176
    .line 177
    invoke-direct {p1}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, p1}, Lr69;->g1(Ljava/util/concurrent/atomic/AtomicReference;)V

    .line 181
    .line 182
    .line 183
    :cond_3
    return-void

    .line 184
    :cond_4
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 185
    .line 186
    .line 187
    iget-object p0, v3, Lpz8;->H:Lmz8;

    .line 188
    .line 189
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    const-string p2, "Lower precedence consent source ignored, proposed source"

    .line 194
    .line 195
    invoke-virtual {p0, p2, p1}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 196
    .line 197
    .line 198
    return-void
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
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
.end method

.method public final t1(Ljava/lang/Boolean;Z)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v0, Ly19;

    .line 10
    .line 11
    iget-object v1, v0, Ly19;->B:Lpz8;

    .line 12
    .line 13
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 14
    .line 15
    .line 16
    iget-object v1, v1, Lpz8;->I:Lmz8;

    .line 17
    .line 18
    const-string v2, "Setting app measurement enabled (FE)"

    .line 19
    .line 20
    invoke-virtual {v1, v2, p1}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 21
    .line 22
    .line 23
    iget-object v1, v0, Ly19;->A:Lq09;

    .line 24
    .line 25
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lin8;->b1()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "measurement_enabled"

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-interface {v2, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_0
    invoke-interface {v2, v3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 55
    .line 56
    .line 57
    if-eqz p2, :cond_2

    .line 58
    .line 59
    invoke-virtual {v1}, Lin8;->b1()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    invoke-interface {p2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 67
    .line 68
    .line 69
    move-result-object p2

    .line 70
    const-string v1, "measurement_enabled_from_api"

    .line 71
    .line 72
    if-eqz p1, :cond_1

    .line 73
    .line 74
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    invoke-interface {p2, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-interface {p2, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 83
    .line 84
    .line 85
    :goto_1
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 86
    .line 87
    .line 88
    :cond_2
    iget-object p2, v0, Ly19;->C:Lr19;

    .line 89
    .line 90
    invoke-static {p2}, Ly19;->g(Ly29;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p2}, Lr19;->b1()V

    .line 94
    .line 95
    .line 96
    iget-boolean p2, v0, Ly19;->V:Z

    .line 97
    .line 98
    if-nez p2, :cond_4

    .line 99
    .line 100
    if-eqz p1, :cond_3

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    return-void

    .line 110
    :cond_4
    :goto_2
    invoke-virtual {p0}, Lv49;->u1()V

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
.end method

.method public final u1()V
    .locals 9

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    iget-object v1, p0, Lin8;->w:Ljava/lang/Object;

    .line 5
    .line 6
    move-object v6, v1

    .line 7
    check-cast v6, Ly19;

    .line 8
    .line 9
    iget-object v1, v6, Ly19;->A:Lq09;

    .line 10
    .line 11
    iget-object v7, v6, Ly19;->B:Lpz8;

    .line 12
    .line 13
    iget-object v2, v6, Ly19;->G:Lxb4;

    .line 14
    .line 15
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 16
    .line 17
    .line 18
    iget-object v1, v1, Lq09;->I:Ll90;

    .line 19
    .line 20
    invoke-virtual {v1}, Ll90;->j()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    const/4 v8, 0x1

    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    const-string v3, "unset"

    .line 28
    .line 29
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 39
    .line 40
    .line 41
    move-result-wide v1

    .line 42
    const-string v5, "_npa"

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    const-string v4, "app"

    .line 46
    .line 47
    move-object v0, p0

    .line 48
    invoke-virtual/range {v0 .. v5}, Lv49;->n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_0
    const-string v0, "true"

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eq v8, v0, :cond_1

    .line 59
    .line 60
    const-wide/16 v0, 0x0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    const-wide/16 v0, 0x1

    .line 64
    .line 65
    :goto_0
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 73
    .line 74
    .line 75
    move-result-wide v1

    .line 76
    const-string v4, "app"

    .line 77
    .line 78
    const-string v5, "_npa"

    .line 79
    .line 80
    move-object v0, p0

    .line 81
    invoke-virtual/range {v0 .. v5}, Lv49;->n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    :cond_2
    :goto_1
    invoke-virtual {v6}, Ly19;->a()Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    iget-boolean v1, p0, Lv49;->N:Z

    .line 91
    .line 92
    if-eqz v1, :cond_3

    .line 93
    .line 94
    invoke-static {v7}, Ly19;->g(Ly29;)V

    .line 95
    .line 96
    .line 97
    iget-object v1, v7, Lpz8;->I:Lmz8;

    .line 98
    .line 99
    const-string v2, "Recording app launch after enabling measurement for the first time (FE)"

    .line 100
    .line 101
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {p0}, Lv49;->o1()V

    .line 105
    .line 106
    .line 107
    iget-object v1, v6, Ly19;->D:Lo79;

    .line 108
    .line 109
    invoke-static {v1}, Ly19;->f(Lfy8;)V

    .line 110
    .line 111
    .line 112
    iget-object v1, v1, Lo79;->A:Luy5;

    .line 113
    .line 114
    invoke-virtual {v1}, Luy5;->k()V

    .line 115
    .line 116
    .line 117
    iget-object v1, v6, Ly19;->C:Lr19;

    .line 118
    .line 119
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 120
    .line 121
    .line 122
    new-instance v2, Lo39;

    .line 123
    .line 124
    invoke-direct {v2, p0, v8}, Lo39;-><init>(Lv49;I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v1, v2}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 128
    .line 129
    .line 130
    return-void

    .line 131
    :cond_3
    invoke-static {v7}, Ly19;->g(Ly29;)V

    .line 132
    .line 133
    .line 134
    iget-object v0, v7, Lpz8;->I:Lmz8;

    .line 135
    .line 136
    const-string v1, "Updating Scion state (FE)"

    .line 137
    .line 138
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v6}, Ly19;->j()Lr69;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {v0}, Lfy8;->d1()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v8}, Lr69;->s1(Z)Lz99;

    .line 152
    .line 153
    .line 154
    move-result-object v1

    .line 155
    new-instance v2, Lv59;

    .line 156
    .line 157
    const/4 v3, 0x3

    .line 158
    invoke-direct {v2, v0, v1, v3}, Lv59;-><init>(Lr69;Lz99;I)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v2}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 162
    .line 163
    .line 164
    return-void
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
.end method

.method public final v1()V
    .locals 2

    .line 1
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ly19;

    .line 4
    .line 5
    iget-object v1, v0, Ly19;->w:Landroid/content/Context;

    .line 6
    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    instance-of v1, v1, Landroid/app/Application;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iget-object v1, p0, Lv49;->y:Lzb2;

    .line 16
    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    iget-object v0, v0, Ly19;->w:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    check-cast v0, Landroid/app/Application;

    .line 26
    .line 27
    iget-object p0, p0, Lv49;->y:Lzb2;

    .line 28
    .line 29
    invoke-virtual {v0, p0}, Landroid/app/Application;->unregisterActivityLifecycleCallbacks(Landroid/app/Application$ActivityLifecycleCallbacks;)V

    .line 30
    .line 31
    .line 32
    :cond_0
    return-void
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

.method public final w1(Landroid/os/Bundle;IJ)V
    .locals 10

    .line 1
    iget-object v3, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v3, Ly19;

    .line 4
    .line 5
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 6
    .line 7
    .line 8
    sget-object v4, Lh39;->c:Lh39;

    .line 9
    .line 10
    sget-object v4, Ld39;->x:Ld39;

    .line 11
    .line 12
    iget-object v4, v4, Ld39;->w:[Lf39;

    .line 13
    .line 14
    array-length v5, v4

    .line 15
    const/4 v6, 0x0

    .line 16
    :goto_0
    const/4 v7, 0x0

    .line 17
    if-ge v6, v5, :cond_3

    .line 18
    .line 19
    aget-object v8, v4, v6

    .line 20
    .line 21
    iget-object v8, v8, Lf39;->w:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p1, v8}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v9

    .line 27
    if-eqz v9, :cond_2

    .line 28
    .line 29
    invoke-virtual {p1, v8}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v8

    .line 33
    if-eqz v8, :cond_2

    .line 34
    .line 35
    const-string v9, "granted"

    .line 36
    .line 37
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v9

    .line 41
    if-eqz v9, :cond_0

    .line 42
    .line 43
    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_0
    const-string v9, "denied"

    .line 47
    .line 48
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v9

    .line 52
    if-eqz v9, :cond_1

    .line 53
    .line 54
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_1
    move-object v9, v7

    .line 58
    :goto_1
    if-nez v9, :cond_2

    .line 59
    .line 60
    goto :goto_2

    .line 61
    :cond_2
    add-int/lit8 v6, v6, 0x1

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move-object v8, v7

    .line 65
    :goto_2
    if-eqz v8, :cond_4

    .line 66
    .line 67
    iget-object v4, v3, Ly19;->B:Lpz8;

    .line 68
    .line 69
    invoke-static {v4}, Ly19;->g(Ly29;)V

    .line 70
    .line 71
    .line 72
    iget-object v4, v4, Lpz8;->G:Lmz8;

    .line 73
    .line 74
    const-string v5, "Ignoring invalid consent setting"

    .line 75
    .line 76
    invoke-virtual {v4, v5, v8}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v4, v3, Ly19;->B:Lpz8;

    .line 80
    .line 81
    invoke-static {v4}, Ly19;->g(Ly29;)V

    .line 82
    .line 83
    .line 84
    iget-object v4, v4, Lpz8;->G:Lmz8;

    .line 85
    .line 86
    const-string v5, "Valid consent values are \'granted\', \'denied\'"

    .line 87
    .line 88
    invoke-virtual {v4, v5}, Lmz8;->a(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_4
    iget-object v3, v3, Ly19;->C:Lr19;

    .line 92
    .line 93
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v3}, Lr19;->i1()Z

    .line 97
    .line 98
    .line 99
    move-result v3

    .line 100
    invoke-static {p2, p1}, Lh39;->b(ILandroid/os/Bundle;)Lh39;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    iget-object v5, v4, Lh39;->a:Ljava/util/EnumMap;

    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 111
    .line 112
    .line 113
    move-result-object v5

    .line 114
    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 115
    .line 116
    .line 117
    move-result v6

    .line 118
    sget-object v8, Lc39;->x:Lc39;

    .line 119
    .line 120
    if-eqz v6, :cond_6

    .line 121
    .line 122
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v6

    .line 126
    check-cast v6, Lc39;

    .line 127
    .line 128
    if-eq v6, v8, :cond_5

    .line 129
    .line 130
    invoke-virtual {p0, v4, v3}, Lv49;->y1(Lh39;Z)V

    .line 131
    .line 132
    .line 133
    :cond_6
    invoke-static {p2, p1}, Lir8;->c(ILandroid/os/Bundle;)Lir8;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    iget-object v5, v4, Lir8;->e:Ljava/util/EnumMap;

    .line 138
    .line 139
    invoke-virtual {v5}, Ljava/util/EnumMap;->values()Ljava/util/Collection;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-interface {v5}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 144
    .line 145
    .line 146
    move-result-object v5

    .line 147
    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_8

    .line 152
    .line 153
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object v6

    .line 157
    check-cast v6, Lc39;

    .line 158
    .line 159
    if-eq v6, v8, :cond_7

    .line 160
    .line 161
    invoke-virtual {p0, v4, v3}, Lv49;->x1(Lir8;Z)V

    .line 162
    .line 163
    .line 164
    :cond_8
    if-nez p1, :cond_9

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_9
    const-string v4, "ad_personalization"

    .line 168
    .line 169
    invoke-virtual {p1, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    invoke-static {v1}, Lh39;->d(Ljava/lang/String;)Lc39;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    const/4 v4, 0x2

    .line 182
    if-eq v1, v4, :cond_b

    .line 183
    .line 184
    const/4 v4, 0x3

    .line 185
    if-eq v1, v4, :cond_a

    .line 186
    .line 187
    goto :goto_3

    .line 188
    :cond_a
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 189
    .line 190
    goto :goto_3

    .line 191
    :cond_b
    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 192
    .line 193
    :goto_3
    if-eqz v7, :cond_e

    .line 194
    .line 195
    const/16 v1, -0x1e

    .line 196
    .line 197
    if-ne p2, v1, :cond_c

    .line 198
    .line 199
    const-string v1, "tcf"

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_c
    const-string v1, "app"

    .line 203
    .line 204
    :goto_4
    if-eqz v3, :cond_d

    .line 205
    .line 206
    invoke-virtual {v7}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v3

    .line 210
    const-string v5, "allow_personalized_ads"

    .line 211
    .line 212
    move-object v0, p0

    .line 213
    move-object v4, v1

    .line 214
    move-wide v1, p3

    .line 215
    invoke-virtual/range {v0 .. v5}, Lv49;->n1(JLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_d
    invoke-virtual {v7}, Ljava/lang/Boolean;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v3

    .line 223
    const-string v2, "allow_personalized_ads"

    .line 224
    .line 225
    const/4 v4, 0x0

    .line 226
    move-object v0, p0

    .line 227
    move-wide v5, p3

    .line 228
    invoke-virtual/range {v0 .. v6}, Lv49;->m1(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;ZJ)V

    .line 229
    .line 230
    .line 231
    :cond_e
    return-void
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
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
.end method

.method public final x1(Lir8;Z)V
    .locals 2

    .line 1
    new-instance v0, Lc49;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1, p0, p1}, Lc49;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lc49;->run()V

    .line 13
    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, Ly19;

    .line 19
    .line 20
    iget-object p0, p0, Ly19;->C:Lr19;

    .line 21
    .line 22
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 26
    .line 27
    .line 28
    return-void
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

.method public final y1(Lh39;Z)V
    .locals 13

    .line 1
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, Lh39;->b:I

    .line 5
    .line 6
    const/16 v1, -0xa

    .line 7
    .line 8
    if-eq v0, v1, :cond_2

    .line 9
    .line 10
    iget-object v2, p1, Lh39;->a:Ljava/util/EnumMap;

    .line 11
    .line 12
    sget-object v3, Lf39;->x:Lf39;

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    check-cast v2, Lc39;

    .line 19
    .line 20
    if-nez v2, :cond_0

    .line 21
    .line 22
    sget-object v2, Lc39;->x:Lc39;

    .line 23
    .line 24
    :cond_0
    sget-object v3, Lc39;->x:Lc39;

    .line 25
    .line 26
    if-ne v2, v3, :cond_2

    .line 27
    .line 28
    iget-object v2, p1, Lh39;->a:Ljava/util/EnumMap;

    .line 29
    .line 30
    sget-object v4, Lf39;->y:Lf39;

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Lc39;

    .line 37
    .line 38
    if-nez v2, :cond_1

    .line 39
    .line 40
    move-object v2, v3

    .line 41
    :cond_1
    if-ne v2, v3, :cond_2

    .line 42
    .line 43
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, Ly19;

    .line 46
    .line 47
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 48
    .line 49
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 50
    .line 51
    .line 52
    iget-object p0, p0, Lpz8;->G:Lmz8;

    .line 53
    .line 54
    const-string p1, "Ignoring empty consent settings"

    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lmz8;->a(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :cond_2
    iget-object v2, p0, Lv49;->D:Ljava/lang/Object;

    .line 61
    .line 62
    monitor-enter v2

    .line 63
    :try_start_0
    iget-object v3, p0, Lv49;->J:Lh39;

    .line 64
    .line 65
    iget v3, v3, Lh39;->b:I

    .line 66
    .line 67
    invoke-static {v0, v3}, Lh39;->l(II)Z

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    const/4 v4, 0x0

    .line 72
    if-eqz v3, :cond_6

    .line 73
    .line 74
    iget-object v3, p0, Lv49;->J:Lh39;

    .line 75
    .line 76
    iget-object v5, p1, Lh39;->a:Ljava/util/EnumMap;

    .line 77
    .line 78
    invoke-virtual {v5}, Ljava/util/EnumMap;->keySet()Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object v6

    .line 82
    new-array v7, v4, [Lf39;

    .line 83
    .line 84
    invoke-interface {v6, v7}, Ljava/util/Set;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v6

    .line 88
    check-cast v6, [Lf39;

    .line 89
    .line 90
    array-length v7, v6

    .line 91
    move v8, v4

    .line 92
    :goto_0
    const/4 v9, 0x1

    .line 93
    if-ge v8, v7, :cond_4

    .line 94
    .line 95
    aget-object v10, v6, v8

    .line 96
    .line 97
    invoke-virtual {v5, v10}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v11

    .line 101
    check-cast v11, Lc39;

    .line 102
    .line 103
    iget-object v12, v3, Lh39;->a:Ljava/util/EnumMap;

    .line 104
    .line 105
    invoke-virtual {v12, v10}, Ljava/util/EnumMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object v10

    .line 109
    check-cast v10, Lc39;

    .line 110
    .line 111
    sget-object v12, Lc39;->z:Lc39;

    .line 112
    .line 113
    if-ne v11, v12, :cond_3

    .line 114
    .line 115
    if-eq v10, v12, :cond_3

    .line 116
    .line 117
    move v3, v9

    .line 118
    goto :goto_1

    .line 119
    :cond_3
    add-int/lit8 v8, v8, 0x1

    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    move v3, v4

    .line 123
    :goto_1
    sget-object v5, Lf39;->y:Lf39;

    .line 124
    .line 125
    invoke-virtual {p1, v5}, Lh39;->i(Lf39;)Z

    .line 126
    .line 127
    .line 128
    move-result v6

    .line 129
    if-eqz v6, :cond_5

    .line 130
    .line 131
    iget-object v6, p0, Lv49;->J:Lh39;

    .line 132
    .line 133
    invoke-virtual {v6, v5}, Lh39;->i(Lf39;)Z

    .line 134
    .line 135
    .line 136
    move-result v5

    .line 137
    if-nez v5, :cond_5

    .line 138
    .line 139
    move v4, v9

    .line 140
    goto :goto_2

    .line 141
    :catchall_0
    move-exception v0

    .line 142
    move-object p0, v0

    .line 143
    goto/16 :goto_6

    .line 144
    .line 145
    :cond_5
    :goto_2
    iget-object v5, p0, Lv49;->J:Lh39;

    .line 146
    .line 147
    invoke-virtual {p1, v5}, Lh39;->k(Lh39;)Lh39;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    iput-object p1, p0, Lv49;->J:Lh39;

    .line 152
    .line 153
    move v8, v4

    .line 154
    move v4, v9

    .line 155
    :goto_3
    move-object v5, p1

    .line 156
    goto :goto_4

    .line 157
    :cond_6
    move v3, v4

    .line 158
    move v8, v3

    .line 159
    goto :goto_3

    .line 160
    :goto_4
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 161
    if-nez v4, :cond_7

    .line 162
    .line 163
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p0, Ly19;

    .line 166
    .line 167
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 168
    .line 169
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 170
    .line 171
    .line 172
    iget-object p0, p0, Lpz8;->H:Lmz8;

    .line 173
    .line 174
    const-string p1, "Ignoring lower-priority consent settings, proposed settings"

    .line 175
    .line 176
    invoke-virtual {p0, p1, v5}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    return-void

    .line 180
    :cond_7
    iget-object p1, p0, Lv49;->K:Ljava/util/concurrent/atomic/AtomicLong;

    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicLong;->getAndIncrement()J

    .line 183
    .line 184
    .line 185
    move-result-wide v6

    .line 186
    if-eqz v3, :cond_9

    .line 187
    .line 188
    iget-object p1, p0, Lv49;->C:Ljava/util/concurrent/atomic/AtomicReference;

    .line 189
    .line 190
    const/4 v0, 0x0

    .line 191
    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    new-instance v3, Le49;

    .line 195
    .line 196
    const/4 v9, 0x0

    .line 197
    move-object v4, p0

    .line 198
    invoke-direct/range {v3 .. v9}, Le49;-><init>(Lv49;Lh39;JZI)V

    .line 199
    .line 200
    .line 201
    if-eqz p2, :cond_8

    .line 202
    .line 203
    invoke-virtual {v4}, Lcx8;->b1()V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v3}, Le49;->run()V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    :cond_8
    iget-object p0, v4, Lin8;->w:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p0, Ly19;

    .line 213
    .line 214
    iget-object p0, p0, Ly19;->C:Lr19;

    .line 215
    .line 216
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p0, v3}, Lr19;->n1(Ljava/lang/Runnable;)V

    .line 220
    .line 221
    .line 222
    return-void

    .line 223
    :cond_9
    move-object v4, p0

    .line 224
    new-instance v3, Le49;

    .line 225
    .line 226
    const/4 v9, 0x1

    .line 227
    invoke-direct/range {v3 .. v9}, Le49;-><init>(Lv49;Lh39;JZI)V

    .line 228
    .line 229
    .line 230
    if-eqz p2, :cond_a

    .line 231
    .line 232
    invoke-virtual {v4}, Lcx8;->b1()V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Le49;->run()V

    .line 236
    .line 237
    .line 238
    return-void

    .line 239
    :cond_a
    const/16 p0, 0x1e

    .line 240
    .line 241
    if-eq v0, p0, :cond_c

    .line 242
    .line 243
    if-ne v0, v1, :cond_b

    .line 244
    .line 245
    goto :goto_5

    .line 246
    :cond_b
    iget-object p0, v4, Lin8;->w:Ljava/lang/Object;

    .line 247
    .line 248
    check-cast p0, Ly19;

    .line 249
    .line 250
    iget-object p0, p0, Ly19;->C:Lr19;

    .line 251
    .line 252
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {p0, v3}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 256
    .line 257
    .line 258
    return-void

    .line 259
    :cond_c
    :goto_5
    iget-object p0, v4, Lin8;->w:Ljava/lang/Object;

    .line 260
    .line 261
    check-cast p0, Ly19;

    .line 262
    .line 263
    iget-object p0, p0, Ly19;->C:Lr19;

    .line 264
    .line 265
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 266
    .line 267
    .line 268
    invoke-virtual {p0, v3}, Lr19;->n1(Ljava/lang/Runnable;)V

    .line 269
    .line 270
    .line 271
    return-void

    .line 272
    :goto_6
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 273
    throw p0
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
.end method

.method public final z1()V
    .locals 8

    .line 1
    invoke-static {}, Lwo8;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast v0, Ly19;

    .line 7
    .line 8
    iget-object v1, v0, Ly19;->z:Ltp8;

    .line 9
    .line 10
    iget-object v2, v0, Ly19;->C:Lr19;

    .line 11
    .line 12
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    sget-object v4, Lby8;->P0:Lay8;

    .line 16
    .line 17
    invoke-virtual {v1, v3, v4}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_3

    .line 22
    .line 23
    invoke-static {v2}, Ly19;->g(Ly29;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lr19;->i1()Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_2

    .line 31
    .line 32
    invoke-static {}, Lts2;->o()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-nez v1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 42
    .line 43
    .line 44
    iget-object v1, v0, Lpz8;->J:Lmz8;

    .line 45
    .line 46
    const-string v3, "Getting trigger URIs (FE)"

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Lmz8;->a(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v3, Ljava/util/concurrent/atomic/AtomicReference;

    .line 52
    .line 53
    invoke-direct {v3}, Ljava/util/concurrent/atomic/AtomicReference;-><init>()V

    .line 54
    .line 55
    .line 56
    invoke-static {v2}, Ly19;->g(Ly29;)V

    .line 57
    .line 58
    .line 59
    new-instance v7, Lz39;

    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    const/4 v4, 0x0

    .line 63
    invoke-direct {v7, p0, v3, v1, v4}, Lz39;-><init>(Lv49;Ljava/util/concurrent/atomic/AtomicReference;IZ)V

    .line 64
    .line 65
    .line 66
    const-wide/16 v4, 0x2710

    .line 67
    .line 68
    const-string v6, "get trigger URIs"

    .line 69
    .line 70
    invoke-virtual/range {v2 .. v7}, Lr19;->m1(Ljava/util/concurrent/atomic/AtomicReference;JLjava/lang/String;Ljava/lang/Runnable;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ljava/util/List;

    .line 78
    .line 79
    if-nez v1, :cond_0

    .line 80
    .line 81
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 82
    .line 83
    .line 84
    iget-object p0, v0, Lpz8;->D:Lmz8;

    .line 85
    .line 86
    const-string v0, "Timed out waiting for get trigger URIs"

    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_0
    invoke-static {v2}, Ly19;->g(Ly29;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Lc49;

    .line 96
    .line 97
    const/4 v3, 0x2

    .line 98
    invoke-direct {v0, v3, p0, v1}, Lc49;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v2, v0}, Lr19;->l1(Ljava/lang/Runnable;)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_1
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 106
    .line 107
    .line 108
    iget-object p0, v0, Lpz8;->B:Lmz8;

    .line 109
    .line 110
    const-string v0, "Cannot get trigger URIs from main thread"

    .line 111
    .line 112
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    return-void

    .line 116
    :cond_2
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 117
    .line 118
    .line 119
    iget-object p0, v0, Lpz8;->B:Lmz8;

    .line 120
    .line 121
    const-string v0, "Cannot get trigger URIs from analytics worker thread"

    .line 122
    .line 123
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    :cond_3
    return-void
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
