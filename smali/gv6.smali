.class public final Lgv6;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lmy0;
.implements Ljava/lang/Iterable;
.implements Lar3;


# instance fields
.field public A:I

.field public final B:Ljava/lang/Object;

.field public C:Z

.field public D:I

.field public E:Ljava/util/ArrayList;

.field public F:Ljava/util/HashMap;

.field public G:Lyo4;

.field public w:[I

.field public x:I

.field public y:[Ljava/lang/Object;

.field public z:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [I

    .line 6
    .line 7
    iput-object v1, p0, Lgv6;->w:[I

    .line 8
    .line 9
    new-array v0, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    iput-object v0, p0, Lgv6;->y:[Ljava/lang/Object;

    .line 12
    .line 13
    new-instance v0, Ljava/lang/Object;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lgv6;->B:Ljava/lang/Object;

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object v0, p0, Lgv6;->E:Ljava/util/ArrayList;

    .line 26
    .line 27
    return-void
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

.method public static final l(Ljv6;I)V
    .locals 1

    .line 1
    :goto_0
    iget v0, p0, Ljv6;->v:I

    .line 2
    .line 3
    if-ltz v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Ljv6;->u:I

    .line 6
    .line 7
    if-gt v0, p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0}, Ljv6;->O()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Ljv6;->j()V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    return-void
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
.method public final f(Lst2;)I
    .locals 0

    .line 1
    iget-boolean p0, p0, Lgv6;->C:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const-string p0, "Use active SlotWriter to determine anchor location instead"

    .line 6
    .line 7
    invoke-static {p0}, Ley0;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lst2;->a()Z

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-nez p0, :cond_1

    .line 15
    .line 16
    const-string p0, "Anchor refers to a group that was removed"

    .line 17
    .line 18
    invoke-static {p0}, Lvm5;->a(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    iget p0, p1, Lst2;->a:I

    .line 22
    .line 23
    return p0
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final g()V
    .locals 1

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object v0, p0, Lgv6;->F:Ljava/util/HashMap;

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

.method public final iterator()Ljava/util/Iterator;
    .locals 3

    .line 1
    new-instance v0, Lux2;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget v2, p0, Lgv6;->x:I

    .line 5
    .line 6
    invoke-direct {v0, p0, v1, v2}, Lux2;-><init>(Lgv6;II)V

    .line 7
    .line 8
    .line 9
    return-object v0
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

.method public final k(Lkr;Llp4;)Ltp4;
    .locals 10

    .line 1
    iget-object v0, p2, Llp4;->a:[Ljava/lang/Object;

    .line 2
    .line 3
    iget v1, p2, Llp4;->b:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    move v3, v2

    .line 7
    :goto_0
    if-ge v3, v1, :cond_3

    .line 8
    .line 9
    aget-object v4, v0, v3

    .line 10
    .line 11
    check-cast v4, Lhn4;

    .line 12
    .line 13
    iget-object v4, v4, Lhn4;->e:Lst2;

    .line 14
    .line 15
    invoke-static {v4}, Lhj8;->m(Lst2;)Lst2;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-virtual {p0, v4}, Lgv6;->p(Lst2;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_2

    .line 24
    .line 25
    new-instance v0, Llp4;

    .line 26
    .line 27
    invoke-direct {v0}, Llp4;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p2, Llp4;->a:[Ljava/lang/Object;

    .line 31
    .line 32
    iget p2, p2, Llp4;->b:I

    .line 33
    .line 34
    move v3, v2

    .line 35
    :goto_1
    if-ge v3, p2, :cond_1

    .line 36
    .line 37
    aget-object v4, v1, v3

    .line 38
    .line 39
    move-object v5, v4

    .line 40
    check-cast v5, Lhn4;

    .line 41
    .line 42
    iget-object v5, v5, Lhn4;->e:Lst2;

    .line 43
    .line 44
    invoke-static {v5}, Lhj8;->m(Lst2;)Lst2;

    .line 45
    .line 46
    .line 47
    move-result-object v5

    .line 48
    invoke-virtual {p0, v5}, Lgv6;->p(Lst2;)Z

    .line 49
    .line 50
    .line 51
    move-result v5

    .line 52
    if-eqz v5, :cond_0

    .line 53
    .line 54
    invoke-virtual {v0, v4}, Llp4;->a(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    move-object p2, v0

    .line 61
    goto :goto_2

    .line 62
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_3
    :goto_2
    new-instance v0, Lay5;

    .line 66
    .line 67
    const/16 v1, 0xe

    .line 68
    .line 69
    invoke-direct {v0, v1, p0}, Lay5;-><init>(ILjava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget v1, p2, Llp4;->b:I

    .line 73
    .line 74
    const/4 v3, 0x1

    .line 75
    if-gt v1, v3, :cond_4

    .line 76
    .line 77
    goto :goto_6

    .line 78
    :cond_4
    invoke-virtual {p2, v2}, Llp4;->f(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v0, v1}, Lay5;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ljava/lang/Comparable;

    .line 87
    .line 88
    iget v4, p2, Llp4;->b:I

    .line 89
    .line 90
    move v5, v3

    .line 91
    :goto_3
    if-ge v5, v4, :cond_9

    .line 92
    .line 93
    invoke-virtual {p2, v5}, Llp4;->f(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    invoke-virtual {v0, v6}, Lay5;->y(Ljava/lang/Object;)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    check-cast v6, Ljava/lang/Comparable;

    .line 102
    .line 103
    invoke-interface {v1, v6}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    if-lez v1, :cond_8

    .line 108
    .line 109
    new-instance v1, Llp4;

    .line 110
    .line 111
    iget v4, p2, Llp4;->b:I

    .line 112
    .line 113
    invoke-direct {v1, v4}, Llp4;-><init>(I)V

    .line 114
    .line 115
    .line 116
    iget-object v4, p2, Llp4;->a:[Ljava/lang/Object;

    .line 117
    .line 118
    iget p2, p2, Llp4;->b:I

    .line 119
    .line 120
    move v5, v2

    .line 121
    :goto_4
    if-ge v5, p2, :cond_5

    .line 122
    .line 123
    aget-object v6, v4, v5

    .line 124
    .line 125
    invoke-virtual {v1, v6}, Llp4;->a(Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    add-int/lit8 v5, v5, 0x1

    .line 129
    .line 130
    goto :goto_4

    .line 131
    :cond_5
    iget-object p2, v1, Llp4;->c:Ljp4;

    .line 132
    .line 133
    if-eqz p2, :cond_6

    .line 134
    .line 135
    goto :goto_5

    .line 136
    :cond_6
    new-instance p2, Ljp4;

    .line 137
    .line 138
    invoke-direct {p2, v2, v1}, Ljp4;-><init>(ILjava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    iput-object p2, v1, Llp4;->c:Ljp4;

    .line 142
    .line 143
    :goto_5
    iget-object v4, p2, Ljp4;->x:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v4, Llp4;

    .line 146
    .line 147
    iget v4, v4, Llp4;->b:I

    .line 148
    .line 149
    if-le v4, v3, :cond_7

    .line 150
    .line 151
    new-instance v4, Lla2;

    .line 152
    .line 153
    invoke-direct {v4, v2, v0}, Lla2;-><init>(ILjava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    invoke-static {p2, v4}, Lht0;->g0(Ljava/util/List;Ljava/util/Comparator;)V

    .line 157
    .line 158
    .line 159
    :cond_7
    move-object p2, v1

    .line 160
    goto :goto_6

    .line 161
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 162
    .line 163
    move-object v1, v6

    .line 164
    goto :goto_3

    .line 165
    :cond_9
    :goto_6
    invoke-virtual {p2}, Llp4;->h()Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    if-eqz v0, :cond_a

    .line 170
    .line 171
    sget-object p0, Lbg6;->b:Ltp4;

    .line 172
    .line 173
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    return-object p0

    .line 177
    :cond_a
    sget-object v0, Lbg6;->a:[J

    .line 178
    .line 179
    new-instance v0, Ltp4;

    .line 180
    .line 181
    invoke-direct {v0}, Ltp4;-><init>()V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0}, Lgv6;->o()Ljv6;

    .line 185
    .line 186
    .line 187
    move-result-object p0

    .line 188
    :try_start_0
    iget-object v1, p2, Llp4;->a:[Ljava/lang/Object;

    .line 189
    .line 190
    iget p2, p2, Llp4;->b:I

    .line 191
    .line 192
    move v4, v2

    .line 193
    :goto_7
    if-ge v4, p2, :cond_f

    .line 194
    .line 195
    aget-object v5, v1, v4

    .line 196
    .line 197
    check-cast v5, Lhn4;

    .line 198
    .line 199
    iget-object v6, v5, Lhn4;->e:Lst2;

    .line 200
    .line 201
    invoke-static {v6}, Lhj8;->m(Lst2;)Lst2;

    .line 202
    .line 203
    .line 204
    move-result-object v6

    .line 205
    invoke-virtual {p0, v6}, Ljv6;->c(Lst2;)I

    .line 206
    .line 207
    .line 208
    move-result v6

    .line 209
    iget-object v7, p0, Ljv6;->b:[I

    .line 210
    .line 211
    invoke-virtual {p0, v7, v6}, Ljv6;->G([II)I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    invoke-static {p0, v7}, Lgv6;->l(Ljv6;I)V

    .line 216
    .line 217
    .line 218
    invoke-static {p0, v7}, Lgv6;->l(Ljv6;I)V

    .line 219
    .line 220
    .line 221
    :goto_8
    iget v8, p0, Ljv6;->t:I

    .line 222
    .line 223
    if-eq v8, v7, :cond_d

    .line 224
    .line 225
    iget v9, p0, Ljv6;->u:I

    .line 226
    .line 227
    if-ne v8, v9, :cond_b

    .line 228
    .line 229
    goto :goto_9

    .line 230
    :cond_b
    invoke-virtual {p0, v8}, Ljv6;->u(I)I

    .line 231
    .line 232
    .line 233
    move-result v9

    .line 234
    add-int/2addr v9, v8

    .line 235
    if-ge v7, v9, :cond_c

    .line 236
    .line 237
    invoke-virtual {p0}, Ljv6;->R()V

    .line 238
    .line 239
    .line 240
    goto :goto_8

    .line 241
    :cond_c
    invoke-virtual {p0}, Ljv6;->N()I

    .line 242
    .line 243
    .line 244
    goto :goto_8

    .line 245
    :cond_d
    :goto_9
    if-ne v8, v7, :cond_e

    .line 246
    .line 247
    goto :goto_a

    .line 248
    :cond_e
    const-string v7, "Unexpected slot table structure"

    .line 249
    .line 250
    invoke-static {v7}, Ley0;->a(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    :goto_a
    invoke-virtual {p0}, Ljv6;->R()V

    .line 254
    .line 255
    .line 256
    iget v7, p0, Ljv6;->t:I

    .line 257
    .line 258
    sub-int/2addr v6, v7

    .line 259
    invoke-virtual {p0, v6}, Ljv6;->a(I)V

    .line 260
    .line 261
    .line 262
    iget-object v6, v5, Lhn4;->c:Lpy0;

    .line 263
    .line 264
    invoke-static {v6, v5, p0, p1}, Ley0;->c(Lpy0;Lhn4;Ljv6;Lkr;)Lgn4;

    .line 265
    .line 266
    .line 267
    move-result-object v6

    .line 268
    invoke-virtual {v0, v5, v6}, Ltp4;->m(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 269
    .line 270
    .line 271
    add-int/lit8 v4, v4, 0x1

    .line 272
    .line 273
    goto :goto_7

    .line 274
    :catchall_0
    move-exception p1

    .line 275
    goto :goto_b

    .line 276
    :cond_f
    const p1, 0x7fffffff

    .line 277
    .line 278
    .line 279
    invoke-static {p0, p1}, Lgv6;->l(Ljv6;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 280
    .line 281
    .line 282
    invoke-virtual {p0, v3}, Ljv6;->e(Z)V

    .line 283
    .line 284
    .line 285
    return-object v0

    .line 286
    :goto_b
    invoke-virtual {p0, v2}, Ljv6;->e(Z)V

    .line 287
    .line 288
    .line 289
    throw p1
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

.method public final n()Lfv6;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lgv6;->C:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget v0, p0, Lgv6;->A:I

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Lgv6;->A:I

    .line 10
    .line 11
    new-instance v0, Lfv6;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lfv6;-><init>(Lgv6;)V

    .line 14
    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_0
    const-string p0, "Cannot read while a writer is pending"

    .line 18
    .line 19
    invoke-static {p0}, Lh;->s(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
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

.method public final o()Ljv6;
    .locals 2

    .line 1
    iget-boolean v0, p0, Lgv6;->C:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "Cannot start a writer when another writer is pending"

    .line 6
    .line 7
    invoke-static {v0}, Ley0;->a(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    :cond_0
    iget v0, p0, Lgv6;->A:I

    .line 11
    .line 12
    if-gtz v0, :cond_1

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "Cannot start a writer when a reader is pending"

    .line 16
    .line 17
    invoke-static {v0}, Ley0;->a(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    :goto_0
    const/4 v0, 0x1

    .line 21
    iput-boolean v0, p0, Lgv6;->C:Z

    .line 22
    .line 23
    iget v1, p0, Lgv6;->D:I

    .line 24
    .line 25
    add-int/2addr v1, v0

    .line 26
    iput v1, p0, Lgv6;->D:I

    .line 27
    .line 28
    new-instance v0, Ljv6;

    .line 29
    .line 30
    invoke-direct {v0, p0}, Ljv6;-><init>(Lgv6;)V

    .line 31
    .line 32
    .line 33
    return-object v0
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

.method public final p(Lst2;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Lst2;->a()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    iget-object v0, p0, Lgv6;->E:Ljava/util/ArrayList;

    .line 8
    .line 9
    iget v1, p1, Lst2;->a:I

    .line 10
    .line 11
    iget v2, p0, Lgv6;->x:I

    .line 12
    .line 13
    invoke-static {v0, v1, v2}, Liv6;->e(Ljava/util/ArrayList;II)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-ltz v0, :cond_0

    .line 18
    .line 19
    iget-object p0, p0, Lgv6;->E:Ljava/util/ArrayList;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-static {p0, p1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-eqz p0, :cond_0

    .line 30
    .line 31
    const/4 p0, 0x1

    .line 32
    return p0

    .line 33
    :cond_0
    const/4 p0, 0x0

    .line 34
    return p0
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

.method public final s(I)Lau2;
    .locals 3

    .line 1
    iget-object v0, p0, Lgv6;->F:Ljava/util/HashMap;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    iget-boolean v2, p0, Lgv6;->C:Z

    .line 7
    .line 8
    if-eqz v2, :cond_0

    .line 9
    .line 10
    const-string v2, "use active SlotWriter to crate an anchor for location instead"

    .line 11
    .line 12
    invoke-static {v2}, Ley0;->a(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    if-ltz p1, :cond_1

    .line 16
    .line 17
    iget v2, p0, Lgv6;->x:I

    .line 18
    .line 19
    if-ge p1, v2, :cond_1

    .line 20
    .line 21
    iget-object p0, p0, Lgv6;->E:Ljava/util/ArrayList;

    .line 22
    .line 23
    invoke-static {p0, p1, v2}, Liv6;->e(Ljava/util/ArrayList;II)I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-ltz p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    check-cast p0, Lst2;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object p0, v1

    .line 37
    :goto_0
    if-eqz p0, :cond_2

    .line 38
    .line 39
    invoke-virtual {v0, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    check-cast p0, Lau2;

    .line 44
    .line 45
    return-object p0

    .line 46
    :cond_2
    return-object v1
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
