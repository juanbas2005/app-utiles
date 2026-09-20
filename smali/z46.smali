.class public final Lz46;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 20
    const/4 v0, 0x1

    iput v0, p0, Lz46;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 18
    iput p4, p0, Lz46;->w:I

    iput-object p1, p0, Lz46;->z:Ljava/lang/Object;

    iput-object p2, p0, Lz46;->x:Ljava/lang/Object;

    iput-object p3, p0, Lz46;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;I)V
    .locals 0

    .line 19
    iput p5, p0, Lz46;->w:I

    iput-object p1, p0, Lz46;->x:Ljava/lang/Object;

    iput-object p2, p0, Lz46;->y:Ljava/lang/Object;

    iput-object p4, p0, Lz46;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lr69;Ljava/util/concurrent/atomic/AtomicReference;Lz99;)V
    .locals 1

    .line 1
    const/16 v0, 0x9

    .line 2
    .line 3
    iput v0, p0, Lz46;->w:I

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    iput-object p2, p0, Lz46;->x:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p3, p0, Lz46;->y:Ljava/lang/Object;

    .line 11
    .line 12
    invoke-static {p1}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lz46;->z:Ljava/lang/Object;

    .line 16
    .line 17
    return-void
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


# virtual methods
.method public final run()V
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget v0, v1, Lz46;->w:I

    .line 4
    .line 5
    const/16 v2, 0x9

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/4 v4, 0x3

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lh06;

    .line 18
    .line 19
    iget-object v0, v0, Lh06;->w:Ljava/lang/Object;

    .line 20
    .line 21
    if-nez v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v1, Lz46;->y:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Ljc9;

    .line 26
    .line 27
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 28
    .line 29
    check-cast v1, Lyl0;

    .line 30
    .line 31
    invoke-static {}, Lvb9;->c()Lic9;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2, v0}, Lvb9;->b(Lic9;Ljc9;)Ljc9;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    :try_start_0
    invoke-virtual {v1}, Lyl0;->run()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3}, Lvb9;->b(Lic9;Ljc9;)Ljc9;

    .line 43
    .line 44
    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    :try_start_1
    invoke-static {v0}, Lub9;->a(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    throw v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    invoke-static {v2, v3}, Lvb9;->b(Lic9;Ljc9;)Ljc9;

    .line 53
    .line 54
    .line 55
    throw v0

    .line 56
    :cond_0
    invoke-static {}, Lku4;->a()V

    .line 57
    .line 58
    .line 59
    :goto_0
    return-void

    .line 60
    :pswitch_0
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 61
    .line 62
    check-cast v0, Lkd6;

    .line 63
    .line 64
    iget-object v2, v1, Lz46;->y:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lxn6;

    .line 67
    .line 68
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, Lob9;

    .line 71
    .line 72
    :try_start_2
    invoke-static {v2}, Lpt2;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 76
    iget-object v0, v0, Lkd6;->C:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lxn6;

    .line 79
    .line 80
    invoke-virtual {v0, v2}, Lx1;->l(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1, v0}, Lx1;->n(Lcom/google/common/util/concurrent/ListenableFuture;)Z

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_2
    invoke-virtual {v1, v2}, Lx1;->n(Lcom/google/common/util/concurrent/ListenableFuture;)Z

    .line 88
    .line 89
    .line 90
    :goto_1
    return-void

    .line 91
    :pswitch_1
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 92
    .line 93
    check-cast v0, Ln49;

    .line 94
    .line 95
    iget-object v2, v1, Lz46;->y:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v2, Lpz8;

    .line 98
    .line 99
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 100
    .line 101
    check-cast v1, Landroid/app/job/JobParameters;

    .line 102
    .line 103
    iget-object v2, v2, Lpz8;->J:Lmz8;

    .line 104
    .line 105
    const-string v3, "AppMeasurementJobService processed last upload request."

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Lmz8;->a(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, Ln49;->x:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v0, Landroid/app/Service;

    .line 113
    .line 114
    check-cast v0, Lx69;

    .line 115
    .line 116
    invoke-interface {v0, v1}, Lx69;->c(Landroid/app/job/JobParameters;)V

    .line 117
    .line 118
    .line 119
    return-void

    .line 120
    :pswitch_2
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lr69;

    .line 123
    .line 124
    iget-object v2, v1, Lz46;->y:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v2, Lz99;

    .line 127
    .line 128
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v1, Llm8;

    .line 131
    .line 132
    iget-object v3, v0, Lin8;->w:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v3, Ly19;

    .line 135
    .line 136
    iget-object v4, v0, Lr69;->z:Liy8;

    .line 137
    .line 138
    if-nez v4, :cond_1

    .line 139
    .line 140
    iget-object v0, v3, Ly19;->B:Lpz8;

    .line 141
    .line 142
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 143
    .line 144
    .line 145
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 146
    .line 147
    const-string v1, "[sgtm] Discarding data. Failed to update batch upload status."

    .line 148
    .line 149
    invoke-virtual {v0, v1}, Lmz8;->a(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    goto :goto_2

    .line 153
    :cond_1
    :try_start_3
    invoke-interface {v4, v2, v1}, Liy8;->w(Lz99;Llm8;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v0}, Lr69;->p1()V
    :try_end_3
    .catch Landroid/os/RemoteException; {:try_start_3 .. :try_end_3} :catch_0

    .line 157
    .line 158
    .line 159
    goto :goto_2

    .line 160
    :catch_0
    move-exception v0

    .line 161
    iget-object v2, v3, Ly19;->B:Lpz8;

    .line 162
    .line 163
    invoke-static {v2}, Ly19;->g(Ly29;)V

    .line 164
    .line 165
    .line 166
    iget-object v2, v2, Lpz8;->B:Lmz8;

    .line 167
    .line 168
    iget-wide v3, v1, Llm8;->w:J

    .line 169
    .line 170
    const-string v1, "[sgtm] Failed to update batch upload status, rowId, exception"

    .line 171
    .line 172
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    invoke-virtual {v2, v3, v0, v1}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 177
    .line 178
    .line 179
    :goto_2
    return-void

    .line 180
    :pswitch_3
    const-string v2, "Failed to get app instance id"

    .line 181
    .line 182
    iget-object v0, v1, Lz46;->y:Ljava/lang/Object;

    .line 183
    .line 184
    move-object v3, v0

    .line 185
    check-cast v3, Lju8;

    .line 186
    .line 187
    iget-object v0, v1, Lz46;->z:Ljava/lang/Object;

    .line 188
    .line 189
    move-object v4, v0

    .line 190
    check-cast v4, Lr69;

    .line 191
    .line 192
    :try_start_4
    iget-object v0, v4, Lin8;->w:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast v0, Ly19;

    .line 195
    .line 196
    iget-object v5, v0, Ly19;->A:Lq09;

    .line 197
    .line 198
    iget-object v6, v0, Ly19;->B:Lpz8;

    .line 199
    .line 200
    invoke-static {v5}, Ly19;->e(Lin8;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {v5}, Lq09;->j1()Lh39;

    .line 204
    .line 205
    .line 206
    move-result-object v8

    .line 207
    sget-object v9, Lf39;->y:Lf39;

    .line 208
    .line 209
    invoke-virtual {v8, v9}, Lh39;->i(Lf39;)Z

    .line 210
    .line 211
    .line 212
    move-result v8

    .line 213
    if-nez v8, :cond_2

    .line 214
    .line 215
    invoke-static {v6}, Ly19;->g(Ly29;)V

    .line 216
    .line 217
    .line 218
    iget-object v1, v6, Lpz8;->G:Lmz8;

    .line 219
    .line 220
    const-string v6, "Analytics storage consent denied; will not get app instance id"

    .line 221
    .line 222
    invoke-virtual {v1, v6}, Lmz8;->a(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    iget-object v1, v0, Ly19;->I:Lv49;

    .line 226
    .line 227
    invoke-static {v1}, Ly19;->f(Lfy8;)V

    .line 228
    .line 229
    .line 230
    iget-object v1, v1, Lv49;->C:Ljava/util/concurrent/atomic/AtomicReference;

    .line 231
    .line 232
    invoke-virtual {v1, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 233
    .line 234
    .line 235
    invoke-static {v5}, Ly19;->e(Lin8;)V

    .line 236
    .line 237
    .line 238
    iget-object v1, v5, Lq09;->C:Ll90;

    .line 239
    .line 240
    invoke-virtual {v1, v7}, Ll90;->k(Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :catchall_3
    move-exception v0

    .line 245
    goto :goto_8

    .line 246
    :catch_1
    move-exception v0

    .line 247
    goto :goto_5

    .line 248
    :cond_2
    iget-object v8, v4, Lr69;->z:Liy8;

    .line 249
    .line 250
    if-nez v8, :cond_3

    .line 251
    .line 252
    invoke-static {v6}, Ly19;->g(Ly29;)V

    .line 253
    .line 254
    .line 255
    iget-object v1, v6, Lpz8;->B:Lmz8;

    .line 256
    .line 257
    invoke-virtual {v1, v2}, Lmz8;->a(Ljava/lang/String;)V
    :try_end_4
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_4} :catch_1
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 258
    .line 259
    .line 260
    :goto_3
    iget-object v0, v0, Ly19;->E:Ld99;

    .line 261
    .line 262
    :goto_4
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {v0, v7, v3}, Ld99;->P1(Ljava/lang/String;Lju8;)V

    .line 266
    .line 267
    .line 268
    goto :goto_7

    .line 269
    :cond_3
    :try_start_5
    iget-object v1, v1, Lz46;->x:Ljava/lang/Object;

    .line 270
    .line 271
    check-cast v1, Lz99;

    .line 272
    .line 273
    invoke-interface {v8, v1}, Liy8;->s(Lz99;)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    if-eqz v7, :cond_4

    .line 278
    .line 279
    iget-object v0, v0, Ly19;->I:Lv49;

    .line 280
    .line 281
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 282
    .line 283
    .line 284
    iget-object v0, v0, Lv49;->C:Ljava/util/concurrent/atomic/AtomicReference;

    .line 285
    .line 286
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 287
    .line 288
    .line 289
    invoke-static {v5}, Ly19;->e(Lin8;)V

    .line 290
    .line 291
    .line 292
    iget-object v0, v5, Lq09;->C:Ll90;

    .line 293
    .line 294
    invoke-virtual {v0, v7}, Ll90;->k(Ljava/lang/String;)V

    .line 295
    .line 296
    .line 297
    :cond_4
    invoke-virtual {v4}, Lr69;->p1()V
    :try_end_5
    .catch Landroid/os/RemoteException; {:try_start_5 .. :try_end_5} :catch_1
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 298
    .line 299
    .line 300
    goto :goto_6

    .line 301
    :goto_5
    :try_start_6
    iget-object v1, v4, Lin8;->w:Ljava/lang/Object;

    .line 302
    .line 303
    check-cast v1, Ly19;

    .line 304
    .line 305
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 306
    .line 307
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 308
    .line 309
    .line 310
    iget-object v1, v1, Lpz8;->B:Lmz8;

    .line 311
    .line 312
    invoke-virtual {v1, v2, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 313
    .line 314
    .line 315
    :goto_6
    iget-object v0, v4, Lin8;->w:Ljava/lang/Object;

    .line 316
    .line 317
    check-cast v0, Ly19;

    .line 318
    .line 319
    iget-object v0, v0, Ly19;->E:Ld99;

    .line 320
    .line 321
    goto :goto_4

    .line 322
    :goto_7
    return-void

    .line 323
    :goto_8
    iget-object v1, v4, Lin8;->w:Ljava/lang/Object;

    .line 324
    .line 325
    check-cast v1, Ly19;

    .line 326
    .line 327
    iget-object v1, v1, Ly19;->E:Ld99;

    .line 328
    .line 329
    invoke-static {v1}, Ly19;->e(Lin8;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1, v7, v3}, Ld99;->P1(Ljava/lang/String;Lju8;)V

    .line 333
    .line 334
    .line 335
    throw v0

    .line 336
    :pswitch_4
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 337
    .line 338
    move-object v5, v0

    .line 339
    check-cast v5, Ljava/util/concurrent/atomic/AtomicReference;

    .line 340
    .line 341
    monitor-enter v5

    .line 342
    :try_start_7
    iget-object v0, v1, Lz46;->z:Ljava/lang/Object;

    .line 343
    .line 344
    check-cast v0, Lr69;

    .line 345
    .line 346
    iget-object v2, v0, Lin8;->w:Ljava/lang/Object;

    .line 347
    .line 348
    check-cast v2, Ly19;

    .line 349
    .line 350
    iget-object v3, v2, Ly19;->A:Lq09;

    .line 351
    .line 352
    invoke-static {v3}, Ly19;->e(Lin8;)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v3}, Lq09;->j1()Lh39;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    sget-object v4, Lf39;->y:Lf39;

    .line 360
    .line 361
    invoke-virtual {v3, v4}, Lh39;->i(Lf39;)Z

    .line 362
    .line 363
    .line 364
    move-result v3

    .line 365
    if-nez v3, :cond_5

    .line 366
    .line 367
    iget-object v3, v2, Ly19;->B:Lpz8;

    .line 368
    .line 369
    invoke-static {v3}, Ly19;->g(Ly29;)V

    .line 370
    .line 371
    .line 372
    iget-object v3, v3, Lpz8;->G:Lmz8;

    .line 373
    .line 374
    const-string v4, "Analytics storage consent denied; will not get app instance id"

    .line 375
    .line 376
    invoke-virtual {v3, v4}, Lmz8;->a(Ljava/lang/String;)V

    .line 377
    .line 378
    .line 379
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 380
    .line 381
    check-cast v0, Ly19;

    .line 382
    .line 383
    iget-object v0, v0, Ly19;->I:Lv49;

    .line 384
    .line 385
    invoke-static {v0}, Ly19;->f(Lfy8;)V

    .line 386
    .line 387
    .line 388
    iget-object v0, v0, Lv49;->C:Ljava/util/concurrent/atomic/AtomicReference;

    .line 389
    .line 390
    invoke-virtual {v0, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 391
    .line 392
    .line 393
    iget-object v0, v2, Ly19;->A:Lq09;

    .line 394
    .line 395
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 396
    .line 397
    .line 398
    iget-object v0, v0, Lq09;->C:Ll90;

    .line 399
    .line 400
    invoke-virtual {v0, v7}, Ll90;->k(Ljava/lang/String;)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v5, v7}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_7 .. :try_end_7} :catch_2
    .catchall {:try_start_7 .. :try_end_7} :catchall_5

    .line 404
    .line 405
    .line 406
    :goto_9
    :try_start_8
    invoke-virtual {v5}, Ljava/lang/Object;->notify()V

    .line 407
    .line 408
    .line 409
    monitor-exit v5
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_4

    .line 410
    goto :goto_c

    .line 411
    :catchall_4
    move-exception v0

    .line 412
    goto :goto_e

    .line 413
    :catchall_5
    move-exception v0

    .line 414
    goto :goto_d

    .line 415
    :catch_2
    move-exception v0

    .line 416
    goto :goto_a

    .line 417
    :cond_5
    :try_start_9
    iget-object v3, v0, Lr69;->z:Liy8;

    .line 418
    .line 419
    if-nez v3, :cond_6

    .line 420
    .line 421
    iget-object v0, v2, Ly19;->B:Lpz8;

    .line 422
    .line 423
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 424
    .line 425
    .line 426
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 427
    .line 428
    const-string v2, "Failed to get app instance id"

    .line 429
    .line 430
    invoke-virtual {v0, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 431
    .line 432
    .line 433
    goto :goto_9

    .line 434
    :cond_6
    iget-object v4, v1, Lz46;->y:Ljava/lang/Object;

    .line 435
    .line 436
    check-cast v4, Lz99;

    .line 437
    .line 438
    invoke-interface {v3, v4}, Liy8;->s(Lz99;)Ljava/lang/String;

    .line 439
    .line 440
    .line 441
    move-result-object v3

    .line 442
    invoke-virtual {v5, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 443
    .line 444
    .line 445
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 446
    .line 447
    .line 448
    move-result-object v3

    .line 449
    check-cast v3, Ljava/lang/String;

    .line 450
    .line 451
    if-eqz v3, :cond_7

    .line 452
    .line 453
    iget-object v4, v0, Lin8;->w:Ljava/lang/Object;

    .line 454
    .line 455
    check-cast v4, Ly19;

    .line 456
    .line 457
    iget-object v4, v4, Ly19;->I:Lv49;

    .line 458
    .line 459
    invoke-static {v4}, Ly19;->f(Lfy8;)V

    .line 460
    .line 461
    .line 462
    iget-object v4, v4, Lv49;->C:Ljava/util/concurrent/atomic/AtomicReference;

    .line 463
    .line 464
    invoke-virtual {v4, v3}, Ljava/util/concurrent/atomic/AtomicReference;->set(Ljava/lang/Object;)V

    .line 465
    .line 466
    .line 467
    iget-object v2, v2, Ly19;->A:Lq09;

    .line 468
    .line 469
    invoke-static {v2}, Ly19;->e(Lin8;)V

    .line 470
    .line 471
    .line 472
    iget-object v2, v2, Lq09;->C:Ll90;

    .line 473
    .line 474
    invoke-virtual {v2, v3}, Ll90;->k(Ljava/lang/String;)V

    .line 475
    .line 476
    .line 477
    :cond_7
    invoke-virtual {v0}, Lr69;->p1()V
    :try_end_9
    .catch Landroid/os/RemoteException; {:try_start_9 .. :try_end_9} :catch_2
    .catchall {:try_start_9 .. :try_end_9} :catchall_5

    .line 478
    .line 479
    .line 480
    :try_start_a
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 481
    .line 482
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_4

    .line 483
    .line 484
    goto :goto_b

    .line 485
    :goto_a
    :try_start_b
    iget-object v2, v1, Lz46;->z:Ljava/lang/Object;

    .line 486
    .line 487
    check-cast v2, Lr69;

    .line 488
    .line 489
    iget-object v2, v2, Lin8;->w:Ljava/lang/Object;

    .line 490
    .line 491
    check-cast v2, Ly19;

    .line 492
    .line 493
    iget-object v2, v2, Ly19;->B:Lpz8;

    .line 494
    .line 495
    invoke-static {v2}, Ly19;->g(Ly29;)V

    .line 496
    .line 497
    .line 498
    iget-object v2, v2, Lpz8;->B:Lmz8;

    .line 499
    .line 500
    const-string v3, "Failed to get app instance id"

    .line 501
    .line 502
    invoke-virtual {v2, v3, v0}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_5

    .line 503
    .line 504
    .line 505
    :try_start_c
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 506
    .line 507
    check-cast v0, Ljava/util/concurrent/atomic/AtomicReference;

    .line 508
    .line 509
    :goto_b
    invoke-virtual {v0}, Ljava/lang/Object;->notify()V

    .line 510
    .line 511
    .line 512
    monitor-exit v5

    .line 513
    :goto_c
    return-void

    .line 514
    :goto_d
    iget-object v1, v1, Lz46;->x:Ljava/lang/Object;

    .line 515
    .line 516
    check-cast v1, Ljava/util/concurrent/atomic/AtomicReference;

    .line 517
    .line 518
    invoke-virtual {v1}, Ljava/lang/Object;->notify()V

    .line 519
    .line 520
    .line 521
    throw v0

    .line 522
    :goto_e
    monitor-exit v5
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_4

    .line 523
    throw v0

    .line 524
    :pswitch_5
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 525
    .line 526
    check-cast v0, Lw29;

    .line 527
    .line 528
    iget-object v5, v1, Lz46;->y:Ljava/lang/Object;

    .line 529
    .line 530
    check-cast v5, Lz99;

    .line 531
    .line 532
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 533
    .line 534
    check-cast v1, Llm8;

    .line 535
    .line 536
    iget-object v8, v0, Lw29;->d:Lv89;

    .line 537
    .line 538
    invoke-virtual {v8}, Lv89;->T()V

    .line 539
    .line 540
    .line 541
    iget-object v5, v5, Lz99;->w:Ljava/lang/String;

    .line 542
    .line 543
    invoke-static {v5}, Lz65;->k(Ljava/lang/Object;)V

    .line 544
    .line 545
    .line 546
    iget-object v9, v8, Lv89;->a0:Ljava/util/HashMap;

    .line 547
    .line 548
    invoke-virtual {v8}, Lv89;->n0()Lr19;

    .line 549
    .line 550
    .line 551
    move-result-object v0

    .line 552
    invoke-virtual {v0}, Lr19;->b1()V

    .line 553
    .line 554
    .line 555
    invoke-virtual {v8}, Lv89;->j0()V

    .line 556
    .line 557
    .line 558
    iget-object v10, v8, Lv89;->y:Luq8;

    .line 559
    .line 560
    invoke-static {v10}, Lv89;->R(Lg89;)V

    .line 561
    .line 562
    .line 563
    iget-wide v12, v1, Llm8;->w:J

    .line 564
    .line 565
    iget-wide v14, v1, Llm8;->y:J

    .line 566
    .line 567
    invoke-virtual {v10}, Lin8;->b1()V

    .line 568
    .line 569
    .line 570
    invoke-virtual {v10}, Lg89;->d1()V

    .line 571
    .line 572
    .line 573
    const/4 v11, 0x4

    .line 574
    :try_start_d
    invoke-virtual {v10}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 575
    .line 576
    .line 577
    move-result-object v16

    .line 578
    const-string v17, "upload_queue"

    .line 579
    .line 580
    const-string v18, "rowId"

    .line 581
    .line 582
    const-string v19, "app_id"

    .line 583
    .line 584
    const-string v20, "measurement_batch"

    .line 585
    .line 586
    const-string v21, "upload_uri"

    .line 587
    .line 588
    const-string v22, "upload_headers"

    .line 589
    .line 590
    const-string v23, "upload_type"

    .line 591
    .line 592
    const-string v24, "retry_count"

    .line 593
    .line 594
    const-string v25, "creation_timestamp"

    .line 595
    .line 596
    const-string v26, "associated_row_id"

    .line 597
    .line 598
    const-string v27, "last_upload_timestamp"

    .line 599
    .line 600
    filled-new-array/range {v18 .. v27}, [Ljava/lang/String;

    .line 601
    .line 602
    .line 603
    move-result-object v18

    .line 604
    const-string v19, "rowId=?"

    .line 605
    .line 606
    invoke-static {v12, v13}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v0

    .line 610
    filled-new-array {v0}, [Ljava/lang/String;

    .line 611
    .line 612
    .line 613
    move-result-object v20

    .line 614
    const-string v24, "1"
    :try_end_d
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_d .. :try_end_d} :catch_a
    .catchall {:try_start_d .. :try_end_d} :catchall_8

    .line 615
    .line 616
    const/16 v21, 0x0

    .line 617
    .line 618
    const/16 v22, 0x0

    .line 619
    .line 620
    const/16 v23, 0x0

    .line 621
    .line 622
    move-object/from16 v25, v7

    .line 623
    .line 624
    :try_start_e
    invoke-virtual/range {v16 .. v24}, Landroid/database/sqlite/SQLiteDatabase;->query(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 625
    .line 626
    .line 627
    move-result-object v7
    :try_end_e
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_e .. :try_end_e} :catch_9
    .catchall {:try_start_e .. :try_end_e} :catchall_7

    .line 628
    :try_start_f
    invoke-interface {v7}, Landroid/database/Cursor;->moveToFirst()Z

    .line 629
    .line 630
    .line 631
    move-result v0

    .line 632
    if-nez v0, :cond_8

    .line 633
    .line 634
    move v4, v11

    .line 635
    move-wide v2, v14

    .line 636
    goto/16 :goto_13

    .line 637
    .line 638
    :cond_8
    invoke-interface {v7, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 639
    .line 640
    .line 641
    move-result-object v0

    .line 642
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V
    :try_end_f
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_f .. :try_end_f} :catch_8
    .catchall {:try_start_f .. :try_end_f} :catchall_6

    .line 643
    .line 644
    .line 645
    move-wide v15, v14

    .line 646
    :try_start_10
    invoke-interface {v7, v3}, Landroid/database/Cursor;->getBlob(I)[B

    .line 647
    .line 648
    .line 649
    move-result-object v14
    :try_end_10
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_10 .. :try_end_10} :catch_7
    .catchall {:try_start_10 .. :try_end_10} :catchall_6

    .line 650
    move-wide/from16 v16, v15

    .line 651
    .line 652
    :try_start_11
    invoke-interface {v7, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v15
    :try_end_11
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_11 .. :try_end_11} :catch_6
    .catchall {:try_start_11 .. :try_end_11} :catchall_6

    .line 656
    move-wide/from16 v17, v16

    .line 657
    .line 658
    :try_start_12
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 659
    .line 660
    .line 661
    move-result-object v16

    .line 662
    const/4 v3, 0x5

    .line 663
    invoke-interface {v7, v3}, Landroid/database/Cursor;->getInt(I)I

    .line 664
    .line 665
    .line 666
    move-result v3
    :try_end_12
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_12 .. :try_end_12} :catch_5
    .catchall {:try_start_12 .. :try_end_12} :catchall_6

    .line 667
    const/4 v11, 0x6

    .line 668
    :try_start_13
    invoke-interface {v7, v11}, Landroid/database/Cursor;->getInt(I)I

    .line 669
    .line 670
    .line 671
    move-result v11

    .line 672
    const/4 v4, 0x7

    .line 673
    invoke-interface {v7, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 674
    .line 675
    .line 676
    move-result-wide v19

    .line 677
    const/16 v4, 0x8

    .line 678
    .line 679
    invoke-interface {v7, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 680
    .line 681
    .line 682
    move-result-wide v21

    .line 683
    invoke-interface {v7, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 684
    .line 685
    .line 686
    move-result-wide v23
    :try_end_13
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_13 .. :try_end_13} :catch_4
    .catchall {:try_start_13 .. :try_end_13} :catchall_6

    .line 687
    move-wide/from16 v28, v17

    .line 688
    .line 689
    move/from16 v17, v3

    .line 690
    .line 691
    move-wide/from16 v2, v28

    .line 692
    .line 693
    move/from16 v18, v11

    .line 694
    .line 695
    const/4 v4, 0x4

    .line 696
    move-object v11, v0

    .line 697
    :try_start_14
    invoke-virtual/range {v10 .. v24}, Luq8;->F1(Ljava/lang/String;J[BLjava/lang/String;Ljava/lang/String;IIJJJ)Lx89;

    .line 698
    .line 699
    .line 700
    move-result-object v0
    :try_end_14
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_14 .. :try_end_14} :catch_3
    .catchall {:try_start_14 .. :try_end_14} :catchall_6

    .line 701
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 702
    .line 703
    .line 704
    move-object v7, v0

    .line 705
    goto :goto_14

    .line 706
    :catchall_6
    move-exception v0

    .line 707
    goto/16 :goto_19

    .line 708
    .line 709
    :catch_3
    move-exception v0

    .line 710
    goto :goto_12

    .line 711
    :catch_4
    move-exception v0

    .line 712
    move-wide/from16 v2, v17

    .line 713
    .line 714
    const/4 v4, 0x4

    .line 715
    goto :goto_12

    .line 716
    :catch_5
    move-exception v0

    .line 717
    move v4, v11

    .line 718
    move-wide/from16 v2, v17

    .line 719
    .line 720
    goto :goto_12

    .line 721
    :catch_6
    move-exception v0

    .line 722
    move v4, v11

    .line 723
    move-wide/from16 v2, v16

    .line 724
    .line 725
    goto :goto_12

    .line 726
    :catch_7
    move-exception v0

    .line 727
    move v4, v11

    .line 728
    move-wide v2, v15

    .line 729
    goto :goto_12

    .line 730
    :catch_8
    move-exception v0

    .line 731
    move v4, v11

    .line 732
    move-wide v2, v14

    .line 733
    goto :goto_12

    .line 734
    :catchall_7
    move-exception v0

    .line 735
    goto :goto_10

    .line 736
    :catch_9
    move-exception v0

    .line 737
    :goto_f
    move v4, v11

    .line 738
    move-wide v2, v14

    .line 739
    goto :goto_11

    .line 740
    :catchall_8
    move-exception v0

    .line 741
    move-object/from16 v25, v7

    .line 742
    .line 743
    goto :goto_10

    .line 744
    :catch_a
    move-exception v0

    .line 745
    move-object/from16 v25, v7

    .line 746
    .line 747
    goto :goto_f

    .line 748
    :goto_10
    move-object/from16 v7, v25

    .line 749
    .line 750
    goto/16 :goto_19

    .line 751
    .line 752
    :goto_11
    move-object/from16 v7, v25

    .line 753
    .line 754
    :goto_12
    :try_start_15
    iget-object v10, v10, Lin8;->w:Ljava/lang/Object;

    .line 755
    .line 756
    check-cast v10, Ly19;

    .line 757
    .line 758
    iget-object v10, v10, Ly19;->B:Lpz8;

    .line 759
    .line 760
    invoke-static {v10}, Ly19;->g(Ly29;)V

    .line 761
    .line 762
    .line 763
    iget-object v10, v10, Lpz8;->B:Lmz8;

    .line 764
    .line 765
    const-string v11, "Error to querying MeasurementBatch from upload_queue. rowId"

    .line 766
    .line 767
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 768
    .line 769
    .line 770
    move-result-object v14

    .line 771
    invoke-virtual {v10, v14, v0, v11}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_6

    .line 772
    .line 773
    .line 774
    :goto_13
    if-eqz v7, :cond_9

    .line 775
    .line 776
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 777
    .line 778
    .line 779
    :cond_9
    move-object/from16 v7, v25

    .line 780
    .line 781
    :goto_14
    if-nez v7, :cond_a

    .line 782
    .line 783
    invoke-virtual {v8}, Lv89;->G()Lpz8;

    .line 784
    .line 785
    .line 786
    move-result-object v0

    .line 787
    iget-object v0, v0, Lpz8;->E:Lmz8;

    .line 788
    .line 789
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 790
    .line 791
    .line 792
    move-result-object v1

    .line 793
    const-string v2, "[sgtm] Queued batch doesn\'t exist. appId, rowId"

    .line 794
    .line 795
    invoke-virtual {v0, v5, v1, v2}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 796
    .line 797
    .line 798
    goto/16 :goto_18

    .line 799
    .line 800
    :cond_a
    iget-object v0, v7, Lx89;->c:Ljava/lang/String;

    .line 801
    .line 802
    iget v7, v1, Llm8;->x:I

    .line 803
    .line 804
    if-ne v7, v6, :cond_d

    .line 805
    .line 806
    invoke-virtual {v9, v0}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 807
    .line 808
    .line 809
    move-result v1

    .line 810
    if-eqz v1, :cond_b

    .line 811
    .line 812
    invoke-virtual {v9, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 813
    .line 814
    .line 815
    :cond_b
    iget-object v0, v8, Lv89;->y:Luq8;

    .line 816
    .line 817
    invoke-static {v0}, Lv89;->R(Lg89;)V

    .line 818
    .line 819
    .line 820
    invoke-static {v12, v13}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    invoke-virtual {v0, v1}, Luq8;->j1(Ljava/lang/Long;)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v8}, Lv89;->G()Lpz8;

    .line 828
    .line 829
    .line 830
    move-result-object v0

    .line 831
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 832
    .line 833
    const-string v7, "[sgtm] queued batch deleted after successful client upload. appId, rowId"

    .line 834
    .line 835
    invoke-virtual {v0, v5, v1, v7}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    const-wide/16 v0, 0x0

    .line 839
    .line 840
    cmp-long v0, v2, v0

    .line 841
    .line 842
    if-lez v0, :cond_10

    .line 843
    .line 844
    iget-object v0, v8, Lv89;->y:Luq8;

    .line 845
    .line 846
    invoke-static {v0}, Lv89;->R(Lg89;)V

    .line 847
    .line 848
    .line 849
    iget-object v1, v0, Lin8;->w:Ljava/lang/Object;

    .line 850
    .line 851
    check-cast v1, Ly19;

    .line 852
    .line 853
    invoke-virtual {v0}, Lin8;->b1()V

    .line 854
    .line 855
    .line 856
    invoke-virtual {v0}, Lg89;->d1()V

    .line 857
    .line 858
    .line 859
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 860
    .line 861
    .line 862
    move-result-object v7

    .line 863
    new-instance v9, Landroid/content/ContentValues;

    .line 864
    .line 865
    invoke-direct {v9}, Landroid/content/ContentValues;-><init>()V

    .line 866
    .line 867
    .line 868
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 869
    .line 870
    .line 871
    move-result-object v6

    .line 872
    const-string v10, "upload_type"

    .line 873
    .line 874
    invoke-virtual {v9, v10, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Integer;)V

    .line 875
    .line 876
    .line 877
    iget-object v6, v1, Ly19;->G:Lxb4;

    .line 878
    .line 879
    iget-object v1, v1, Ly19;->B:Lpz8;

    .line 880
    .line 881
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 882
    .line 883
    .line 884
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 885
    .line 886
    .line 887
    move-result-wide v10

    .line 888
    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 889
    .line 890
    .line 891
    move-result-object v6

    .line 892
    const-string v10, "creation_timestamp"

    .line 893
    .line 894
    invoke-virtual {v9, v10, v6}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 895
    .line 896
    .line 897
    :try_start_16
    invoke-virtual {v0}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 898
    .line 899
    .line 900
    move-result-object v0

    .line 901
    const-string v6, "upload_queue"

    .line 902
    .line 903
    const-string v10, "rowid=? AND app_id=? AND upload_type=?"

    .line 904
    .line 905
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 906
    .line 907
    .line 908
    move-result-object v11

    .line 909
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 910
    .line 911
    .line 912
    move-result-object v4

    .line 913
    filled-new-array {v11, v5, v4}, [Ljava/lang/String;

    .line 914
    .line 915
    .line 916
    move-result-object v4

    .line 917
    invoke-virtual {v0, v6, v9, v10, v4}, Landroid/database/sqlite/SQLiteDatabase;->update(Ljava/lang/String;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I

    .line 918
    .line 919
    .line 920
    move-result v0

    .line 921
    int-to-long v9, v0

    .line 922
    const-wide/16 v11, 0x1

    .line 923
    .line 924
    cmp-long v0, v9, v11

    .line 925
    .line 926
    if-eqz v0, :cond_c

    .line 927
    .line 928
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 929
    .line 930
    .line 931
    iget-object v0, v1, Lpz8;->E:Lmz8;

    .line 932
    .line 933
    const-string v4, "Google Signal pending batch not updated. appId, rowId"

    .line 934
    .line 935
    invoke-virtual {v0, v5, v7, v4}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_16
    .catch Landroid/database/sqlite/SQLiteException; {:try_start_16 .. :try_end_16} :catch_b

    .line 936
    .line 937
    .line 938
    goto :goto_15

    .line 939
    :catch_b
    move-exception v0

    .line 940
    goto :goto_16

    .line 941
    :cond_c
    :goto_15
    invoke-virtual {v8}, Lv89;->G()Lpz8;

    .line 942
    .line 943
    .line 944
    move-result-object v0

    .line 945
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 946
    .line 947
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 948
    .line 949
    .line 950
    move-result-object v1

    .line 951
    const-string v2, "[sgtm] queued Google Signal batch updated. appId, signalRowId"

    .line 952
    .line 953
    invoke-virtual {v0, v5, v1, v2}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 954
    .line 955
    .line 956
    invoke-virtual {v8, v5}, Lv89;->o(Ljava/lang/String;)V

    .line 957
    .line 958
    .line 959
    goto :goto_18

    .line 960
    :goto_16
    invoke-static {v1}, Ly19;->g(Ly29;)V

    .line 961
    .line 962
    .line 963
    iget-object v1, v1, Lpz8;->B:Lmz8;

    .line 964
    .line 965
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 966
    .line 967
    .line 968
    move-result-object v2

    .line 969
    const-string v3, "Failed to update google Signal pending batch. appid, rowId"

    .line 970
    .line 971
    invoke-virtual {v1, v3, v5, v2, v0}, Lmz8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 972
    .line 973
    .line 974
    throw v0

    .line 975
    :cond_d
    const/4 v2, 0x3

    .line 976
    if-ne v7, v2, :cond_f

    .line 977
    .line 978
    invoke-virtual {v9, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 979
    .line 980
    .line 981
    move-result-object v2

    .line 982
    check-cast v2, Lu89;

    .line 983
    .line 984
    if-nez v2, :cond_e

    .line 985
    .line 986
    new-instance v2, Lu89;

    .line 987
    .line 988
    invoke-direct {v2, v8}, Lu89;-><init>(Lv89;)V

    .line 989
    .line 990
    .line 991
    invoke-virtual {v9, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 992
    .line 993
    .line 994
    goto :goto_17

    .line 995
    :cond_e
    iget v3, v2, Lu89;->b:I

    .line 996
    .line 997
    add-int/2addr v3, v6

    .line 998
    iput v3, v2, Lu89;->b:I

    .line 999
    .line 1000
    invoke-virtual {v2}, Lu89;->a()J

    .line 1001
    .line 1002
    .line 1003
    move-result-wide v3

    .line 1004
    iput-wide v3, v2, Lu89;->c:J

    .line 1005
    .line 1006
    :goto_17
    invoke-virtual {v8}, Lv89;->Q()Lxb4;

    .line 1007
    .line 1008
    .line 1009
    move-result-object v3

    .line 1010
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1011
    .line 1012
    .line 1013
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1014
    .line 1015
    .line 1016
    move-result-wide v3

    .line 1017
    iget-wide v6, v2, Lu89;->c:J

    .line 1018
    .line 1019
    sub-long/2addr v6, v3

    .line 1020
    invoke-virtual {v8}, Lv89;->G()Lpz8;

    .line 1021
    .line 1022
    .line 1023
    move-result-object v2

    .line 1024
    iget-object v2, v2, Lpz8;->J:Lmz8;

    .line 1025
    .line 1026
    const-wide/16 v3, 0x3e8

    .line 1027
    .line 1028
    div-long/2addr v6, v3

    .line 1029
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v3

    .line 1033
    const-string v4, "[sgtm] Putting sGTM server in backoff mode. appId, destination, nextRetryInSeconds"

    .line 1034
    .line 1035
    invoke-virtual {v2, v4, v5, v0, v3}, Lmz8;->d(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 1036
    .line 1037
    .line 1038
    :cond_f
    iget-object v0, v8, Lv89;->y:Luq8;

    .line 1039
    .line 1040
    invoke-static {v0}, Lv89;->R(Lg89;)V

    .line 1041
    .line 1042
    .line 1043
    iget-wide v1, v1, Llm8;->w:J

    .line 1044
    .line 1045
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 1046
    .line 1047
    .line 1048
    move-result-object v1

    .line 1049
    invoke-virtual {v0, v1}, Luq8;->o1(Ljava/lang/Long;)V

    .line 1050
    .line 1051
    .line 1052
    invoke-virtual {v8}, Lv89;->G()Lpz8;

    .line 1053
    .line 1054
    .line 1055
    move-result-object v0

    .line 1056
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 1057
    .line 1058
    const-string v2, "[sgtm] increased batch retry count after failed client upload. appId, rowId"

    .line 1059
    .line 1060
    invoke-virtual {v0, v5, v1, v2}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1061
    .line 1062
    .line 1063
    :cond_10
    :goto_18
    return-void

    .line 1064
    :goto_19
    if-eqz v7, :cond_11

    .line 1065
    .line 1066
    invoke-interface {v7}, Landroid/database/Cursor;->close()V

    .line 1067
    .line 1068
    .line 1069
    :cond_11
    throw v0

    .line 1070
    :pswitch_6
    iget-object v0, v1, Lz46;->z:Ljava/lang/Object;

    .line 1071
    .line 1072
    check-cast v0, Lw29;

    .line 1073
    .line 1074
    iget-object v0, v0, Lw29;->d:Lv89;

    .line 1075
    .line 1076
    invoke-virtual {v0}, Lv89;->T()V

    .line 1077
    .line 1078
    .line 1079
    iget-object v2, v1, Lz46;->x:Ljava/lang/Object;

    .line 1080
    .line 1081
    check-cast v2, Lz89;

    .line 1082
    .line 1083
    invoke-virtual {v2}, Lz89;->f()Ljava/lang/Object;

    .line 1084
    .line 1085
    .line 1086
    move-result-object v3

    .line 1087
    iget-object v1, v1, Lz46;->y:Ljava/lang/Object;

    .line 1088
    .line 1089
    check-cast v1, Lz99;

    .line 1090
    .line 1091
    if-nez v3, :cond_12

    .line 1092
    .line 1093
    iget-object v2, v2, Lz89;->x:Ljava/lang/String;

    .line 1094
    .line 1095
    invoke-virtual {v0, v2, v1}, Lv89;->V(Ljava/lang/String;Lz99;)V

    .line 1096
    .line 1097
    .line 1098
    goto :goto_1a

    .line 1099
    :cond_12
    invoke-virtual {v0, v2, v1}, Lv89;->U(Lz89;Lz99;)V

    .line 1100
    .line 1101
    .line 1102
    :goto_1a
    return-void

    .line 1103
    :pswitch_7
    iget-object v0, v1, Lz46;->z:Ljava/lang/Object;

    .line 1104
    .line 1105
    check-cast v0, Lw29;

    .line 1106
    .line 1107
    iget-object v2, v0, Lw29;->d:Lv89;

    .line 1108
    .line 1109
    invoke-virtual {v2}, Lv89;->T()V

    .line 1110
    .line 1111
    .line 1112
    iget-object v0, v0, Lw29;->d:Lv89;

    .line 1113
    .line 1114
    iget-object v2, v1, Lz46;->x:Ljava/lang/Object;

    .line 1115
    .line 1116
    check-cast v2, Lzr8;

    .line 1117
    .line 1118
    iget-object v1, v1, Lz46;->y:Ljava/lang/Object;

    .line 1119
    .line 1120
    check-cast v1, Ljava/lang/String;

    .line 1121
    .line 1122
    invoke-virtual {v0, v1, v2}, Lv89;->c(Ljava/lang/String;Lzr8;)V

    .line 1123
    .line 1124
    .line 1125
    return-void

    .line 1126
    :pswitch_8
    move-object/from16 v25, v7

    .line 1127
    .line 1128
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 1129
    .line 1130
    check-cast v0, Lzr8;

    .line 1131
    .line 1132
    iget-object v2, v1, Lz46;->y:Ljava/lang/Object;

    .line 1133
    .line 1134
    check-cast v2, Lz99;

    .line 1135
    .line 1136
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 1137
    .line 1138
    check-cast v1, Lw29;

    .line 1139
    .line 1140
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1141
    .line 1142
    .line 1143
    iget-object v1, v1, Lw29;->d:Lv89;

    .line 1144
    .line 1145
    const-string v3, "_cmp"

    .line 1146
    .line 1147
    iget-object v4, v0, Lzr8;->w:Ljava/lang/String;

    .line 1148
    .line 1149
    invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1150
    .line 1151
    .line 1152
    move-result v3

    .line 1153
    if-eqz v3, :cond_15

    .line 1154
    .line 1155
    iget-object v9, v0, Lzr8;->x:Lur8;

    .line 1156
    .line 1157
    if-eqz v9, :cond_15

    .line 1158
    .line 1159
    iget-object v3, v9, Lur8;->w:Landroid/os/Bundle;

    .line 1160
    .line 1161
    invoke-virtual {v3}, Landroid/os/BaseBundle;->size()I

    .line 1162
    .line 1163
    .line 1164
    move-result v4

    .line 1165
    if-nez v4, :cond_13

    .line 1166
    .line 1167
    goto :goto_1b

    .line 1168
    :cond_13
    const-string v4, "_cis"

    .line 1169
    .line 1170
    invoke-virtual {v3, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 1171
    .line 1172
    .line 1173
    move-result-object v3

    .line 1174
    const-string v4, "referrer broadcast"

    .line 1175
    .line 1176
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1177
    .line 1178
    .line 1179
    move-result v4

    .line 1180
    if-nez v4, :cond_14

    .line 1181
    .line 1182
    const-string v4, "referrer API"

    .line 1183
    .line 1184
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1185
    .line 1186
    .line 1187
    move-result v3

    .line 1188
    if-eqz v3, :cond_15

    .line 1189
    .line 1190
    :cond_14
    invoke-virtual {v1}, Lv89;->G()Lpz8;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v3

    .line 1194
    iget-object v3, v3, Lpz8;->H:Lmz8;

    .line 1195
    .line 1196
    invoke-virtual {v0}, Lzr8;->toString()Ljava/lang/String;

    .line 1197
    .line 1198
    .line 1199
    move-result-object v4

    .line 1200
    const-string v5, "Event has been filtered "

    .line 1201
    .line 1202
    invoke-virtual {v3, v5, v4}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1203
    .line 1204
    .line 1205
    new-instance v7, Lzr8;

    .line 1206
    .line 1207
    iget-object v10, v0, Lzr8;->y:Ljava/lang/String;

    .line 1208
    .line 1209
    iget-wide v11, v0, Lzr8;->z:J

    .line 1210
    .line 1211
    iget-wide v13, v0, Lzr8;->A:J

    .line 1212
    .line 1213
    const-string v8, "_cmpx"

    .line 1214
    .line 1215
    invoke-direct/range {v7 .. v14}, Lzr8;-><init>(Ljava/lang/String;Lur8;Ljava/lang/String;JJ)V

    .line 1216
    .line 1217
    .line 1218
    move-object v0, v7

    .line 1219
    :cond_15
    :goto_1b
    iget-object v3, v0, Lzr8;->w:Ljava/lang/String;

    .line 1220
    .line 1221
    iget-object v4, v1, Lv89;->w:Lj19;

    .line 1222
    .line 1223
    iget-object v5, v1, Lv89;->C:Ly89;

    .line 1224
    .line 1225
    invoke-static {v4}, Lv89;->R(Lg89;)V

    .line 1226
    .line 1227
    .line 1228
    iget-object v7, v2, Lz99;->w:Ljava/lang/String;

    .line 1229
    .line 1230
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1231
    .line 1232
    .line 1233
    move-result v8

    .line 1234
    if-eqz v8, :cond_16

    .line 1235
    .line 1236
    move-object/from16 v7, v25

    .line 1237
    .line 1238
    goto :goto_1c

    .line 1239
    :cond_16
    iget-object v4, v4, Lj19;->G:Lt11;

    .line 1240
    .line 1241
    invoke-virtual {v4, v7}, Lkd4;->h(Ljava/lang/Object;)Ljava/lang/Object;

    .line 1242
    .line 1243
    .line 1244
    move-result-object v4

    .line 1245
    move-object v7, v4

    .line 1246
    check-cast v7, Lgt8;

    .line 1247
    .line 1248
    :goto_1c
    if-eqz v7, :cond_1a

    .line 1249
    .line 1250
    :try_start_17
    iget-object v4, v7, Lgt8;->c:Lcf4;

    .line 1251
    .line 1252
    invoke-static {v5}, Lv89;->R(Lg89;)V

    .line 1253
    .line 1254
    .line 1255
    iget-object v8, v0, Lzr8;->x:Lur8;

    .line 1256
    .line 1257
    invoke-virtual {v8}, Lur8;->l()Landroid/os/Bundle;

    .line 1258
    .line 1259
    .line 1260
    move-result-object v8

    .line 1261
    invoke-static {v8, v6}, Ly89;->Q1(Landroid/os/Bundle;Z)Ljava/util/HashMap;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v6

    .line 1265
    sget-object v8, Lr16;->Y:[Ljava/lang/String;

    .line 1266
    .line 1267
    sget-object v9, Lr16;->T:[Ljava/lang/String;

    .line 1268
    .line 1269
    invoke-static {v3, v8, v9}, Lb35;->G(Ljava/lang/String;[Ljava/lang/String;[Ljava/lang/String;)Ljava/lang/String;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v8

    .line 1273
    if-eqz v8, :cond_17

    .line 1274
    .line 1275
    goto :goto_1d

    .line 1276
    :cond_17
    move-object v8, v3

    .line 1277
    :goto_1d
    new-instance v9, Lwi8;

    .line 1278
    .line 1279
    iget-wide v10, v0, Lzr8;->z:J

    .line 1280
    .line 1281
    invoke-direct {v9, v8, v10, v11, v6}, Lwi8;-><init>(Ljava/lang/String;JLjava/util/HashMap;)V

    .line 1282
    .line 1283
    .line 1284
    invoke-virtual {v7, v9}, Lgt8;->a(Lwi8;)Z

    .line 1285
    .line 1286
    .line 1287
    move-result v6
    :try_end_17
    .catch Lcom/google/android/gms/internal/measurement/zzd; {:try_start_17 .. :try_end_17} :catch_c

    .line 1288
    if-nez v6, :cond_18

    .line 1289
    .line 1290
    goto/16 :goto_20

    .line 1291
    .line 1292
    :cond_18
    iget-object v6, v4, Lcf4;->y:Ljava/lang/Object;

    .line 1293
    .line 1294
    check-cast v6, Lwi8;

    .line 1295
    .line 1296
    iget-object v7, v4, Lcf4;->x:Ljava/lang/Object;

    .line 1297
    .line 1298
    check-cast v7, Lwi8;

    .line 1299
    .line 1300
    invoke-virtual {v6, v7}, Lwi8;->equals(Ljava/lang/Object;)Z

    .line 1301
    .line 1302
    .line 1303
    move-result v6

    .line 1304
    if-nez v6, :cond_19

    .line 1305
    .line 1306
    invoke-virtual {v1}, Lv89;->G()Lpz8;

    .line 1307
    .line 1308
    .line 1309
    move-result-object v0

    .line 1310
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 1311
    .line 1312
    const-string v6, "EES edited event"

    .line 1313
    .line 1314
    invoke-virtual {v0, v6, v3}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1315
    .line 1316
    .line 1317
    invoke-static {v5}, Lv89;->R(Lg89;)V

    .line 1318
    .line 1319
    .line 1320
    iget-object v0, v4, Lcf4;->y:Ljava/lang/Object;

    .line 1321
    .line 1322
    check-cast v0, Lwi8;

    .line 1323
    .line 1324
    invoke-static {v0}, Ly89;->g1(Lwi8;)Lzr8;

    .line 1325
    .line 1326
    .line 1327
    move-result-object v0

    .line 1328
    invoke-virtual {v1}, Lv89;->T()V

    .line 1329
    .line 1330
    .line 1331
    invoke-virtual {v1, v0, v2}, Lv89;->e(Lzr8;Lz99;)V

    .line 1332
    .line 1333
    .line 1334
    goto :goto_1e

    .line 1335
    :cond_19
    invoke-virtual {v1}, Lv89;->T()V

    .line 1336
    .line 1337
    .line 1338
    invoke-virtual {v1, v0, v2}, Lv89;->e(Lzr8;Lz99;)V

    .line 1339
    .line 1340
    .line 1341
    :goto_1e
    iget-object v0, v4, Lcf4;->z:Ljava/lang/Object;

    .line 1342
    .line 1343
    check-cast v0, Ljava/util/ArrayList;

    .line 1344
    .line 1345
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1346
    .line 1347
    .line 1348
    move-result v0

    .line 1349
    if-nez v0, :cond_1b

    .line 1350
    .line 1351
    iget-object v0, v4, Lcf4;->z:Ljava/lang/Object;

    .line 1352
    .line 1353
    check-cast v0, Ljava/util/ArrayList;

    .line 1354
    .line 1355
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    :goto_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1360
    .line 1361
    .line 1362
    move-result v3

    .line 1363
    if-eqz v3, :cond_1b

    .line 1364
    .line 1365
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v3

    .line 1369
    check-cast v3, Lwi8;

    .line 1370
    .line 1371
    invoke-virtual {v1}, Lv89;->G()Lpz8;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v4

    .line 1375
    iget-object v4, v4, Lpz8;->J:Lmz8;

    .line 1376
    .line 1377
    iget-object v6, v3, Lwi8;->a:Ljava/lang/String;

    .line 1378
    .line 1379
    const-string v7, "EES logging created event"

    .line 1380
    .line 1381
    invoke-virtual {v4, v7, v6}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1382
    .line 1383
    .line 1384
    invoke-static {v5}, Lv89;->R(Lg89;)V

    .line 1385
    .line 1386
    .line 1387
    invoke-static {v3}, Ly89;->g1(Lwi8;)Lzr8;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v3

    .line 1391
    invoke-virtual {v1}, Lv89;->T()V

    .line 1392
    .line 1393
    .line 1394
    invoke-virtual {v1, v3, v2}, Lv89;->e(Lzr8;Lz99;)V

    .line 1395
    .line 1396
    .line 1397
    goto :goto_1f

    .line 1398
    :catch_c
    invoke-virtual {v1}, Lv89;->G()Lpz8;

    .line 1399
    .line 1400
    .line 1401
    move-result-object v4

    .line 1402
    iget-object v4, v4, Lpz8;->B:Lmz8;

    .line 1403
    .line 1404
    iget-object v5, v2, Lz99;->x:Ljava/lang/String;

    .line 1405
    .line 1406
    const-string v6, "EES error. appId, eventName"

    .line 1407
    .line 1408
    invoke-virtual {v4, v5, v3, v6}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 1409
    .line 1410
    .line 1411
    :goto_20
    invoke-virtual {v1}, Lv89;->G()Lpz8;

    .line 1412
    .line 1413
    .line 1414
    move-result-object v4

    .line 1415
    iget-object v4, v4, Lpz8;->J:Lmz8;

    .line 1416
    .line 1417
    const-string v5, "EES was not applied to event"

    .line 1418
    .line 1419
    invoke-virtual {v4, v5, v3}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1420
    .line 1421
    .line 1422
    invoke-virtual {v1}, Lv89;->T()V

    .line 1423
    .line 1424
    .line 1425
    invoke-virtual {v1, v0, v2}, Lv89;->e(Lzr8;Lz99;)V

    .line 1426
    .line 1427
    .line 1428
    goto :goto_21

    .line 1429
    :cond_1a
    invoke-virtual {v1}, Lv89;->G()Lpz8;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v3

    .line 1433
    iget-object v3, v3, Lpz8;->J:Lmz8;

    .line 1434
    .line 1435
    iget-object v4, v2, Lz99;->w:Ljava/lang/String;

    .line 1436
    .line 1437
    const-string v5, "EES not loaded for"

    .line 1438
    .line 1439
    invoke-virtual {v3, v5, v4}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1440
    .line 1441
    .line 1442
    invoke-virtual {v1}, Lv89;->T()V

    .line 1443
    .line 1444
    .line 1445
    invoke-virtual {v1, v0, v2}, Lv89;->e(Lzr8;Lz99;)V

    .line 1446
    .line 1447
    .line 1448
    :cond_1b
    :goto_21
    return-void

    .line 1449
    :pswitch_9
    iget-object v0, v1, Lz46;->z:Ljava/lang/Object;

    .line 1450
    .line 1451
    check-cast v0, Lw29;

    .line 1452
    .line 1453
    iget-object v0, v0, Lw29;->d:Lv89;

    .line 1454
    .line 1455
    invoke-virtual {v0}, Lv89;->T()V

    .line 1456
    .line 1457
    .line 1458
    iget-object v2, v1, Lz46;->x:Ljava/lang/Object;

    .line 1459
    .line 1460
    check-cast v2, Lxn8;

    .line 1461
    .line 1462
    iget-object v3, v2, Lxn8;->y:Lz89;

    .line 1463
    .line 1464
    invoke-virtual {v3}, Lz89;->f()Ljava/lang/Object;

    .line 1465
    .line 1466
    .line 1467
    move-result-object v3

    .line 1468
    iget-object v1, v1, Lz46;->y:Ljava/lang/Object;

    .line 1469
    .line 1470
    check-cast v1, Lz99;

    .line 1471
    .line 1472
    if-nez v3, :cond_1c

    .line 1473
    .line 1474
    invoke-virtual {v0, v2, v1}, Lv89;->Y(Lxn8;Lz99;)V

    .line 1475
    .line 1476
    .line 1477
    goto :goto_22

    .line 1478
    :cond_1c
    invoke-virtual {v0, v2, v1}, Lv89;->X(Lxn8;Lz99;)V

    .line 1479
    .line 1480
    .line 1481
    :goto_22
    return-void

    .line 1482
    :pswitch_a
    move-object/from16 v25, v7

    .line 1483
    .line 1484
    iget-object v0, v1, Lz46;->y:Ljava/lang/Object;

    .line 1485
    .line 1486
    check-cast v0, Lns0;

    .line 1487
    .line 1488
    iget-object v2, v0, Lns0;->w:Landroid/content/Intent;

    .line 1489
    .line 1490
    const-string v4, "google.message_id"

    .line 1491
    .line 1492
    invoke-virtual {v2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1493
    .line 1494
    .line 1495
    move-result-object v4

    .line 1496
    if-nez v4, :cond_1d

    .line 1497
    .line 1498
    const-string v4, "message_id"

    .line 1499
    .line 1500
    invoke-virtual {v2, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1501
    .line 1502
    .line 1503
    move-result-object v4

    .line 1504
    :cond_1d
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 1505
    .line 1506
    .line 1507
    move-result v2

    .line 1508
    if-eqz v2, :cond_1e

    .line 1509
    .line 1510
    invoke-static/range {v25 .. v25}, Lb35;->l(Ljava/lang/Object;)Lyb9;

    .line 1511
    .line 1512
    .line 1513
    move-result-object v0

    .line 1514
    goto :goto_24

    .line 1515
    :cond_1e
    new-instance v2, Landroid/os/Bundle;

    .line 1516
    .line 1517
    invoke-direct {v2}, Landroid/os/Bundle;-><init>()V

    .line 1518
    .line 1519
    .line 1520
    iget-object v4, v0, Lns0;->w:Landroid/content/Intent;

    .line 1521
    .line 1522
    const-string v7, "google.message_id"

    .line 1523
    .line 1524
    invoke-virtual {v4, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1525
    .line 1526
    .line 1527
    move-result-object v7

    .line 1528
    if-nez v7, :cond_1f

    .line 1529
    .line 1530
    const-string v7, "message_id"

    .line 1531
    .line 1532
    invoke-virtual {v4, v7}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v7

    .line 1536
    :cond_1f
    const-string v4, "google.message_id"

    .line 1537
    .line 1538
    invoke-virtual {v2, v4, v7}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1539
    .line 1540
    .line 1541
    iget-object v0, v0, Lns0;->w:Landroid/content/Intent;

    .line 1542
    .line 1543
    const-string v4, "google.product_id"

    .line 1544
    .line 1545
    invoke-virtual {v0, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 1546
    .line 1547
    .line 1548
    move-result v7

    .line 1549
    if-eqz v7, :cond_20

    .line 1550
    .line 1551
    invoke-virtual {v0, v4, v5}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 1552
    .line 1553
    .line 1554
    move-result v0

    .line 1555
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v7

    .line 1559
    goto :goto_23

    .line 1560
    :cond_20
    move-object/from16 v7, v25

    .line 1561
    .line 1562
    :goto_23
    if-eqz v7, :cond_21

    .line 1563
    .line 1564
    const-string v0, "google.product_id"

    .line 1565
    .line 1566
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 1567
    .line 1568
    .line 1569
    move-result v4

    .line 1570
    invoke-virtual {v2, v0, v4}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V

    .line 1571
    .line 1572
    .line 1573
    :cond_21
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 1574
    .line 1575
    check-cast v0, Landroid/content/Context;

    .line 1576
    .line 1577
    const-string v4, "supports_message_handled"

    .line 1578
    .line 1579
    invoke-virtual {v2, v4, v6}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 1580
    .line 1581
    .line 1582
    invoke-static {v0}, Lkb9;->s(Landroid/content/Context;)Lkb9;

    .line 1583
    .line 1584
    .line 1585
    move-result-object v4

    .line 1586
    new-instance v0, Lba9;

    .line 1587
    .line 1588
    monitor-enter v4

    .line 1589
    :try_start_18
    iget v6, v4, Lkb9;->x:I

    .line 1590
    .line 1591
    add-int/lit8 v7, v6, 0x1

    .line 1592
    .line 1593
    iput v7, v4, Lkb9;->x:I
    :try_end_18
    .catchall {:try_start_18 .. :try_end_18} :catchall_9

    .line 1594
    .line 1595
    monitor-exit v4

    .line 1596
    invoke-direct {v0, v6, v3, v2, v5}, Lba9;-><init>(IILandroid/os/Bundle;I)V

    .line 1597
    .line 1598
    .line 1599
    invoke-virtual {v4, v0}, Lkb9;->t(Lba9;)Lyb9;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v0

    .line 1603
    :goto_24
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 1604
    .line 1605
    check-cast v1, Ljava/util/concurrent/CountDownLatch;

    .line 1606
    .line 1607
    sget-object v2, Lgv1;->A:Lgv1;

    .line 1608
    .line 1609
    new-instance v3, Laj8;

    .line 1610
    .line 1611
    invoke-direct {v3, v1}, Laj8;-><init>(Ljava/util/concurrent/CountDownLatch;)V

    .line 1612
    .line 1613
    .line 1614
    invoke-virtual {v0, v2, v3}, Lyb9;->c(Ljava/util/concurrent/Executor;Ly45;)V

    .line 1615
    .line 1616
    .line 1617
    return-void

    .line 1618
    :catchall_9
    move-exception v0

    .line 1619
    :try_start_19
    monitor-exit v4
    :try_end_19
    .catchall {:try_start_19 .. :try_end_19} :catchall_9

    .line 1620
    throw v0

    .line 1621
    :pswitch_b
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 1622
    .line 1623
    move-object v3, v0

    .line 1624
    check-cast v3, Lkk0;

    .line 1625
    .line 1626
    :try_start_1a
    iget-object v0, v3, Lkk0;->A:Le81;

    .line 1627
    .line 1628
    sget-object v2, Lhz2;->z:Lhz2;

    .line 1629
    .line 1630
    invoke-interface {v0, v2}, Le81;->L(Ld81;)Le81;

    .line 1631
    .line 1632
    .line 1633
    move-result-object v0

    .line 1634
    new-instance v2, Lng;

    .line 1635
    .line 1636
    iget-object v4, v1, Lz46;->y:Ljava/lang/Object;

    .line 1637
    .line 1638
    check-cast v4, La96;

    .line 1639
    .line 1640
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 1641
    .line 1642
    check-cast v1, Lk05;

    .line 1643
    .line 1644
    const/4 v5, 0x0

    .line 1645
    const/16 v6, 0x11

    .line 1646
    .line 1647
    move-object/from16 v28, v4

    .line 1648
    .line 1649
    move-object v4, v1

    .line 1650
    move-object v1, v2

    .line 1651
    move-object/from16 v2, v28

    .line 1652
    .line 1653
    invoke-direct/range {v1 .. v6}, Lng;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 1654
    .line 1655
    .line 1656
    invoke-static {v0, v1}, Lar7;->U(Le81;Lgs2;)Ljava/lang/Object;
    :try_end_1a
    .catchall {:try_start_1a .. :try_end_1a} :catchall_a

    .line 1657
    .line 1658
    .line 1659
    goto :goto_25

    .line 1660
    :catchall_a
    move-exception v0

    .line 1661
    invoke-virtual {v3, v0}, Lkk0;->a(Ljava/lang/Throwable;)Z

    .line 1662
    .line 1663
    .line 1664
    :goto_25
    return-void

    .line 1665
    :pswitch_c
    move-object/from16 v25, v7

    .line 1666
    .line 1667
    :try_start_1b
    iget-object v0, v1, Lz46;->x:Ljava/lang/Object;

    .line 1668
    .line 1669
    check-cast v0, Lnl2;

    .line 1670
    .line 1671
    invoke-virtual {v0}, Lnl2;->call()Ljava/lang/Object;

    .line 1672
    .line 1673
    .line 1674
    move-result-object v7
    :try_end_1b
    .catch Ljava/lang/Exception; {:try_start_1b .. :try_end_1b} :catch_d

    .line 1675
    goto :goto_26

    .line 1676
    :catch_d
    move-object/from16 v7, v25

    .line 1677
    .line 1678
    :goto_26
    iget-object v0, v1, Lz46;->y:Ljava/lang/Object;

    .line 1679
    .line 1680
    check-cast v0, Lol2;

    .line 1681
    .line 1682
    iget-object v1, v1, Lz46;->z:Ljava/lang/Object;

    .line 1683
    .line 1684
    check-cast v1, Landroid/os/Handler;

    .line 1685
    .line 1686
    new-instance v3, Lnt2;

    .line 1687
    .line 1688
    invoke-direct {v3, v2, v0, v7}, Lnt2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 1689
    .line 1690
    .line 1691
    invoke-virtual {v1, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1692
    .line 1693
    .line 1694
    return-void

    .line 1695
    :pswitch_d
    move-object/from16 v25, v7

    .line 1696
    .line 1697
    iget-object v0, v1, Lz46;->z:Ljava/lang/Object;

    .line 1698
    .line 1699
    check-cast v0, La56;

    .line 1700
    .line 1701
    iget-object v2, v1, Lz46;->x:Ljava/lang/Object;

    .line 1702
    .line 1703
    check-cast v2, Ldz;

    .line 1704
    .line 1705
    iget-object v1, v1, Lz46;->y:Ljava/lang/Object;

    .line 1706
    .line 1707
    check-cast v1, Lxb7;

    .line 1708
    .line 1709
    invoke-virtual {v0, v2, v1}, La56;->b(Ldz;Lxb7;)V

    .line 1710
    .line 1711
    .line 1712
    iget-object v1, v0, La56;->i:Lhv2;

    .line 1713
    .line 1714
    iget-object v1, v1, Lhv2;->x:Ljava/lang/Object;

    .line 1715
    .line 1716
    check-cast v1, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 1717
    .line 1718
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    .line 1719
    .line 1720
    .line 1721
    const-wide v3, 0x40ed4c0000000000L    # 60000.0

    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    iget-wide v5, v0, La56;->a:D

    .line 1727
    .line 1728
    div-double/2addr v3, v5

    .line 1729
    iget-wide v5, v0, La56;->b:D

    .line 1730
    .line 1731
    invoke-virtual {v0}, La56;->a()I

    .line 1732
    .line 1733
    .line 1734
    move-result v0

    .line 1735
    int-to-double v0, v0

    .line 1736
    invoke-static {v5, v6, v0, v1}, Ljava/lang/Math;->pow(DD)D

    .line 1737
    .line 1738
    .line 1739
    move-result-wide v0

    .line 1740
    mul-double/2addr v0, v3

    .line 1741
    const-wide v3, 0x414b774000000000L    # 3600000.0

    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    invoke-static {v3, v4, v0, v1}, Ljava/lang/Math;->min(DD)D

    .line 1747
    .line 1748
    .line 1749
    move-result-wide v0

    .line 1750
    new-instance v3, Ljava/lang/StringBuilder;

    .line 1751
    .line 1752
    const-string v4, "Delay for: "

    .line 1753
    .line 1754
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1755
    .line 1756
    .line 1757
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1758
    .line 1759
    const-string v5, "%.2f"

    .line 1760
    .line 1761
    const-wide v6, 0x408f400000000000L    # 1000.0

    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    div-double v6, v0, v6

    .line 1767
    .line 1768
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 1769
    .line 1770
    .line 1771
    move-result-object v6

    .line 1772
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v6

    .line 1776
    invoke-static {v4, v5, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 1777
    .line 1778
    .line 1779
    move-result-object v4

    .line 1780
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1781
    .line 1782
    .line 1783
    const-string v4, " s for report: "

    .line 1784
    .line 1785
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1786
    .line 1787
    .line 1788
    iget-object v2, v2, Ldz;->b:Ljava/lang/String;

    .line 1789
    .line 1790
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1791
    .line 1792
    .line 1793
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1794
    .line 1795
    .line 1796
    move-result-object v2

    .line 1797
    const-string v3, "FirebaseCrashlytics"

    .line 1798
    .line 1799
    const/4 v4, 0x3

    .line 1800
    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 1801
    .line 1802
    .line 1803
    move-result v4

    .line 1804
    if-eqz v4, :cond_22

    .line 1805
    .line 1806
    move-object/from16 v4, v25

    .line 1807
    .line 1808
    invoke-static {v3, v2, v4}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 1809
    .line 1810
    .line 1811
    :cond_22
    double-to-long v0, v0

    .line 1812
    :try_start_1c
    invoke-static {v0, v1}, Ljava/lang/Thread;->sleep(J)V
    :try_end_1c
    .catch Ljava/lang/InterruptedException; {:try_start_1c .. :try_end_1c} :catch_e

    .line 1813
    .line 1814
    .line 1815
    :catch_e
    return-void

    .line 1816
    nop

    .line 1817
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, Lz46;->w:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    iget-object p0, p0, Lz46;->z:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Lyl0;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    add-int/lit8 v0, v0, 0xe

    .line 26
    .line 27
    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 28
    .line 29
    .line 30
    const-string v0, "propagating=["

    .line 31
    .line 32
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string p0, "]"

    .line 39
    .line 40
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_0
    .end packed-switch
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
