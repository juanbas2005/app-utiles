.class public final Lr69;
.super Lfy8;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public volatile A:Ljava/lang/Boolean;

.field public final B:Lz59;

.field public C:Ljava/util/concurrent/ScheduledExecutorService;

.field public final D:Lcp0;

.field public final E:Ljava/util/ArrayList;

.field public final F:Lz59;

.field public final y:Lm69;

.field public z:Liy8;


# direct methods
.method public constructor <init>(Ly19;)V
    .locals 2

    .line 1
    invoke-direct {p0, p1}, Lfy8;-><init>(Ly19;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lr69;->E:Ljava/util/ArrayList;

    .line 10
    .line 11
    new-instance v0, Lcp0;

    .line 12
    .line 13
    iget-object v1, p1, Ly19;->G:Lxb4;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Lcp0;-><init>(Lxb4;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lr69;->D:Lcp0;

    .line 19
    .line 20
    new-instance v0, Lm69;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lm69;-><init>(Lr69;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lr69;->y:Lm69;

    .line 26
    .line 27
    new-instance v0, Lz59;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    invoke-direct {v0, p0, p1, v1}, Lz59;-><init>(Lr69;Ly19;I)V

    .line 31
    .line 32
    .line 33
    iput-object v0, p0, Lr69;->B:Lz59;

    .line 34
    .line 35
    new-instance v0, Lz59;

    .line 36
    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-direct {v0, p0, p1, v1}, Lz59;-><init>(Lr69;Ly19;I)V

    .line 39
    .line 40
    .line 41
    iput-object v0, p0, Lr69;->F:Lz59;

    .line 42
    .line 43
    return-void
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


# virtual methods
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

.method public final g1(Ljava/util/concurrent/atomic/AtomicReference;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    const/4 v0, 0x0

    .line 8
    invoke-virtual {p0, v0}, Lr69;->s1(Z)Lz99;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    new-instance v1, Lz46;

    .line 13
    .line 14
    invoke-direct {v1, p0, p1, v0}, Lz46;-><init>(Lr69;Ljava/util/concurrent/atomic/AtomicReference;Lz99;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 18
    .line 19
    .line 20
    return-void
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

.method public final h1(Landroid/os/Bundle;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    new-instance v4, Lur8;

    .line 8
    .line 9
    invoke-direct {v4, p1}, Lur8;-><init>(Landroid/os/Bundle;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lr69;->o1()V

    .line 13
    .line 14
    .line 15
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Ly19;

    .line 18
    .line 19
    iget-object v1, v0, Ly19;->z:Ltp8;

    .line 20
    .line 21
    const/4 v2, 0x0

    .line 22
    sget-object v3, Lby8;->W0:Lay8;

    .line 23
    .line 24
    invoke-virtual {v1, v2, v3}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    const/4 v2, 0x0

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0}, Ly19;->i()Lcz8;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast v1, Ly19;

    .line 38
    .line 39
    iget-object v3, v1, Ly19;->E:Ld99;

    .line 40
    .line 41
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 42
    .line 43
    invoke-static {v3}, Ly19;->e(Lin8;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v4}, Ld99;->L1(Landroid/os/Parcelable;)[B

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, v1, Lpz8;->C:Lmz8;

    .line 56
    .line 57
    const-string v1, "Null default event parameters; not writing to database"

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    :goto_0
    move v0, v2

    .line 63
    goto :goto_1

    .line 64
    :cond_0
    array-length v5, v3

    .line 65
    const/high16 v6, 0x20000

    .line 66
    .line 67
    if-le v5, v6, :cond_1

    .line 68
    .line 69
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, v1, Lpz8;->C:Lmz8;

    .line 73
    .line 74
    const-string v1, "Default event parameters too long for local database. Sending directly to service"

    .line 75
    .line 76
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    const/4 v1, 0x4

    .line 81
    invoke-virtual {v0, v1, v3}, Lcz8;->j1(I[B)Z

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    :goto_1
    if-eqz v0, :cond_2

    .line 86
    .line 87
    const/4 v0, 0x1

    .line 88
    move v3, v0

    .line 89
    goto :goto_2

    .line 90
    :cond_2
    move v3, v2

    .line 91
    :goto_2
    invoke-virtual {p0, v2}, Lr69;->s1(Z)Lz99;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    new-instance v0, Lw39;

    .line 96
    .line 97
    move-object v1, p0

    .line 98
    move-object v5, p1

    .line 99
    invoke-direct/range {v0 .. v5}, Lw39;-><init>(Lr69;Lz99;ZLur8;Landroid/os/Bundle;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, v0}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 103
    .line 104
    .line 105
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
.end method

.method public final i1()V
    .locals 11

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lr69;->t1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_1

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Lr69;->j1()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x1

    .line 20
    if-nez v0, :cond_4

    .line 21
    .line 22
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ly19;

    .line 25
    .line 26
    iget-object v2, v0, Ly19;->z:Ltp8;

    .line 27
    .line 28
    invoke-virtual {v2}, Ltp8;->f1()Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-nez v2, :cond_3

    .line 33
    .line 34
    iget-object v2, v0, Ly19;->w:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    new-instance v3, Landroid/content/Intent;

    .line 41
    .line 42
    invoke-direct {v3}, Landroid/content/Intent;-><init>()V

    .line 43
    .line 44
    .line 45
    iget-object v4, v0, Ly19;->w:Landroid/content/Context;

    .line 46
    .line 47
    const-string v5, "com.google.android.gms.measurement.AppMeasurementService"

    .line 48
    .line 49
    invoke-virtual {v3, v4, v5}, Landroid/content/Intent;->setClassName(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    const/high16 v4, 0x10000

    .line 54
    .line 55
    invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->queryIntentServices(Landroid/content/Intent;I)Ljava/util/List;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    if-eqz v2, :cond_2

    .line 60
    .line 61
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 62
    .line 63
    .line 64
    move-result v2

    .line 65
    if-nez v2, :cond_2

    .line 66
    .line 67
    new-instance v2, Landroid/content/Intent;

    .line 68
    .line 69
    const-string v3, "com.google.android.gms.measurement.START"

    .line 70
    .line 71
    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    new-instance v3, Landroid/content/ComponentName;

    .line 75
    .line 76
    iget-object v0, v0, Ly19;->w:Landroid/content/Context;

    .line 77
    .line 78
    const-string v4, "com.google.android.gms.measurement.AppMeasurementService"

    .line 79
    .line 80
    invoke-direct {v3, v0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 84
    .line 85
    .line 86
    iget-object p0, p0, Lr69;->y:Lm69;

    .line 87
    .line 88
    iget-object v0, p0, Lm69;->y:Lr69;

    .line 89
    .line 90
    invoke-virtual {v0}, Lcx8;->b1()V

    .line 91
    .line 92
    .line 93
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v0, Ly19;

    .line 96
    .line 97
    iget-object v0, v0, Ly19;->w:Landroid/content/Context;

    .line 98
    .line 99
    invoke-static {}, Lq11;->b()Lq11;

    .line 100
    .line 101
    .line 102
    move-result-object v3

    .line 103
    monitor-enter p0

    .line 104
    :try_start_0
    iget-boolean v4, p0, Lm69;->w:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    iget-object v5, p0, Lm69;->y:Lr69;

    .line 107
    .line 108
    if-eqz v4, :cond_1

    .line 109
    .line 110
    :try_start_1
    iget-object v0, v5, Lin8;->w:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Ly19;

    .line 113
    .line 114
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 115
    .line 116
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 117
    .line 118
    .line 119
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 120
    .line 121
    const-string v1, "Connection attempt already in progress"

    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    monitor-exit p0

    .line 127
    return-void

    .line 128
    :catchall_0
    move-exception v0

    .line 129
    goto :goto_0

    .line 130
    :cond_1
    iget-object v4, v5, Lin8;->w:Ljava/lang/Object;

    .line 131
    .line 132
    check-cast v4, Ly19;

    .line 133
    .line 134
    iget-object v4, v4, Ly19;->B:Lpz8;

    .line 135
    .line 136
    invoke-static {v4}, Ly19;->g(Ly29;)V

    .line 137
    .line 138
    .line 139
    iget-object v4, v4, Lpz8;->J:Lmz8;

    .line 140
    .line 141
    const-string v6, "Using local app measurement service"

    .line 142
    .line 143
    invoke-virtual {v4, v6}, Lmz8;->a(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iput-boolean v1, p0, Lm69;->w:Z

    .line 147
    .line 148
    iget-object v1, v5, Lr69;->y:Lm69;

    .line 149
    .line 150
    const/16 v4, 0x81

    .line 151
    .line 152
    invoke-virtual {v3, v0, v2, v1, v4}, Lq11;->a(Landroid/content/Context;Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z

    .line 153
    .line 154
    .line 155
    monitor-exit p0

    .line 156
    return-void

    .line 157
    :goto_0
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 158
    throw v0

    .line 159
    :cond_2
    iget-object p0, v0, Ly19;->B:Lpz8;

    .line 160
    .line 161
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 162
    .line 163
    .line 164
    iget-object p0, p0, Lpz8;->B:Lmz8;

    .line 165
    .line 166
    const-string v0, "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"

    .line 167
    .line 168
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    :cond_3
    :goto_1
    return-void

    .line 172
    :cond_4
    iget-object v8, p0, Lr69;->y:Lm69;

    .line 173
    .line 174
    iget-object p0, v8, Lm69;->y:Lr69;

    .line 175
    .line 176
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 177
    .line 178
    .line 179
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p0, Ly19;

    .line 182
    .line 183
    iget-object v3, p0, Ly19;->w:Landroid/content/Context;

    .line 184
    .line 185
    monitor-enter v8

    .line 186
    :try_start_2
    iget-boolean p0, v8, Lm69;->w:Z

    .line 187
    .line 188
    if-eqz p0, :cond_5

    .line 189
    .line 190
    iget-object p0, v8, Lm69;->y:Lr69;

    .line 191
    .line 192
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p0, Ly19;

    .line 195
    .line 196
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 197
    .line 198
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 199
    .line 200
    .line 201
    iget-object p0, p0, Lpz8;->J:Lmz8;

    .line 202
    .line 203
    const-string v0, "Connection attempt already in progress"

    .line 204
    .line 205
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    monitor-exit v8

    .line 209
    return-void

    .line 210
    :catchall_1
    move-exception v0

    .line 211
    move-object p0, v0

    .line 212
    goto :goto_2

    .line 213
    :cond_5
    iget-object p0, v8, Lm69;->x:Lhz8;

    .line 214
    .line 215
    if-eqz p0, :cond_7

    .line 216
    .line 217
    iget-object p0, v8, Lm69;->x:Lhz8;

    .line 218
    .line 219
    invoke-virtual {p0}, Ly50;->q()Z

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    if-nez p0, :cond_6

    .line 224
    .line 225
    iget-object p0, v8, Lm69;->x:Lhz8;

    .line 226
    .line 227
    invoke-virtual {p0}, Ly50;->p()Z

    .line 228
    .line 229
    .line 230
    move-result p0

    .line 231
    if-eqz p0, :cond_7

    .line 232
    .line 233
    :cond_6
    iget-object p0, v8, Lm69;->y:Lr69;

    .line 234
    .line 235
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 236
    .line 237
    check-cast p0, Ly19;

    .line 238
    .line 239
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 240
    .line 241
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 242
    .line 243
    .line 244
    iget-object p0, p0, Lpz8;->J:Lmz8;

    .line 245
    .line 246
    const-string v0, "Already awaiting connection attempt"

    .line 247
    .line 248
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    monitor-exit v8

    .line 252
    return-void

    .line 253
    :cond_7
    new-instance v2, Lhz8;

    .line 254
    .line 255
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-static {v3}, Lg99;->a(Landroid/content/Context;)Lg99;

    .line 260
    .line 261
    .line 262
    move-result-object v5

    .line 263
    sget-object v6, Lmw2;->b:Lmw2;

    .line 264
    .line 265
    const/16 v7, 0x5d

    .line 266
    .line 267
    const/4 v10, 0x0

    .line 268
    move-object v9, v8

    .line 269
    invoke-direct/range {v2 .. v10}, Ly50;-><init>(Landroid/content/Context;Landroid/os/Looper;Lg99;Lmw2;ILv50;Lw50;Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    iput-object v2, v8, Lm69;->x:Lhz8;

    .line 273
    .line 274
    iget-object p0, v8, Lm69;->y:Lr69;

    .line 275
    .line 276
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 277
    .line 278
    check-cast p0, Ly19;

    .line 279
    .line 280
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 281
    .line 282
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 283
    .line 284
    .line 285
    iget-object p0, p0, Lpz8;->J:Lmz8;

    .line 286
    .line 287
    const-string v0, "Connecting to remote service"

    .line 288
    .line 289
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 290
    .line 291
    .line 292
    iput-boolean v1, v8, Lm69;->w:Z

    .line 293
    .line 294
    iget-object p0, v8, Lm69;->x:Lhz8;

    .line 295
    .line 296
    invoke-static {p0}, Lz65;->k(Ljava/lang/Object;)V

    .line 297
    .line 298
    .line 299
    iget-object p0, v8, Lm69;->x:Lhz8;

    .line 300
    .line 301
    invoke-virtual {p0}, Ly50;->a()V

    .line 302
    .line 303
    .line 304
    monitor-exit v8

    .line 305
    return-void

    .line 306
    :goto_2
    monitor-exit v8
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 307
    throw p0
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

.method public final j1()Z
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
    iget-object v0, p0, Lr69;->A:Ljava/lang/Boolean;

    .line 8
    .line 9
    if-nez v0, :cond_d

    .line 10
    .line 11
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, Ly19;

    .line 20
    .line 21
    iget-object v1, v0, Ly19;->A:Lq09;

    .line 22
    .line 23
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lin8;->b1()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    const-string v3, "use_service"

    .line 34
    .line 35
    invoke-interface {v2, v3}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    const/4 v4, 0x0

    .line 40
    if-nez v2, :cond_0

    .line 41
    .line 42
    const/4 v1, 0x0

    .line 43
    goto :goto_0

    .line 44
    :cond_0
    invoke-virtual {v1}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-interface {v1, v3, v4}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    :goto_0
    const/4 v2, 0x1

    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    if-eqz v5, :cond_1

    .line 64
    .line 65
    goto/16 :goto_6

    .line 66
    .line 67
    :cond_1
    iget-object v5, p0, Lin8;->w:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v5, Ly19;

    .line 70
    .line 71
    invoke-virtual {v5}, Ly19;->l()Lvy8;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-virtual {v5}, Lfy8;->d1()V

    .line 76
    .line 77
    .line 78
    iget v5, v5, Lvy8;->J:I

    .line 79
    .line 80
    if-ne v5, v2, :cond_2

    .line 81
    .line 82
    :goto_1
    move v4, v2

    .line 83
    goto/16 :goto_4

    .line 84
    .line 85
    :cond_2
    iget-object v5, v0, Ly19;->B:Lpz8;

    .line 86
    .line 87
    invoke-static {v5}, Ly19;->g(Ly29;)V

    .line 88
    .line 89
    .line 90
    iget-object v5, v5, Lpz8;->J:Lmz8;

    .line 91
    .line 92
    const-string v6, "Checking service availability"

    .line 93
    .line 94
    invoke-virtual {v5, v6}, Lmz8;->a(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    iget-object v5, v0, Ly19;->E:Ld99;

    .line 98
    .line 99
    invoke-static {v5}, Ly19;->e(Lin8;)V

    .line 100
    .line 101
    .line 102
    iget-object v5, v5, Lin8;->w:Ljava/lang/Object;

    .line 103
    .line 104
    check-cast v5, Ly19;

    .line 105
    .line 106
    sget-object v6, Lmw2;->b:Lmw2;

    .line 107
    .line 108
    iget-object v5, v5, Ly19;->w:Landroid/content/Context;

    .line 109
    .line 110
    const v7, 0xbdfcb8

    .line 111
    .line 112
    .line 113
    invoke-virtual {v6, v5, v7}, Lmw2;->b(Landroid/content/Context;I)I

    .line 114
    .line 115
    .line 116
    move-result v5

    .line 117
    if-eqz v5, :cond_a

    .line 118
    .line 119
    if-eq v5, v2, :cond_9

    .line 120
    .line 121
    const/4 v6, 0x2

    .line 122
    if-eq v5, v6, :cond_6

    .line 123
    .line 124
    const/4 v1, 0x3

    .line 125
    if-eq v5, v1, :cond_5

    .line 126
    .line 127
    iget-object v1, v0, Ly19;->B:Lpz8;

    .line 128
    .line 129
    const/16 v6, 0x9

    .line 130
    .line 131
    if-eq v5, v6, :cond_4

    .line 132
    .line 133
    const/16 v6, 0x12

    .line 134
    .line 135
    if-eq v5, v6, :cond_3

    .line 136
    .line 137
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 138
    .line 139
    .line 140
    iget-object v1, v1, Lpz8;->E:Lmz8;

    .line 141
    .line 142
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 143
    .line 144
    .line 145
    move-result-object v2

    .line 146
    const-string v5, "Unexpected service status"

    .line 147
    .line 148
    invoke-virtual {v1, v5, v2}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    :goto_2
    move v2, v4

    .line 152
    goto :goto_4

    .line 153
    :cond_3
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 154
    .line 155
    .line 156
    iget-object v1, v1, Lpz8;->E:Lmz8;

    .line 157
    .line 158
    const-string v4, "Service updating"

    .line 159
    .line 160
    invoke-virtual {v1, v4}, Lmz8;->a(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_4
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 165
    .line 166
    .line 167
    iget-object v1, v1, Lpz8;->E:Lmz8;

    .line 168
    .line 169
    const-string v2, "Service invalid"

    .line 170
    .line 171
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_5
    iget-object v1, v0, Ly19;->B:Lpz8;

    .line 176
    .line 177
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 178
    .line 179
    .line 180
    iget-object v1, v1, Lpz8;->E:Lmz8;

    .line 181
    .line 182
    const-string v2, "Service disabled"

    .line 183
    .line 184
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto :goto_2

    .line 188
    :cond_6
    iget-object v5, v0, Ly19;->B:Lpz8;

    .line 189
    .line 190
    invoke-static {v5}, Ly19;->g(Ly29;)V

    .line 191
    .line 192
    .line 193
    iget-object v5, v5, Lpz8;->I:Lmz8;

    .line 194
    .line 195
    const-string v6, "Service container out of date"

    .line 196
    .line 197
    invoke-virtual {v5, v6}, Lmz8;->a(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    iget-object v5, v0, Ly19;->E:Ld99;

    .line 201
    .line 202
    invoke-static {v5}, Ly19;->e(Lin8;)V

    .line 203
    .line 204
    .line 205
    invoke-virtual {v5}, Ld99;->N1()I

    .line 206
    .line 207
    .line 208
    move-result v5

    .line 209
    const/16 v6, 0x4423

    .line 210
    .line 211
    if-ge v5, v6, :cond_7

    .line 212
    .line 213
    goto :goto_4

    .line 214
    :cond_7
    if-nez v1, :cond_8

    .line 215
    .line 216
    goto :goto_3

    .line 217
    :cond_8
    move v2, v4

    .line 218
    :goto_3
    move v8, v4

    .line 219
    move v4, v2

    .line 220
    move v2, v8

    .line 221
    goto :goto_4

    .line 222
    :cond_9
    iget-object v1, v0, Ly19;->B:Lpz8;

    .line 223
    .line 224
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 225
    .line 226
    .line 227
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 228
    .line 229
    const-string v5, "Service missing"

    .line 230
    .line 231
    invoke-virtual {v1, v5}, Lmz8;->a(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    goto :goto_4

    .line 235
    :cond_a
    iget-object v1, v0, Ly19;->B:Lpz8;

    .line 236
    .line 237
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 238
    .line 239
    .line 240
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 241
    .line 242
    const-string v4, "Service available"

    .line 243
    .line 244
    invoke-virtual {v1, v4}, Lmz8;->a(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    goto/16 :goto_1

    .line 248
    .line 249
    :goto_4
    if-nez v4, :cond_b

    .line 250
    .line 251
    iget-object v1, v0, Ly19;->z:Ltp8;

    .line 252
    .line 253
    invoke-virtual {v1}, Ltp8;->f1()Z

    .line 254
    .line 255
    .line 256
    move-result v1

    .line 257
    if-eqz v1, :cond_b

    .line 258
    .line 259
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 260
    .line 261
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 262
    .line 263
    .line 264
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 265
    .line 266
    const-string v1, "No way to upload. Consider using the full version of Analytics"

    .line 267
    .line 268
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    goto :goto_5

    .line 272
    :cond_b
    if-eqz v2, :cond_c

    .line 273
    .line 274
    iget-object v0, v0, Ly19;->A:Lq09;

    .line 275
    .line 276
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {v0}, Lin8;->b1()V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v0}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 283
    .line 284
    .line 285
    move-result-object v0

    .line 286
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-interface {v0, v3, v4}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 291
    .line 292
    .line 293
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 294
    .line 295
    .line 296
    :cond_c
    :goto_5
    move v2, v4

    .line 297
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 298
    .line 299
    .line 300
    move-result-object v0

    .line 301
    iput-object v0, p0, Lr69;->A:Ljava/lang/Boolean;

    .line 302
    .line 303
    :cond_d
    iget-object p0, p0, Lr69;->A:Ljava/lang/Boolean;

    .line 304
    .line 305
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 306
    .line 307
    .line 308
    move-result p0

    .line 309
    return p0
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

.method public final k1()V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    iget-object v0, p0, Lr69;->y:Lm69;

    .line 8
    .line 9
    iget-object v1, v0, Lm69;->x:Lhz8;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    iget-object v1, v0, Lm69;->x:Lhz8;

    .line 14
    .line 15
    invoke-virtual {v1}, Ly50;->p()Z

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_0

    .line 20
    .line 21
    iget-object v1, v0, Lm69;->x:Lhz8;

    .line 22
    .line 23
    invoke-virtual {v1}, Ly50;->q()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    :cond_0
    iget-object v1, v0, Lm69;->x:Lhz8;

    .line 30
    .line 31
    invoke-virtual {v1}, Ly50;->c()V

    .line 32
    .line 33
    .line 34
    :cond_1
    const/4 v1, 0x0

    .line 35
    iput-object v1, v0, Lm69;->x:Lhz8;

    .line 36
    .line 37
    :try_start_0
    invoke-static {}, Lq11;->b()Lq11;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    iget-object v3, p0, Lin8;->w:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v3, Ly19;

    .line 44
    .line 45
    iget-object v3, v3, Ly19;->w:Landroid/content/Context;

    .line 46
    .line 47
    invoke-virtual {v2, v3, v0}, Lq11;->c(Landroid/content/Context;Landroid/content/ServiceConnection;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    .line 49
    .line 50
    :catch_0
    iput-object v1, p0, Lr69;->z:Liy8;

    .line 51
    .line 52
    return-void
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

.method public final l1()Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lr69;->j1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ly19;

    .line 16
    .line 17
    iget-object p0, p0, Ly19;->E:Ld99;

    .line 18
    .line 19
    invoke-static {p0}, Ly19;->e(Lin8;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ld99;->N1()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    sget-object v0, Lby8;->J0:Lay8;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Lay8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-lt p0, v0, :cond_0

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/4 p0, 0x0

    .line 43
    return p0

    .line 44
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 45
    return p0
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

.method public final m1()Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lr69;->j1()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p0, Ly19;

    .line 16
    .line 17
    iget-object p0, p0, Ly19;->E:Ld99;

    .line 18
    .line 19
    invoke-static {p0}, Ly19;->e(Lin8;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Ld99;->N1()I

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    const v0, 0x3ae30

    .line 27
    .line 28
    .line 29
    if-lt p0, v0, :cond_0

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/4 p0, 0x0

    .line 33
    return p0

    .line 34
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 35
    return p0
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

.method public final n1(Landroid/content/ComponentName;)V
    .locals 2

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr69;->z:Liy8;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    iput-object v0, p0, Lr69;->z:Liy8;

    .line 10
    .line 11
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Ly19;

    .line 14
    .line 15
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 16
    .line 17
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 18
    .line 19
    .line 20
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 21
    .line 22
    const-string v1, "Disconnected from device MeasurementService"

    .line 23
    .line 24
    invoke-virtual {v0, v1, p1}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lr69;->i1()V

    .line 31
    .line 32
    .line 33
    :cond_0
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
.end method

.method public final o1()V
    .locals 0

    .line 1
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ly19;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
.end method

.method public final p1()V
    .locals 3

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lr69;->D:Lcp0;

    .line 5
    .line 6
    iget-object v1, v0, Lcp0;->y:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v1, Lxb4;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 14
    .line 15
    .line 16
    move-result-wide v1

    .line 17
    iput-wide v1, v0, Lcp0;->x:J

    .line 18
    .line 19
    iget-object v0, p0, Lin8;->w:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ly19;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    sget-object v0, Lby8;->Y:Lay8;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v0, v1}, Lay8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Ljava/lang/Long;

    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    iget-object p0, p0, Lr69;->B:Lz59;

    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Lxq8;->b(J)V

    .line 42
    .line 43
    .line 44
    return-void
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

.method public final q1(Ljava/lang/Runnable;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lr69;->t1()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object v0, p0, Lr69;->E:Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    int-to-long v1, v1

    .line 21
    iget-object v3, p0, Lin8;->w:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v3, Ly19;

    .line 24
    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    const-wide/16 v4, 0x3e8

    .line 29
    .line 30
    cmp-long v1, v1, v4

    .line 31
    .line 32
    if-ltz v1, :cond_1

    .line 33
    .line 34
    iget-object p0, v3, Ly19;->B:Lpz8;

    .line 35
    .line 36
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, Lpz8;->B:Lmz8;

    .line 40
    .line 41
    const-string p1, "Discarding data. Max runnable queue size reached"

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lmz8;->a(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_1
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, Lr69;->F:Lz59;

    .line 51
    .line 52
    const-wide/32 v0, 0xea60

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1, v0, v1}, Lxq8;->b(J)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0}, Lr69;->i1()V

    .line 59
    .line 60
    .line 61
    return-void
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

.method public final r1()V
    .locals 6

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
    iget-object v1, v0, Ly19;->B:Lpz8;

    .line 9
    .line 10
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 11
    .line 12
    .line 13
    iget-object v1, v1, Lpz8;->J:Lmz8;

    .line 14
    .line 15
    iget-object v2, p0, Lr69;->E:Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    const-string v4, "Processing queued up service tasks"

    .line 26
    .line 27
    invoke-virtual {v1, v4, v3}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    check-cast v3, Ljava/lang/Runnable;

    .line 45
    .line 46
    :try_start_0
    invoke-interface {v3}, Ljava/lang/Runnable;->run()V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catch_0
    move-exception v3

    .line 51
    iget-object v4, v0, Ly19;->B:Lpz8;

    .line 52
    .line 53
    invoke-static {v4}, Ly19;->g(Ly29;)V

    .line 54
    .line 55
    .line 56
    iget-object v4, v4, Lpz8;->B:Lmz8;

    .line 57
    .line 58
    const-string v5, "Task exception while flushing queue"

    .line 59
    .line 60
    invoke-virtual {v4, v5, v3}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 65
    .line 66
    .line 67
    iget-object p0, p0, Lr69;->F:Lz59;

    .line 68
    .line 69
    invoke-virtual {p0}, Lxq8;->c()V

    .line 70
    .line 71
    .line 72
    return-void
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
.end method

.method public final s1(Z)Lz99;
    .locals 9

    .line 1
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Ly19;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ly19;->l()Lvy8;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz p1, :cond_7

    .line 14
    .line 15
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 16
    .line 17
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lin8;->w:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p0, Ly19;

    .line 23
    .line 24
    iget-object p1, p0, Ly19;->A:Lq09;

    .line 25
    .line 26
    invoke-static {p1}, Ly19;->e(Lin8;)V

    .line 27
    .line 28
    .line 29
    iget-object p1, p1, Lq09;->A:Lrb2;

    .line 30
    .line 31
    if-nez p1, :cond_0

    .line 32
    .line 33
    goto/16 :goto_4

    .line 34
    .line 35
    :cond_0
    iget-object p0, p0, Ly19;->A:Lq09;

    .line 36
    .line 37
    invoke-static {p0}, Ly19;->e(Lin8;)V

    .line 38
    .line 39
    .line 40
    iget-object p0, p0, Lq09;->A:Lrb2;

    .line 41
    .line 42
    iget-object p1, p0, Lrb2;->A:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, Lq09;

    .line 45
    .line 46
    invoke-virtual {p1}, Lin8;->b1()V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lin8;->b1()V

    .line 50
    .line 51
    .line 52
    iget-object v2, p0, Lrb2;->A:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v2, Lq09;

    .line 55
    .line 56
    invoke-virtual {v2}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    iget-object v3, p0, Lrb2;->x:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v3, Ljava/lang/String;

    .line 63
    .line 64
    const-wide/16 v4, 0x0

    .line 65
    .line 66
    invoke-interface {v2, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 67
    .line 68
    .line 69
    move-result-wide v2

    .line 70
    cmp-long v6, v2, v4

    .line 71
    .line 72
    if-nez v6, :cond_1

    .line 73
    .line 74
    invoke-virtual {p0}, Lrb2;->d()V

    .line 75
    .line 76
    .line 77
    move-wide v2, v4

    .line 78
    goto :goto_0

    .line 79
    :cond_1
    iget-object v6, p1, Lin8;->w:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v6, Ly19;

    .line 82
    .line 83
    iget-object v6, v6, Ly19;->G:Lxb4;

    .line 84
    .line 85
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 89
    .line 90
    .line 91
    move-result-wide v6

    .line 92
    sub-long/2addr v2, v6

    .line 93
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 94
    .line 95
    .line 96
    move-result-wide v2

    .line 97
    :goto_0
    iget-wide v6, p0, Lrb2;->w:J

    .line 98
    .line 99
    cmp-long v8, v2, v6

    .line 100
    .line 101
    if-gez v8, :cond_2

    .line 102
    .line 103
    :goto_1
    move-object p0, v1

    .line 104
    goto :goto_3

    .line 105
    :cond_2
    add-long/2addr v6, v6

    .line 106
    cmp-long v2, v2, v6

    .line 107
    .line 108
    if-lez v2, :cond_3

    .line 109
    .line 110
    invoke-virtual {p0}, Lrb2;->d()V

    .line 111
    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_3
    iget-object v2, p0, Lrb2;->z:Ljava/io/Serializable;

    .line 115
    .line 116
    check-cast v2, Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p1}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 119
    .line 120
    .line 121
    move-result-object v3

    .line 122
    invoke-interface {v3, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iget-object v3, p0, Lrb2;->y:Ljava/lang/Object;

    .line 127
    .line 128
    check-cast v3, Ljava/lang/String;

    .line 129
    .line 130
    invoke-virtual {p1}, Lq09;->g1()Landroid/content/SharedPreferences;

    .line 131
    .line 132
    .line 133
    move-result-object p1

    .line 134
    invoke-interface {p1, v3, v4, v5}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 135
    .line 136
    .line 137
    move-result-wide v6

    .line 138
    invoke-virtual {p0}, Lrb2;->d()V

    .line 139
    .line 140
    .line 141
    if-eqz v2, :cond_5

    .line 142
    .line 143
    cmp-long p0, v6, v4

    .line 144
    .line 145
    if-gtz p0, :cond_4

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :cond_4
    new-instance p0, Landroid/util/Pair;

    .line 149
    .line 150
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 151
    .line 152
    .line 153
    move-result-object p1

    .line 154
    invoke-direct {p0, v2, p1}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 155
    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_5
    :goto_2
    sget-object p0, Lq09;->V:Landroid/util/Pair;

    .line 159
    .line 160
    :goto_3
    if-eqz p0, :cond_7

    .line 161
    .line 162
    sget-object p1, Lq09;->V:Landroid/util/Pair;

    .line 163
    .line 164
    if-ne p0, p1, :cond_6

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_6
    iget-object p1, p0, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 168
    .line 169
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 170
    .line 171
    .line 172
    move-result-object p1

    .line 173
    iget-object p0, p0, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 174
    .line 175
    check-cast p0, Ljava/lang/String;

    .line 176
    .line 177
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 178
    .line 179
    .line 180
    move-result v1

    .line 181
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v2

    .line 185
    add-int/lit8 v1, v1, 0x1

    .line 186
    .line 187
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v2

    .line 191
    new-instance v3, Ljava/lang/StringBuilder;

    .line 192
    .line 193
    add-int/2addr v1, v2

    .line 194
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 195
    .line 196
    .line 197
    const-string v1, ":"

    .line 198
    .line 199
    invoke-static {v3, p1, v1, p0}, Lf21;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v1

    .line 203
    :cond_7
    :goto_4
    invoke-virtual {v0, v1}, Lvy8;->g1(Ljava/lang/String;)Lz99;

    .line 204
    .line 205
    .line 206
    move-result-object p0

    .line 207
    return-object p0
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
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
.end method

.method public final t1()Z
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcx8;->b1()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lfy8;->d1()V

    .line 5
    .line 6
    .line 7
    iget-object p0, p0, Lr69;->z:Liy8;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_0
    const/4 p0, 0x0

    .line 14
    return p0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public final u1(Liy8;La3;Lz99;)V
    .locals 69

    .line 1
    move-object/from16 v2, p2

    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Lcx8;->b1()V

    .line 4
    .line 5
    .line 6
    invoke-virtual/range {p0 .. p0}, Lfy8;->d1()V

    .line 7
    .line 8
    .line 9
    invoke-virtual/range {p0 .. p0}, Lr69;->o1()V

    .line 10
    .line 11
    .line 12
    move-object/from16 v0, p0

    .line 13
    .line 14
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v3, v0

    .line 17
    check-cast v3, Ly19;

    .line 18
    .line 19
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v4, v3, Ly19;->w:Landroid/content/Context;

    .line 23
    .line 24
    iget-object v5, v3, Ly19;->z:Ltp8;

    .line 25
    .line 26
    iget-object v6, v3, Ly19;->B:Lpz8;

    .line 27
    .line 28
    iget-object v7, v3, Ly19;->G:Lxb4;

    .line 29
    .line 30
    const/16 v9, 0x64

    .line 31
    .line 32
    move-object/from16 v10, p3

    .line 33
    .line 34
    move v0, v9

    .line 35
    const/4 v11, 0x0

    .line 36
    :goto_0
    const/16 v12, 0x3e9

    .line 37
    .line 38
    if-ge v11, v12, :cond_24

    .line 39
    .line 40
    if-ne v0, v9, :cond_24

    .line 41
    .line 42
    new-instance v12, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ly19;->i()Lcz8;

    .line 48
    .line 49
    .line 50
    move-result-object v13

    .line 51
    const-string v14, "Error reading entries from local database"

    .line 52
    .line 53
    const-string v15, "entry"

    .line 54
    .line 55
    move/from16 p0, v9

    .line 56
    .line 57
    const-string v9, "type"

    .line 58
    .line 59
    const-string v8, "rowid"

    .line 60
    .line 61
    iget-object v0, v13, Lin8;->w:Ljava/lang/Object;

    .line 62
    .line 63
    move-object/from16 v17, v7

    .line 64
    .line 65
    move-object v7, v0

    .line 66
    check-cast v7, Ly19;

    .line 67
    .line 68
    invoke-virtual {v13}, Lcx8;->b1()V

    .line 69
    .line 70
    .line 71
    iget-boolean v0, v13, Lcz8;->z:Z

    .line 72
    .line 73
    move/from16 p3, v11

    .line 74
    .line 75
    const-wide/16 v18, 0x0

    .line 76
    .line 77
    if-eqz v0, :cond_0

    .line 78
    .line 79
    move-object/from16 v20, v3

    .line 80
    .line 81
    move-object/from16 v21, v4

    .line 82
    .line 83
    move-object/from16 v22, v6

    .line 84
    .line 85
    :goto_1
    const/4 v8, 0x0

    .line 86
    :goto_2
    const/4 v11, 0x0

    .line 87
    goto/16 :goto_3a

    .line 88
    .line 89
    :cond_0
    new-instance v11, Ljava/util/ArrayList;

    .line 90
    .line 91
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 92
    .line 93
    .line 94
    iget-object v0, v13, Lin8;->w:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ly19;

    .line 97
    .line 98
    iget-object v0, v0, Ly19;->w:Landroid/content/Context;

    .line 99
    .line 100
    move-object/from16 v20, v3

    .line 101
    .line 102
    const-string v3, "google_app_measurement_local.db"

    .line 103
    .line 104
    invoke-virtual {v0, v3}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_18

    .line 113
    .line 114
    const/4 v3, 0x5

    .line 115
    move-object/from16 v21, v4

    .line 116
    .line 117
    move-object/from16 v22, v6

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    move v6, v3

    .line 121
    :goto_3
    if-ge v4, v3, :cond_17

    .line 122
    .line 123
    const/4 v3, 0x1

    .line 124
    :try_start_0
    invoke-virtual {v13}, Lcz8;->i1()Landroid/database/sqlite/SQLiteDatabase;

    .line 125
    .line 126
    .line 127
    move-result-object v24
    :try_end_0
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_0 .. :try_end_0} :catch_38
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_0 .. :try_end_0} :catch_37
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_0 .. :try_end_0} :catch_36
    .catchall {:try_start_0 .. :try_end_0} :catchall_c

    .line 128
    if-nez v24, :cond_1

    .line 129
    .line 130
    :try_start_1
    iput-boolean v3, v13, Lcz8;->z:Z

    .line 131
    .line 132
    goto :goto_1

    .line 133
    :catchall_0
    move-exception v0

    .line 134
    move-object/from16 v4, v24

    .line 135
    .line 136
    goto/16 :goto_30

    .line 137
    .line 138
    :catch_0
    move-exception v0

    .line 139
    move/from16 v36, v4

    .line 140
    .line 141
    :goto_4
    move-object/from16 v37, v8

    .line 142
    .line 143
    move-object/from16 v26, v15

    .line 144
    .line 145
    move-object/from16 v4, v24

    .line 146
    .line 147
    const/4 v8, 0x0

    .line 148
    const/16 v23, 0x5

    .line 149
    .line 150
    :goto_5
    move-object/from16 v24, v9

    .line 151
    .line 152
    goto/16 :goto_31

    .line 153
    .line 154
    :catch_1
    move/from16 v36, v4

    .line 155
    .line 156
    :catch_2
    move-object/from16 v37, v8

    .line 157
    .line 158
    move-object/from16 v26, v15

    .line 159
    .line 160
    move-object/from16 v4, v24

    .line 161
    .line 162
    const/4 v8, 0x0

    .line 163
    const/16 v23, 0x5

    .line 164
    .line 165
    :goto_6
    move-object/from16 v24, v9

    .line 166
    .line 167
    goto/16 :goto_32

    .line 168
    .line 169
    :catch_3
    move-exception v0

    .line 170
    move/from16 v36, v4

    .line 171
    .line 172
    :goto_7
    move-object/from16 v37, v8

    .line 173
    .line 174
    move-object/from16 v26, v15

    .line 175
    .line 176
    move-object/from16 v4, v24

    .line 177
    .line 178
    const/4 v8, 0x0

    .line 179
    const/16 v23, 0x5

    .line 180
    .line 181
    :goto_8
    move-object/from16 v24, v9

    .line 182
    .line 183
    goto/16 :goto_33

    .line 184
    .line 185
    :cond_1
    invoke-virtual/range {v24 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 186
    .line 187
    .line 188
    const-string v0, "3"
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    .line 190
    :try_start_2
    const-string v25, "messages"

    .line 191
    .line 192
    filled-new-array {v8}, [Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v26

    .line 196
    const-string v27, "type=?"

    .line 197
    .line 198
    filled-new-array {v0}, [Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v28

    .line 202
    const-string v31, "rowid desc"

    .line 203
    .line 204
    const-string v32, "1"

    .line 205
    .line 206
    const/16 v29, 0x0

    .line 207
    .line 208
    const/16 v30, 0x0

    .line 209
    .line 210
    invoke-virtual/range {v24 .. v32}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 211
    .line 212
    .line 213
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_a

    .line 214
    :try_start_3
    invoke-interface {v3}, Landroid/database/Cursor;->moveToFirst()Z

    .line 215
    .line 216
    .line 217
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_9

    .line 218
    const-wide/16 v34, -0x1

    .line 219
    .line 220
    if-eqz v0, :cond_2

    .line 221
    .line 222
    move/from16 v36, v4

    .line 223
    .line 224
    const/4 v4, 0x0

    .line 225
    :try_start_4
    invoke-interface {v3, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 226
    .line 227
    .line 228
    move-result-wide v25
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 229
    :try_start_5
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_5
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_5 .. :try_end_5} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_5 .. :try_end_5} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_5 .. :try_end_5} :catch_4
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 230
    .line 231
    .line 232
    goto :goto_a

    .line 233
    :catch_4
    move-exception v0

    .line 234
    goto :goto_4

    .line 235
    :catch_5
    move-exception v0

    .line 236
    goto :goto_7

    .line 237
    :catchall_1
    move-exception v0

    .line 238
    :goto_9
    move-object/from16 v37, v8

    .line 239
    .line 240
    move-object/from16 v26, v15

    .line 241
    .line 242
    move-object/from16 v4, v24

    .line 243
    .line 244
    const/4 v8, 0x0

    .line 245
    const/16 v23, 0x5

    .line 246
    .line 247
    move-object/from16 v24, v9

    .line 248
    .line 249
    goto/16 :goto_2e

    .line 250
    .line 251
    :cond_2
    move/from16 v36, v4

    .line 252
    .line 253
    :try_start_6
    invoke-interface {v3}, Landroid/database/Cursor;->close()V
    :try_end_6
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_6 .. :try_end_6} :catch_32
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_6 .. :try_end_6} :catch_31
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_6 .. :try_end_6} :catch_30
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 254
    .line 255
    .line 256
    move-wide/from16 v25, v34

    .line 257
    .line 258
    :goto_a
    cmp-long v0, v25, v34

    .line 259
    .line 260
    if-eqz v0, :cond_3

    .line 261
    .line 262
    :try_start_7
    const-string v0, "rowid<?"

    .line 263
    .line 264
    const/4 v3, 0x1

    .line 265
    new-array v4, v3, [Ljava/lang/String;

    .line 266
    .line 267
    invoke-static/range {v25 .. v26}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 268
    .line 269
    .line 270
    move-result-object v3

    .line 271
    const/16 v16, 0x0

    .line 272
    .line 273
    aput-object v3, v4, v16
    :try_end_7
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_7 .. :try_end_7} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_7 .. :try_end_7} :catch_4
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 274
    .line 275
    move-object/from16 v27, v0

    .line 276
    .line 277
    move-object/from16 v28, v4

    .line 278
    .line 279
    goto :goto_b

    .line 280
    :cond_3
    const/16 v27, 0x0

    .line 281
    .line 282
    const/16 v28, 0x0

    .line 283
    .line 284
    :goto_b
    :try_start_8
    filled-new-array {v8, v9, v15}, [Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v0

    .line 288
    iget-object v3, v7, Ly19;->z:Ltp8;

    .line 289
    .line 290
    sget-object v4, Lby8;->W0:Lay8;
    :try_end_8
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_8 .. :try_end_8} :catch_32
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_8 .. :try_end_8} :catch_31
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_8 .. :try_end_8} :catch_30
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 291
    .line 292
    move-object/from16 v37, v8

    .line 293
    .line 294
    const/4 v8, 0x0

    .line 295
    :try_start_9
    invoke-virtual {v3, v8, v4}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 296
    .line 297
    .line 298
    move-result v3
    :try_end_9
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_9 .. :try_end_9} :catch_2e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_9 .. :try_end_9} :catch_2d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_9 .. :try_end_9} :catch_2c
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 299
    const/16 v38, 0x4

    .line 300
    .line 301
    const/16 v39, 0x3

    .line 302
    .line 303
    const/4 v8, 0x2

    .line 304
    if-eqz v3, :cond_4

    .line 305
    .line 306
    const/4 v3, 0x5

    .line 307
    :try_start_a
    new-array v0, v3, [Ljava/lang/String;

    .line 308
    .line 309
    const/16 v16, 0x0

    .line 310
    .line 311
    aput-object v37, v0, v16

    .line 312
    .line 313
    const/16 v33, 0x1

    .line 314
    .line 315
    aput-object v9, v0, v33

    .line 316
    .line 317
    aput-object v15, v0, v8

    .line 318
    .line 319
    const-string v23, "app_version"

    .line 320
    .line 321
    aput-object v23, v0, v39

    .line 322
    .line 323
    const-string v23, "app_version_int"

    .line 324
    .line 325
    aput-object v23, v0, v38
    :try_end_a
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_a .. :try_end_a} :catch_8
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_a .. :try_end_a} :catch_7
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_a .. :try_end_a} :catch_6
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 326
    .line 327
    :goto_c
    move-object/from16 v26, v0

    .line 328
    .line 329
    goto :goto_d

    .line 330
    :catch_6
    move-exception v0

    .line 331
    move/from16 v23, v3

    .line 332
    .line 333
    move-object/from16 v26, v15

    .line 334
    .line 335
    move-object/from16 v4, v24

    .line 336
    .line 337
    const/4 v8, 0x0

    .line 338
    goto/16 :goto_5

    .line 339
    .line 340
    :catch_7
    move/from16 v23, v3

    .line 341
    .line 342
    move-object/from16 v26, v15

    .line 343
    .line 344
    move-object/from16 v4, v24

    .line 345
    .line 346
    const/4 v8, 0x0

    .line 347
    goto/16 :goto_6

    .line 348
    .line 349
    :catch_8
    move-exception v0

    .line 350
    move/from16 v23, v3

    .line 351
    .line 352
    move-object/from16 v26, v15

    .line 353
    .line 354
    move-object/from16 v4, v24

    .line 355
    .line 356
    const/4 v8, 0x0

    .line 357
    goto/16 :goto_8

    .line 358
    .line 359
    :cond_4
    const/4 v3, 0x5

    .line 360
    goto :goto_c

    .line 361
    :goto_d
    :try_start_b
    const-string v25, "messages"

    .line 362
    .line 363
    const-string v31, "rowid asc"

    .line 364
    .line 365
    invoke-static/range {p0 .. p0}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v32
    :try_end_b
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_b .. :try_end_b} :catch_2e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_b .. :try_end_b} :catch_2f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_b .. :try_end_b} :catch_2c
    .catchall {:try_start_b .. :try_end_b} :catchall_0

    .line 369
    const/16 v29, 0x0

    .line 370
    .line 371
    const/16 v30, 0x0

    .line 372
    .line 373
    :try_start_c
    invoke-virtual/range {v24 .. v32}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 374
    .line 375
    .line 376
    move-result-object v3
    :try_end_c
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_c .. :try_end_c} :catch_2e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_c .. :try_end_c} :catch_2d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_c .. :try_end_c} :catch_2c
    .catchall {:try_start_c .. :try_end_c} :catchall_0

    .line 377
    move-object/from16 v40, v24

    .line 378
    .line 379
    :goto_e
    :try_start_d
    invoke-interface {v3}, Landroid/database/Cursor;->moveToNext()Z

    .line 380
    .line 381
    .line 382
    move-result v0
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_d .. :try_end_d} :catch_2b
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_d .. :try_end_d} :catch_29
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_28
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 383
    if-eqz v0, :cond_d

    .line 384
    .line 385
    const/4 v8, 0x0

    .line 386
    :try_start_e
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 387
    .line 388
    .line 389
    move-result-wide v34
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_e .. :try_end_e} :catch_25
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_e .. :try_end_e} :catch_24
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_23
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    .line 390
    const/4 v8, 0x1

    .line 391
    :try_start_f
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getInt(I)I

    .line 392
    .line 393
    .line 394
    move-result v0
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_f .. :try_end_f} :catch_22
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_f .. :try_end_f} :catch_21
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_20
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 395
    move-object/from16 v24, v9

    .line 396
    .line 397
    const/4 v8, 0x2

    .line 398
    :try_start_10
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getBlob(I)[B

    .line 399
    .line 400
    .line 401
    move-result-object v9

    .line 402
    iget-object v8, v7, Ly19;->z:Ltp8;
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_10 .. :try_end_10} :catch_1f
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_10 .. :try_end_10} :catch_1e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_1d
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 403
    .line 404
    move-object/from16 v26, v15

    .line 405
    .line 406
    const/4 v15, 0x0

    .line 407
    :try_start_11
    invoke-virtual {v8, v15, v4}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 408
    .line 409
    .line 410
    move-result v8
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_11 .. :try_end_11} :catch_1c
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_11 .. :try_end_11} :catch_1b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_1a
    .catchall {:try_start_11 .. :try_end_11} :catchall_2

    .line 411
    if-eqz v8, :cond_5

    .line 412
    .line 413
    move/from16 v8, v39

    .line 414
    .line 415
    :try_start_12
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 416
    .line 417
    .line 418
    move-result-object v15

    .line 419
    move/from16 v8, v38

    .line 420
    .line 421
    invoke-interface {v3, v8}, Landroid/database/Cursor;->getLong(I)J

    .line 422
    .line 423
    .line 424
    move-result-wide v27
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_12 .. :try_end_12} :catch_c
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_12 .. :try_end_12} :catch_a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_9
    .catchall {:try_start_12 .. :try_end_12} :catchall_2

    .line 425
    move-object v8, v3

    .line 426
    move-wide/from16 v67, v27

    .line 427
    .line 428
    move-object/from16 v27, v4

    .line 429
    .line 430
    move-wide/from16 v3, v67

    .line 431
    .line 432
    goto :goto_13

    .line 433
    :catchall_2
    move-exception v0

    .line 434
    move-object/from16 v28, v3

    .line 435
    .line 436
    :goto_f
    move-object/from16 v4, v40

    .line 437
    .line 438
    goto/16 :goto_27

    .line 439
    .line 440
    :catch_9
    move-exception v0

    .line 441
    move-object/from16 v28, v3

    .line 442
    .line 443
    :goto_10
    move-object/from16 v4, v40

    .line 444
    .line 445
    const/4 v8, 0x0

    .line 446
    goto/16 :goto_28

    .line 447
    .line 448
    :catch_a
    move-object/from16 v28, v3

    .line 449
    .line 450
    :catch_b
    :goto_11
    move-object/from16 v4, v40

    .line 451
    .line 452
    const/4 v8, 0x0

    .line 453
    goto/16 :goto_29

    .line 454
    .line 455
    :catch_c
    move-exception v0

    .line 456
    move-object/from16 v28, v3

    .line 457
    .line 458
    :goto_12
    move-object/from16 v4, v40

    .line 459
    .line 460
    const/4 v8, 0x0

    .line 461
    goto/16 :goto_2a

    .line 462
    .line 463
    :cond_5
    move-object v8, v3

    .line 464
    move-object/from16 v27, v4

    .line 465
    .line 466
    move-wide/from16 v3, v18

    .line 467
    .line 468
    const/4 v15, 0x0

    .line 469
    :goto_13
    if-nez v0, :cond_7

    .line 470
    .line 471
    move-object/from16 v28, v8

    .line 472
    .line 473
    :try_start_13
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 474
    .line 475
    .line 476
    move-result-object v8
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_13 .. :try_end_13} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_13 .. :try_end_13} :catch_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_d
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    .line 477
    :try_start_14
    array-length v0, v9

    .line 478
    const/4 v1, 0x0

    .line 479
    invoke-virtual {v8, v9, v1, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 480
    .line 481
    .line 482
    invoke-virtual {v8, v1}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 483
    .line 484
    .line 485
    sget-object v0, Lzr8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 486
    .line 487
    invoke-interface {v0, v8}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 488
    .line 489
    .line 490
    move-result-object v0

    .line 491
    check-cast v0, Lzr8;
    :try_end_14
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_14 .. :try_end_14} :catch_f
    .catchall {:try_start_14 .. :try_end_14} :catchall_4

    .line 492
    .line 493
    :try_start_15
    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    .line 494
    .line 495
    .line 496
    if-eqz v0, :cond_6

    .line 497
    .line 498
    new-instance v1, Lzy8;

    .line 499
    .line 500
    invoke-direct {v1, v0, v15, v3, v4}, Lzy8;-><init>(La3;Ljava/lang/String;J)V

    .line 501
    .line 502
    .line 503
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_15
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_15 .. :try_end_15} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_15 .. :try_end_15} :catch_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_15 .. :try_end_15} :catch_d
    .catchall {:try_start_15 .. :try_end_15} :catchall_3

    .line 504
    .line 505
    .line 506
    :cond_6
    :goto_14
    const/4 v3, 0x3

    .line 507
    const/4 v8, 0x0

    .line 508
    goto/16 :goto_22

    .line 509
    .line 510
    :catchall_3
    move-exception v0

    .line 511
    goto :goto_f

    .line 512
    :catch_d
    move-exception v0

    .line 513
    goto :goto_10

    .line 514
    :catch_e
    move-exception v0

    .line 515
    goto :goto_12

    .line 516
    :catchall_4
    move-exception v0

    .line 517
    goto :goto_15

    .line 518
    :catch_f
    :try_start_16
    iget-object v0, v7, Ly19;->B:Lpz8;

    .line 519
    .line 520
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 521
    .line 522
    .line 523
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 524
    .line 525
    const-string v1, "Failed to load event from local database"

    .line 526
    .line 527
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_4

    .line 528
    .line 529
    .line 530
    :try_start_17
    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    .line 531
    .line 532
    .line 533
    goto :goto_14

    .line 534
    :goto_15
    invoke-virtual {v8}, Landroid/os/Parcel;->recycle()V

    .line 535
    .line 536
    .line 537
    throw v0

    .line 538
    :cond_7
    move-object/from16 v28, v8

    .line 539
    .line 540
    const/4 v8, 0x1

    .line 541
    if-ne v0, v8, :cond_8

    .line 542
    .line 543
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 544
    .line 545
    .line 546
    move-result-object v1
    :try_end_17
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_17 .. :try_end_17} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_17 .. :try_end_17} :catch_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_17 .. :try_end_17} :catch_d
    .catchall {:try_start_17 .. :try_end_17} :catchall_3

    .line 547
    :try_start_18
    array-length v0, v9

    .line 548
    const/4 v8, 0x0

    .line 549
    invoke-virtual {v1, v9, v8, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 550
    .line 551
    .line 552
    invoke-virtual {v1, v8}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 553
    .line 554
    .line 555
    sget-object v0, Lz89;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 556
    .line 557
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 558
    .line 559
    .line 560
    move-result-object v0

    .line 561
    check-cast v0, Lz89;
    :try_end_18
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_18 .. :try_end_18} :catch_10
    .catchall {:try_start_18 .. :try_end_18} :catchall_5

    .line 562
    .line 563
    :try_start_19
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    :try_end_19
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_19 .. :try_end_19} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_19 .. :try_end_19} :catch_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_19 .. :try_end_19} :catch_d
    .catchall {:try_start_19 .. :try_end_19} :catchall_3

    .line 564
    .line 565
    .line 566
    goto :goto_16

    .line 567
    :catchall_5
    move-exception v0

    .line 568
    goto :goto_17

    .line 569
    :catch_10
    :try_start_1a
    iget-object v0, v7, Ly19;->B:Lpz8;

    .line 570
    .line 571
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 572
    .line 573
    .line 574
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 575
    .line 576
    const-string v8, "Failed to load user property from local database"

    .line 577
    .line 578
    invoke-virtual {v0, v8}, Lmz8;->a(Ljava/lang/String;)V
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_5

    .line 579
    .line 580
    .line 581
    :try_start_1b
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 582
    .line 583
    .line 584
    const/4 v0, 0x0

    .line 585
    :goto_16
    if-eqz v0, :cond_6

    .line 586
    .line 587
    new-instance v1, Lzy8;

    .line 588
    .line 589
    invoke-direct {v1, v0, v15, v3, v4}, Lzy8;-><init>(La3;Ljava/lang/String;J)V

    .line 590
    .line 591
    .line 592
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 593
    .line 594
    .line 595
    goto :goto_14

    .line 596
    :goto_17
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 597
    .line 598
    .line 599
    throw v0

    .line 600
    :cond_8
    const/4 v8, 0x2

    .line 601
    if-ne v0, v8, :cond_9

    .line 602
    .line 603
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 604
    .line 605
    .line 606
    move-result-object v1
    :try_end_1b
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1b .. :try_end_1b} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1b .. :try_end_1b} :catch_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1b .. :try_end_1b} :catch_d
    .catchall {:try_start_1b .. :try_end_1b} :catchall_3

    .line 607
    :try_start_1c
    array-length v0, v9

    .line 608
    const/4 v8, 0x0

    .line 609
    invoke-virtual {v1, v9, v8, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 610
    .line 611
    .line 612
    invoke-virtual {v1, v8}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 613
    .line 614
    .line 615
    sget-object v0, Lxn8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 616
    .line 617
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    check-cast v0, Lxn8;
    :try_end_1c
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_1c .. :try_end_1c} :catch_11
    .catchall {:try_start_1c .. :try_end_1c} :catchall_6

    .line 622
    .line 623
    :try_start_1d
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    :try_end_1d
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1d .. :try_end_1d} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1d .. :try_end_1d} :catch_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1d .. :try_end_1d} :catch_d
    .catchall {:try_start_1d .. :try_end_1d} :catchall_3

    .line 624
    .line 625
    .line 626
    goto :goto_18

    .line 627
    :catchall_6
    move-exception v0

    .line 628
    goto :goto_19

    .line 629
    :catch_11
    :try_start_1e
    iget-object v0, v7, Ly19;->B:Lpz8;

    .line 630
    .line 631
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 632
    .line 633
    .line 634
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 635
    .line 636
    const-string v8, "Failed to load conditional user property from local database"

    .line 637
    .line 638
    invoke-virtual {v0, v8}, Lmz8;->a(Ljava/lang/String;)V
    :try_end_1e
    .catchall {:try_start_1e .. :try_end_1e} :catchall_6

    .line 639
    .line 640
    .line 641
    :try_start_1f
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 642
    .line 643
    .line 644
    const/4 v0, 0x0

    .line 645
    :goto_18
    if-eqz v0, :cond_6

    .line 646
    .line 647
    new-instance v1, Lzy8;

    .line 648
    .line 649
    invoke-direct {v1, v0, v15, v3, v4}, Lzy8;-><init>(La3;Ljava/lang/String;J)V

    .line 650
    .line 651
    .line 652
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 653
    .line 654
    .line 655
    goto/16 :goto_14

    .line 656
    .line 657
    :goto_19
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 658
    .line 659
    .line 660
    throw v0
    :try_end_1f
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_1f .. :try_end_1f} :catch_e
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_1f .. :try_end_1f} :catch_b
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1f .. :try_end_1f} :catch_d
    .catchall {:try_start_1f .. :try_end_1f} :catchall_3

    .line 661
    :cond_9
    const/4 v8, 0x4

    .line 662
    if-ne v0, v8, :cond_b

    .line 663
    .line 664
    :try_start_20
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 665
    .line 666
    .line 667
    move-result-object v1
    :try_end_20
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_20 .. :try_end_20} :catch_19
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_20 .. :try_end_20} :catch_18
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_20 .. :try_end_20} :catch_17
    .catchall {:try_start_20 .. :try_end_20} :catchall_3

    .line 668
    :try_start_21
    array-length v0, v9
    :try_end_21
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_21 .. :try_end_21} :catch_15
    .catchall {:try_start_21 .. :try_end_21} :catchall_8

    .line 669
    const/4 v8, 0x0

    .line 670
    :try_start_22
    invoke-virtual {v1, v9, v8, v0}, Landroid/os/Parcel;->unmarshall([BII)V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v1, v8}, Landroid/os/Parcel;->setDataPosition(I)V

    .line 674
    .line 675
    .line 676
    sget-object v0, Lur8;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 677
    .line 678
    invoke-interface {v0, v1}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    move-result-object v0

    .line 682
    check-cast v0, Lur8;
    :try_end_22
    .catch Lcom/google/android/gms/common/internal/safeparcel/SafeParcelReader$ParseException; {:try_start_22 .. :try_end_22} :catch_16
    .catchall {:try_start_22 .. :try_end_22} :catchall_7

    .line 683
    .line 684
    :try_start_23
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V
    :try_end_23
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_23 .. :try_end_23} :catch_14
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_23 .. :try_end_23} :catch_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_23 .. :try_end_23} :catch_12
    .catchall {:try_start_23 .. :try_end_23} :catchall_3

    .line 685
    .line 686
    .line 687
    goto :goto_1d

    .line 688
    :catch_12
    move-exception v0

    .line 689
    :goto_1a
    move-object/from16 v4, v40

    .line 690
    .line 691
    goto/16 :goto_28

    .line 692
    .line 693
    :catch_13
    :goto_1b
    move-object/from16 v4, v40

    .line 694
    .line 695
    goto/16 :goto_29

    .line 696
    .line 697
    :catch_14
    move-exception v0

    .line 698
    :goto_1c
    move-object/from16 v4, v40

    .line 699
    .line 700
    goto/16 :goto_2a

    .line 701
    .line 702
    :catchall_7
    move-exception v0

    .line 703
    goto :goto_1e

    .line 704
    :catchall_8
    move-exception v0

    .line 705
    const/4 v8, 0x0

    .line 706
    goto :goto_1e

    .line 707
    :catch_15
    const/4 v8, 0x0

    .line 708
    :catch_16
    :try_start_24
    iget-object v0, v7, Ly19;->B:Lpz8;

    .line 709
    .line 710
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 711
    .line 712
    .line 713
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 714
    .line 715
    const-string v9, "Failed to load default event parameters from local database"

    .line 716
    .line 717
    invoke-virtual {v0, v9}, Lmz8;->a(Ljava/lang/String;)V
    :try_end_24
    .catchall {:try_start_24 .. :try_end_24} :catchall_7

    .line 718
    .line 719
    .line 720
    :try_start_25
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 721
    .line 722
    .line 723
    const/4 v0, 0x0

    .line 724
    :goto_1d
    if-eqz v0, :cond_a

    .line 725
    .line 726
    new-instance v1, Lzy8;

    .line 727
    .line 728
    invoke-direct {v1, v0, v15, v3, v4}, Lzy8;-><init>(La3;Ljava/lang/String;J)V

    .line 729
    .line 730
    .line 731
    invoke-virtual {v11, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 732
    .line 733
    .line 734
    :cond_a
    const/4 v3, 0x3

    .line 735
    goto :goto_22

    .line 736
    :goto_1e
    invoke-virtual {v1}, Landroid/os/Parcel;->recycle()V

    .line 737
    .line 738
    .line 739
    throw v0
    :try_end_25
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_25 .. :try_end_25} :catch_14
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_25 .. :try_end_25} :catch_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_25 .. :try_end_25} :catch_12
    .catchall {:try_start_25 .. :try_end_25} :catchall_3

    .line 740
    :catch_17
    move-exception v0

    .line 741
    :goto_1f
    const/4 v8, 0x0

    .line 742
    goto :goto_1a

    .line 743
    :catch_18
    :goto_20
    const/4 v8, 0x0

    .line 744
    goto :goto_1b

    .line 745
    :catch_19
    move-exception v0

    .line 746
    :goto_21
    const/4 v8, 0x0

    .line 747
    goto :goto_1c

    .line 748
    :cond_b
    const/4 v8, 0x0

    .line 749
    iget-object v1, v7, Ly19;->B:Lpz8;

    .line 750
    .line 751
    const/4 v3, 0x3

    .line 752
    if-ne v0, v3, :cond_c

    .line 753
    .line 754
    :try_start_26
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 755
    .line 756
    .line 757
    iget-object v0, v1, Lpz8;->J:Lmz8;

    .line 758
    .line 759
    const-string v1, "Skipping app launch break"

    .line 760
    .line 761
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 762
    .line 763
    .line 764
    goto :goto_22

    .line 765
    :cond_c
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 766
    .line 767
    .line 768
    iget-object v0, v1, Lpz8;->B:Lmz8;

    .line 769
    .line 770
    const-string v1, "Unknown record type in local database"

    .line 771
    .line 772
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    :goto_22
    move/from16 v39, v3

    .line 776
    .line 777
    move-object/from16 v9, v24

    .line 778
    .line 779
    move-object/from16 v15, v26

    .line 780
    .line 781
    move-object/from16 v4, v27

    .line 782
    .line 783
    move-object/from16 v3, v28

    .line 784
    .line 785
    const/4 v8, 0x2

    .line 786
    const/16 v38, 0x4

    .line 787
    .line 788
    goto/16 :goto_e

    .line 789
    .line 790
    :catch_1a
    move-exception v0

    .line 791
    move-object/from16 v28, v3

    .line 792
    .line 793
    goto :goto_1f

    .line 794
    :catch_1b
    move-object/from16 v28, v3

    .line 795
    .line 796
    goto :goto_20

    .line 797
    :catch_1c
    move-exception v0

    .line 798
    move-object/from16 v28, v3

    .line 799
    .line 800
    goto :goto_21

    .line 801
    :catch_1d
    move-exception v0

    .line 802
    move-object/from16 v28, v3

    .line 803
    .line 804
    :goto_23
    move-object/from16 v26, v15

    .line 805
    .line 806
    goto :goto_1f

    .line 807
    :catch_1e
    move-object/from16 v28, v3

    .line 808
    .line 809
    :goto_24
    move-object/from16 v26, v15

    .line 810
    .line 811
    goto :goto_20

    .line 812
    :catch_1f
    move-exception v0

    .line 813
    move-object/from16 v28, v3

    .line 814
    .line 815
    :goto_25
    move-object/from16 v26, v15

    .line 816
    .line 817
    goto :goto_21

    .line 818
    :catch_20
    move-exception v0

    .line 819
    move-object/from16 v28, v3

    .line 820
    .line 821
    move-object/from16 v24, v9

    .line 822
    .line 823
    goto :goto_23

    .line 824
    :catch_21
    move-object/from16 v28, v3

    .line 825
    .line 826
    move-object/from16 v24, v9

    .line 827
    .line 828
    goto :goto_24

    .line 829
    :catch_22
    move-exception v0

    .line 830
    move-object/from16 v28, v3

    .line 831
    .line 832
    move-object/from16 v24, v9

    .line 833
    .line 834
    goto :goto_25

    .line 835
    :catch_23
    move-exception v0

    .line 836
    move-object/from16 v28, v3

    .line 837
    .line 838
    move-object/from16 v24, v9

    .line 839
    .line 840
    move-object/from16 v26, v15

    .line 841
    .line 842
    goto/16 :goto_1a

    .line 843
    .line 844
    :catch_24
    move-object/from16 v28, v3

    .line 845
    .line 846
    move-object/from16 v24, v9

    .line 847
    .line 848
    move-object/from16 v26, v15

    .line 849
    .line 850
    goto/16 :goto_1b

    .line 851
    .line 852
    :catch_25
    move-exception v0

    .line 853
    move-object/from16 v28, v3

    .line 854
    .line 855
    move-object/from16 v24, v9

    .line 856
    .line 857
    move-object/from16 v26, v15

    .line 858
    .line 859
    goto/16 :goto_1c

    .line 860
    .line 861
    :cond_d
    move-object/from16 v28, v3

    .line 862
    .line 863
    move-object/from16 v24, v9

    .line 864
    .line 865
    move-object/from16 v26, v15

    .line 866
    .line 867
    const/4 v8, 0x0

    .line 868
    const-string v0, "messages"

    .line 869
    .line 870
    const-string v1, "rowid <= ?"

    .line 871
    .line 872
    invoke-static/range {v34 .. v35}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 873
    .line 874
    .line 875
    move-result-object v3

    .line 876
    filled-new-array {v3}, [Ljava/lang/String;

    .line 877
    .line 878
    .line 879
    move-result-object v3
    :try_end_26
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_26 .. :try_end_26} :catch_14
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_26 .. :try_end_26} :catch_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_26 .. :try_end_26} :catch_12
    .catchall {:try_start_26 .. :try_end_26} :catchall_3

    .line 880
    move-object/from16 v4, v40

    .line 881
    .line 882
    :try_start_27
    invoke-virtual {v4, v0, v1, v3}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 883
    .line 884
    .line 885
    move-result v0

    .line 886
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    .line 887
    .line 888
    .line 889
    move-result v1

    .line 890
    if-ge v0, v1, :cond_e

    .line 891
    .line 892
    iget-object v0, v7, Ly19;->B:Lpz8;

    .line 893
    .line 894
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 895
    .line 896
    .line 897
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 898
    .line 899
    const-string v1, "Fewer entries removed from local database than expected"

    .line 900
    .line 901
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 902
    .line 903
    .line 904
    goto :goto_26

    .line 905
    :catch_26
    move-exception v0

    .line 906
    goto :goto_28

    .line 907
    :catch_27
    move-exception v0

    .line 908
    goto :goto_2a

    .line 909
    :cond_e
    :goto_26
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 910
    .line 911
    .line 912
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V
    :try_end_27
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_27 .. :try_end_27} :catch_27
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_27 .. :try_end_27} :catch_2a
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_27 .. :try_end_27} :catch_26
    .catchall {:try_start_27 .. :try_end_27} :catchall_d

    .line 913
    .line 914
    .line 915
    invoke-interface/range {v28 .. v28}, Landroid/database/Cursor;->close()V

    .line 916
    .line 917
    .line 918
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 919
    .line 920
    .line 921
    goto/16 :goto_3a

    .line 922
    .line 923
    :goto_27
    move-object/from16 v11, v28

    .line 924
    .line 925
    goto/16 :goto_39

    .line 926
    .line 927
    :catch_28
    move-exception v0

    .line 928
    move-object/from16 v28, v3

    .line 929
    .line 930
    move-object/from16 v24, v9

    .line 931
    .line 932
    move-object/from16 v26, v15

    .line 933
    .line 934
    goto/16 :goto_10

    .line 935
    .line 936
    :goto_28
    const/16 v23, 0x5

    .line 937
    .line 938
    goto/16 :goto_34

    .line 939
    .line 940
    :catch_29
    move-object/from16 v28, v3

    .line 941
    .line 942
    move-object/from16 v24, v9

    .line 943
    .line 944
    move-object/from16 v26, v15

    .line 945
    .line 946
    goto/16 :goto_11

    .line 947
    .line 948
    :catch_2a
    :goto_29
    const/16 v23, 0x5

    .line 949
    .line 950
    goto/16 :goto_35

    .line 951
    .line 952
    :catch_2b
    move-exception v0

    .line 953
    move-object/from16 v28, v3

    .line 954
    .line 955
    move-object/from16 v24, v9

    .line 956
    .line 957
    move-object/from16 v26, v15

    .line 958
    .line 959
    goto/16 :goto_12

    .line 960
    .line 961
    :goto_2a
    const/16 v23, 0x5

    .line 962
    .line 963
    goto/16 :goto_37

    .line 964
    .line 965
    :catch_2c
    move-exception v0

    .line 966
    :goto_2b
    move-object/from16 v26, v15

    .line 967
    .line 968
    move-object/from16 v4, v24

    .line 969
    .line 970
    const/4 v8, 0x0

    .line 971
    move-object/from16 v24, v9

    .line 972
    .line 973
    const/16 v23, 0x5

    .line 974
    .line 975
    goto :goto_31

    .line 976
    :catch_2d
    :goto_2c
    move-object/from16 v26, v15

    .line 977
    .line 978
    move-object/from16 v4, v24

    .line 979
    .line 980
    const/4 v8, 0x0

    .line 981
    move-object/from16 v24, v9

    .line 982
    .line 983
    const/16 v23, 0x5

    .line 984
    .line 985
    goto :goto_32

    .line 986
    :catch_2e
    move-exception v0

    .line 987
    :goto_2d
    move-object/from16 v26, v15

    .line 988
    .line 989
    move-object/from16 v4, v24

    .line 990
    .line 991
    const/4 v8, 0x0

    .line 992
    move-object/from16 v24, v9

    .line 993
    .line 994
    const/16 v23, 0x5

    .line 995
    .line 996
    goto :goto_33

    .line 997
    :catch_2f
    move-object/from16 v26, v15

    .line 998
    .line 999
    move-object/from16 v4, v24

    .line 1000
    .line 1001
    const/4 v8, 0x0

    .line 1002
    move-object/from16 v24, v9

    .line 1003
    .line 1004
    move/from16 v23, v3

    .line 1005
    .line 1006
    goto :goto_32

    .line 1007
    :catch_30
    move-exception v0

    .line 1008
    move-object/from16 v37, v8

    .line 1009
    .line 1010
    goto :goto_2b

    .line 1011
    :catch_31
    move-object/from16 v37, v8

    .line 1012
    .line 1013
    goto :goto_2c

    .line 1014
    :catch_32
    move-exception v0

    .line 1015
    move-object/from16 v37, v8

    .line 1016
    .line 1017
    goto :goto_2d

    .line 1018
    :catchall_9
    move-exception v0

    .line 1019
    move/from16 v36, v4

    .line 1020
    .line 1021
    goto/16 :goto_9

    .line 1022
    .line 1023
    :catchall_a
    move-exception v0

    .line 1024
    move/from16 v36, v4

    .line 1025
    .line 1026
    move-object/from16 v37, v8

    .line 1027
    .line 1028
    move-object/from16 v26, v15

    .line 1029
    .line 1030
    move-object/from16 v4, v24

    .line 1031
    .line 1032
    const/4 v8, 0x0

    .line 1033
    const/16 v23, 0x5

    .line 1034
    .line 1035
    move-object/from16 v24, v9

    .line 1036
    .line 1037
    const/4 v3, 0x0

    .line 1038
    :goto_2e
    if-eqz v3, :cond_f

    .line 1039
    .line 1040
    :try_start_28
    invoke-interface {v3}, Landroid/database/Cursor;->close()V

    .line 1041
    .line 1042
    .line 1043
    goto :goto_2f

    .line 1044
    :catchall_b
    move-exception v0

    .line 1045
    goto :goto_30

    .line 1046
    :catch_33
    move-exception v0

    .line 1047
    goto :goto_31

    .line 1048
    :catch_34
    move-exception v0

    .line 1049
    goto :goto_33

    .line 1050
    :cond_f
    :goto_2f
    throw v0
    :try_end_28
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_28 .. :try_end_28} :catch_34
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_28 .. :try_end_28} :catch_35
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_28 .. :try_end_28} :catch_33
    .catchall {:try_start_28 .. :try_end_28} :catchall_b

    .line 1051
    :goto_30
    const/4 v11, 0x0

    .line 1052
    goto/16 :goto_39

    .line 1053
    .line 1054
    :goto_31
    const/16 v28, 0x0

    .line 1055
    .line 1056
    goto :goto_34

    .line 1057
    :catch_35
    :goto_32
    const/16 v28, 0x0

    .line 1058
    .line 1059
    goto :goto_35

    .line 1060
    :goto_33
    const/16 v28, 0x0

    .line 1061
    .line 1062
    goto/16 :goto_37

    .line 1063
    .line 1064
    :catchall_c
    move-exception v0

    .line 1065
    const/4 v4, 0x0

    .line 1066
    goto :goto_30

    .line 1067
    :catch_36
    move-exception v0

    .line 1068
    move/from16 v36, v4

    .line 1069
    .line 1070
    move-object/from16 v37, v8

    .line 1071
    .line 1072
    move-object/from16 v24, v9

    .line 1073
    .line 1074
    move-object/from16 v26, v15

    .line 1075
    .line 1076
    const/4 v8, 0x0

    .line 1077
    const/16 v23, 0x5

    .line 1078
    .line 1079
    const/4 v4, 0x0

    .line 1080
    goto :goto_31

    .line 1081
    :goto_34
    if-eqz v4, :cond_10

    .line 1082
    .line 1083
    :try_start_29
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 1084
    .line 1085
    .line 1086
    move-result v1

    .line 1087
    if-eqz v1, :cond_10

    .line 1088
    .line 1089
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 1090
    .line 1091
    .line 1092
    :cond_10
    iget-object v1, v7, Ly19;->B:Lpz8;

    .line 1093
    .line 1094
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 1095
    .line 1096
    .line 1097
    iget-object v1, v1, Lpz8;->B:Lmz8;

    .line 1098
    .line 1099
    invoke-virtual {v1, v14, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1100
    .line 1101
    .line 1102
    const/4 v3, 0x1

    .line 1103
    iput-boolean v3, v13, Lcz8;->z:Z
    :try_end_29
    .catchall {:try_start_29 .. :try_end_29} :catchall_d

    .line 1104
    .line 1105
    if-eqz v28, :cond_11

    .line 1106
    .line 1107
    invoke-interface/range {v28 .. v28}, Landroid/database/Cursor;->close()V

    .line 1108
    .line 1109
    .line 1110
    :cond_11
    if-eqz v4, :cond_14

    .line 1111
    .line 1112
    goto :goto_36

    .line 1113
    :catch_37
    move/from16 v36, v4

    .line 1114
    .line 1115
    move-object/from16 v37, v8

    .line 1116
    .line 1117
    move-object/from16 v24, v9

    .line 1118
    .line 1119
    move-object/from16 v26, v15

    .line 1120
    .line 1121
    const/4 v8, 0x0

    .line 1122
    const/16 v23, 0x5

    .line 1123
    .line 1124
    const/4 v4, 0x0

    .line 1125
    goto :goto_32

    .line 1126
    :goto_35
    int-to-long v0, v6

    .line 1127
    :try_start_2a
    invoke-static {v0, v1}, Landroid/os/SystemClock;->sleep(J)V
    :try_end_2a
    .catchall {:try_start_2a .. :try_end_2a} :catchall_d

    .line 1128
    .line 1129
    .line 1130
    add-int/lit8 v6, v6, 0x14

    .line 1131
    .line 1132
    if-eqz v28, :cond_12

    .line 1133
    .line 1134
    invoke-interface/range {v28 .. v28}, Landroid/database/Cursor;->close()V

    .line 1135
    .line 1136
    .line 1137
    :cond_12
    if-eqz v4, :cond_14

    .line 1138
    .line 1139
    :goto_36
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 1140
    .line 1141
    .line 1142
    goto :goto_38

    .line 1143
    :catchall_d
    move-exception v0

    .line 1144
    goto/16 :goto_27

    .line 1145
    .line 1146
    :catch_38
    move-exception v0

    .line 1147
    move/from16 v36, v4

    .line 1148
    .line 1149
    move-object/from16 v37, v8

    .line 1150
    .line 1151
    move-object/from16 v24, v9

    .line 1152
    .line 1153
    move-object/from16 v26, v15

    .line 1154
    .line 1155
    const/4 v8, 0x0

    .line 1156
    const/16 v23, 0x5

    .line 1157
    .line 1158
    const/4 v4, 0x0

    .line 1159
    goto :goto_33

    .line 1160
    :goto_37
    :try_start_2b
    iget-object v1, v7, Ly19;->B:Lpz8;

    .line 1161
    .line 1162
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 1163
    .line 1164
    .line 1165
    iget-object v1, v1, Lpz8;->B:Lmz8;

    .line 1166
    .line 1167
    invoke-virtual {v1, v14, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1168
    .line 1169
    .line 1170
    const/4 v3, 0x1

    .line 1171
    iput-boolean v3, v13, Lcz8;->z:Z
    :try_end_2b
    .catchall {:try_start_2b .. :try_end_2b} :catchall_d

    .line 1172
    .line 1173
    if-eqz v28, :cond_13

    .line 1174
    .line 1175
    invoke-interface/range {v28 .. v28}, Landroid/database/Cursor;->close()V

    .line 1176
    .line 1177
    .line 1178
    :cond_13
    if-eqz v4, :cond_14

    .line 1179
    .line 1180
    goto :goto_36

    .line 1181
    :cond_14
    :goto_38
    add-int/lit8 v4, v36, 0x1

    .line 1182
    .line 1183
    move/from16 v3, v23

    .line 1184
    .line 1185
    move-object/from16 v9, v24

    .line 1186
    .line 1187
    move-object/from16 v15, v26

    .line 1188
    .line 1189
    move-object/from16 v8, v37

    .line 1190
    .line 1191
    goto/16 :goto_3

    .line 1192
    .line 1193
    :goto_39
    if-eqz v11, :cond_15

    .line 1194
    .line 1195
    invoke-interface {v11}, Landroid/database/Cursor;->close()V

    .line 1196
    .line 1197
    .line 1198
    :cond_15
    if-eqz v4, :cond_16

    .line 1199
    .line 1200
    invoke-virtual {v4}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 1201
    .line 1202
    .line 1203
    :cond_16
    throw v0

    .line 1204
    :cond_17
    const/4 v8, 0x0

    .line 1205
    iget-object v0, v7, Ly19;->B:Lpz8;

    .line 1206
    .line 1207
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 1208
    .line 1209
    .line 1210
    iget-object v0, v0, Lpz8;->E:Lmz8;

    .line 1211
    .line 1212
    const-string v1, "Failed to read events from database in reasonable time"

    .line 1213
    .line 1214
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 1215
    .line 1216
    .line 1217
    goto/16 :goto_2

    .line 1218
    .line 1219
    :cond_18
    move-object/from16 v21, v4

    .line 1220
    .line 1221
    move-object/from16 v22, v6

    .line 1222
    .line 1223
    const/4 v8, 0x0

    .line 1224
    :goto_3a
    if-eqz v11, :cond_19

    .line 1225
    .line 1226
    invoke-virtual {v12, v11}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1227
    .line 1228
    .line 1229
    invoke-interface {v11}, Ljava/util/List;->size()I

    .line 1230
    .line 1231
    .line 1232
    move-result v0

    .line 1233
    move v1, v0

    .line 1234
    goto :goto_3b

    .line 1235
    :cond_19
    move v1, v8

    .line 1236
    :goto_3b
    move/from16 v3, p0

    .line 1237
    .line 1238
    if-eqz v2, :cond_1a

    .line 1239
    .line 1240
    if-ge v1, v3, :cond_1a

    .line 1241
    .line 1242
    iget-object v0, v10, Lz99;->y:Ljava/lang/String;

    .line 1243
    .line 1244
    iget-wide v6, v10, Lz99;->F:J

    .line 1245
    .line 1246
    new-instance v4, Lzy8;

    .line 1247
    .line 1248
    invoke-direct {v4, v2, v0, v6, v7}, Lzy8;-><init>(La3;Ljava/lang/String;J)V

    .line 1249
    .line 1250
    .line 1251
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1252
    .line 1253
    .line 1254
    :cond_1a
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 1255
    .line 1256
    .line 1257
    move-result v4

    .line 1258
    move v6, v8

    .line 1259
    :goto_3c
    if-ge v6, v4, :cond_23

    .line 1260
    .line 1261
    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    check-cast v0, Lzy8;

    .line 1266
    .line 1267
    iget-object v7, v0, Lzy8;->a:La3;

    .line 1268
    .line 1269
    sget-object v9, Lby8;->W0:Lay8;

    .line 1270
    .line 1271
    const/4 v15, 0x0

    .line 1272
    invoke-virtual {v5, v15, v9}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 1273
    .line 1274
    .line 1275
    move-result v11

    .line 1276
    if-eqz v11, :cond_1b

    .line 1277
    .line 1278
    iget-object v11, v0, Lzy8;->b:Ljava/lang/String;

    .line 1279
    .line 1280
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1281
    .line 1282
    .line 1283
    move-result v13

    .line 1284
    if-nez v13, :cond_1b

    .line 1285
    .line 1286
    iget-wide v13, v0, Lzy8;->c:J

    .line 1287
    .line 1288
    iget-object v0, v10, Lz99;->w:Ljava/lang/String;

    .line 1289
    .line 1290
    iget-object v15, v10, Lz99;->x:Ljava/lang/String;

    .line 1291
    .line 1292
    iget-object v3, v10, Lz99;->z:Ljava/lang/String;

    .line 1293
    .line 1294
    move-object/from16 v65, v9

    .line 1295
    .line 1296
    iget-wide v8, v10, Lz99;->A:J

    .line 1297
    .line 1298
    move-object/from16 v24, v0

    .line 1299
    .line 1300
    move/from16 v66, v1

    .line 1301
    .line 1302
    iget-wide v0, v10, Lz99;->B:J

    .line 1303
    .line 1304
    move-wide/from16 v32, v0

    .line 1305
    .line 1306
    iget-object v0, v10, Lz99;->C:Ljava/lang/String;

    .line 1307
    .line 1308
    iget-boolean v1, v10, Lz99;->D:Z

    .line 1309
    .line 1310
    move-object/from16 v34, v0

    .line 1311
    .line 1312
    iget-boolean v0, v10, Lz99;->E:Z

    .line 1313
    .line 1314
    move/from16 v36, v0

    .line 1315
    .line 1316
    iget-object v0, v10, Lz99;->G:Ljava/lang/String;

    .line 1317
    .line 1318
    move-object/from16 v37, v0

    .line 1319
    .line 1320
    move/from16 v35, v1

    .line 1321
    .line 1322
    iget-wide v0, v10, Lz99;->H:J

    .line 1323
    .line 1324
    move-wide/from16 v38, v0

    .line 1325
    .line 1326
    iget v0, v10, Lz99;->I:I

    .line 1327
    .line 1328
    iget-boolean v1, v10, Lz99;->J:Z

    .line 1329
    .line 1330
    move/from16 v40, v0

    .line 1331
    .line 1332
    iget-boolean v0, v10, Lz99;->K:Z

    .line 1333
    .line 1334
    move/from16 v42, v0

    .line 1335
    .line 1336
    iget-object v0, v10, Lz99;->L:Ljava/lang/Boolean;

    .line 1337
    .line 1338
    move-object/from16 v43, v0

    .line 1339
    .line 1340
    move/from16 v41, v1

    .line 1341
    .line 1342
    iget-wide v0, v10, Lz99;->M:J

    .line 1343
    .line 1344
    move-wide/from16 v44, v0

    .line 1345
    .line 1346
    iget-object v0, v10, Lz99;->N:Ljava/util/List;

    .line 1347
    .line 1348
    iget-object v1, v10, Lz99;->O:Ljava/lang/String;

    .line 1349
    .line 1350
    move-object/from16 v46, v0

    .line 1351
    .line 1352
    iget-object v0, v10, Lz99;->P:Ljava/lang/String;

    .line 1353
    .line 1354
    move-object/from16 v48, v0

    .line 1355
    .line 1356
    iget-object v0, v10, Lz99;->Q:Ljava/lang/String;

    .line 1357
    .line 1358
    move-object/from16 v49, v0

    .line 1359
    .line 1360
    iget-boolean v0, v10, Lz99;->R:Z

    .line 1361
    .line 1362
    move/from16 v50, v0

    .line 1363
    .line 1364
    move-object/from16 v47, v1

    .line 1365
    .line 1366
    iget-wide v0, v10, Lz99;->S:J

    .line 1367
    .line 1368
    move-wide/from16 v51, v0

    .line 1369
    .line 1370
    iget v0, v10, Lz99;->T:I

    .line 1371
    .line 1372
    iget-object v1, v10, Lz99;->U:Ljava/lang/String;

    .line 1373
    .line 1374
    move/from16 v53, v0

    .line 1375
    .line 1376
    iget v0, v10, Lz99;->V:I

    .line 1377
    .line 1378
    move/from16 v55, v0

    .line 1379
    .line 1380
    move-object/from16 v54, v1

    .line 1381
    .line 1382
    iget-wide v0, v10, Lz99;->W:J

    .line 1383
    .line 1384
    move-wide/from16 v56, v0

    .line 1385
    .line 1386
    iget-object v0, v10, Lz99;->X:Ljava/lang/String;

    .line 1387
    .line 1388
    iget-object v1, v10, Lz99;->Y:Ljava/lang/String;

    .line 1389
    .line 1390
    move-object/from16 v58, v0

    .line 1391
    .line 1392
    move-object/from16 v59, v1

    .line 1393
    .line 1394
    iget-wide v0, v10, Lz99;->Z:J

    .line 1395
    .line 1396
    move-wide/from16 v60, v0

    .line 1397
    .line 1398
    iget v0, v10, Lz99;->a0:I

    .line 1399
    .line 1400
    move/from16 v62, v0

    .line 1401
    .line 1402
    iget-wide v0, v10, Lz99;->b0:J

    .line 1403
    .line 1404
    new-instance v23, Lz99;

    .line 1405
    .line 1406
    move-wide/from16 v63, v0

    .line 1407
    .line 1408
    move-object/from16 v29, v3

    .line 1409
    .line 1410
    move-wide/from16 v30, v8

    .line 1411
    .line 1412
    move-object/from16 v26, v11

    .line 1413
    .line 1414
    move-wide/from16 v27, v13

    .line 1415
    .line 1416
    move-object/from16 v25, v15

    .line 1417
    .line 1418
    invoke-direct/range {v23 .. v64}, Lz99;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;JJLjava/lang/String;ZZLjava/lang/String;JIZZLjava/lang/Boolean;JLjava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZJILjava/lang/String;IJLjava/lang/String;Ljava/lang/String;JIJ)V

    .line 1419
    .line 1420
    .line 1421
    move-object/from16 v10, v23

    .line 1422
    .line 1423
    goto :goto_3d

    .line 1424
    :cond_1b
    move/from16 v66, v1

    .line 1425
    .line 1426
    move-object/from16 v65, v9

    .line 1427
    .line 1428
    :goto_3d
    instance-of v0, v7, Lzr8;

    .line 1429
    .line 1430
    if-eqz v0, :cond_1f

    .line 1431
    .line 1432
    :try_start_2c
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1433
    .line 1434
    .line 1435
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1436
    .line 1437
    .line 1438
    move-result-wide v26
    :try_end_2c
    .catch Landroid/os/RemoteException; {:try_start_2c .. :try_end_2c} :catch_3e

    .line 1439
    :try_start_2d
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1440
    .line 1441
    .line 1442
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1443
    .line 1444
    .line 1445
    move-result-wide v8
    :try_end_2d
    .catch Landroid/os/RemoteException; {:try_start_2d .. :try_end_2d} :catch_3d

    .line 1446
    :try_start_2e
    check-cast v7, Lzr8;
    :try_end_2e
    .catch Landroid/os/RemoteException; {:try_start_2e .. :try_end_2e} :catch_3c

    .line 1447
    .line 1448
    move-object/from16 v1, p1

    .line 1449
    .line 1450
    :try_start_2f
    invoke-interface {v1, v7, v10}, Liy8;->r(Lzr8;Lz99;)V

    .line 1451
    .line 1452
    .line 1453
    invoke-static/range {v22 .. v22}, Ly19;->g(Ly29;)V
    :try_end_2f
    .catch Landroid/os/RemoteException; {:try_start_2f .. :try_end_2f} :catch_3b

    .line 1454
    .line 1455
    .line 1456
    move-object/from16 v3, v22

    .line 1457
    .line 1458
    :try_start_30
    iget-object v0, v3, Lpz8;->J:Lmz8;

    .line 1459
    .line 1460
    const-string v7, "Logging telemetry for logEvent from database"

    .line 1461
    .line 1462
    invoke-virtual {v0, v7}, Lmz8;->a(Ljava/lang/String;)V

    .line 1463
    .line 1464
    .line 1465
    sget-object v0, Lfm8;->A:Lfm8;

    .line 1466
    .line 1467
    if-nez v0, :cond_1c

    .line 1468
    .line 1469
    new-instance v0, Lfm8;
    :try_end_30
    .catch Landroid/os/RemoteException; {:try_start_30 .. :try_end_30} :catch_3a

    .line 1470
    .line 1471
    move-object/from16 v11, v20

    .line 1472
    .line 1473
    move-object/from16 v13, v21

    .line 1474
    .line 1475
    :try_start_31
    invoke-direct {v0, v13, v11}, Lfm8;-><init>(Landroid/content/Context;Ly19;)V

    .line 1476
    .line 1477
    .line 1478
    sput-object v0, Lfm8;->A:Lfm8;

    .line 1479
    .line 1480
    goto :goto_3e

    .line 1481
    :cond_1c
    move-object/from16 v11, v20

    .line 1482
    .line 1483
    move-object/from16 v13, v21

    .line 1484
    .line 1485
    :goto_3e
    sget-object v23, Lfm8;->A:Lfm8;

    .line 1486
    .line 1487
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1488
    .line 1489
    .line 1490
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1491
    .line 1492
    .line 1493
    move-result-wide v28

    .line 1494
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1495
    .line 1496
    .line 1497
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1498
    .line 1499
    .line 1500
    move-result-wide v14

    .line 1501
    sub-long/2addr v14, v8

    .line 1502
    long-to-int v0, v14

    .line 1503
    const/16 v24, 0x0

    .line 1504
    .line 1505
    move/from16 v25, v0

    .line 1506
    .line 1507
    invoke-virtual/range {v23 .. v29}, Lfm8;->e(IIJJ)V
    :try_end_31
    .catch Landroid/os/RemoteException; {:try_start_31 .. :try_end_31} :catch_39

    .line 1508
    .line 1509
    .line 1510
    :cond_1d
    :goto_3f
    const/4 v15, 0x0

    .line 1511
    goto/16 :goto_43

    .line 1512
    .line 1513
    :catch_39
    move-exception v0

    .line 1514
    goto :goto_41

    .line 1515
    :catch_3a
    move-exception v0

    .line 1516
    move-object/from16 v11, v20

    .line 1517
    .line 1518
    move-object/from16 v13, v21

    .line 1519
    .line 1520
    goto :goto_41

    .line 1521
    :catch_3b
    move-exception v0

    .line 1522
    :goto_40
    move-object/from16 v11, v20

    .line 1523
    .line 1524
    move-object/from16 v13, v21

    .line 1525
    .line 1526
    move-object/from16 v3, v22

    .line 1527
    .line 1528
    goto :goto_41

    .line 1529
    :catch_3c
    move-exception v0

    .line 1530
    move-object/from16 v1, p1

    .line 1531
    .line 1532
    goto :goto_40

    .line 1533
    :goto_41
    move-wide/from16 v23, v26

    .line 1534
    .line 1535
    goto :goto_42

    .line 1536
    :catch_3d
    move-exception v0

    .line 1537
    move-object/from16 v1, p1

    .line 1538
    .line 1539
    move-object/from16 v11, v20

    .line 1540
    .line 1541
    move-object/from16 v13, v21

    .line 1542
    .line 1543
    move-object/from16 v3, v22

    .line 1544
    .line 1545
    move-wide/from16 v8, v18

    .line 1546
    .line 1547
    goto :goto_41

    .line 1548
    :catch_3e
    move-exception v0

    .line 1549
    move-object/from16 v1, p1

    .line 1550
    .line 1551
    move-object/from16 v11, v20

    .line 1552
    .line 1553
    move-object/from16 v13, v21

    .line 1554
    .line 1555
    move-object/from16 v3, v22

    .line 1556
    .line 1557
    move-wide/from16 v8, v18

    .line 1558
    .line 1559
    move-wide/from16 v23, v8

    .line 1560
    .line 1561
    :goto_42
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 1562
    .line 1563
    .line 1564
    iget-object v7, v3, Lpz8;->B:Lmz8;

    .line 1565
    .line 1566
    const-string v14, "Failed to send event to the service"

    .line 1567
    .line 1568
    invoke-virtual {v7, v14, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1569
    .line 1570
    .line 1571
    cmp-long v0, v23, v18

    .line 1572
    .line 1573
    if-eqz v0, :cond_1d

    .line 1574
    .line 1575
    sget-object v0, Lfm8;->A:Lfm8;

    .line 1576
    .line 1577
    if-nez v0, :cond_1e

    .line 1578
    .line 1579
    new-instance v0, Lfm8;

    .line 1580
    .line 1581
    invoke-direct {v0, v13, v11}, Lfm8;-><init>(Landroid/content/Context;Ly19;)V

    .line 1582
    .line 1583
    .line 1584
    sput-object v0, Lfm8;->A:Lfm8;

    .line 1585
    .line 1586
    :cond_1e
    sget-object v20, Lfm8;->A:Lfm8;

    .line 1587
    .line 1588
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1589
    .line 1590
    .line 1591
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1592
    .line 1593
    .line 1594
    move-result-wide v25

    .line 1595
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1596
    .line 1597
    .line 1598
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 1599
    .line 1600
    .line 1601
    move-result-wide v14

    .line 1602
    sub-long/2addr v14, v8

    .line 1603
    long-to-int v0, v14

    .line 1604
    const/16 v21, 0xd

    .line 1605
    .line 1606
    move/from16 v22, v0

    .line 1607
    .line 1608
    invoke-virtual/range {v20 .. v26}, Lfm8;->e(IIJJ)V

    .line 1609
    .line 1610
    .line 1611
    goto :goto_3f

    .line 1612
    :cond_1f
    move-object/from16 v1, p1

    .line 1613
    .line 1614
    move-object/from16 v11, v20

    .line 1615
    .line 1616
    move-object/from16 v13, v21

    .line 1617
    .line 1618
    move-object/from16 v3, v22

    .line 1619
    .line 1620
    instance-of v0, v7, Lz89;

    .line 1621
    .line 1622
    if-eqz v0, :cond_20

    .line 1623
    .line 1624
    :try_start_32
    check-cast v7, Lz89;

    .line 1625
    .line 1626
    invoke-interface {v1, v7, v10}, Liy8;->o(Lz89;Lz99;)V
    :try_end_32
    .catch Landroid/os/RemoteException; {:try_start_32 .. :try_end_32} :catch_3f

    .line 1627
    .line 1628
    .line 1629
    goto :goto_3f

    .line 1630
    :catch_3f
    move-exception v0

    .line 1631
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 1632
    .line 1633
    .line 1634
    iget-object v7, v3, Lpz8;->B:Lmz8;

    .line 1635
    .line 1636
    const-string v8, "Failed to send user property to the service"

    .line 1637
    .line 1638
    invoke-virtual {v7, v8, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1639
    .line 1640
    .line 1641
    goto/16 :goto_3f

    .line 1642
    .line 1643
    :cond_20
    instance-of v0, v7, Lxn8;

    .line 1644
    .line 1645
    if-eqz v0, :cond_21

    .line 1646
    .line 1647
    :try_start_33
    check-cast v7, Lxn8;

    .line 1648
    .line 1649
    invoke-interface {v1, v7, v10}, Liy8;->y(Lxn8;Lz99;)V
    :try_end_33
    .catch Landroid/os/RemoteException; {:try_start_33 .. :try_end_33} :catch_40

    .line 1650
    .line 1651
    .line 1652
    goto/16 :goto_3f

    .line 1653
    .line 1654
    :catch_40
    move-exception v0

    .line 1655
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 1656
    .line 1657
    .line 1658
    iget-object v7, v3, Lpz8;->B:Lmz8;

    .line 1659
    .line 1660
    const-string v8, "Failed to send conditional user property to the service"

    .line 1661
    .line 1662
    invoke-virtual {v7, v8, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1663
    .line 1664
    .line 1665
    goto/16 :goto_3f

    .line 1666
    .line 1667
    :cond_21
    move-object/from16 v0, v65

    .line 1668
    .line 1669
    const/4 v15, 0x0

    .line 1670
    invoke-virtual {v5, v15, v0}, Ltp8;->n1(Ljava/lang/String;Lay8;)Z

    .line 1671
    .line 1672
    .line 1673
    move-result v0

    .line 1674
    if-eqz v0, :cond_22

    .line 1675
    .line 1676
    instance-of v0, v7, Lur8;

    .line 1677
    .line 1678
    if-eqz v0, :cond_22

    .line 1679
    .line 1680
    :try_start_34
    check-cast v7, Lur8;

    .line 1681
    .line 1682
    invoke-virtual {v7}, Lur8;->l()Landroid/os/Bundle;

    .line 1683
    .line 1684
    .line 1685
    move-result-object v0

    .line 1686
    invoke-interface {v1, v0, v10}, Liy8;->j(Landroid/os/Bundle;Lz99;)V
    :try_end_34
    .catch Landroid/os/RemoteException; {:try_start_34 .. :try_end_34} :catch_41

    .line 1687
    .line 1688
    .line 1689
    goto :goto_43

    .line 1690
    :catch_41
    move-exception v0

    .line 1691
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 1692
    .line 1693
    .line 1694
    iget-object v7, v3, Lpz8;->B:Lmz8;

    .line 1695
    .line 1696
    const-string v8, "Failed to send default event parameters to the service"

    .line 1697
    .line 1698
    invoke-virtual {v7, v8, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1699
    .line 1700
    .line 1701
    goto :goto_43

    .line 1702
    :cond_22
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 1703
    .line 1704
    .line 1705
    iget-object v0, v3, Lpz8;->B:Lmz8;

    .line 1706
    .line 1707
    const-string v7, "Discarding data. Unrecognized parcel type."

    .line 1708
    .line 1709
    invoke-virtual {v0, v7}, Lmz8;->a(Ljava/lang/String;)V

    .line 1710
    .line 1711
    .line 1712
    :goto_43
    add-int/lit8 v6, v6, 0x1

    .line 1713
    .line 1714
    move-object/from16 v22, v3

    .line 1715
    .line 1716
    move-object/from16 v20, v11

    .line 1717
    .line 1718
    move-object/from16 v21, v13

    .line 1719
    .line 1720
    move/from16 v1, v66

    .line 1721
    .line 1722
    const/16 v3, 0x64

    .line 1723
    .line 1724
    const/4 v8, 0x0

    .line 1725
    goto/16 :goto_3c

    .line 1726
    .line 1727
    :cond_23
    move/from16 v66, v1

    .line 1728
    .line 1729
    move-object/from16 v11, v20

    .line 1730
    .line 1731
    move-object/from16 v13, v21

    .line 1732
    .line 1733
    move-object/from16 v3, v22

    .line 1734
    .line 1735
    move-object/from16 v1, p1

    .line 1736
    .line 1737
    add-int/lit8 v0, p3, 0x1

    .line 1738
    .line 1739
    move-object v6, v3

    .line 1740
    move-object v3, v11

    .line 1741
    move-object v4, v13

    .line 1742
    move-object/from16 v7, v17

    .line 1743
    .line 1744
    const/16 v9, 0x64

    .line 1745
    .line 1746
    move v11, v0

    .line 1747
    move/from16 v0, v66

    .line 1748
    .line 1749
    goto/16 :goto_0

    .line 1750
    .line 1751
    :cond_24
    return-void
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

.method public final v1(Lxn8;)V
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
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ly19;->i()Lcz8;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, Ly19;

    .line 21
    .line 22
    iget-object v2, v1, Ly19;->E:Ld99;

    .line 23
    .line 24
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Ld99;->L1(Landroid/os/Parcelable;)[B

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    array-length v3, v2

    .line 32
    const/high16 v4, 0x20000

    .line 33
    .line 34
    if-le v3, v4, :cond_0

    .line 35
    .line 36
    iget-object v0, v1, Ly19;->B:Lpz8;

    .line 37
    .line 38
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 39
    .line 40
    .line 41
    iget-object v0, v0, Lpz8;->C:Lmz8;

    .line 42
    .line 43
    const-string v1, "Conditional user property too long for local database. Sending directly to service"

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    const/4 v0, 0x0

    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v1, 0x2

    .line 51
    invoke-virtual {v0, v1, v2}, Lcz8;->j1(I[B)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_0
    new-instance v1, Lxn8;

    .line 56
    .line 57
    invoke-direct {v1, p1}, Lxn8;-><init>(Lxn8;)V

    .line 58
    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    invoke-virtual {p0, p1}, Lr69;->s1(Z)Lz99;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance v2, Lhy8;

    .line 66
    .line 67
    invoke-direct {v2, p0, p1, v0, v1}, Lhy8;-><init>(Lr69;Lz99;ZLxn8;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v2}, Lr69;->q1(Ljava/lang/Runnable;)V

    .line 71
    .line 72
    .line 73
    return-void
    .line 74
    .line 75
    .line 76
.end method
