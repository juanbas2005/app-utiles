.class public final Lu33;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Loy6;


# instance fields
.field public A:Z

.field public final synthetic B:Lw33;

.field public final w:J

.field public x:Z

.field public final y:Lsc0;

.field public final z:Lsc0;


# direct methods
.method public constructor <init>(Lw33;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lu33;->B:Lw33;

    .line 5
    .line 6
    iput-wide p2, p0, Lu33;->w:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lu33;->x:Z

    .line 9
    .line 10
    new-instance p1, Lsc0;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lu33;->y:Lsc0;

    .line 16
    .line 17
    new-instance p1, Lsc0;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lu33;->z:Lsc0;

    .line 23
    .line 24
    return-void
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
.method public final Y(JLsc0;)J
    .locals 27

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-wide/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual/range {p3 .. p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-wide/16 v3, 0x0

    .line 9
    .line 10
    cmp-long v5, v1, v3

    .line 11
    .line 12
    if-ltz v5, :cond_f

    .line 13
    .line 14
    :goto_0
    iget-object v5, v0, Lu33;->B:Lw33;

    .line 15
    .line 16
    monitor-enter v5

    .line 17
    :try_start_0
    iget-object v6, v5, Lw33;->x:Lp33;

    .line 18
    .line 19
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v6, v5, Lw33;->E:Lt33;

    .line 23
    .line 24
    iget-boolean v7, v6, Lt33;->y:Z

    .line 25
    .line 26
    const/4 v8, 0x1

    .line 27
    const/4 v9, 0x0

    .line 28
    if-nez v7, :cond_1

    .line 29
    .line 30
    iget-boolean v6, v6, Lt33;->w:Z

    .line 31
    .line 32
    if-eqz v6, :cond_0

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_0
    move v6, v9

    .line 36
    goto :goto_2

    .line 37
    :cond_1
    :goto_1
    move v6, v8

    .line 38
    :goto_2
    if-eqz v6, :cond_2

    .line 39
    .line 40
    iget-object v7, v5, Lw33;->F:Lv33;

    .line 41
    .line 42
    invoke-virtual {v7}, Lvt;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    .line 44
    .line 45
    goto :goto_3

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    goto/16 :goto_9

    .line 48
    .line 49
    :cond_2
    :goto_3
    :try_start_1
    invoke-virtual {v5}, Lw33;->g()Lk62;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    if-eqz v7, :cond_3

    .line 54
    .line 55
    iget-boolean v7, v0, Lu33;->x:Z

    .line 56
    .line 57
    if-nez v7, :cond_3

    .line 58
    .line 59
    iget-object v7, v5, Lw33;->I:Ljava/io/IOException;

    .line 60
    .line 61
    if-nez v7, :cond_4

    .line 62
    .line 63
    new-instance v7, Lokhttp3/internal/http2/StreamResetException;

    .line 64
    .line 65
    invoke-virtual {v5}, Lw33;->g()Lk62;

    .line 66
    .line 67
    .line 68
    move-result-object v10

    .line 69
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    invoke-direct {v7, v10}, Lokhttp3/internal/http2/StreamResetException;-><init>(Lk62;)V

    .line 73
    .line 74
    .line 75
    goto :goto_4

    .line 76
    :catchall_1
    move-exception v0

    .line 77
    goto/16 :goto_8

    .line 78
    .line 79
    :cond_3
    const/4 v7, 0x0

    .line 80
    :cond_4
    :goto_4
    iget-boolean v10, v0, Lu33;->A:Z

    .line 81
    .line 82
    if-nez v10, :cond_d

    .line 83
    .line 84
    iget-object v10, v0, Lu33;->z:Lsc0;

    .line 85
    .line 86
    iget-wide v11, v10, Lsc0;->x:J

    .line 87
    .line 88
    cmp-long v13, v11, v3

    .line 89
    .line 90
    const-wide/16 v14, -0x1

    .line 91
    .line 92
    if-lez v13, :cond_7

    .line 93
    .line 94
    invoke-static {v1, v2, v11, v12}, Ljava/lang/Math;->min(JJ)J

    .line 95
    .line 96
    .line 97
    move-result-wide v11

    .line 98
    move-object/from16 v13, p3

    .line 99
    .line 100
    invoke-virtual {v10, v11, v12, v13}, Lsc0;->Y(JLsc0;)J

    .line 101
    .line 102
    .line 103
    move-result-wide v17

    .line 104
    iget-object v8, v5, Lw33;->y:Lko7;

    .line 105
    .line 106
    const-wide/16 v19, 0x0

    .line 107
    .line 108
    const/16 v21, 0x2

    .line 109
    .line 110
    move-object/from16 v16, v8

    .line 111
    .line 112
    invoke-static/range {v16 .. v21}, Lko7;->c(Lko7;JJI)V

    .line 113
    .line 114
    .line 115
    iget-object v8, v5, Lw33;->y:Lko7;

    .line 116
    .line 117
    invoke-virtual {v8}, Lko7;->b()J

    .line 118
    .line 119
    .line 120
    move-result-wide v10

    .line 121
    if-nez v7, :cond_5

    .line 122
    .line 123
    iget-object v8, v5, Lw33;->x:Lp33;

    .line 124
    .line 125
    iget-object v8, v8, Lp33;->M:Lao6;

    .line 126
    .line 127
    invoke-virtual {v8}, Lao6;->a()I

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    div-int/lit8 v8, v8, 0x2

    .line 132
    .line 133
    move-wide/from16 v25, v3

    .line 134
    .line 135
    int-to-long v3, v8

    .line 136
    cmp-long v3, v10, v3

    .line 137
    .line 138
    if-ltz v3, :cond_6

    .line 139
    .line 140
    iget-object v3, v5, Lw33;->x:Lp33;

    .line 141
    .line 142
    iget v4, v5, Lw33;->w:I

    .line 143
    .line 144
    invoke-virtual {v3, v10, v11, v4}, Lp33;->D(JI)V

    .line 145
    .line 146
    .line 147
    iget-object v3, v5, Lw33;->y:Lko7;

    .line 148
    .line 149
    const-wide/16 v20, 0x0

    .line 150
    .line 151
    const/16 v24, 0x1

    .line 152
    .line 153
    move-object/from16 v19, v3

    .line 154
    .line 155
    move-wide/from16 v22, v10

    .line 156
    .line 157
    invoke-static/range {v19 .. v24}, Lko7;->c(Lko7;JJI)V

    .line 158
    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_5
    move-wide/from16 v25, v3

    .line 162
    .line 163
    :cond_6
    :goto_5
    move v8, v9

    .line 164
    goto :goto_7

    .line 165
    :cond_7
    move-object/from16 v13, p3

    .line 166
    .line 167
    move-wide/from16 v25, v3

    .line 168
    .line 169
    iget-boolean v3, v0, Lu33;->x:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 170
    .line 171
    if-nez v3, :cond_8

    .line 172
    .line 173
    if-nez v7, :cond_8

    .line 174
    .line 175
    :try_start_2
    invoke-virtual {v5}, Ljava/lang/Object;->wait()V
    :try_end_2
    .catch Ljava/lang/InterruptedException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 176
    .line 177
    .line 178
    :goto_6
    move-wide/from16 v17, v14

    .line 179
    .line 180
    goto :goto_7

    .line 181
    :catch_0
    :try_start_3
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 186
    .line 187
    .line 188
    new-instance v0, Ljava/io/InterruptedIOException;

    .line 189
    .line 190
    invoke-direct {v0}, Ljava/io/InterruptedIOException;-><init>()V

    .line 191
    .line 192
    .line 193
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 194
    :cond_8
    move v8, v9

    .line 195
    goto :goto_6

    .line 196
    :goto_7
    if-eqz v6, :cond_9

    .line 197
    .line 198
    :try_start_4
    iget-object v3, v5, Lw33;->F:Lv33;

    .line 199
    .line 200
    invoke-virtual {v3}, Lv33;->l()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 201
    .line 202
    .line 203
    :cond_9
    monitor-exit v5

    .line 204
    iget-object v3, v0, Lu33;->B:Lw33;

    .line 205
    .line 206
    iget-object v3, v3, Lw33;->x:Lp33;

    .line 207
    .line 208
    iget-object v3, v3, Lp33;->L:Lgi2;

    .line 209
    .line 210
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 211
    .line 212
    .line 213
    if-eqz v8, :cond_a

    .line 214
    .line 215
    move-wide/from16 v3, v25

    .line 216
    .line 217
    goto/16 :goto_0

    .line 218
    .line 219
    :cond_a
    cmp-long v0, v17, v14

    .line 220
    .line 221
    if-eqz v0, :cond_b

    .line 222
    .line 223
    return-wide v17

    .line 224
    :cond_b
    if-nez v7, :cond_c

    .line 225
    .line 226
    return-wide v14

    .line 227
    :cond_c
    throw v7

    .line 228
    :cond_d
    :try_start_5
    new-instance v0, Ljava/io/IOException;

    .line 229
    .line 230
    const-string v1, "stream closed"

    .line 231
    .line 232
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 236
    :goto_8
    if-eqz v6, :cond_e

    .line 237
    .line 238
    :try_start_6
    iget-object v1, v5, Lw33;->F:Lv33;

    .line 239
    .line 240
    invoke-virtual {v1}, Lv33;->l()V

    .line 241
    .line 242
    .line 243
    :cond_e
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 244
    :goto_9
    monitor-exit v5

    .line 245
    throw v0

    .line 246
    :cond_f
    move-wide/from16 v25, v3

    .line 247
    .line 248
    const-string v0, "byteCount < 0: "

    .line 249
    .line 250
    invoke-static {v1, v2, v0}, Lf21;->f(JLjava/lang/String;)Ljava/lang/String;

    .line 251
    .line 252
    .line 253
    move-result-object v0

    .line 254
    invoke-static {v0}, Lh;->j(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    return-wide v25
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
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lu33;->B:Lw33;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lu33;->A:Z

    .line 6
    .line 7
    iget-object v1, p0, Lu33;->z:Lsc0;

    .line 8
    .line 9
    iget-wide v2, v1, Lsc0;->x:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lsc0;->a()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, v2, v0

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    iget-object v0, p0, Lu33;->B:Lw33;

    .line 25
    .line 26
    sget-object v1, Lfg8;->a:Ljava/util/TimeZone;

    .line 27
    .line 28
    iget-object v0, v0, Lw33;->x:Lp33;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Lp33;->u(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object p0, p0, Lu33;->B:Lw33;

    .line 34
    .line 35
    invoke-virtual {p0}, Lw33;->a()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception p0

    .line 40
    monitor-exit v0

    .line 41
    throw p0
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

.method public final g()Lri7;
    .locals 0

    .line 1
    iget-object p0, p0, Lu33;->B:Lw33;

    .line 2
    .line 3
    iget-object p0, p0, Lw33;->F:Lv33;

    .line 4
    .line 5
    return-object p0
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
