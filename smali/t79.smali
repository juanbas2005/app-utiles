.class public abstract Lt79;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lx77;


# instance fields
.field public final w:Ljava/lang/String;

.field public final x:Luw2;

.field public volatile y:I

.field public z:Ln49;


# direct methods
.method public constructor <init>(Ljava/lang/String;Luw2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lt79;->w:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lt79;->x:Luw2;

    .line 7
    .line 8
    const/4 p1, -0x1

    .line 9
    iput p1, p0, Lt79;->y:I

    .line 10
    .line 11
    return-void
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
.method public abstract a()Ljava/lang/Object;
.end method

.method public abstract b(Ljava/lang/String;)Ljava/lang/Object;
.end method

.method public abstract c(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public abstract d()Ljava/lang/Object;
.end method

.method public abstract e(Ljava/lang/Object;)V
.end method

.method public final get()Ljava/lang/Object;
    .locals 11

    .line 1
    sget-object v0, Lpd8;->z:Lbn8;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    sget-object v0, Lx49;->j:Ljava/lang/Object;

    .line 6
    .line 7
    new-instance v0, Lbn8;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Exception;-><init>()V

    .line 10
    .line 11
    .line 12
    sput-object v0, Lpd8;->z:Lbn8;

    .line 13
    .line 14
    :cond_0
    sget-object v0, Lx49;->k:Ljava/util/concurrent/atomic/AtomicReference;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    check-cast v0, Landroid/content/Context;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_11

    .line 24
    .line 25
    sget-object v2, Lx49;->l:Lx49;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :try_start_0
    const-string v2, "Given application context does not implement GeneratedComponentManager: "

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 41
    .line 42
    .line 43
    move-result-object v4

    .line 44
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    new-instance v5, Ljava/lang/IllegalStateException;

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v6

    .line 57
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    add-int/lit8 v6, v6, 0x48

    .line 62
    .line 63
    new-instance v7, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-static {v4}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-virtual {v2, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-direct {v5, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw v5
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    :catch_0
    sget-object v2, Lx49;->j:Ljava/lang/Object;

    .line 84
    .line 85
    monitor-enter v2

    .line 86
    :try_start_1
    sget-object v4, Lx49;->l:Lx49;

    .line 87
    .line 88
    if-eqz v4, :cond_2

    .line 89
    .line 90
    sget-object v0, Lx49;->l:Lx49;

    .line 91
    .line 92
    monitor-exit v2

    .line 93
    :goto_0
    move-object v2, v0

    .line 94
    goto :goto_1

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    goto/16 :goto_d

    .line 97
    .line 98
    :cond_2
    new-instance v4, Lz49;

    .line 99
    .line 100
    invoke-direct {v4, v0, v3, v3}, Lz49;-><init>(Landroid/content/Context;IZ)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v4}, Lz49;->get()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Lx49;

    .line 108
    .line 109
    sput-object v0, Lx49;->l:Lx49;

    .line 110
    .line 111
    sget-object v4, Ljava/util/logging/Level;->CONFIG:Ljava/util/logging/Level;

    .line 112
    .line 113
    invoke-virtual {v0}, Lx49;->a()Ljm4;

    .line 114
    .line 115
    .line 116
    move-result-object v5

    .line 117
    const-string v6, "Application doesn\'t implement PhenotypeApplication interface, falling back to globally set context. See go/phenotype-flag#process-stable-init for more info."

    .line 118
    .line 119
    new-array v7, v3, [Ljava/lang/Object;

    .line 120
    .line 121
    invoke-static {v4, v5, v1, v6, v7}, Lc35;->q(Ljava/util/logging/Level;Ljava/util/concurrent/Executor;Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 122
    .line 123
    .line 124
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 125
    goto :goto_0

    .line 126
    :goto_1
    iget v0, p0, Lt79;->y:I

    .line 127
    .line 128
    const/4 v4, -0x1

    .line 129
    if-eq v0, v4, :cond_3

    .line 130
    .line 131
    iget-object v5, p0, Lt79;->z:Ln49;

    .line 132
    .line 133
    iget-object v5, v5, Ln49;->x:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 136
    .line 137
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 138
    .line 139
    .line 140
    move-result v5

    .line 141
    if-ge v0, v5, :cond_10

    .line 142
    .line 143
    :cond_3
    monitor-enter p0

    .line 144
    :try_start_2
    iget v0, p0, Lt79;->y:I

    .line 145
    .line 146
    if-ne v0, v4, :cond_4

    .line 147
    .line 148
    invoke-static {}, Lx49;->b()V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    iget-object v4, p0, Lt79;->x:Luw2;

    .line 155
    .line 156
    invoke-virtual {v4, v2}, Luw2;->c(Lx49;)Lw89;

    .line 157
    .line 158
    .line 159
    move-result-object v4

    .line 160
    iget-object v5, v4, Lw89;->g:Ln49;

    .line 161
    .line 162
    iput-object v5, p0, Lt79;->z:Ln49;

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :catchall_1
    move-exception v0

    .line 166
    goto/16 :goto_c

    .line 167
    .line 168
    :cond_4
    move-object v4, v1

    .line 169
    :goto_2
    iget-object v5, p0, Lt79;->z:Ln49;

    .line 170
    .line 171
    iget-object v5, v5, Ln49;->x:Ljava/lang/Object;

    .line 172
    .line 173
    check-cast v5, Ljava/util/concurrent/atomic/AtomicInteger;

    .line 174
    .line 175
    invoke-virtual {v5}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    .line 176
    .line 177
    .line 178
    move-result v5

    .line 179
    if-ge v0, v5, :cond_f

    .line 180
    .line 181
    invoke-static {}, Lx49;->b()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    iget-object v0, v2, Lx49;->b:Landroid/content/Context;

    .line 188
    .line 189
    invoke-static {v0}, Lt49;->g0(Landroid/content/Context;)Lo75;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    invoke-virtual {v0}, Lo75;->b()Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_7

    .line 198
    .line 199
    invoke-virtual {v0}, Lo75;->a()Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    check-cast v6, Ls49;

    .line 204
    .line 205
    invoke-static {}, Lu49;->a()Landroid/net/Uri;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    iget-object v8, p0, Lt79;->w:Ljava/lang/String;

    .line 210
    .line 211
    if-eqz v7, :cond_5

    .line 212
    .line 213
    iget-object v6, v6, Ls49;->a:Lzt6;

    .line 214
    .line 215
    invoke-virtual {v7}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-virtual {v6, v7}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    .line 221
    .line 222
    move-result-object v6

    .line 223
    check-cast v6, Lzt6;

    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_5
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 227
    .line 228
    .line 229
    move-object v6, v1

    .line 230
    :goto_3
    if-nez v6, :cond_6

    .line 231
    .line 232
    move-object v6, v1

    .line 233
    goto :goto_4

    .line 234
    :cond_6
    invoke-virtual {v6, v8}, Lzt6;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    .line 236
    .line 237
    move-result-object v6

    .line 238
    check-cast v6, Ljava/lang/String;

    .line 239
    .line 240
    :goto_4
    if-nez v6, :cond_8

    .line 241
    .line 242
    :cond_7
    :goto_5
    move-object v6, v1

    .line 243
    goto :goto_7

    .line 244
    :cond_8
    const-string v7, "Invalid Phenotype flag value for flag "
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 245
    .line 246
    :try_start_3
    invoke-virtual {p0, v6}, Lt79;->b(Ljava/lang/String;)Ljava/lang/Object;

    .line 247
    .line 248
    .line 249
    move-result-object v6
    :try_end_3
    .catch Ljava/lang/IllegalArgumentException; {:try_start_3 .. :try_end_3} :catch_2
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 250
    goto :goto_7

    .line 251
    :catch_1
    move-exception v6

    .line 252
    goto :goto_6

    .line 253
    :catch_2
    move-exception v6

    .line 254
    :goto_6
    :try_start_4
    const-string v8, "FilePhenotypeFlags"

    .line 255
    .line 256
    iget-object v9, p0, Lt79;->w:Ljava/lang/String;

    .line 257
    .line 258
    invoke-virtual {v7, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object v7

    .line 262
    invoke-static {v8, v7, v6}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 263
    .line 264
    .line 265
    goto :goto_5

    .line 266
    :goto_7
    if-nez v4, :cond_9

    .line 267
    .line 268
    iget-object v4, p0, Lt79;->x:Luw2;

    .line 269
    .line 270
    invoke-virtual {v4, v2}, Luw2;->c(Lx49;)Lw89;

    .line 271
    .line 272
    .line 273
    move-result-object v4

    .line 274
    :cond_9
    iget-object v7, v4, Lw89;->c:Ljava/lang/String;

    .line 275
    .line 276
    sget v8, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 277
    .line 278
    const/16 v9, 0x1a

    .line 279
    .line 280
    if-lt v8, v9, :cond_a

    .line 281
    .line 282
    iget-object v8, v2, Lx49;->b:Landroid/content/Context;

    .line 283
    .line 284
    invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v8

    .line 288
    const-string v9, "com.android.vending"

    .line 289
    .line 290
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    move-result v8

    .line 294
    if-nez v8, :cond_a

    .line 295
    .line 296
    const-string v8, "com.google.android.gms.measurement#"

    .line 297
    .line 298
    invoke-virtual {v7, v8}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 299
    .line 300
    .line 301
    move-result v8

    .line 302
    if-nez v8, :cond_a

    .line 303
    .line 304
    invoke-virtual {v2}, Lx49;->a()Ljm4;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    new-instance v9, Lc49;

    .line 309
    .line 310
    const/16 v10, 0xc

    .line 311
    .line 312
    invoke-direct {v9, v2, v3, v7, v10}, Lc49;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    .line 313
    .line 314
    .line 315
    invoke-virtual {v8, v9}, Ljm4;->a(Lc49;)Lcom/google/common/util/concurrent/ListenableFuture;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    new-instance v3, Lm89;

    .line 320
    .line 321
    const/4 v7, 0x2

    .line 322
    invoke-direct {v3, v7, v2}, Lm89;-><init>(ILjava/lang/Object;)V

    .line 323
    .line 324
    .line 325
    sget-object v7, Lfv1;->w:Lfv1;

    .line 326
    .line 327
    invoke-interface {v2, v3, v7}, Lcom/google/common/util/concurrent/ListenableFuture;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 328
    .line 329
    .line 330
    :cond_a
    const-string v2, "Invalid Phenotype flag value for flag "

    .line 331
    .line 332
    iget-object v3, p0, Lt79;->w:Ljava/lang/String;

    .line 333
    .line 334
    invoke-virtual {v4}, Lw89;->a()Lge2;

    .line 335
    .line 336
    .line 337
    move-result-object v4

    .line 338
    iget-object v4, v4, Lge2;->d:Ljava/lang/Object;

    .line 339
    .line 340
    check-cast v4, Ln36;

    .line 341
    .line 342
    invoke-virtual {v4, v3}, Ln36;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 343
    .line 344
    .line 345
    move-result-object v3
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 346
    if-nez v3, :cond_b

    .line 347
    .line 348
    goto :goto_9

    .line 349
    :cond_b
    :try_start_5
    invoke-virtual {p0, v3}, Lt79;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 350
    .line 351
    .line 352
    move-result-object v1
    :try_end_5
    .catch Ljava/lang/ClassCastException; {:try_start_5 .. :try_end_5} :catch_4
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 353
    goto :goto_9

    .line 354
    :catch_3
    move-exception v3

    .line 355
    goto :goto_8

    .line 356
    :catch_4
    move-exception v3

    .line 357
    :goto_8
    :try_start_6
    const-string v4, "FilePhenotypeFlags"

    .line 358
    .line 359
    iget-object v7, p0, Lt79;->w:Ljava/lang/String;

    .line 360
    .line 361
    invoke-virtual {v2, v7}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-static {v4, v2, v3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 366
    .line 367
    .line 368
    :goto_9
    invoke-virtual {v0}, Lo75;->b()Z

    .line 369
    .line 370
    .line 371
    move-result v0

    .line 372
    const/4 v2, 0x1

    .line 373
    if-ne v2, v0, :cond_c

    .line 374
    .line 375
    goto :goto_a

    .line 376
    :cond_c
    move-object v6, v1

    .line 377
    :goto_a
    if-nez v6, :cond_d

    .line 378
    .line 379
    invoke-virtual {p0}, Lt79;->a()Ljava/lang/Object;

    .line 380
    .line 381
    .line 382
    move-result-object v6

    .line 383
    :cond_d
    if-eqz v6, :cond_e

    .line 384
    .line 385
    invoke-virtual {p0, v6}, Lt79;->e(Ljava/lang/Object;)V

    .line 386
    .line 387
    .line 388
    iput v5, p0, Lt79;->y:I

    .line 389
    .line 390
    :cond_e
    monitor-exit p0

    .line 391
    goto :goto_b

    .line 392
    :cond_f
    monitor-exit p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_1

    .line 393
    :cond_10
    invoke-virtual {p0}, Lt79;->d()Ljava/lang/Object;

    .line 394
    .line 395
    .line 396
    move-result-object v6

    .line 397
    :goto_b
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 398
    .line 399
    .line 400
    return-object v6

    .line 401
    :goto_c
    :try_start_7
    monitor-exit p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 402
    throw v0

    .line 403
    :goto_d
    :try_start_8
    monitor-exit v2
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 404
    throw p0

    .line 405
    :cond_11
    sget-object p0, Lpd8;->x:Ljava/lang/Object;

    .line 406
    .line 407
    monitor-enter p0

    .line 408
    :try_start_9
    monitor-exit p0
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_2

    .line 409
    const-string p0, "Must call PhenotypeContext.setContext() first"

    .line 410
    .line 411
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 412
    .line 413
    .line 414
    return-object v1

    .line 415
    :catchall_2
    move-exception v0

    .line 416
    :try_start_a
    monitor-exit p0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 417
    throw v0
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
