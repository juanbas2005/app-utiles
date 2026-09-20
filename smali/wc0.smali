.class public final Lwc0;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lg88;


# instance fields
.field public w:Ljava/lang/Object;

.field public x:Lkk0;

.field public final synthetic y:Lad0;


# direct methods
.method public constructor <init>(Lad0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lwc0;->y:Lad0;

    .line 5
    .line 6
    sget-object p1, Lcd0;->p:Lpy2;

    .line 7
    .line 8
    iput-object p1, p0, Lwc0;->w:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
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
.method public final a(Lh61;)Ljava/lang/Object;
    .locals 14

    .line 1
    iget-object v0, p0, Lwc0;->w:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lcd0;->p:Lpy2;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq v0, v1, :cond_0

    .line 7
    .line 8
    sget-object v1, Lcd0;->l:Lpy2;

    .line 9
    .line 10
    if-eq v0, v1, :cond_0

    .line 11
    .line 12
    goto/16 :goto_7

    .line 13
    .line 14
    :cond_0
    sget-object v0, Lad0;->D:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 15
    .line 16
    iget-object v3, p0, Lwc0;->y:Lad0;

    .line 17
    .line 18
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    check-cast v0, Lsn0;

    .line 23
    .line 24
    :goto_0
    invoke-virtual {v3}, Lad0;->D()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_2

    .line 29
    .line 30
    sget-object p1, Lcd0;->l:Lpy2;

    .line 31
    .line 32
    iput-object p1, p0, Lwc0;->w:Ljava/lang/Object;

    .line 33
    .line 34
    invoke-virtual {v3}, Lad0;->u()Ljava/lang/Throwable;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    if-nez p0, :cond_1

    .line 39
    .line 40
    const/4 v2, 0x0

    .line 41
    goto/16 :goto_7

    .line 42
    .line 43
    :cond_1
    sget p1, Lz17;->a:I

    .line 44
    .line 45
    throw p0

    .line 46
    :cond_2
    sget-object v1, Lad0;->z:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 47
    .line 48
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 49
    .line 50
    .line 51
    move-result-wide v6

    .line 52
    sget v1, Lcd0;->b:I

    .line 53
    .line 54
    int-to-long v4, v1

    .line 55
    div-long v8, v6, v4

    .line 56
    .line 57
    rem-long v4, v6, v4

    .line 58
    .line 59
    long-to-int v5, v4

    .line 60
    iget-wide v10, v0, Lri6;->e:J

    .line 61
    .line 62
    cmp-long v1, v10, v8

    .line 63
    .line 64
    if-eqz v1, :cond_4

    .line 65
    .line 66
    invoke-virtual {v3, v8, v9, v0}, Lad0;->r(JLsn0;)Lsn0;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    if-nez v1, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    move-object v4, v1

    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move-object v4, v0

    .line 76
    :goto_1
    const/4 v8, 0x0

    .line 77
    invoke-virtual/range {v3 .. v8}, Lad0;->Q(Lsn0;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    sget-object v1, Lcd0;->m:Lpy2;

    .line 82
    .line 83
    const/4 v9, 0x0

    .line 84
    if-eq v0, v1, :cond_14

    .line 85
    .line 86
    sget-object v10, Lcd0;->o:Lpy2;

    .line 87
    .line 88
    if-ne v0, v10, :cond_6

    .line 89
    .line 90
    invoke-virtual {v3}, Lad0;->x()J

    .line 91
    .line 92
    .line 93
    move-result-wide v0

    .line 94
    cmp-long v0, v6, v0

    .line 95
    .line 96
    if-gez v0, :cond_5

    .line 97
    .line 98
    invoke-virtual {v4}, Lhz0;->a()V

    .line 99
    .line 100
    .line 101
    :cond_5
    move-object v0, v4

    .line 102
    goto :goto_0

    .line 103
    :cond_6
    sget-object v8, Lcd0;->n:Lpy2;

    .line 104
    .line 105
    if-ne v0, v8, :cond_13

    .line 106
    .line 107
    invoke-static {p1}, Lrc9;->a0(Lf61;)Lf61;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-static {p1}, Lhj8;->y(Lf61;)Lkk0;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    :try_start_0
    iput-object p1, p0, Lwc0;->x:Lkk0;

    .line 116
    .line 117
    move-object v8, p0

    .line 118
    invoke-virtual/range {v3 .. v8}, Lad0;->Q(Lsn0;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    iget-object v0, v3, Lad0;->x:Lvr2;

    .line 123
    .line 124
    if-ne p0, v1, :cond_7

    .line 125
    .line 126
    invoke-virtual {v8, v4, v5}, Lwc0;->b(Lri6;I)V

    .line 127
    .line 128
    .line 129
    goto/16 :goto_5

    .line 130
    .line 131
    :catchall_0
    move-exception v0

    .line 132
    move-object p0, v0

    .line 133
    goto/16 :goto_6

    .line 134
    .line 135
    :cond_7
    const/4 v1, 0x5

    .line 136
    if-ne p0, v10, :cond_12

    .line 137
    .line 138
    invoke-virtual {v3}, Lad0;->x()J

    .line 139
    .line 140
    .line 141
    move-result-wide v10

    .line 142
    cmp-long p0, v6, v10

    .line 143
    .line 144
    if-gez p0, :cond_8

    .line 145
    .line 146
    invoke-virtual {v4}, Lhz0;->a()V

    .line 147
    .line 148
    .line 149
    :cond_8
    sget-object p0, Lad0;->D:Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;

    .line 150
    .line 151
    invoke-virtual {p0, v3}, Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    check-cast p0, Lsn0;

    .line 156
    .line 157
    :goto_2
    invoke-virtual {v3}, Lad0;->D()Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_a

    .line 162
    .line 163
    iget-object p0, v8, Lwc0;->x:Lkk0;

    .line 164
    .line 165
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    iput-object v9, v8, Lwc0;->x:Lkk0;

    .line 169
    .line 170
    sget-object v0, Lcd0;->l:Lpy2;

    .line 171
    .line 172
    iput-object v0, v8, Lwc0;->w:Ljava/lang/Object;

    .line 173
    .line 174
    invoke-virtual {v3}, Lad0;->u()Ljava/lang/Throwable;

    .line 175
    .line 176
    .line 177
    move-result-object v0

    .line 178
    if-nez v0, :cond_9

    .line 179
    .line 180
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 181
    .line 182
    invoke-virtual {p0, v0}, Lkk0;->f(Ljava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    goto/16 :goto_5

    .line 186
    .line 187
    :cond_9
    new-instance v1, Lm66;

    .line 188
    .line 189
    invoke-direct {v1, v0}, Lm66;-><init>(Ljava/lang/Throwable;)V

    .line 190
    .line 191
    .line 192
    invoke-virtual {p0, v1}, Lkk0;->f(Ljava/lang/Object;)V

    .line 193
    .line 194
    .line 195
    goto/16 :goto_5

    .line 196
    .line 197
    :cond_a
    sget-object v2, Lad0;->z:Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;

    .line 198
    .line 199
    invoke-virtual {v2, v3}, Ljava/util/concurrent/atomic/AtomicLongFieldUpdater;->getAndIncrement(Ljava/lang/Object;)J

    .line 200
    .line 201
    .line 202
    move-result-wide v6

    .line 203
    sget v2, Lcd0;->b:I

    .line 204
    .line 205
    int-to-long v4, v2

    .line 206
    div-long v10, v6, v4

    .line 207
    .line 208
    rem-long v4, v6, v4

    .line 209
    .line 210
    long-to-int v5, v4

    .line 211
    iget-wide v12, p0, Lri6;->e:J

    .line 212
    .line 213
    cmp-long v2, v12, v10

    .line 214
    .line 215
    if-eqz v2, :cond_c

    .line 216
    .line 217
    invoke-virtual {v3, v10, v11, p0}, Lad0;->r(JLsn0;)Lsn0;

    .line 218
    .line 219
    .line 220
    move-result-object v2

    .line 221
    if-nez v2, :cond_b

    .line 222
    .line 223
    goto :goto_2

    .line 224
    :cond_b
    move-object v4, v2

    .line 225
    goto :goto_3

    .line 226
    :cond_c
    move-object v4, p0

    .line 227
    :goto_3
    invoke-virtual/range {v3 .. v8}, Lad0;->Q(Lsn0;IJLjava/lang/Object;)Ljava/lang/Object;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    move-object v2, v4

    .line 232
    sget-object v4, Lcd0;->m:Lpy2;

    .line 233
    .line 234
    if-ne p0, v4, :cond_d

    .line 235
    .line 236
    invoke-virtual {v8, v2, v5}, Lwc0;->b(Lri6;I)V

    .line 237
    .line 238
    .line 239
    goto :goto_5

    .line 240
    :cond_d
    sget-object v4, Lcd0;->o:Lpy2;

    .line 241
    .line 242
    if-ne p0, v4, :cond_f

    .line 243
    .line 244
    invoke-virtual {v3}, Lad0;->x()J

    .line 245
    .line 246
    .line 247
    move-result-wide v4

    .line 248
    cmp-long p0, v6, v4

    .line 249
    .line 250
    if-gez p0, :cond_e

    .line 251
    .line 252
    invoke-virtual {v2}, Lhz0;->a()V

    .line 253
    .line 254
    .line 255
    :cond_e
    move-object p0, v2

    .line 256
    goto :goto_2

    .line 257
    :cond_f
    sget-object v3, Lcd0;->n:Lpy2;

    .line 258
    .line 259
    if-eq p0, v3, :cond_11

    .line 260
    .line 261
    invoke-virtual {v2}, Lhz0;->a()V

    .line 262
    .line 263
    .line 264
    iput-object p0, v8, Lwc0;->w:Ljava/lang/Object;

    .line 265
    .line 266
    iput-object v9, v8, Lwc0;->x:Lkk0;

    .line 267
    .line 268
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 269
    .line 270
    if-eqz v0, :cond_10

    .line 271
    .line 272
    new-instance v9, Lgc5;

    .line 273
    .line 274
    invoke-direct {v9, v0, p0, v1}, Lgc5;-><init>(Lvr2;Ljava/lang/Object;I)V

    .line 275
    .line 276
    .line 277
    :cond_10
    :goto_4
    invoke-virtual {p1, v2, v9}, Lkk0;->J(Ljava/lang/Object;Lhs2;)V

    .line 278
    .line 279
    .line 280
    goto :goto_5

    .line 281
    :cond_11
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 282
    .line 283
    const-string v0, "unexpected"

    .line 284
    .line 285
    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 286
    .line 287
    .line 288
    throw p0

    .line 289
    :cond_12
    invoke-virtual {v4}, Lhz0;->a()V

    .line 290
    .line 291
    .line 292
    iput-object p0, v8, Lwc0;->w:Ljava/lang/Object;

    .line 293
    .line 294
    iput-object v9, v8, Lwc0;->x:Lkk0;

    .line 295
    .line 296
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 297
    .line 298
    if-eqz v0, :cond_10

    .line 299
    .line 300
    new-instance v9, Lgc5;

    .line 301
    .line 302
    invoke-direct {v9, v0, p0, v1}, Lgc5;-><init>(Lvr2;Ljava/lang/Object;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 303
    .line 304
    .line 305
    goto :goto_4

    .line 306
    :goto_5
    invoke-virtual {p1}, Lkk0;->t()Ljava/lang/Object;

    .line 307
    .line 308
    .line 309
    move-result-object p0

    .line 310
    return-object p0

    .line 311
    :goto_6
    invoke-virtual {p1}, Lkk0;->C()V

    .line 312
    .line 313
    .line 314
    throw p0

    .line 315
    :cond_13
    move-object v8, p0

    .line 316
    invoke-virtual {v4}, Lhz0;->a()V

    .line 317
    .line 318
    .line 319
    iput-object v0, v8, Lwc0;->w:Ljava/lang/Object;

    .line 320
    .line 321
    :goto_7
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 322
    .line 323
    .line 324
    move-result-object p0

    .line 325
    return-object p0

    .line 326
    :cond_14
    const-string p0, "unreachable"

    .line 327
    .line 328
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 329
    .line 330
    .line 331
    return-object v9
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

.method public final b(Lri6;I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lwc0;->x:Lkk0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lkk0;->b(Lri6;I)V

    .line 6
    .line 7
    .line 8
    :cond_0
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

.method public final c()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lwc0;->w:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v1, Lcd0;->p:Lpy2;

    .line 4
    .line 5
    if-eq v0, v1, :cond_1

    .line 6
    .line 7
    iput-object v1, p0, Lwc0;->w:Ljava/lang/Object;

    .line 8
    .line 9
    sget-object v1, Lcd0;->l:Lpy2;

    .line 10
    .line 11
    if-eq v0, v1, :cond_0

    .line 12
    .line 13
    return-object v0

    .line 14
    :cond_0
    iget-object p0, p0, Lwc0;->y:Lad0;

    .line 15
    .line 16
    invoke-virtual {p0}, Lad0;->v()Ljava/lang/Throwable;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    sget v0, Lz17;->a:I

    .line 21
    .line 22
    throw p0

    .line 23
    :cond_1
    const-string p0, "`hasNext()` has not been invoked"

    .line 24
    .line 25
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
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
