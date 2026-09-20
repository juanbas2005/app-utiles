.class public final Lm03;
.super La97;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public A:Ln03;

.field public B:Ljava/util/Iterator;

.field public C:I

.field public D:I

.field public E:I

.field public F:I

.field public synthetic G:Ljava/lang/Object;

.field public final synthetic H:Ln03;


# direct methods
.method public constructor <init>(Ln03;Lf61;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lm03;->H:Ln03;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, La97;-><init>(ILf61;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lfi2;

    .line 2
    .line 3
    check-cast p2, Lf61;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Lm03;->o(Lf61;Ljava/lang/Object;)Lf61;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lm03;

    .line 10
    .line 11
    sget-object p1, Lvs7;->a:Lvs7;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lm03;->s(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
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

.method public final o(Lf61;Ljava/lang/Object;)Lf61;
    .locals 1

    .line 1
    new-instance v0, Lm03;

    .line 2
    .line 3
    iget-object p0, p0, Lm03;->H:Ln03;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1}, Lm03;-><init>(Ln03;Lf61;)V

    .line 6
    .line 7
    .line 8
    iput-object p2, v0, Lm03;->G:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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

.method public final s(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lm03;->G:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Lfi2;

    .line 6
    .line 7
    iget v2, v0, Lm03;->F:I

    .line 8
    .line 9
    const/4 v3, 0x4

    .line 10
    const/4 v4, 0x3

    .line 11
    const/4 v5, 0x2

    .line 12
    iget-object v6, v0, Lm03;->H:Ln03;

    .line 13
    .line 14
    const/4 v7, 0x1

    .line 15
    const/4 v8, 0x0

    .line 16
    sget-object v9, Lp81;->w:Lp81;

    .line 17
    .line 18
    if-eqz v2, :cond_4

    .line 19
    .line 20
    if-eq v2, v7, :cond_3

    .line 21
    .line 22
    if-eq v2, v5, :cond_2

    .line 23
    .line 24
    if-eq v2, v4, :cond_1

    .line 25
    .line 26
    if-ne v2, v3, :cond_0

    .line 27
    .line 28
    iget v2, v0, Lm03;->D:I

    .line 29
    .line 30
    iget v5, v0, Lm03;->C:I

    .line 31
    .line 32
    iget-object v6, v0, Lm03;->B:Ljava/util/Iterator;

    .line 33
    .line 34
    iget-object v7, v0, Lm03;->A:Ln03;

    .line 35
    .line 36
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move v10, v2

    .line 40
    move-object v2, v6

    .line 41
    move-object v6, v7

    .line 42
    goto :goto_2

    .line 43
    :cond_0
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {v0}, Lh;->s(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v8

    .line 49
    :cond_1
    iget v2, v0, Lm03;->E:I

    .line 50
    .line 51
    iget v5, v0, Lm03;->D:I

    .line 52
    .line 53
    iget v6, v0, Lm03;->C:I

    .line 54
    .line 55
    iget-object v7, v0, Lm03;->B:Ljava/util/Iterator;

    .line 56
    .line 57
    iget-object v10, v0, Lm03;->A:Ln03;

    .line 58
    .line 59
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_2
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    move-object/from16 v2, p1

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_3
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    move-object/from16 v2, p1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    invoke-static/range {p1 .. p1}, Lo85;->q(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v2, v6, Ln03;->b:Ldv7;

    .line 80
    .line 81
    iput-object v1, v0, Lm03;->G:Ljava/lang/Object;

    .line 82
    .line 83
    iput v7, v0, Lm03;->F:I

    .line 84
    .line 85
    check-cast v2, Ldy7;

    .line 86
    .line 87
    iget-object v7, v2, Ldy7;->b:Lh81;

    .line 88
    .line 89
    new-instance v10, Lgv7;

    .line 90
    .line 91
    invoke-direct {v10, v2, v8, v5}, Lgv7;-><init>(Ldy7;Lf61;I)V

    .line 92
    .line 93
    .line 94
    invoke-static {v7, v10, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    if-ne v2, v9, :cond_5

    .line 99
    .line 100
    goto/16 :goto_4

    .line 101
    .line 102
    :cond_5
    :goto_0
    check-cast v2, Ljava/lang/String;

    .line 103
    .line 104
    iget-object v7, v6, Ln03;->a:Lp94;

    .line 105
    .line 106
    iput-object v1, v0, Lm03;->G:Ljava/lang/Object;

    .line 107
    .line 108
    iput v5, v0, Lm03;->F:I

    .line 109
    .line 110
    iget-object v5, v7, Lp94;->b:Lh81;

    .line 111
    .line 112
    new-instance v10, Lju1;

    .line 113
    .line 114
    const/16 v11, 0x13

    .line 115
    .line 116
    invoke-direct {v10, v7, v2, v8, v11}, Lju1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lf61;I)V

    .line 117
    .line 118
    .line 119
    invoke-static {v5, v10, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-ne v2, v9, :cond_6

    .line 124
    .line 125
    goto/16 :goto_4

    .line 126
    .line 127
    :cond_6
    :goto_1
    check-cast v2, Ljava/util/List;

    .line 128
    .line 129
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 130
    .line 131
    .line 132
    move-result v5

    .line 133
    sget-object v7, Lyh7;->a:Lhr2;

    .line 134
    .line 135
    const/4 v10, 0x0

    .line 136
    new-array v11, v10, [Ljava/lang/Object;

    .line 137
    .line 138
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    invoke-static {v11}, Lhr2;->m([Ljava/lang/Object;)V

    .line 142
    .line 143
    .line 144
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 149
    .line 150
    .line 151
    move-result v7

    .line 152
    sget-object v11, Lvs7;->a:Lvs7;

    .line 153
    .line 154
    if-eqz v7, :cond_b

    .line 155
    .line 156
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    move-result-object v7

    .line 160
    add-int/lit8 v12, v10, 0x1

    .line 161
    .line 162
    if-ltz v10, :cond_a

    .line 163
    .line 164
    check-cast v7, Lal3;

    .line 165
    .line 166
    iget-object v14, v6, Ln03;->a:Lp94;

    .line 167
    .line 168
    iget-object v15, v7, Lal3;->a:Ljava/lang/String;

    .line 169
    .line 170
    iput-object v1, v0, Lm03;->G:Ljava/lang/Object;

    .line 171
    .line 172
    iput-object v6, v0, Lm03;->A:Ln03;

    .line 173
    .line 174
    iput-object v2, v0, Lm03;->B:Ljava/util/Iterator;

    .line 175
    .line 176
    iput v5, v0, Lm03;->C:I

    .line 177
    .line 178
    iput v12, v0, Lm03;->D:I

    .line 179
    .line 180
    iput v10, v0, Lm03;->E:I

    .line 181
    .line 182
    iput v4, v0, Lm03;->F:I

    .line 183
    .line 184
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 185
    .line 186
    .line 187
    move-result-wide v16

    .line 188
    iget-object v7, v14, Lp94;->b:Lh81;

    .line 189
    .line 190
    new-instance v13, Lo94;

    .line 191
    .line 192
    const/16 v18, 0x0

    .line 193
    .line 194
    invoke-direct/range {v13 .. v18}, Lo94;-><init>(Lp94;Ljava/lang/String;JLf61;)V

    .line 195
    .line 196
    .line 197
    invoke-static {v7, v13, v0}, Lar7;->e0(Le81;Lgs2;Lf61;)Ljava/lang/Object;

    .line 198
    .line 199
    .line 200
    move-result-object v7

    .line 201
    if-ne v7, v9, :cond_7

    .line 202
    .line 203
    move-object v11, v7

    .line 204
    :cond_7
    if-ne v11, v9, :cond_8

    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    move-object v7, v2

    .line 208
    move v2, v10

    .line 209
    move-object v10, v6

    .line 210
    move v6, v5

    .line 211
    move v5, v12

    .line 212
    :goto_3
    new-instance v11, Lu97;

    .line 213
    .line 214
    add-int/lit8 v12, v2, 0x1

    .line 215
    .line 216
    invoke-direct {v11, v6, v12}, Lu97;-><init>(II)V

    .line 217
    .line 218
    .line 219
    iput-object v1, v0, Lm03;->G:Ljava/lang/Object;

    .line 220
    .line 221
    iput-object v10, v0, Lm03;->A:Ln03;

    .line 222
    .line 223
    iput-object v7, v0, Lm03;->B:Ljava/util/Iterator;

    .line 224
    .line 225
    iput v6, v0, Lm03;->C:I

    .line 226
    .line 227
    iput v5, v0, Lm03;->D:I

    .line 228
    .line 229
    iput v2, v0, Lm03;->E:I

    .line 230
    .line 231
    iput v3, v0, Lm03;->F:I

    .line 232
    .line 233
    invoke-interface {v1, v11, v0}, Lfi2;->k(Ljava/lang/Object;Lf61;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object v2

    .line 237
    if-ne v2, v9, :cond_9

    .line 238
    .line 239
    :goto_4
    return-object v9

    .line 240
    :cond_9
    move-object v2, v10

    .line 241
    move v10, v5

    .line 242
    move v5, v6

    .line 243
    move-object v6, v2

    .line 244
    move-object v2, v7

    .line 245
    goto :goto_2

    .line 246
    :cond_a
    invoke-static {}, Lsg3;->Z()V

    .line 247
    .line 248
    .line 249
    throw v8

    .line 250
    :cond_b
    return-object v11
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
