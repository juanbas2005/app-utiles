.class public final Lm89;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 10
    iput p1, p0, Lm89;->w:I

    iput-object p2, p0, Lm89;->x:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lv89;Lz49;)V
    .locals 0

    .line 1
    const/4 p2, 0x0

    .line 2
    iput p2, p0, Lm89;->w:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lm89;->x:Ljava/lang/Object;

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
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Lm89;->w:I

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x3

    .line 5
    const/4 v3, 0x1

    .line 6
    iget-object p0, p0, Lm89;->x:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p0, Ly19;

    .line 12
    .line 13
    iget-object v0, p0, Ly19;->E:Ld99;

    .line 14
    .line 15
    iget-object v1, p0, Ly19;->I:Lv49;

    .line 16
    .line 17
    invoke-static {v0}, Ly19;->e(Lin8;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lin8;->b1()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ld99;->z1()J

    .line 24
    .line 25
    .line 26
    move-result-wide v3

    .line 27
    const-wide/16 v5, 0x1

    .line 28
    .line 29
    cmp-long v0, v3, v5

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    invoke-static {v1}, Ly19;->f(Lfy8;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1}, Lcx8;->b1()V

    .line 37
    .line 38
    .line 39
    iget-object p0, v1, Lv49;->H:Lp39;

    .line 40
    .line 41
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-virtual {p0}, Lxq8;->c()V

    .line 44
    .line 45
    .line 46
    :cond_0
    new-instance p0, Ljava/lang/Thread;

    .line 47
    .line 48
    invoke-static {v1}, Ly19;->f(Lfy8;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lo39;

    .line 52
    .line 53
    invoke-direct {v0, v1, v2}, Lo39;-><init>(Lv49;I)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_1
    iget-object p0, p0, Ly19;->B:Lpz8;

    .line 64
    .line 65
    invoke-static {p0}, Ly19;->g(Ly29;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, p0, Lpz8;->E:Lmz8;

    .line 69
    .line 70
    const-string v0, "registerTrigger called but app not eligible"

    .line 71
    .line 72
    invoke-virtual {p0, v0}, Lmz8;->a(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :goto_0
    return-void

    .line 76
    :pswitch_0
    check-cast p0, Lto;

    .line 77
    .line 78
    iget-object p0, p0, Lto;->b:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast p0, Ly19;

    .line 81
    .line 82
    iget-object v0, p0, Ly19;->Q:Lc59;

    .line 83
    .line 84
    invoke-static {v0}, Ly19;->d(Lcx8;)V

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, Ly19;->Q:Lc59;

    .line 88
    .line 89
    sget-object v0, Lby8;->D:Lay8;

    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lay8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    check-cast v0, Ljava/lang/Long;

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 98
    .line 99
    .line 100
    move-result-wide v0

    .line 101
    invoke-virtual {p0, v0, v1}, Lc59;->g1(J)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :pswitch_1
    check-cast p0, Lyj2;

    .line 106
    .line 107
    :try_start_0
    invoke-static {p0}, Lpt2;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    .line 110
    goto :goto_1

    .line 111
    :catch_0
    move-exception p0

    .line 112
    const-string v0, "StorageInfoHandler"

    .line 113
    .line 114
    invoke-static {v0, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 115
    .line 116
    .line 117
    move-result v1

    .line 118
    if-eqz v1, :cond_2

    .line 119
    .line 120
    const-string v1, "Failed to get storage info from GMS"

    .line 121
    .line 122
    invoke-static {v0, v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 123
    .line 124
    .line 125
    :cond_2
    :goto_1
    return-void

    .line 126
    :pswitch_2
    check-cast p0, Lo99;

    .line 127
    .line 128
    iget-object p0, p0, Lo99;->c:Lrx8;

    .line 129
    .line 130
    invoke-virtual {p0}, Lrx8;->get()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    check-cast p0, Ljava/lang/Boolean;

    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 137
    .line 138
    .line 139
    move-result p0

    .line 140
    if-eqz p0, :cond_3

    .line 141
    .line 142
    const-string p0, "PhenotypeProcessReaper"

    .line 143
    .line 144
    const-string v0, "Killing process to refresh experiment configuration"

    .line 145
    .line 146
    invoke-static {p0, v0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 147
    .line 148
    .line 149
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    invoke-static {p0}, Landroid/os/Process;->killProcess(I)V

    .line 154
    .line 155
    .line 156
    const/4 p0, 0x0

    .line 157
    invoke-static {p0}, Ljava/lang/System;->exit(I)V

    .line 158
    .line 159
    .line 160
    :cond_3
    return-void

    .line 161
    :pswitch_3
    check-cast p0, Lxj2;

    .line 162
    .line 163
    :try_start_1
    invoke-static {p0}, Lpt2;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :catch_1
    move-exception p0

    .line 168
    const-string v0, "PhFlagUpdateRegistry"

    .line 169
    .line 170
    const-string v1, "Failed to register flag update listener which may lead to stale flags."

    .line 171
    .line 172
    invoke-static {v0, v1, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 173
    .line 174
    .line 175
    :goto_2
    return-void

    .line 176
    :pswitch_4
    check-cast p0, Lcom/google/common/util/concurrent/ListenableFuture;

    .line 177
    .line 178
    :try_start_2
    invoke-static {p0}, Lpt2;->b(Ljava/util/concurrent/Future;)Ljava/lang/Object;
    :try_end_2
    .catch Ljava/util/concurrent/ExecutionException; {:try_start_2 .. :try_end_2} :catch_2

    .line 179
    .line 180
    .line 181
    goto :goto_3

    .line 182
    :catch_2
    move-exception p0

    .line 183
    new-instance v0, Lm89;

    .line 184
    .line 185
    invoke-direct {v0, v3, p0}, Lm89;-><init>(ILjava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    invoke-static {}, Lag8;->N()Landroid/os/Handler;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 193
    .line 194
    .line 195
    :goto_3
    return-void

    .line 196
    :pswitch_5
    new-instance v0, Ljava/lang/RuntimeException;

    .line 197
    .line 198
    check-cast p0, Ljava/util/concurrent/ExecutionException;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 201
    .line 202
    .line 203
    move-result-object p0

    .line 204
    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 205
    .line 206
    .line 207
    throw v0

    .line 208
    :pswitch_6
    check-cast p0, Lv89;

    .line 209
    .line 210
    invoke-virtual {p0}, Lv89;->n0()Lr19;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-virtual {v0}, Lr19;->b1()V

    .line 215
    .line 216
    .line 217
    new-instance v0, Lv09;

    .line 218
    .line 219
    invoke-direct {v0, p0}, Lv09;-><init>(Lv89;)V

    .line 220
    .line 221
    .line 222
    iput-object v0, p0, Lv89;->G:Lv09;

    .line 223
    .line 224
    new-instance v0, Luq8;

    .line 225
    .line 226
    invoke-direct {v0, p0}, Luq8;-><init>(Lv89;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v0}, Lg89;->e1()V

    .line 230
    .line 231
    .line 232
    iput-object v0, p0, Lv89;->y:Luq8;

    .line 233
    .line 234
    iget-object v0, p0, Lv89;->w:Lj19;

    .line 235
    .line 236
    invoke-virtual {p0}, Lv89;->c0()Ltp8;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-static {v0}, Lz65;->k(Ljava/lang/Object;)V

    .line 241
    .line 242
    .line 243
    iput-object v0, v2, Ltp8;->z:Lrp8;

    .line 244
    .line 245
    new-instance v0, Lu69;

    .line 246
    .line 247
    invoke-direct {v0, p0}, Lu69;-><init>(Lv89;)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0}, Lg89;->e1()V

    .line 251
    .line 252
    .line 253
    iput-object v0, p0, Lv89;->E:Lu69;

    .line 254
    .line 255
    new-instance v0, Ldl8;

    .line 256
    .line 257
    invoke-direct {v0, p0}, Lg89;-><init>(Lv89;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {v0}, Lg89;->e1()V

    .line 261
    .line 262
    .line 263
    iput-object v0, p0, Lv89;->B:Ldl8;

    .line 264
    .line 265
    new-instance v0, Lxz8;

    .line 266
    .line 267
    invoke-direct {v0, p0, v3}, Lxz8;-><init>(Lv89;I)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0}, Lg89;->e1()V

    .line 271
    .line 272
    .line 273
    iput-object v0, p0, Lv89;->D:Lxz8;

    .line 274
    .line 275
    new-instance v0, Lw79;

    .line 276
    .line 277
    invoke-direct {v0, p0}, Lw79;-><init>(Lv89;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v0}, Lg89;->e1()V

    .line 281
    .line 282
    .line 283
    iput-object v0, p0, Lv89;->A:Lw79;

    .line 284
    .line 285
    new-instance v0, Lf09;

    .line 286
    .line 287
    invoke-direct {v0, p0}, Lf09;-><init>(Lv89;)V

    .line 288
    .line 289
    .line 290
    iput-object v0, p0, Lv89;->z:Lf09;

    .line 291
    .line 292
    iget v0, p0, Lv89;->N:I

    .line 293
    .line 294
    iget v2, p0, Lv89;->O:I

    .line 295
    .line 296
    if-eq v0, v2, :cond_4

    .line 297
    .line 298
    invoke-virtual {p0}, Lv89;->G()Lpz8;

    .line 299
    .line 300
    .line 301
    move-result-object v0

    .line 302
    iget-object v0, v0, Lpz8;->B:Lmz8;

    .line 303
    .line 304
    iget v2, p0, Lv89;->N:I

    .line 305
    .line 306
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 307
    .line 308
    .line 309
    move-result-object v2

    .line 310
    iget v4, p0, Lv89;->O:I

    .line 311
    .line 312
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 313
    .line 314
    .line 315
    move-result-object v4

    .line 316
    const-string v5, "Not all upload components initialized"

    .line 317
    .line 318
    invoke-virtual {v0, v2, v4, v5}, Lmz8;->c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;)V

    .line 319
    .line 320
    .line 321
    :cond_4
    iget-object v0, p0, Lv89;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 322
    .line 323
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 324
    .line 325
    .line 326
    invoke-virtual {p0}, Lv89;->G()Lpz8;

    .line 327
    .line 328
    .line 329
    move-result-object v0

    .line 330
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 331
    .line 332
    const-string v2, "UploadController is now fully initialized"

    .line 333
    .line 334
    invoke-virtual {v0, v2}, Lmz8;->a(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-virtual {p0}, Lv89;->n0()Lr19;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-virtual {v0}, Lr19;->b1()V

    .line 342
    .line 343
    .line 344
    iget-object v0, p0, Lv89;->y:Luq8;

    .line 345
    .line 346
    invoke-static {v0}, Lv89;->R(Lg89;)V

    .line 347
    .line 348
    .line 349
    invoke-virtual {v0}, Luq8;->m1()V

    .line 350
    .line 351
    .line 352
    iget-object v0, p0, Lv89;->y:Luq8;

    .line 353
    .line 354
    invoke-static {v0}, Lv89;->R(Lg89;)V

    .line 355
    .line 356
    .line 357
    invoke-virtual {v0}, Lin8;->b1()V

    .line 358
    .line 359
    .line 360
    invoke-virtual {v0}, Lg89;->d1()V

    .line 361
    .line 362
    .line 363
    invoke-virtual {v0}, Luq8;->N1()Z

    .line 364
    .line 365
    .line 366
    move-result v2

    .line 367
    const-wide/16 v3, 0x0

    .line 368
    .line 369
    if-eqz v2, :cond_6

    .line 370
    .line 371
    sget-object v2, Lby8;->u0:Lay8;

    .line 372
    .line 373
    invoke-virtual {v2, v1}, Lay8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    move-result-object v5

    .line 377
    check-cast v5, Ljava/lang/Long;

    .line 378
    .line 379
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 380
    .line 381
    .line 382
    move-result-wide v5

    .line 383
    cmp-long v5, v5, v3

    .line 384
    .line 385
    if-nez v5, :cond_5

    .line 386
    .line 387
    goto :goto_4

    .line 388
    :cond_5
    invoke-virtual {v0}, Luq8;->T1()Landroid/database/sqlite/SQLiteDatabase;

    .line 389
    .line 390
    .line 391
    move-result-object v5

    .line 392
    iget-object v0, v0, Lin8;->w:Ljava/lang/Object;

    .line 393
    .line 394
    check-cast v0, Ly19;

    .line 395
    .line 396
    iget-object v6, v0, Ly19;->G:Lxb4;

    .line 397
    .line 398
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 399
    .line 400
    .line 401
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 402
    .line 403
    .line 404
    move-result-wide v6

    .line 405
    invoke-static {v6, v7}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 406
    .line 407
    .line 408
    move-result-object v6

    .line 409
    invoke-virtual {v2, v1}, Lay8;->a(Ljava/lang/Object;)Ljava/lang/Object;

    .line 410
    .line 411
    .line 412
    move-result-object v1

    .line 413
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    filled-new-array {v6, v1}, [Ljava/lang/String;

    .line 418
    .line 419
    .line 420
    move-result-object v1

    .line 421
    const-string v2, "trigger_uris"

    .line 422
    .line 423
    const-string v6, "abs(timestamp_millis - ?) > cast(? as integer)"

    .line 424
    .line 425
    invoke-virtual {v5, v2, v6, v1}, Landroid/database/sqlite/SQLiteDatabase;->delete(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I

    .line 426
    .line 427
    .line 428
    move-result v1

    .line 429
    if-lez v1, :cond_6

    .line 430
    .line 431
    iget-object v0, v0, Ly19;->B:Lpz8;

    .line 432
    .line 433
    invoke-static {v0}, Ly19;->g(Ly29;)V

    .line 434
    .line 435
    .line 436
    iget-object v0, v0, Lpz8;->J:Lmz8;

    .line 437
    .line 438
    const-string v2, "Deleted stale trigger uris. rowsDeleted"

    .line 439
    .line 440
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 441
    .line 442
    .line 443
    move-result-object v1

    .line 444
    invoke-virtual {v0, v2, v1}, Lmz8;->b(Ljava/lang/String;Ljava/lang/Object;)V

    .line 445
    .line 446
    .line 447
    :cond_6
    :goto_4
    iget-object v0, p0, Lv89;->E:Lu69;

    .line 448
    .line 449
    iget-object v0, v0, Lu69;->D:Ll09;

    .line 450
    .line 451
    invoke-virtual {v0}, Ll09;->a()J

    .line 452
    .line 453
    .line 454
    move-result-wide v0

    .line 455
    cmp-long v0, v0, v3

    .line 456
    .line 457
    if-nez v0, :cond_7

    .line 458
    .line 459
    iget-object v0, p0, Lv89;->E:Lu69;

    .line 460
    .line 461
    iget-object v0, v0, Lu69;->D:Ll09;

    .line 462
    .line 463
    invoke-virtual {p0}, Lv89;->Q()Lxb4;

    .line 464
    .line 465
    .line 466
    move-result-object v1

    .line 467
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 468
    .line 469
    .line 470
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 471
    .line 472
    .line 473
    move-result-wide v1

    .line 474
    invoke-virtual {v0, v1, v2}, Ll09;->b(J)V

    .line 475
    .line 476
    .line 477
    :cond_7
    invoke-virtual {p0}, Lv89;->K()V

    .line 478
    .line 479
    .line 480
    return-void

    .line 481
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
