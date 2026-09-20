.class public Lor0;
.super Lv0;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"


# instance fields
.field public g0:Lqk5;

.field public h0:Lta3;


# virtual methods
.method public final I()V
    .locals 3

    .line 1
    iget-object v0, p0, Lv0;->M:Lap4;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lv0;->Z:Lr23;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    new-instance v2, Ls23;

    .line 10
    .line 11
    invoke-direct {v2, v1}, Ls23;-><init>(Lr23;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Lap4;->c(Ldf3;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    iput-object v0, p0, Lv0;->Z:Lr23;

    .line 19
    .line 20
    const/4 v0, 0x0

    .line 21
    invoke-virtual {p0, v0}, Lor0;->m1(Z)V

    .line 22
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
.end method

.method public final h0()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-virtual {p0, v0}, Lor0;->m1(Z)V

    .line 3
    .line 4
    .line 5
    return-void
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

.method public final i1(Landroid/view/KeyEvent;)Z
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final j1(Landroid/view/KeyEvent;)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lv0;->k1()V

    .line 2
    .line 3
    .line 4
    return-void
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
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
.end method

.method public final m1(Z)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iput-object v0, p0, Lor0;->h0:Lta3;

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iput-object v0, p0, Lor0;->g0:Lqk5;

    .line 8
    .line 9
    :goto_0
    invoke-virtual {p0, p1}, Lv0;->c1(Z)V

    .line 10
    .line 11
    .line 12
    const-string p1, "idle"

    .line 13
    .line 14
    iput-object p1, p0, Lv0;->W:Ljava/lang/String;

    .line 15
    .line 16
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
.end method

.method public final w(Lig;Llk5;)V
    .locals 9

    .line 1
    iget-object p1, p1, Lig;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {p0}, Lv0;->g1()V

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, Lv0;->R:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lv0;->V:Lkv2;

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    new-instance v0, Lkv2;

    .line 17
    .line 18
    invoke-direct {v0, p0}, Lkv2;-><init>(Liv2;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lwo1;->V0(Lvo1;)Lvo1;

    .line 22
    .line 23
    .line 24
    iput-object v0, p0, Lv0;->V:Lkv2;

    .line 25
    .line 26
    :cond_0
    sget-object v0, Llk5;->x:Llk5;

    .line 27
    .line 28
    const-string v1, "recognized"

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    const/4 v3, 0x0

    .line 32
    if-ne p2, v0, :cond_9

    .line 33
    .line 34
    iget-object p2, p0, Lor0;->h0:Lta3;

    .line 35
    .line 36
    if-nez p2, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 39
    .line 40
    .line 41
    move-result p2

    .line 42
    move v0, v3

    .line 43
    :goto_0
    if-ge v0, p2, :cond_c

    .line 44
    .line 45
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, Lta3;

    .line 50
    .line 51
    invoke-static {v1}, Lrd3;->h(Lta3;)Z

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    check-cast p1, Lta3;

    .line 62
    .line 63
    iput-boolean v2, p1, Lta3;->i:Z

    .line 64
    .line 65
    iput-object p1, p0, Lor0;->h0:Lta3;

    .line 66
    .line 67
    iget-boolean p2, p0, Lv0;->R:Z

    .line 68
    .line 69
    if-eqz p2, :cond_c

    .line 70
    .line 71
    const-string p2, "waiting"

    .line 72
    .line 73
    iput-object p2, p0, Lv0;->W:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p0, p1}, Lv0;->e1(Lta3;)V

    .line 76
    .line 77
    .line 78
    return-void

    .line 79
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_2
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 83
    .line 84
    .line 85
    move-result p2

    .line 86
    move v0, v3

    .line 87
    :goto_1
    if-ge v0, p2, :cond_7

    .line 88
    .line 89
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lta3;

    .line 94
    .line 95
    iget-boolean v5, v4, Lta3;->i:Z

    .line 96
    .line 97
    if-nez v5, :cond_3

    .line 98
    .line 99
    iget-boolean v5, v4, Lta3;->h:Z

    .line 100
    .line 101
    if-eqz v5, :cond_3

    .line 102
    .line 103
    iget-boolean v4, v4, Lta3;->d:Z

    .line 104
    .line 105
    if-nez v4, :cond_3

    .line 106
    .line 107
    add-int/lit8 v0, v0, 0x1

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_3
    sget-object p2, Lxy0;->u:Lt37;

    .line 111
    .line 112
    invoke-static {p0, p2}, Lh49;->w(Lry0;Lhu5;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p2

    .line 116
    check-cast p2, Lg58;

    .line 117
    .line 118
    invoke-interface {p2}, Lg58;->f()F

    .line 119
    .line 120
    .line 121
    move-result p2

    .line 122
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    move v1, v3

    .line 127
    :goto_2
    if-ge v1, v0, :cond_c

    .line 128
    .line 129
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v4

    .line 133
    check-cast v4, Lta3;

    .line 134
    .line 135
    iget-wide v5, v4, Lta3;->c:J

    .line 136
    .line 137
    iget-object v7, p0, Lor0;->h0:Lta3;

    .line 138
    .line 139
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    iget-wide v7, v7, Lta3;->c:J

    .line 143
    .line 144
    invoke-static {v5, v6, v7, v8}, Ll35;->d(JJ)J

    .line 145
    .line 146
    .line 147
    move-result-wide v5

    .line 148
    invoke-static {v5, v6}, Ll35;->c(J)F

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    invoke-static {v5}, Ljava/lang/Math;->abs(F)F

    .line 153
    .line 154
    .line 155
    move-result v5

    .line 156
    cmpl-float v5, v5, p2

    .line 157
    .line 158
    if-lez v5, :cond_4

    .line 159
    .line 160
    move v5, v2

    .line 161
    goto :goto_3

    .line 162
    :cond_4
    move v5, v3

    .line 163
    :goto_3
    iget-boolean v4, v4, Lta3;->i:Z

    .line 164
    .line 165
    if-nez v4, :cond_6

    .line 166
    .line 167
    if-eqz v5, :cond_5

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_6
    :goto_4
    invoke-virtual {p0, v2}, Lor0;->m1(Z)V

    .line 174
    .line 175
    .line 176
    return-void

    .line 177
    :cond_7
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object p1

    .line 181
    check-cast p1, Lta3;

    .line 182
    .line 183
    iput-boolean v2, p1, Lta3;->i:Z

    .line 184
    .line 185
    iget-boolean p1, p0, Lv0;->R:Z

    .line 186
    .line 187
    if-eqz p1, :cond_8

    .line 188
    .line 189
    iput-object v1, p0, Lv0;->W:Ljava/lang/String;

    .line 190
    .line 191
    iget-object p1, p0, Lor0;->h0:Lta3;

    .line 192
    .line 193
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    iget-wide p1, p1, Lta3;->c:J

    .line 197
    .line 198
    invoke-virtual {p0, v2, p1, p2}, Lv0;->d1(ZJ)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {p0}, Lv0;->k1()V

    .line 202
    .line 203
    .line 204
    :cond_8
    const/4 p1, 0x0

    .line 205
    iput-object p1, p0, Lor0;->h0:Lta3;

    .line 206
    .line 207
    return-void

    .line 208
    :cond_9
    sget-object v0, Llk5;->y:Llk5;

    .line 209
    .line 210
    if-ne p2, v0, :cond_c

    .line 211
    .line 212
    iget-object p2, p0, Lor0;->h0:Lta3;

    .line 213
    .line 214
    if-eqz p2, :cond_b

    .line 215
    .line 216
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 217
    .line 218
    .line 219
    move-result p2

    .line 220
    :goto_5
    if-ge v3, p2, :cond_b

    .line 221
    .line 222
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    check-cast v0, Lta3;

    .line 227
    .line 228
    iget-boolean v4, v0, Lta3;->i:Z

    .line 229
    .line 230
    if-eqz v4, :cond_a

    .line 231
    .line 232
    iget-object v4, p0, Lor0;->h0:Lta3;

    .line 233
    .line 234
    if-eq v0, v4, :cond_a

    .line 235
    .line 236
    invoke-virtual {p0, v2}, Lor0;->m1(Z)V

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_a
    add-int/lit8 v3, v3, 0x1

    .line 241
    .line 242
    goto :goto_5

    .line 243
    :cond_b
    :goto_6
    iget-object p1, p0, Lv0;->W:Ljava/lang/String;

    .line 244
    .line 245
    invoke-static {p1, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 246
    .line 247
    .line 248
    move-result p1

    .line 249
    if-eqz p1, :cond_c

    .line 250
    .line 251
    const-string p1, "idle"

    .line 252
    .line 253
    iput-object p1, p0, Lv0;->W:Ljava/lang/String;

    .line 254
    .line 255
    :cond_c
    return-void
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
.end method

.method public final y(Lkk5;Llk5;J)V
    .locals 6

    .line 1
    invoke-super {p0, p1, p2, p3, p4}, Lv0;->y(Lkk5;Llk5;J)V

    .line 2
    .line 3
    .line 4
    sget-object v0, Llk5;->x:Llk5;

    .line 5
    .line 6
    const-string v1, "recognized"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    if-ne p2, v0, :cond_6

    .line 10
    .line 11
    iget-object p2, p0, Lor0;->g0:Lqk5;

    .line 12
    .line 13
    if-nez p2, :cond_0

    .line 14
    .line 15
    const/4 p2, 0x1

    .line 16
    invoke-static {p1, p2}, Lsb7;->e(Lkk5;Z)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    if-eqz p2, :cond_9

    .line 21
    .line 22
    iget-object p1, p1, Lkk5;->a:Ljava/util/List;

    .line 23
    .line 24
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    check-cast p1, Lqk5;

    .line 29
    .line 30
    invoke-virtual {p1}, Lqk5;->a()V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, Lor0;->g0:Lqk5;

    .line 34
    .line 35
    iget-boolean p2, p0, Lv0;->R:Z

    .line 36
    .line 37
    if-eqz p2, :cond_9

    .line 38
    .line 39
    const-string p2, "waiting"

    .line 40
    .line 41
    iput-object p2, p0, Lv0;->W:Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lv0;->f1(Lqk5;)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    iget-object p1, p1, Lkk5;->a:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 50
    .line 51
    .line 52
    move-result p2

    .line 53
    move v0, v2

    .line 54
    :goto_0
    if-ge v0, p2, :cond_4

    .line 55
    .line 56
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    check-cast v3, Lqk5;

    .line 61
    .line 62
    invoke-static {v3}, Lub5;->c(Lqk5;)Z

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    if-nez v3, :cond_3

    .line 67
    .line 68
    invoke-virtual {p0, p3, p4}, Lv0;->b1(J)J

    .line 69
    .line 70
    .line 71
    move-result-wide v0

    .line 72
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 73
    .line 74
    .line 75
    move-result p2

    .line 76
    move v3, v2

    .line 77
    :goto_1
    if-ge v3, p2, :cond_9

    .line 78
    .line 79
    invoke-interface {p1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    check-cast v4, Lqk5;

    .line 84
    .line 85
    invoke-virtual {v4}, Lqk5;->c()Z

    .line 86
    .line 87
    .line 88
    move-result v5

    .line 89
    if-nez v5, :cond_2

    .line 90
    .line 91
    invoke-static {v4, p3, p4, v0, v1}, Lub5;->n(Lqk5;JJ)Z

    .line 92
    .line 93
    .line 94
    move-result v4

    .line 95
    if-eqz v4, :cond_1

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    :goto_2
    invoke-virtual {p0, v2}, Lor0;->m1(Z)V

    .line 102
    .line 103
    .line 104
    return-void

    .line 105
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_4
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    check-cast p1, Lqk5;

    .line 113
    .line 114
    invoke-virtual {p1}, Lqk5;->a()V

    .line 115
    .line 116
    .line 117
    iget-boolean p1, p0, Lv0;->R:Z

    .line 118
    .line 119
    if-eqz p1, :cond_5

    .line 120
    .line 121
    iput-object v1, p0, Lv0;->W:Ljava/lang/String;

    .line 122
    .line 123
    iget-object p1, p0, Lor0;->g0:Lqk5;

    .line 124
    .line 125
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    iget-wide p1, p1, Lqk5;->c:J

    .line 129
    .line 130
    invoke-virtual {p0, v2, p1, p2}, Lv0;->d1(ZJ)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lv0;->k1()V

    .line 134
    .line 135
    .line 136
    :cond_5
    const/4 p1, 0x0

    .line 137
    iput-object p1, p0, Lor0;->g0:Lqk5;

    .line 138
    .line 139
    return-void

    .line 140
    :cond_6
    sget-object p3, Llk5;->y:Llk5;

    .line 141
    .line 142
    if-ne p2, p3, :cond_9

    .line 143
    .line 144
    iget-object p2, p0, Lor0;->g0:Lqk5;

    .line 145
    .line 146
    if-eqz p2, :cond_8

    .line 147
    .line 148
    iget-object p1, p1, Lkk5;->a:Ljava/util/List;

    .line 149
    .line 150
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 151
    .line 152
    .line 153
    move-result p2

    .line 154
    move p3, v2

    .line 155
    :goto_3
    if-ge p3, p2, :cond_8

    .line 156
    .line 157
    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object p4

    .line 161
    check-cast p4, Lqk5;

    .line 162
    .line 163
    invoke-virtual {p4}, Lqk5;->c()Z

    .line 164
    .line 165
    .line 166
    move-result v0

    .line 167
    if-eqz v0, :cond_7

    .line 168
    .line 169
    iget-object v0, p0, Lor0;->g0:Lqk5;

    .line 170
    .line 171
    if-eq p4, v0, :cond_7

    .line 172
    .line 173
    invoke-virtual {p0, v2}, Lor0;->m1(Z)V

    .line 174
    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_7
    add-int/lit8 p3, p3, 0x1

    .line 178
    .line 179
    goto :goto_3

    .line 180
    :cond_8
    :goto_4
    iget-object p1, p0, Lv0;->W:Ljava/lang/String;

    .line 181
    .line 182
    invoke-static {p1, v1}, Lsg3;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-eqz p1, :cond_9

    .line 187
    .line 188
    const-string p1, "idle"

    .line 189
    .line 190
    iput-object p1, p0, Lv0;->W:Ljava/lang/String;

    .line 191
    .line 192
    :cond_9
    return-void
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
