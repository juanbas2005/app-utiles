.class public final synthetic Lab7;
.super Ljava/lang/Object;
.source "r8-map-id-a2600502e373284585f18be1dd969014ce4136ee711daf2a2a8e9cf573c31dbd"

# interfaces
.implements Lgs2;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lfw0;

.field public final synthetic y:Lgs2;

.field public final synthetic z:Lfw0;


# direct methods
.method public synthetic constructor <init>(Lfw0;Lgs2;Lfw0;I)V
    .locals 0

    .line 1
    iput p4, p0, Lab7;->w:I

    .line 2
    .line 3
    iput-object p1, p0, Lab7;->x:Lfw0;

    .line 4
    .line 5
    iput-object p2, p0, Lab7;->y:Lgs2;

    .line 6
    .line 7
    iput-object p3, p0, Lab7;->z:Lfw0;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
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
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 23

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lab7;->w:I

    .line 4
    .line 5
    sget-object v2, Lvs7;->a:Lvs7;

    .line 6
    .line 7
    const/4 v3, 0x6

    .line 8
    const/4 v4, 0x2

    .line 9
    const/4 v5, 0x0

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v7, v0, Lab7;->x:Lfw0;

    .line 12
    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    move-object/from16 v10, p1

    .line 17
    .line 18
    check-cast v10, Lq67;

    .line 19
    .line 20
    move-object/from16 v13, p2

    .line 21
    .line 22
    check-cast v13, Lk31;

    .line 23
    .line 24
    iget-wide v1, v13, Lk31;->a:J

    .line 25
    .line 26
    invoke-static {v1, v2}, Lk31;->h(J)I

    .line 27
    .line 28
    .line 29
    move-result v17

    .line 30
    sget-object v1, Lcb7;->w:Lcb7;

    .line 31
    .line 32
    invoke-interface {v10, v7, v1}, Lq67;->x(Lgs2;Ljava/lang/Object;)Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    new-instance v12, Lf06;

    .line 41
    .line 42
    invoke-direct {v12}, Ljava/lang/Object;-><init>()V

    .line 43
    .line 44
    .line 45
    if-lez v2, :cond_0

    .line 46
    .line 47
    div-int v3, v17, v2

    .line 48
    .line 49
    iput v3, v12, Lf06;->w:I

    .line 50
    .line 51
    :cond_0
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 56
    .line 57
    .line 58
    move-result v4

    .line 59
    move v6, v5

    .line 60
    :goto_0
    if-ge v6, v4, :cond_1

    .line 61
    .line 62
    invoke-interface {v1, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v7

    .line 66
    check-cast v7, Lgh4;

    .line 67
    .line 68
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    iget v8, v12, Lf06;->w:I

    .line 73
    .line 74
    invoke-interface {v7, v8}, Lgh4;->c(I)I

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    invoke-static {v7, v3}, Ljava/lang/Math;->max(II)I

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    add-int/lit8 v6, v6, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v14

    .line 93
    new-instance v9, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 96
    .line 97
    .line 98
    move-result v3

    .line 99
    invoke-direct {v9, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 103
    .line 104
    .line 105
    move-result v3

    .line 106
    move v4, v5

    .line 107
    :goto_1
    if-ge v4, v3, :cond_3

    .line 108
    .line 109
    invoke-interface {v1, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v6

    .line 113
    check-cast v6, Lgh4;

    .line 114
    .line 115
    iget v7, v12, Lf06;->w:I

    .line 116
    .line 117
    if-ltz v7, :cond_2

    .line 118
    .line 119
    if-ltz v14, :cond_2

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_2
    const-string v8, "maxWidth must be >= than minWidth,\nmaxHeight must be >= than minHeight,\nminWidth and minHeight must be >= 0"

    .line 123
    .line 124
    invoke-static {v8}, Lac3;->a(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    :goto_2
    invoke-static {v7, v7, v14, v14}, Lm31;->h(IIII)J

    .line 128
    .line 129
    .line 130
    move-result-wide v7

    .line 131
    invoke-interface {v6, v7, v8}, Lgh4;->y(J)Leh5;

    .line 132
    .line 133
    .line 134
    move-result-object v6

    .line 135
    invoke-virtual {v9, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 136
    .line 137
    .line 138
    add-int/lit8 v4, v4, 0x1

    .line 139
    .line 140
    goto :goto_1

    .line 141
    :cond_3
    new-instance v3, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 144
    .line 145
    .line 146
    :goto_3
    if-ge v5, v2, :cond_5

    .line 147
    .line 148
    invoke-interface {v1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v4

    .line 152
    check-cast v4, Lgh4;

    .line 153
    .line 154
    invoke-interface {v4, v14}, Lgh4;->v(I)I

    .line 155
    .line 156
    .line 157
    move-result v4

    .line 158
    iget v6, v12, Lf06;->w:I

    .line 159
    .line 160
    invoke-static {v4, v6}, Ljava/lang/Math;->min(II)I

    .line 161
    .line 162
    .line 163
    move-result v4

    .line 164
    invoke-interface {v10, v4}, Ltp1;->P(I)F

    .line 165
    .line 166
    .line 167
    move-result v4

    .line 168
    sget v6, Lva7;->c:F

    .line 169
    .line 170
    const/high16 v7, 0x40000000    # 2.0f

    .line 171
    .line 172
    mul-float/2addr v6, v7

    .line 173
    sub-float/2addr v4, v6

    .line 174
    new-instance v6, Llx1;

    .line 175
    .line 176
    invoke-direct {v6, v4}, Llx1;-><init>(F)V

    .line 177
    .line 178
    .line 179
    new-instance v4, Llx1;

    .line 180
    .line 181
    const/high16 v7, 0x41c00000    # 24.0f

    .line 182
    .line 183
    invoke-direct {v4, v7}, Llx1;-><init>(F)V

    .line 184
    .line 185
    .line 186
    invoke-virtual {v6, v4}, Llx1;->compareTo(Ljava/lang/Object;)I

    .line 187
    .line 188
    .line 189
    move-result v7

    .line 190
    if-ltz v7, :cond_4

    .line 191
    .line 192
    goto :goto_4

    .line 193
    :cond_4
    move-object v6, v4

    .line 194
    :goto_4
    new-instance v4, Lwa7;

    .line 195
    .line 196
    iget v7, v12, Lf06;->w:I

    .line 197
    .line 198
    invoke-interface {v10, v7}, Ltp1;->P(I)F

    .line 199
    .line 200
    .line 201
    move-result v7

    .line 202
    int-to-float v8, v5

    .line 203
    mul-float/2addr v7, v8

    .line 204
    iget v8, v12, Lf06;->w:I

    .line 205
    .line 206
    invoke-interface {v10, v8}, Ltp1;->P(I)F

    .line 207
    .line 208
    .line 209
    move-result v8

    .line 210
    iget v6, v6, Llx1;->w:F

    .line 211
    .line 212
    invoke-direct {v4, v7, v8, v6}, Lwa7;-><init>(FFF)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    add-int/lit8 v5, v5, 0x1

    .line 219
    .line 220
    goto :goto_3

    .line 221
    :cond_5
    new-instance v8, Lbb7;

    .line 222
    .line 223
    iget-object v11, v0, Lab7;->y:Lgs2;

    .line 224
    .line 225
    iget-object v15, v0, Lab7;->z:Lfw0;

    .line 226
    .line 227
    move-object/from16 v16, v3

    .line 228
    .line 229
    invoke-direct/range {v8 .. v17}, Lbb7;-><init>(Ljava/util/ArrayList;Lq67;Lgs2;Lf06;Lk31;ILfw0;Ljava/util/ArrayList;I)V

    .line 230
    .line 231
    .line 232
    move/from16 v0, v17

    .line 233
    .line 234
    sget-object v1, Lb42;->w:Lb42;

    .line 235
    .line 236
    invoke-interface {v10, v0, v14, v1, v8}, Loh4;->d0(IILjava/util/Map;Lvr2;)Lmh4;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    return-object v0

    .line 241
    :pswitch_0
    move-object/from16 v11, p1

    .line 242
    .line 243
    check-cast v11, Lyt2;

    .line 244
    .line 245
    move-object/from16 v1, p2

    .line 246
    .line 247
    check-cast v1, Ljava/lang/Integer;

    .line 248
    .line 249
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 250
    .line 251
    .line 252
    move-result v1

    .line 253
    and-int/lit8 v8, v1, 0x3

    .line 254
    .line 255
    if-eq v8, v4, :cond_6

    .line 256
    .line 257
    move v4, v6

    .line 258
    goto :goto_5

    .line 259
    :cond_6
    move v4, v5

    .line 260
    :goto_5
    and-int/2addr v1, v6

    .line 261
    invoke-virtual {v11, v1, v4}, Lyt2;->V(IZ)Z

    .line 262
    .line 263
    .line 264
    move-result v1

    .line 265
    if-eqz v1, :cond_b

    .line 266
    .line 267
    sget-object v1, Lxb4;->K:Lg80;

    .line 268
    .line 269
    sget-object v4, Lwr;->g:Lhz2;

    .line 270
    .line 271
    invoke-static {v4, v1, v11, v3}, Lzt0;->a(Lvr;Lg80;Lyt2;I)Lau0;

    .line 272
    .line 273
    .line 274
    move-result-object v1

    .line 275
    iget-wide v8, v11, Lyt2;->T:J

    .line 276
    .line 277
    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    .line 278
    .line 279
    .line 280
    move-result v4

    .line 281
    invoke-virtual {v11}, Lyt2;->m()Lvf5;

    .line 282
    .line 283
    .line 284
    move-result-object v8

    .line 285
    sget-object v9, Ljl4;->w:Ljl4;

    .line 286
    .line 287
    invoke-static {v11, v9}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 288
    .line 289
    .line 290
    move-result-object v10

    .line 291
    sget-object v12, Lux0;->d:Ltx0;

    .line 292
    .line 293
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 294
    .line 295
    .line 296
    sget-object v12, Ltx0;->b:Lvy0;

    .line 297
    .line 298
    invoke-virtual {v11}, Lyt2;->i0()V

    .line 299
    .line 300
    .line 301
    iget-boolean v13, v11, Lyt2;->S:Z

    .line 302
    .line 303
    if-eqz v13, :cond_7

    .line 304
    .line 305
    invoke-virtual {v11, v12}, Lyt2;->l(Lsr2;)V

    .line 306
    .line 307
    .line 308
    goto :goto_6

    .line 309
    :cond_7
    invoke-virtual {v11}, Lyt2;->r0()V

    .line 310
    .line 311
    .line 312
    :goto_6
    sget-object v13, Ltx0;->f:Lck;

    .line 313
    .line 314
    invoke-static {v13, v11, v1}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    sget-object v1, Ltx0;->e:Lck;

    .line 318
    .line 319
    invoke-static {v1, v11, v8}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 320
    .line 321
    .line 322
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 323
    .line 324
    .line 325
    move-result-object v4

    .line 326
    sget-object v8, Ltx0;->g:Lck;

    .line 327
    .line 328
    invoke-static {v8, v11, v4}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 329
    .line 330
    .line 331
    sget-object v4, Ltx0;->h:Lce;

    .line 332
    .line 333
    invoke-static {v11, v4}, Lg75;->O(Lyt2;Lvr2;)V

    .line 334
    .line 335
    .line 336
    sget-object v14, Ltx0;->d:Lck;

    .line 337
    .line 338
    invoke-static {v14, v11, v10}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    sget-object v10, Lxy0;->i:Lt37;

    .line 342
    .line 343
    invoke-virtual {v11, v10}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 344
    .line 345
    .line 346
    move-result-object v10

    .line 347
    move-object/from16 v16, v10

    .line 348
    .line 349
    check-cast v16, Lik2;

    .line 350
    .line 351
    sget-object v10, Lxy0;->n:Lt37;

    .line 352
    .line 353
    invoke-virtual {v11, v10}, Lyt2;->k(Lhu5;)Ljava/lang/Object;

    .line 354
    .line 355
    .line 356
    move-result-object v10

    .line 357
    sget-object v15, Ley3;->x:Ley3;

    .line 358
    .line 359
    if-ne v10, v15, :cond_8

    .line 360
    .line 361
    move/from16 v18, v6

    .line 362
    .line 363
    goto :goto_7

    .line 364
    :cond_8
    move/from16 v18, v5

    .line 365
    .line 366
    :goto_7
    sget-object v10, Lbu0;->a:Lbu0;

    .line 367
    .line 368
    invoke-virtual {v10, v5}, Lbu0;->a(Z)Lml4;

    .line 369
    .line 370
    .line 371
    move-result-object v15

    .line 372
    move/from16 v17, v3

    .line 373
    .line 374
    sget-object v3, Lxb4;->y:Li80;

    .line 375
    .line 376
    invoke-static {v3, v5}, Lmb0;->d(Ljb;Z)Llh4;

    .line 377
    .line 378
    .line 379
    move-result-object v6

    .line 380
    move-object/from16 p1, v6

    .line 381
    .line 382
    iget-wide v5, v11, Lyt2;->T:J

    .line 383
    .line 384
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 385
    .line 386
    .line 387
    move-result v5

    .line 388
    invoke-virtual {v11}, Lyt2;->m()Lvf5;

    .line 389
    .line 390
    .line 391
    move-result-object v6

    .line 392
    invoke-static {v11, v15}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 393
    .line 394
    .line 395
    move-result-object v15

    .line 396
    invoke-virtual {v11}, Lyt2;->i0()V

    .line 397
    .line 398
    .line 399
    move-object/from16 v22, v2

    .line 400
    .line 401
    iget-boolean v2, v11, Lyt2;->S:Z

    .line 402
    .line 403
    if-eqz v2, :cond_9

    .line 404
    .line 405
    invoke-virtual {v11, v12}, Lyt2;->l(Lsr2;)V

    .line 406
    .line 407
    .line 408
    :goto_8
    move-object/from16 v2, p1

    .line 409
    .line 410
    goto :goto_9

    .line 411
    :cond_9
    invoke-virtual {v11}, Lyt2;->r0()V

    .line 412
    .line 413
    .line 414
    goto :goto_8

    .line 415
    :goto_9
    invoke-static {v13, v11, v2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 416
    .line 417
    .line 418
    invoke-static {v1, v11, v6}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    invoke-static {v5, v11, v8, v11, v4}, Lf21;->s(ILyt2;Lck;Lyt2;Lce;)V

    .line 422
    .line 423
    .line 424
    invoke-static {v14, v11, v15}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 425
    .line 426
    .line 427
    invoke-static/range {v17 .. v17}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 428
    .line 429
    .line 430
    move-result-object v2

    .line 431
    invoke-virtual {v7, v10, v11, v2}, Lfw0;->u(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 432
    .line 433
    .line 434
    const/4 v2, 0x1

    .line 435
    invoke-virtual {v11, v2}, Lyt2;->r(Z)V

    .line 436
    .line 437
    .line 438
    sget-object v2, Lxb4;->M:Lg80;

    .line 439
    .line 440
    new-instance v5, Lf23;

    .line 441
    .line 442
    invoke-direct {v5, v2}, Lf23;-><init>(Lg80;)V

    .line 443
    .line 444
    .line 445
    invoke-interface {v9, v5}, Lml4;->d(Lml4;)Lml4;

    .line 446
    .line 447
    .line 448
    sget-object v2, Lqg1;->a:Lpa5;

    .line 449
    .line 450
    invoke-static {v5, v2}, Lx91;->J(Lml4;Lla5;)Lml4;

    .line 451
    .line 452
    .line 453
    move-result-object v2

    .line 454
    const/4 v5, 0x0

    .line 455
    invoke-static {v3, v5}, Lmb0;->d(Ljb;Z)Llh4;

    .line 456
    .line 457
    .line 458
    move-result-object v3

    .line 459
    iget-wide v5, v11, Lyt2;->T:J

    .line 460
    .line 461
    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    .line 462
    .line 463
    .line 464
    move-result v5

    .line 465
    invoke-virtual {v11}, Lyt2;->m()Lvf5;

    .line 466
    .line 467
    .line 468
    move-result-object v6

    .line 469
    invoke-static {v11, v2}, Lgw8;->E(Lyt2;Lml4;)Lml4;

    .line 470
    .line 471
    .line 472
    move-result-object v2

    .line 473
    invoke-virtual {v11}, Lyt2;->i0()V

    .line 474
    .line 475
    .line 476
    iget-boolean v7, v11, Lyt2;->S:Z

    .line 477
    .line 478
    if-eqz v7, :cond_a

    .line 479
    .line 480
    invoke-virtual {v11, v12}, Lyt2;->l(Lsr2;)V

    .line 481
    .line 482
    .line 483
    goto :goto_a

    .line 484
    :cond_a
    invoke-virtual {v11}, Lyt2;->r0()V

    .line 485
    .line 486
    .line 487
    :goto_a
    invoke-static {v13, v11, v3}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 488
    .line 489
    .line 490
    invoke-static {v1, v11, v6}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 491
    .line 492
    .line 493
    invoke-static {v5, v11, v8, v11, v4}, Lf21;->s(ILyt2;Lck;Lyt2;Lce;)V

    .line 494
    .line 495
    .line 496
    invoke-static {v14, v11, v2}, Lg75;->Q(Lgs2;Lyt2;Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    sget-object v1, Lar7;->f0:Lrt0;

    .line 500
    .line 501
    invoke-static {v1, v11}, Lst0;->e(Lrt0;Lyt2;)J

    .line 502
    .line 503
    .line 504
    move-result-wide v7

    .line 505
    sget-object v1, Lar7;->g0:Lcr7;

    .line 506
    .line 507
    invoke-static {v1, v11}, Ldr7;->a(Lcr7;Lyt2;)Ltg7;

    .line 508
    .line 509
    .line 510
    move-result-object v9

    .line 511
    new-instance v15, Lng1;

    .line 512
    .line 513
    const/16 v20, 0x0

    .line 514
    .line 515
    iget-object v1, v0, Lab7;->y:Lgs2;

    .line 516
    .line 517
    iget-object v0, v0, Lab7;->z:Lfw0;

    .line 518
    .line 519
    move-object/from16 v19, v0

    .line 520
    .line 521
    move-object/from16 v17, v1

    .line 522
    .line 523
    invoke-direct/range {v15 .. v20}, Lng1;-><init>(Lik2;Lgs2;ZLfw0;I)V

    .line 524
    .line 525
    .line 526
    const v0, -0x41cc98e9

    .line 527
    .line 528
    .line 529
    invoke-static {v0, v15, v11}, Lsu0;->J(ILds2;Lyt2;)Lfw0;

    .line 530
    .line 531
    .line 532
    move-result-object v10

    .line 533
    const/16 v12, 0x180

    .line 534
    .line 535
    invoke-static/range {v7 .. v12}, La35;->a(JLtg7;Lgs2;Lyt2;I)V

    .line 536
    .line 537
    .line 538
    const/4 v2, 0x1

    .line 539
    invoke-virtual {v11, v2}, Lyt2;->r(Z)V

    .line 540
    .line 541
    .line 542
    invoke-virtual {v11, v2}, Lyt2;->r(Z)V

    .line 543
    .line 544
    .line 545
    goto :goto_b

    .line 546
    :cond_b
    move-object/from16 v22, v2

    .line 547
    .line 548
    invoke-virtual {v11}, Lyt2;->Y()V

    .line 549
    .line 550
    .line 551
    :goto_b
    return-object v22

    .line 552
    :pswitch_1
    move-object/from16 v22, v2

    .line 553
    .line 554
    move/from16 v17, v3

    .line 555
    .line 556
    move-object/from16 v1, p1

    .line 557
    .line 558
    check-cast v1, Lyt2;

    .line 559
    .line 560
    move-object/from16 v2, p2

    .line 561
    .line 562
    check-cast v2, Ljava/lang/Integer;

    .line 563
    .line 564
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 565
    .line 566
    .line 567
    move-result v2

    .line 568
    and-int/lit8 v3, v2, 0x3

    .line 569
    .line 570
    if-eq v3, v4, :cond_c

    .line 571
    .line 572
    const/4 v3, 0x1

    .line 573
    :goto_c
    const/16 v21, 0x1

    .line 574
    .line 575
    goto :goto_d

    .line 576
    :cond_c
    const/4 v3, 0x0

    .line 577
    goto :goto_c

    .line 578
    :goto_d
    and-int/lit8 v2, v2, 0x1

    .line 579
    .line 580
    invoke-virtual {v1, v2, v3}, Lyt2;->V(IZ)Z

    .line 581
    .line 582
    .line 583
    move-result v2

    .line 584
    if-eqz v2, :cond_f

    .line 585
    .line 586
    sget-object v2, Lyu6;->a:Lsd2;

    .line 587
    .line 588
    invoke-virtual {v1, v7}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 589
    .line 590
    .line 591
    move-result v3

    .line 592
    iget-object v5, v0, Lab7;->y:Lgs2;

    .line 593
    .line 594
    invoke-virtual {v1, v5}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 595
    .line 596
    .line 597
    move-result v6

    .line 598
    or-int/2addr v3, v6

    .line 599
    iget-object v0, v0, Lab7;->z:Lfw0;

    .line 600
    .line 601
    invoke-virtual {v1, v0}, Lyt2;->g(Ljava/lang/Object;)Z

    .line 602
    .line 603
    .line 604
    move-result v6

    .line 605
    or-int/2addr v3, v6

    .line 606
    invoke-virtual {v1}, Lyt2;->Q()Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v6

    .line 610
    if-nez v3, :cond_d

    .line 611
    .line 612
    sget-object v3, Lay0;->a:Ld63;

    .line 613
    .line 614
    if-ne v6, v3, :cond_e

    .line 615
    .line 616
    :cond_d
    new-instance v6, Lab7;

    .line 617
    .line 618
    invoke-direct {v6, v7, v5, v0, v4}, Lab7;-><init>(Lfw0;Lgs2;Lfw0;I)V

    .line 619
    .line 620
    .line 621
    invoke-virtual {v1, v6}, Lyt2;->o0(Ljava/lang/Object;)V

    .line 622
    .line 623
    .line 624
    :cond_e
    check-cast v6, Lgs2;

    .line 625
    .line 626
    move/from16 v0, v17

    .line 627
    .line 628
    const/4 v5, 0x0

    .line 629
    invoke-static {v2, v6, v1, v0, v5}, Lm67;->a(Lml4;Lgs2;Lyt2;II)V

    .line 630
    .line 631
    .line 632
    goto :goto_e

    .line 633
    :cond_f
    invoke-virtual {v1}, Lyt2;->Y()V

    .line 634
    .line 635
    .line 636
    :goto_e
    return-object v22

    .line 637
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
