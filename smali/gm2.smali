.class public final Lgm2;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final A:Ljava/lang/String;

.field public static final B:J


# instance fields
.field public final w:Landroid/content/Context;

.field public final x:Lnd8;

.field public final y:Lbr4;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "ForceStopRunnable"

    .line 2
    .line 3
    invoke-static {v0}, Lbc4;->p(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Lgm2;->A:Ljava/lang/String;

    .line 8
    .line 9
    const-wide v0, 0x496cebb800L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    sput-wide v0, Lgm2;->B:J

    .line 15
    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public constructor <init>(Landroid/content/Context;Lnd8;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lgm2;->w:Landroid/content/Context;

    .line 9
    .line 10
    iput-object p2, p0, Lgm2;->x:Lnd8;

    .line 11
    .line 12
    iget-object p1, p2, Lnd8;->g:Lbr4;

    .line 13
    .line 14
    iput-object p1, p0, Lgm2;->y:Lbr4;

    .line 15
    .line 16
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lgm2;->z:I

    .line 18
    .line 19
    return-void
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

.method public static c(Landroid/content/Context;)V
    .locals 5

    .line 1
    const-string v0, "alarm"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/AlarmManager;

    .line 8
    .line 9
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 10
    .line 11
    const/16 v2, 0x1f

    .line 12
    .line 13
    if-lt v1, v2, :cond_0

    .line 14
    .line 15
    const/high16 v1, 0xa000000

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/high16 v1, 0x8000000

    .line 19
    .line 20
    :goto_0
    new-instance v2, Landroid/content/Intent;

    .line 21
    .line 22
    invoke-direct {v2}, Landroid/content/Intent;-><init>()V

    .line 23
    .line 24
    .line 25
    new-instance v3, Landroid/content/ComponentName;

    .line 26
    .line 27
    const-class v4, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 28
    .line 29
    invoke-direct {v3, p0, v4}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 33
    .line 34
    .line 35
    const-string v3, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 38
    .line 39
    .line 40
    const/4 v3, -0x1

    .line 41
    invoke-static {p0, v3, v2, v1}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v1

    .line 49
    sget-wide v3, Lgm2;->B:J

    .line 50
    .line 51
    add-long/2addr v1, v3

    .line 52
    if-eqz v0, :cond_1

    .line 53
    .line 54
    const/4 v3, 0x0

    .line 55
    invoke-virtual {v0, v3, v1, v2, p0}, Landroid/app/AlarmManager;->setExact(IJLandroid/app/PendingIntent;)V

    .line 56
    .line 57
    .line 58
    :cond_1
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
.end method


# virtual methods
.method public final a()V
    .locals 20

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "last_force_stop_ms"

    .line 4
    .line 5
    iget-object v2, v0, Lgm2;->y:Lbr4;

    .line 6
    .line 7
    iget-object v3, v0, Lgm2;->x:Lnd8;

    .line 8
    .line 9
    iget-object v4, v3, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 10
    .line 11
    iget-object v5, v3, Lnd8;->b:Lf01;

    .line 12
    .line 13
    iget-object v6, v3, Lnd8;->g:Lbr4;

    .line 14
    .line 15
    iget-object v7, v3, Lnd8;->c:Landroidx/work/impl/WorkDatabase;

    .line 16
    .line 17
    sget-object v8, Lna7;->B:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v0, v0, Lgm2;->w:Landroid/content/Context;

    .line 20
    .line 21
    invoke-static {v0}, Lhl3;->a(Landroid/content/Context;)Landroid/app/job/JobScheduler;

    .line 22
    .line 23
    .line 24
    move-result-object v8

    .line 25
    invoke-static {v0, v8}, Lna7;->b(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 26
    .line 27
    .line 28
    move-result-object v9

    .line 29
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->t()Lja7;

    .line 30
    .line 31
    .line 32
    move-result-object v10

    .line 33
    iget-object v10, v10, Lja7;->a:La96;

    .line 34
    .line 35
    new-instance v11, Lha7;

    .line 36
    .line 37
    const/4 v12, 0x0

    .line 38
    invoke-direct {v11, v12}, Lha7;-><init>(I)V

    .line 39
    .line 40
    .line 41
    const/4 v13, 0x1

    .line 42
    invoke-static {v10, v13, v12, v11}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v10

    .line 46
    check-cast v10, Ljava/util/List;

    .line 47
    .line 48
    if-eqz v9, :cond_0

    .line 49
    .line 50
    invoke-virtual {v9}, Ljava/util/ArrayList;->size()I

    .line 51
    .line 52
    .line 53
    move-result v11

    .line 54
    goto :goto_0

    .line 55
    :cond_0
    move v11, v12

    .line 56
    :goto_0
    new-instance v14, Ljava/util/HashSet;

    .line 57
    .line 58
    invoke-direct {v14, v11}, Ljava/util/HashSet;-><init>(I)V

    .line 59
    .line 60
    .line 61
    if-eqz v9, :cond_2

    .line 62
    .line 63
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 64
    .line 65
    .line 66
    move-result v11

    .line 67
    if-nez v11, :cond_2

    .line 68
    .line 69
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v9

    .line 73
    :goto_1
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v11

    .line 77
    if-eqz v11, :cond_2

    .line 78
    .line 79
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v11

    .line 83
    check-cast v11, Landroid/app/job/JobInfo;

    .line 84
    .line 85
    invoke-static {v11}, Lna7;->f(Landroid/app/job/JobInfo;)Lid8;

    .line 86
    .line 87
    .line 88
    move-result-object v15

    .line 89
    if-eqz v15, :cond_1

    .line 90
    .line 91
    iget-object v11, v15, Lid8;->a:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v14, v11}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_1
    invoke-virtual {v11}, Landroid/app/job/JobInfo;->getId()I

    .line 98
    .line 99
    .line 100
    move-result v11

    .line 101
    invoke-static {v8, v11}, Lna7;->a(Landroid/app/job/JobScheduler;I)V

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    :cond_3
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 110
    .line 111
    .line 112
    move-result v9

    .line 113
    if-eqz v9, :cond_4

    .line 114
    .line 115
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v9

    .line 119
    check-cast v9, Ljava/lang/String;

    .line 120
    .line 121
    invoke-virtual {v14, v9}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v9

    .line 125
    if-nez v9, :cond_3

    .line 126
    .line 127
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 128
    .line 129
    .line 130
    move-result-object v8

    .line 131
    sget-object v9, Lna7;->B:Ljava/lang/String;

    .line 132
    .line 133
    const-string v11, "Reconciling jobs"

    .line 134
    .line 135
    invoke-virtual {v8, v9, v11}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    move v8, v13

    .line 139
    goto :goto_2

    .line 140
    :cond_4
    move v8, v12

    .line 141
    :goto_2
    const-wide/16 v14, -0x1

    .line 142
    .line 143
    if-eqz v8, :cond_6

    .line 144
    .line 145
    invoke-virtual {v4}, La96;->b()V

    .line 146
    .line 147
    .line 148
    :try_start_0
    invoke-virtual {v4}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object v10

    .line 156
    :goto_3
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v11

    .line 160
    if-eqz v11, :cond_5

    .line 161
    .line 162
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v11

    .line 166
    check-cast v11, Ljava/lang/String;

    .line 167
    .line 168
    invoke-virtual {v9, v14, v15, v11}, Lfe8;->g(JLjava/lang/String;)V

    .line 169
    .line 170
    .line 171
    goto :goto_3

    .line 172
    :catchall_0
    move-exception v0

    .line 173
    goto :goto_4

    .line 174
    :cond_5
    invoke-virtual {v4}, La96;->p()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, La96;->f()V

    .line 178
    .line 179
    .line 180
    goto :goto_5

    .line 181
    :goto_4
    invoke-virtual {v4}, La96;->f()V

    .line 182
    .line 183
    .line 184
    throw v0

    .line 185
    :cond_6
    :goto_5
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->w()Lfe8;

    .line 186
    .line 187
    .line 188
    move-result-object v4

    .line 189
    invoke-virtual {v7}, Landroidx/work/impl/WorkDatabase;->v()Lud8;

    .line 190
    .line 191
    .line 192
    move-result-object v9

    .line 193
    invoke-virtual {v7}, La96;->b()V

    .line 194
    .line 195
    .line 196
    :try_start_1
    iget-object v10, v4, Lfe8;->a:La96;

    .line 197
    .line 198
    new-instance v11, Lrb8;

    .line 199
    .line 200
    const/4 v14, 0x4

    .line 201
    invoke-direct {v11, v14}, Lrb8;-><init>(I)V

    .line 202
    .line 203
    .line 204
    invoke-static {v10, v13, v12, v11}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v10

    .line 208
    check-cast v10, Ljava/util/List;

    .line 209
    .line 210
    if-eqz v10, :cond_7

    .line 211
    .line 212
    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    .line 213
    .line 214
    .line 215
    move-result v11

    .line 216
    if-nez v11, :cond_7

    .line 217
    .line 218
    move v11, v13

    .line 219
    goto :goto_6

    .line 220
    :catchall_1
    move-exception v0

    .line 221
    goto/16 :goto_10

    .line 222
    .line 223
    :cond_7
    move v11, v12

    .line 224
    :goto_6
    if-eqz v11, :cond_8

    .line 225
    .line 226
    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 227
    .line 228
    .line 229
    move-result-object v10

    .line 230
    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 231
    .line 232
    .line 233
    move-result v14

    .line 234
    if-eqz v14, :cond_8

    .line 235
    .line 236
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 237
    .line 238
    .line 239
    move-result-object v14

    .line 240
    check-cast v14, Lbe8;

    .line 241
    .line 242
    sget-object v15, Lkd8;->w:Lkd8;

    .line 243
    .line 244
    iget-object v14, v14, Lbe8;->a:Ljava/lang/String;

    .line 245
    .line 246
    invoke-virtual {v4, v15, v14}, Lfe8;->j(Lkd8;Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    const/16 v15, -0x200

    .line 250
    .line 251
    invoke-virtual {v4, v15, v14}, Lfe8;->k(ILjava/lang/String;)V

    .line 252
    .line 253
    .line 254
    const-wide/16 v12, -0x1

    .line 255
    .line 256
    invoke-virtual {v4, v12, v13, v14}, Lfe8;->g(JLjava/lang/String;)V

    .line 257
    .line 258
    .line 259
    const/4 v12, 0x0

    .line 260
    const/4 v13, 0x1

    .line 261
    goto :goto_7

    .line 262
    :cond_8
    iget-object v4, v9, Lud8;->a:La96;

    .line 263
    .line 264
    new-instance v9, Lrb8;

    .line 265
    .line 266
    const/4 v10, 0x2

    .line 267
    invoke-direct {v9, v10}, Lrb8;-><init>(I)V

    .line 268
    .line 269
    .line 270
    const/4 v10, 0x0

    .line 271
    const/4 v15, 0x1

    .line 272
    invoke-static {v4, v10, v15, v9}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    invoke-virtual {v7}, La96;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 276
    .line 277
    .line 278
    invoke-virtual {v7}, La96;->f()V

    .line 279
    .line 280
    .line 281
    if-nez v11, :cond_a

    .line 282
    .line 283
    if-eqz v8, :cond_9

    .line 284
    .line 285
    goto :goto_8

    .line 286
    :cond_9
    const/4 v4, 0x0

    .line 287
    goto :goto_9

    .line 288
    :cond_a
    :goto_8
    const/4 v4, 0x1

    .line 289
    :goto_9
    iget-object v8, v6, Lbr4;->x:Ljava/lang/Object;

    .line 290
    .line 291
    check-cast v8, Landroidx/work/impl/WorkDatabase;

    .line 292
    .line 293
    invoke-virtual {v8}, Landroidx/work/impl/WorkDatabase;->s()Len5;

    .line 294
    .line 295
    .line 296
    move-result-object v8

    .line 297
    const-string v9, "reschedule_needed"

    .line 298
    .line 299
    invoke-virtual {v8, v9}, Len5;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 300
    .line 301
    .line 302
    move-result-object v8

    .line 303
    const/16 v10, 0x12

    .line 304
    .line 305
    const-wide/16 v11, 0x0

    .line 306
    .line 307
    sget-object v13, Lgm2;->A:Ljava/lang/String;

    .line 308
    .line 309
    if-eqz v8, :cond_b

    .line 310
    .line 311
    invoke-virtual {v8}, Ljava/lang/Long;->longValue()J

    .line 312
    .line 313
    .line 314
    move-result-wide v16

    .line 315
    const-wide/16 v18, 0x1

    .line 316
    .line 317
    cmp-long v8, v16, v18

    .line 318
    .line 319
    if-nez v8, :cond_b

    .line 320
    .line 321
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 322
    .line 323
    .line 324
    move-result-object v0

    .line 325
    const-string v1, "Rescheduling Workers."

    .line 326
    .line 327
    invoke-virtual {v0, v13, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v3}, Lnd8;->f()V

    .line 331
    .line 332
    .line 333
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 334
    .line 335
    .line 336
    new-instance v0, Ldn5;

    .line 337
    .line 338
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-direct {v0, v9, v1}, Ldn5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 343
    .line 344
    .line 345
    iget-object v1, v6, Lbr4;->x:Ljava/lang/Object;

    .line 346
    .line 347
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 348
    .line 349
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->s()Len5;

    .line 350
    .line 351
    .line 352
    move-result-object v1

    .line 353
    iget-object v2, v1, Len5;->a:La96;

    .line 354
    .line 355
    new-instance v3, Lw34;

    .line 356
    .line 357
    invoke-direct {v3, v10, v1, v0}, Lw34;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    const/4 v10, 0x0

    .line 361
    const/4 v15, 0x1

    .line 362
    invoke-static {v2, v10, v15, v3}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    return-void

    .line 366
    :cond_b
    :try_start_2
    sget v6, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 367
    .line 368
    const/16 v8, 0x1f

    .line 369
    .line 370
    if-lt v6, v8, :cond_c

    .line 371
    .line 372
    const/high16 v8, 0x22000000

    .line 373
    .line 374
    goto :goto_a

    .line 375
    :cond_c
    const/high16 v8, 0x20000000

    .line 376
    .line 377
    :goto_a
    new-instance v9, Landroid/content/Intent;

    .line 378
    .line 379
    invoke-direct {v9}, Landroid/content/Intent;-><init>()V

    .line 380
    .line 381
    .line 382
    new-instance v14, Landroid/content/ComponentName;

    .line 383
    .line 384
    const-class v11, Landroidx/work/impl/utils/ForceStopRunnable$BroadcastReceiver;

    .line 385
    .line 386
    invoke-direct {v14, v0, v11}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 387
    .line 388
    .line 389
    invoke-virtual {v9, v14}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 390
    .line 391
    .line 392
    const-string v11, "ACTION_FORCE_STOP_RESCHEDULE"

    .line 393
    .line 394
    invoke-virtual {v9, v11}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 395
    .line 396
    .line 397
    const/4 v11, -0x1

    .line 398
    invoke-static {v0, v11, v9, v8}, Landroid/app/PendingIntent;->getBroadcast(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 399
    .line 400
    .line 401
    move-result-object v8

    .line 402
    const/16 v9, 0x1e

    .line 403
    .line 404
    if-lt v6, v9, :cond_10

    .line 405
    .line 406
    if-eqz v8, :cond_d

    .line 407
    .line 408
    invoke-virtual {v8}, Landroid/app/PendingIntent;->cancel()V

    .line 409
    .line 410
    .line 411
    goto :goto_b

    .line 412
    :catch_0
    move-exception v0

    .line 413
    goto :goto_e

    .line 414
    :catch_1
    move-exception v0

    .line 415
    goto :goto_e

    .line 416
    :cond_d
    :goto_b
    const-string v6, "activity"

    .line 417
    .line 418
    invoke-virtual {v0, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    check-cast v0, Landroid/app/ActivityManager;

    .line 423
    .line 424
    invoke-static {v0}, Lt4;->n(Landroid/app/ActivityManager;)Ljava/util/List;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    if-eqz v0, :cond_11

    .line 429
    .line 430
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 431
    .line 432
    .line 433
    move-result v6

    .line 434
    if-nez v6, :cond_11

    .line 435
    .line 436
    iget-object v6, v2, Lbr4;->x:Ljava/lang/Object;

    .line 437
    .line 438
    check-cast v6, Landroidx/work/impl/WorkDatabase;

    .line 439
    .line 440
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->s()Len5;

    .line 441
    .line 442
    .line 443
    move-result-object v6

    .line 444
    invoke-virtual {v6, v1}, Len5;->a(Ljava/lang/String;)Ljava/lang/Long;

    .line 445
    .line 446
    .line 447
    move-result-object v6

    .line 448
    if-eqz v6, :cond_e

    .line 449
    .line 450
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 451
    .line 452
    .line 453
    move-result-wide v11

    .line 454
    goto :goto_c

    .line 455
    :cond_e
    const-wide/16 v11, 0x0

    .line 456
    .line 457
    :goto_c
    const/4 v6, 0x0

    .line 458
    :goto_d
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 459
    .line 460
    .line 461
    move-result v8

    .line 462
    if-ge v6, v8, :cond_11

    .line 463
    .line 464
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    move-result-object v8

    .line 468
    invoke-static {v8}, Lt4;->f(Ljava/lang/Object;)Landroid/app/ApplicationExitInfo;

    .line 469
    .line 470
    .line 471
    move-result-object v8

    .line 472
    invoke-static {v8}, Lt4;->b(Landroid/app/ApplicationExitInfo;)I

    .line 473
    .line 474
    .line 475
    move-result v9

    .line 476
    const/16 v14, 0xa

    .line 477
    .line 478
    if-ne v9, v14, :cond_f

    .line 479
    .line 480
    invoke-static {v8}, Lt4;->e(Landroid/app/ApplicationExitInfo;)J

    .line 481
    .line 482
    .line 483
    move-result-wide v8

    .line 484
    cmp-long v8, v8, v11

    .line 485
    .line 486
    if-ltz v8, :cond_f

    .line 487
    .line 488
    goto :goto_f

    .line 489
    :cond_f
    add-int/lit8 v6, v6, 0x1

    .line 490
    .line 491
    goto :goto_d

    .line 492
    :cond_10
    if-nez v8, :cond_11

    .line 493
    .line 494
    invoke-static {v0}, Lgm2;->c(Landroid/content/Context;)V
    :try_end_2
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    .line 495
    .line 496
    .line 497
    goto :goto_f

    .line 498
    :cond_11
    if-eqz v4, :cond_12

    .line 499
    .line 500
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 501
    .line 502
    .line 503
    move-result-object v0

    .line 504
    const-string v1, "Found unfinished work, scheduling it."

    .line 505
    .line 506
    invoke-virtual {v0, v13, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 507
    .line 508
    .line 509
    iget-object v0, v3, Lnd8;->e:Ljava/util/List;

    .line 510
    .line 511
    invoke-static {v5, v7, v0}, Lmg6;->b(Lf01;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    .line 512
    .line 513
    .line 514
    :cond_12
    return-void

    .line 515
    :goto_e
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 516
    .line 517
    .line 518
    move-result-object v4

    .line 519
    iget v4, v4, Lbc4;->x:I

    .line 520
    .line 521
    const/4 v6, 0x5

    .line 522
    if-gt v4, v6, :cond_13

    .line 523
    .line 524
    const-string v4, "Ignoring exception"

    .line 525
    .line 526
    invoke-static {v13, v4, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 527
    .line 528
    .line 529
    :cond_13
    :goto_f
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 530
    .line 531
    .line 532
    move-result-object v0

    .line 533
    const-string v4, "Application was force-stopped, rescheduling."

    .line 534
    .line 535
    invoke-virtual {v0, v13, v4}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 536
    .line 537
    .line 538
    invoke-virtual {v3}, Lnd8;->f()V

    .line 539
    .line 540
    .line 541
    iget-object v0, v5, Lf01;->d:Lz53;

    .line 542
    .line 543
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 544
    .line 545
    .line 546
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 547
    .line 548
    .line 549
    move-result-wide v3

    .line 550
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    new-instance v0, Ldn5;

    .line 554
    .line 555
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    invoke-direct {v0, v1, v3}, Ldn5;-><init>(Ljava/lang/String;Ljava/lang/Long;)V

    .line 560
    .line 561
    .line 562
    iget-object v1, v2, Lbr4;->x:Ljava/lang/Object;

    .line 563
    .line 564
    check-cast v1, Landroidx/work/impl/WorkDatabase;

    .line 565
    .line 566
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->s()Len5;

    .line 567
    .line 568
    .line 569
    move-result-object v1

    .line 570
    iget-object v2, v1, Len5;->a:La96;

    .line 571
    .line 572
    new-instance v3, Lw34;

    .line 573
    .line 574
    invoke-direct {v3, v10, v1, v0}, Lw34;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 575
    .line 576
    .line 577
    const/4 v10, 0x0

    .line 578
    const/4 v15, 0x1

    .line 579
    invoke-static {v2, v10, v15, v3}, Lsg3;->O(La96;ZZLvr2;)Ljava/lang/Object;

    .line 580
    .line 581
    .line 582
    return-void

    .line 583
    :goto_10
    invoke-virtual {v7}, La96;->f()V

    .line 584
    .line 585
    .line 586
    throw v0
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
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
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
.end method

.method public final b()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lgm2;->x:Lnd8;

    .line 2
    .line 3
    iget-object v0, v0, Lnd8;->b:Lf01;

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    sget-object v2, Lgm2;->A:Ljava/lang/String;

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string v0, "The default process name was not specified."

    .line 22
    .line 23
    invoke-virtual {p0, v2, v0}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const/4 p0, 0x1

    .line 27
    return p0

    .line 28
    :cond_0
    iget-object p0, p0, Lgm2;->w:Landroid/content/Context;

    .line 29
    .line 30
    invoke-static {p0, v0}, Lkp5;->a(Landroid/content/Context;Lf01;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    new-instance v1, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    const-string v3, "Is default app process = "

    .line 41
    .line 42
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v0, v2, v1}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return p0
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
.end method

.method public final run()V
    .locals 11

    .line 1
    iget-object v0, p0, Lgm2;->w:Landroid/content/Context;

    .line 2
    .line 3
    sget-object v1, Lgm2;->A:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p0, Lgm2;->x:Lnd8;

    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lgm2;->b()Z

    .line 8
    .line 9
    .line 10
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    if-nez v3, :cond_0

    .line 12
    .line 13
    invoke-virtual {v2}, Lnd8;->e()V

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    :cond_0
    :goto_0
    :try_start_1
    invoke-static {v0}, Ln85;->l(Landroid/content/Context;)V
    :try_end_1
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_1 .. :try_end_1} :catch_9
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 18
    .line 19
    .line 20
    :try_start_2
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    const-string v4, "Performing cleanup operations."

    .line 25
    .line 26
    invoke-virtual {v3, v1, v4}, Lbc4;->e(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 27
    .line 28
    .line 29
    :try_start_3
    invoke-virtual {p0}, Lgm2;->a()V
    :try_end_3
    .catch Landroid/database/sqlite/SQLiteAccessPermException; {:try_start_3 .. :try_end_3} :catch_8
    .catch Landroid/database/sqlite/SQLiteCantOpenDatabaseException; {:try_start_3 .. :try_end_3} :catch_7
    .catch Landroid/database/sqlite/SQLiteConstraintException; {:try_start_3 .. :try_end_3} :catch_6
    .catch Landroid/database/sqlite/SQLiteDatabaseCorruptException; {:try_start_3 .. :try_end_3} :catch_5
    .catch Landroid/database/sqlite/SQLiteDatabaseLockedException; {:try_start_3 .. :try_end_3} :catch_4
    .catch Landroid/database/sqlite/SQLiteDiskIOException; {:try_start_3 .. :try_end_3} :catch_3
    .catch Landroid/database/sqlite/SQLiteFullException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Landroid/database/sqlite/SQLiteTableLockedException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v2}, Lnd8;->e()V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :catch_1
    move-exception v3

    .line 40
    goto :goto_1

    .line 41
    :catch_2
    move-exception v3

    .line 42
    goto :goto_1

    .line 43
    :catch_3
    move-exception v3

    .line 44
    goto :goto_1

    .line 45
    :catch_4
    move-exception v3

    .line 46
    goto :goto_1

    .line 47
    :catch_5
    move-exception v3

    .line 48
    goto :goto_1

    .line 49
    :catch_6
    move-exception v3

    .line 50
    goto :goto_1

    .line 51
    :catch_7
    move-exception v3

    .line 52
    goto :goto_1

    .line 53
    :catch_8
    move-exception v3

    .line 54
    :goto_1
    :try_start_4
    iget v4, p0, Lgm2;->z:I

    .line 55
    .line 56
    add-int/lit8 v4, v4, 0x1

    .line 57
    .line 58
    iput v4, p0, Lgm2;->z:I

    .line 59
    .line 60
    const/4 v5, 0x3

    .line 61
    if-lt v4, v5, :cond_2

    .line 62
    .line 63
    invoke-static {v0}, Li75;->h(Landroid/content/Context;)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-eqz p0, :cond_1

    .line 68
    .line 69
    const-string p0, "The file system on the device is in a bad state. WorkManager cannot access the app\'s internal data store."

    .line 70
    .line 71
    goto :goto_2

    .line 72
    :cond_1
    const-string p0, "WorkManager can\'t be accessed from direct boot, because credential encrypted storage isn\'t accessible.\nDon\'t access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot"

    .line 73
    .line 74
    :goto_2
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-virtual {v0, v1, p0, v3}, Lbc4;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 79
    .line 80
    .line 81
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 82
    .line 83
    invoke-direct {v0, p0, v3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    iget-object p0, v2, Lnd8;->b:Lf01;

    .line 87
    .line 88
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    throw v0

    .line 92
    :cond_2
    int-to-long v4, v4

    .line 93
    const-wide/16 v6, 0x12c

    .line 94
    .line 95
    mul-long/2addr v4, v6

    .line 96
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    new-instance v9, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 103
    .line 104
    .line 105
    const-string v10, "Retrying after "

    .line 106
    .line 107
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v9, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v4

    .line 117
    invoke-virtual {v8, v1, v4, v3}, Lbc4;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 118
    .line 119
    .line 120
    iget v3, p0, Lgm2;->z:I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 121
    .line 122
    int-to-long v3, v3

    .line 123
    mul-long/2addr v3, v6

    .line 124
    :try_start_5
    invoke-static {v3, v4}, Ljava/lang/Thread;->sleep(J)V
    :try_end_5
    .catch Ljava/lang/InterruptedException; {:try_start_5 .. :try_end_5} :catch_0
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catch_9
    move-exception p0

    .line 129
    :try_start_6
    const-string v0, "Unexpected SQLite exception during migrations"

    .line 130
    .line 131
    invoke-static {}, Lbc4;->k()Lbc4;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    invoke-virtual {v3, v1, v0}, Lbc4;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    new-instance v1, Ljava/lang/IllegalStateException;

    .line 139
    .line 140
    invoke-direct {v1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 141
    .line 142
    .line 143
    iget-object p0, v2, Lnd8;->b:Lf01;

    .line 144
    .line 145
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 146
    .line 147
    .line 148
    throw v1
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 149
    :goto_3
    invoke-virtual {v2}, Lnd8;->e()V

    .line 150
    .line 151
    .line 152
    throw p0
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
